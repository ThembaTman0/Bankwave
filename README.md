# Bankwave – Spring Boot Microservices (Foundational Phase)

## Overview

**Bankwave** is a foundational **Spring Boot microservices system** that models core banking domains such as **accounts, loans, and cards**.  
The project focuses on **getting the fundamentals right**: clean service boundaries, RESTful APIs, isolated data ownership, and production-style code structure.

This repository reflects the system **up to the foundational microservices stage** before introducing Spring Cloud components. The emphasis is on understanding **how microservices should be built**, not just how frameworks wire them together.

While the work was guided by structured learning material, the implementation has been **adapted and refined** to demonstrate real-world engineering practices expected from a professional Java developer.

---

## Services

| Service          | Responsibility                | Port |
|------------------|-------------------------------|------|
| Accounts Service | Customer account management   | 8080 |
| Loans Service    | Loan management               | 8090 |
| Cards Service    | Card management               | 9000 |

Each service:

- Is a **standalone Spring Boot application**
- Exposes **RESTful APIs**
- Owns its **own database**
- Can be built, tested, and deployed independently
- Is designed to scale horizontally in containerized environments

---

## Architectural Approach

This system follows **core microservices principles** commonly used in fintech and enterprise environments:

- **Service isolation** – one business capability per service
- **Database-per-service** – no shared schemas or cross-service joins
- **Loose coupling** – services interact only via APIs
- **Stateless design** – services do not maintain session state
- **Explicit configuration** – everything required to run a service is visible

At this stage, the project deliberately avoids Spring Cloud abstractions to ensure the **underlying architecture is well understood**.

---

## Technology Stack

- **Java 11**
- **Spring Boot**
- **Spring Web (REST)**
- **Spring Data JPA**
- **Hibernate**
- **Maven**
- **H2 / MySQL**
- **Basic Docker usage (image building concepts)**

---

## Project Structure

Each microservice follows a consistent and maintainable structure:

    ├── controller   → REST endpoints and request handling
    ├── service      → Business logic and transactions
    ├── repository   → Data access using Spring Data JPA
    ├── entity       → JPA domain models
    ├── dto          → API request / response models
    ├── exception    → Centralized exception handling
    └── config       → Application configuration

This structure enforces **clear responsibility boundaries** and mirrors patterns used in real production systems.

---

## Microservice – Bankwave

The **Services** demonstrates how a real banking domain service should be structured and implemented.

### Core Capabilities

- Create customer accounts
- Retrieve account details
- Update account information
- Enforce validation and business rules at service boundaries

---

## REST API Design

- RESTful endpoints with meaningful resource naming
- HTTP status codes used correctly for success and failure cases
- DTOs used to avoid leaking internal domain models
- Validation applied to incoming requests
- Consistent error responses using centralized exception handling

APIs can be tested using:

- Postman
- curl
- Browser (GET endpoints)

---

## Persistence & Data Management

- Spring Data JPA repositories for clean data access
- Hibernate used for ORM mapping
- Each service owns its database schema
- No cross-service database access
- Transaction boundaries defined at the service layer

This aligns with **data ownership rules used in regulated financial systems**.

---

## Quality & Engineering Practices

The project prioritizes **code quality and clarity** over unnecessary complexity.

Practices applied include:

- Centralized exception handling for predictable API errors
- Input validation to fail fast on invalid data
- Clear separation between API, business logic, and persistence
- Externalized configuration using properties and profiles
- Meaningful logging to support debugging
- Readable, intention-revealing method and class names
- Minimal but sufficient abstractions

The goal is to produce services that are **easy to understand, safe to change, and suitable for long-term maintenance**.

---

## Running the Services Locally

### Prerequisites

- Java 11+
- Maven

### Start a Service

    mvn spring-boot:run

Each service runs on its configured port as defined in `application.properties`.

---

## Current Scope

### Included

- Independent Spring Boot microservices
- REST APIs
- JPA/Hibernate persistence
- Database-per-service pattern
- DTO-based API contracts
- Centralized exception handling
- Foundational Docker concepts

### Not Yet Included

- Service discovery
- API gateway
- Centralized configuration
- Inter-service communication patterns
- Security (OAuth2/JWT)
- Resilience patterns
- Distributed tracing
- Kubernetes deployments

These are planned for later phases once the core architecture is solid.

---

## Planned Next Steps

- Spring Cloud Config
- Service discovery
- API Gateway
- Inter-service communication
- Fault tolerance and resilience
- Observability and metrics
- Container orchestration concepts

---

## Why This Repository Matters

This project demonstrates:

- Strong understanding of **microservices fundamentals**
- Clean Spring Boot service design
- Awareness of **fintech and enterprise constraints**
- Discipline in not over-engineering early
- A solid base for building scalable systems

It reflects how real systems are built: **start simple, get the boundaries right, then evolve responsibly**.

---

## Final Notes

This repository represents a **foundational microservices implementation**, intentionally focused on correctness and clarity.  
It serves as a reliable base for moving toward a full cloud-native architecture while maintaining strong engineering fundamentals.

---
