# Nyxora Store – Java E-Commerce Platform

## Project Overview

Nyxora Store is a Java-based E-Commerce web application developed using Spring Boot and Maven.

The project demonstrates the implementation of an online shopping platform using Java programming concepts and a structured web application architecture.

## Technologies Used

- Java
- Spring Boot
- Maven
- HTML
- Spring Data Repository Architecture

## Project Features

- Product listing and management
- Shopping cart interface
- Order history page
- Initial product data setup
- Web-based shopping interface

## Project Structure

```text
Java-project-Ecommerce-Platform/
│
├── pom.xml
│
└── src/
    └── main/
        ├── java/
        │   └── com/
        │       └── nyxora/
        │           └── shop/
        │               ├── controller/
        │               ├── model/
        │               ├── repository/
        │               ├── ShopApplication.java
        │               └── StoreData.java
        │
        └── resources/
            ├── templates/
            │   ├── index.html
            │   ├── cart.html
            │   └── orders.html
            │
            └── Application.properties
```

## Main Components

| Component | Description |
|---|---|
| ShopApplication.java | Spring Boot application entry point |
| StoreData.java | Initial product data setup |
| controller | Handles application requests |
| model | Contains application data models |
| repository | Handles product repository operations |
| index.html | Main store page |
| cart.html | Shopping cart page |
| orders.html | Order history page |
| pom.xml | Maven project configuration |

## How to Run the Project

### Prerequisites
- Java Development Kit (JDK), compatible with the version specified in pom.xml
- Apache Maven
- Java IDE (IntelliJ IDEA, Eclipse or VS Code)

### Steps

1. Download or clone the GitHub repository.
2. Open the `Java-project-Ecommerce-Platform` directory.
3. Install the required Maven dependencies.
4. Configure the application properties as required.
5. Run `ShopApplication.java` or execute:

```bash
mvn spring-boot:run
```

6. Open the application in your browser using the configured server address and port.

## Learning Objectives

- Understanding Java-based web application development.
- Implementing Spring Boot project architecture.
- Working with controllers, models and repositories.
- Managing Maven dependencies.
- Developing an E-Commerce application.

## Project Information

**Project Name:** Nyxora Store

**Project Type:** Academic Java Project

**GitHub Repository:** https://github.com/charvichittora123/java-class--repo

**Project Directory:** Java-project-Ecommerce-Platform
