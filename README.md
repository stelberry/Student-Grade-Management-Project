# Student Grade Management Program

## Overview
The **Student Grade Management Program** is a system designed to manage student grades. The project was developed in two phases:

- **Coursework 1 (CW1):** Focused on implementing the core model classes with unit tests.
- **Coursework 2 (CW2):** Extended CW1 into a backend service using Spring Boot, allowing interaction through a web API.

---

## Features
### CW1: Core Functionality
In the first phase, the project implemented the fundamental model classes for managing student grades. The implementation followed Test-Driven Development (TDD) and adhered to strict coding standards.

- **Model Classes:**
  - `Student`: Represents a student with attributes like ID, name, and email.
  - `Module`: Represents a university module, including a unique code and name.
  - `Grade`: Represents a student's grade for a specific module.
  - `Registration`: Tracks which students are registered for which modules.
- **Exception Handling:**
  - `NoGradeAvailableException`: Raised when no grade is available for a requested module.
  - `NoRegistrationException`: Raised when a student tries to access grades for unregistered modules.
- **Testing:**
  - Unit tests were written using JUnit 5.
  - Follows TDD principles, with test order comments included in test cases.

---

### CW2: Backend API
The second phase transformed the program into a backend service using **Spring Boot**.

- **Spring Boot Integration:**
  - The program was set up as a Maven project.
  - Model classes from CW1 were moved to the new backend project.
- **Database Management:**
  - Used an **H2 in-memory database** for temporary data storage.
  - Implemented schema using PostgreSQL syntax.
- **REST API:**
  - Implemented a `GradeController` to handle HTTP requests.
  - Added an endpoint for adding student grades:
    ```java
    @PostMapping(value = "/grades/addGrade")
    public ResponseEntity<Grade> addGrade(@RequestBody Map<String, String> params) {
        // Process request and add grade
    }
    ```
- **Repository Layer:**
  - Implemented using `CrudRepository` for database operations.
- **GitLab CI/CD Integration:**
  - Configured `.gitlab-ci.yml` to automate builds and validation.
- **Validation & Code Quality:**
  - Ensured code quality with Checkstyle, SpotBugs, and JUnit tests.
  - Verified implementation using the command:
    ```sh
    mvn compile test checkstyle:check spotbugs:check verify site
    ```
- **Swagger Documentation:**
  - API documentation enabled with SpringDoc Swagger UI.

---

## Technologies Used
- **Java** (Spring Boot, JUnit 5)
- **Maven** (Project Management)
- **H2 Database** (In-memory storage)
- **PostgreSQL** (SQL Syntax for schema definition)
- **GitLab CI/CD** (Automated testing and validation)
- **Swagger UI** (API Documentation)

---

## Project Structure
```
student-grade-management/
├── src/main/java/uk/ac/rhul/cs2800/model/   # Model classes
├── src/main/java/uk/ac/rhul/cs2800/controller/  # API controllers
├── src/main/java/uk/ac/rhul/cs2800/repository/  # Database repositories
├── src/test/java/uk/ac/rhul/cs2800/  # Unit tests
├── pom.xml   # Maven dependencies
├── application.properties  # Spring Boot configuration
└── .gitlab-ci.yml  # CI/CD configuration
```

---

## How to Run
### Running Tests
```sh
mvn test
```
### Running the Application
```sh
mvn spring-boot:run
```
### Accessing Swagger UI
After running the application, visit:
```
http://localhost:2800/swagger-ui.html
```

---

## Contribution Workflow
- Create a feature branch.
- Implement changes and commit with meaningful messages.
- Push changes and create a Merge Request (MR) on GitLab.
- Ensure CI/CD validation passes before merging into the main branch.

