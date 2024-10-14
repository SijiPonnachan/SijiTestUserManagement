package com.siji.test.usermanagement.service;

import com.siji.test.usermanagement.model.UserRecord;
import com.siji.test.usermanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserRecord createUser(UserRecord user) {
        return userRepository.save(user);
    }

    public List<UserRecord> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<UserRecord> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public UserRecord updateUser(Long id, UserRecord userDetails) {
    	UserRecord user = userRepository.findById(id).orElseThrow();
        user.setUsername(userDetails.getUsername());
        user.setFirstName(userDetails.getFirstName());
        user.setLastName(userDetails.getLastName());
        user.setEmail(userDetails.getEmail());
        user.setPhoneNumber(userDetails.getPhoneNumber());
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
