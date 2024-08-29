# REST API Project

## Description

This repository contains a simple REST API built with Spring Boot. The API provides endpoints to manage `Person` entities, including basic CRUD operations. Additionally, it includes endpoints for greeting messages to demonstrate different HTTP request methods.

The project uses Spring Boot for creating the RESTful web services and demonstrates how to structure a basic API with controllers, services, repositories, and exception handling.

## Features

- **CRUD Operations:** Endpoints to create, read, update, and delete `Person` records.
- **Greeting Endpoints:** Demonstrates basic GET requests for returning greeting messages.
- **Exception Handling:** Custom exception handling for "Not Found" scenarios.
- **In-Memory Database:** Uses an in-memory repository for storing `Person` records.

## Project Structure

### Controller

- **`PersonController`**: Manages `Person` entities with endpoints for CRUD operations.
  - `GET /persons` - Retrieve all `Person` records.
  - `GET /persons/{personalNo}` - Retrieve a `Person` by ID.
  - `POST /persons` - Create a new `Person`.
  - `PUT /persons/{personalNo}` - Update an existing `Person`.
  - `DELETE /persons/{personalNo}` - Delete a `Person` by ID.
  
- **`MainController`**: Provides greeting messages with different endpoints.
  - `GET /greetings/hello` - Returns a "Hello" message with an incrementing count.
  - `GET /greetings/hi` - Returns a "Hi" message with an incrementing count.

### Domain

- **`Person`**: Represents a person with fields for `personalNo`, `fullName`, and `bdt` (birth date). Includes custom `equals` and `hashCode` methods.

### Exception

- **`NotFoundException`**: Custom exception to handle "Not Found" scenarios with a `404` HTTP status code.

### Service

- **`Service`**: Provides business logic and interacts with the repository. Methods include:
  - `findAll()`: Retrieves all `Person` records.
  - `findById(String id)`: Finds a `Person` by ID.
  - `save(Person person)`: Saves or updates a `Person`.
  - `delete(String id)`: Deletes a `Person` by ID.

### Repository

- **`PersonRepository`**: Manages `Person` entities in an in-memory database. Methods include:
  - `findAll()`: Retrieves all `Person` records.
  - `findById(String id)`: Finds a `Person` by ID.
  - `save(Person person)`: Adds or updates a `Person`.
  - `delete(String id)`: Deletes a `Person` by ID.

