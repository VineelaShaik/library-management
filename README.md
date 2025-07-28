# 📚 Library Management System - Spring Boot CRUD App

This is a simple **Library Management System** built using **Spring Boot**, performing full **CRUD operations** for managing books. It is designed to demonstrate backend capabilities such as RESTful APIs, JPA integration, and basic service-layer architecture.

---

## 🚀 Features

- Add new books 📘  
- View all books 📖  
- Update existing book details ✏️  
- Delete books from the library 🗑️  
- RESTful API endpoints using Spring Boot  
- Integrated with JPA and H2/MySQL (configurable)

---

## 🛠️ Tech Stack

- Java 17+ / 11+  
- Spring Boot  
- Spring Data JPA  
- Spring Web  
- H2 / MySQL Database  
- Maven  
- Postman (for API testing)

---


## 🔌 API Endpoints

| Method | Endpoint        | Description            |
|--------|------------------|------------------------|
| GET    | `/books`         | Get all books          |
| GET    | `/books/{id}`    | Get book by ID         |
| POST   | `/books`         | Add a new book         |
| PUT    | `/books/{id}`    | Update book details    |
| DELETE | `/books/{id}`    | Delete book by ID      |

---

## ⚙️ Configuration (application.properties)

For H2:
```properties
spring.application.name=personal-library
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
spring.jpa.hibernate.ddl-auto=update
spring.h2.console.path=/h2-console
```
---
▶️ How to Run
## Using IDE:
Clone the repo

Open it in IntelliJ / Eclipse

Run the LibraryManagementApplication.java class

## Using Command Line:
```
git clone https://github.com/VineelaShaik/library-management.git
cd library-management
./mvnw spring-boot:run
```

---
🧪 API Testing (Postman)
Example request (POST):

```
   "title": "War and Peace",
    "author": "Tolstoy",
    "genre": "Non-Fiction",
    "yearPublished": 1869,
    "read": false
```

## Output

### Updating a book by Id
<img width="1920" height="1080" alt="Screenshot 2025-07-28 180008" src="https://github.com/user-attachments/assets/1f49e896-56af-4751-963e-c9195423e967" />

### Deleting a book by Id
<img width="1920" height="1080" alt="Screenshot 2025-07-28 175655" src="https://github.com/user-attachments/assets/bab76ec4-666d-43c7-ad8c-d876c1fa9835" />

### Getting a book by Id
<img width="1920" height="1080" alt="Screenshot 2025-07-28 175913" src="https://github.com/user-attachments/assets/5e37c4fe-68fe-4f56-9895-12c2b39e002d" />

### Getting all books
<img width="1920" height="1080" alt="Screenshot 2025-07-28 175830" src="https://github.com/user-attachments/assets/028ab28e-c410-4c80-8b42-ce0355c7efc1" />


## Author
Vineela Shaik

