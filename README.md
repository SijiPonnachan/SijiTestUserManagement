# User Management API by Siji Ponnachan

## Overview

This project is a RESTful API for managing users, built with Java 17 and Spring Boot. It allows for the creation, retrieval, updating, and deletion of user records.

## Features

- Create new users
- List all users
- Retrieve a single user by ID
- Update user information
- Delete a user

## User Information

Each user record includes the following information:
- Username
- First Name
- Last Name
- Email
- Phone Number

## Technologies Used

- Java 17
- Spring Boot
- Spring Data JPA
- H2 Database (for development and testing)
- Gradle (for dependency management)

## Getting Started

### Prerequisites

- Java 17 or higher
- Gradle
- An IDE (e.g., IntelliJ IDEA, Eclipse, or Spring Tool Suite)

### Installation

1. Clone the repository: git clone <repository-url>

2. Navigate to the project directory: cd <project-directory>

3. Build the project: ./gradlew build

4. Run the application: ./gradlew bootRun


###API Endpoints:

POST		**/users**			: Create a new user

GET			**/users**			: Retrieve a list of users

GET			**/users/{id}**		: Retrieve a user by ID

PUT			**/users/{id}**		: Update a user

DELETE		**/users/{id}**		: Delete a user


###Test APIs using Postman:

Download Postman: If you haven’t already, download and install Postman.

Create Requests

###### POST /users: To create a new user.
	URL: http://localhost:8080/users
	Body: Select raw and choose JSON as the format. For example:
		{
			"username": "jdoe",
			"firstName": "John",
			"lastName": "Doe",
			"email": "jdoe@example.com",
			"phoneNumber": "123-456-7890"
			}
###### GET /users: To list all users.
	URL: http://localhost:8080/users
	
###### GET /users/{id}: To get a specific user by ID.
	URL: http://localhost:8080/users/{id} (replace {id} with the actual user ID)
	
###### PUT /users/{id}: To update an existing user.
	URL: http://localhost:8080/users/{id}
	Body: Similar to the POST request with updated fields.

###### DELETE /users/{id}: To delete a user.
	URL: http://localhost:8080/users/{id} (replace {id} with the actual user ID)