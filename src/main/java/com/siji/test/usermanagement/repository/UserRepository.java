package com.siji.test.usermanagement.repository;

import com.siji.test.usermanagement.model.UserRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserRecord, Long> {
}
