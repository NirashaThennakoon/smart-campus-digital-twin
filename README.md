Smart Campus Digital Twin API

A backend service built with Java 21 and Spring Boot to model a digital twin of a smart campus.
The first version provides a REST API for managing buildings with database schema managed by Flyway.

Features (current state)

* RESTful API for Building entity.
* Database schema migration with Flyway (V1__init.sql).
* Persistence with Spring Data JPA (Hibernate).
* DTO ↔ Entity mapping with MapStruct.
* In-memory H2 database for development.
* Swagger UI for API exploration