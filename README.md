# Student Demo Project

## Overview

This is a simple demo project showcasing the usage of Spring framework version 3.2.2 and JDK version 17. The project is structured with distinct layers, including the Controller layer, Service layer, and DAO layer.

## Project Components

### Controller Layer

In the Controller layer, the main component is `MyController`. This class is responsible for handling the mapping of incoming requests. To achieve loose coupling and enhance maintainability, `MyController` references a Service layer interface instead of a Service layer class which implements the method of that interface.

### Service Layer

The Service layer encapsulates the business logic of the application. For the sake of abstraction and adhering to best practices, an interface is utilized in the Service layer.Service layer communicate with DAO layer. In this layer all the logic is written.
### DAO Layer

The DAO (Data Access Object) layer is responsible for interacting with the database. In this project, an entity named `Student` is created in the DAO layer. This entity is mapped to a database table, and its purpose is to model the student data within the system.

## Technology Stack

- Spring Framework: 3.2.2
- JDK Version: 17
- Database:`MySql`



