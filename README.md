# 📒 Notes API

A simple service for creating and managing notes, built with Spring Boot 3.x.

## 📚 Technologies

- Java 21
- Spring Boot 3.4.4
- Spring Web, Spring Data JPA
- H2 Database (in-memory for testing purposes)
- Maven

## 🚀 Features

- [x] Fetch a list of all notes (`GET /api/notes`)
- [x] Project structure (Controller, Service, Repository, Model)
- [x] Embedded H2 in-memory database
- [x] Maven as the build system
- [x] Project configuration using Spring Boot Starters

## 🛠️ Planned Features

- [ ] Create new notes (`POST /api/notes`)
- [ ] Update existing notes (`PUT /api/notes/{id}`)
- [ ] Delete notes (`DELETE /api/notes/{id}`)
- [ ] HTTP error handling (404, 400)
- [ ] Data validation (e.g., title cannot be empty)
- [ ] API documentation using Swagger
- [ ] Production deployment using PostgreSQL
- [ ] User login system (Spring Security)

## 🚀 How to Run the Project

```bash
git clone https://github.com/malpish0n/notes-app.git
cd notes-app
.\mvnw.cmd spring-boot:run
