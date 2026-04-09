# E-Commerce Backend (Spring Boot)

## Description

This project is a RESTful E-Commerce Backend application built using Spring Boot. It follows a layered architecture with clear separation of concerns, including Entity, DTO, Mapper, Controller, Service, Repository, and Exception handling.

The application provides core functionalities for managing Users, Products, Addresses, and Orders, along with validation and structured error handling.

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

## Project Structure

src/main/java/com/project
│
├── controller # REST API endpoints
├── service # Business logic
├── repository # Data access layer
├── entity # Database entities
├── dto # Data Transfer Objects
├── mapper # Entity ↔ DTO conversion
├── exception # Global exception handling

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

## API Endpoints

### User

- POST   `/api/users`
- GET    `/api/users`
- GET    `/api/users/{id}`
- PUT    `/api/users/{id}`
- DELETE `/api/users/{id}`

### Product

- POST   `/api/products`
- GET    `/api/products`
- GET    `/api/products/{id}`
- PUT    `/api/products/{id}`
- DELETE `/api/products/{id}`

### Address

- POST   `/api/addresses`
- GET    `/api/addresses`
- GET    `/api/addresses/{id}`
- PUT    `/api/addresses/{id}`
- DELETE `/api/addresses/{id}`

### Order

- POST   `/api/orders`
- GET    `/api/orders`
- GET    `/api/orders/{id}`
- DELETE `/api/orders/{id}`

---

## How to Run

1. Clone the repository:
   git clone https://github.com/Nithesh-08/E-Commerce-Backend-Project.git
2. Navigate to project:
  cd your-repo-name

3. Configure database in application.properties:
spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce_db
spring.datasource.username=root
spring.datasource.password=Meena@26

4.Create Database:
CREATE DATABASE ecommerce_db;

5.Run application:
  mvn spring-boot:run   

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

## Key Technologies Used

- Framework: Spring Boot  
- Language: Java  
- Build Tool: Maven  
- ORM: Spring Data JPA (Hibernate)  
- Database: MySQL  
- Validation: Jakarta Validation  

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------

## Data Flow

### Controller  
The Controller layer handles incoming HTTP requests and exposes RESTful API endpoints. It receives client input, applies validation, and forwards requests to the service layer.

### Service  
The Service layer contains business logic and coordinates between different layers. It processes data, manages entity relationships, and applies validation rules.

### Repository  
The Repository layer interacts with the database using Spring Data JPA. It handles CRUD operations and abstracts database access.

### DTO (Data Transfer Object)  
DTOs are used to transfer data between layers. They help in controlling the data exposed to the client and prevent direct exposure of entity models.

### Mapper  
The Mapper layer converts data between Entity and DTO objects. It ensures clean separation between database models and API responses.

### Exception Handling  
A global exception handling mechanism is implemented to provide consistent and structured error responses across the application.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

## Database Design

The application uses a relational database with entities such as User, Product, Address, and Orders.  
Entity relationships are managed using JPA annotations to maintain data integrity and consistency.

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

## Data Structures Used

The project uses domain models such as:
- User  
- Product  
- Address  
- Orders  

These classes represent the core data structures and are mapped to database tables.

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

## Key Features

- RESTful APIs for User, Product, Address, and Order management  
- Full CRUD operations for all modules  
- Layered architecture (Controller, Service, Repository)  
- DTO and Mapper pattern for clean data transformation  
- Input validation using Jakarta Validation  
- Global exception handling for consistent error responses  

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

## Importance

This project demonstrates a structured backend system using Spring Boot. It highlights essential backend development practices such as layered architecture, DTO design, data transformation using mappers, validation, and centralized exception handling.
  
