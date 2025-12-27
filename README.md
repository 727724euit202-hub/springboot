# Attendance Management System

## Description
This is a Spring Boot based Attendance Management System developed as part of an academic project.  
The application allows managing employees, recording attendance logs, and generating daily attendance summaries with pagination support.

---

## Features
- Employee management (Add, Update, View)
- Attendance log management (Check-in / Check-out)
- Daily attendance summary with date range and pagination
- Admin user management
- Global exception handling
- Layered architecture (Controller, Service, Repository)

---

## Tech Stack
- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL (or H2 for testing)
- Maven

---

## Project Structure
src/main/java/com/examly/springapp
├── controller
├── service
├── repository
├── model
├── exception
├── configuration
├── aop


---

## How to Run the Application
1. Import the project into an IDE (Eclipse / IntelliJ / VS Code)
2. Make sure Maven dependencies are downloaded
3. Run the main class:
4. The application will start on the default port `8080`

---

## API Endpoints (Sample)

### Employee
- `POST /employees`
- `GET /employees/{id}`
- `PUT /employees/{id}`
- `GET /employees`

### Attendance Logs
- `POST /attendancelogs`
- `PUT /attendancelogs/{id}`
- `GET /attendancelogs`

### Daily Attendance Summary
- `POST /daily-summary/create`
- `GET /daily-summary/employee/code/{employeeCode}`  
  (with `startDate`, `endDate`, `page`, `size` as request parameters)

---

## Notes
- Pagination is implemented using Spring Data `Pageable`
- The project follows RESTful API design
- README file is for documentation purposes only

---

## Author
Rithish Nivash
