 ## My Taxi Service(EN)

My Taxi Service is a web application for managing a taxi service. This project implements features for taxi management, user registration and authentication, taxi booking, order tracking, and more.

## Table of Contents
- [Project Description](#project-description)
- [Requirements](#requirements)
- [Installation](#installation)
- [License](#license)

## Project Description

This project is developed for the "My Taxi Service" web application. The project provides functionality for managing a taxi service, taxi booking, user authentication, and much more.

### Key features of the project include:
* User registration with the ability to create customer or driver accounts.
* User authentication using tokens or sessions.
* The ability for customers to book taxis and track the status of their orders.
* List of available drivers and their locations.
* Management and scheduling of driver routes.
* Administrator interface for managing users, taxis, and other system parameters.



## 🧰 Technology Stack
JavaServer Pages (JSP) for developing dynamic pages.
Controllers that interact with JSP pages and handle user requests.
MySQL as the database management system (DBMS).
## ℹ️ Database Structure
For the database structure, MySQL is used to store and manage the data. The database has the following structure:
* The "drivers" table with fields: id, name, and license_number.
* The "manufacturers" table with fields: id, name, and country.
* The "cars" table with fields: id, model, and manufacturer_id, where manufacturer_id is a foreign key referencing the "manufacturers" table.
 ![DB](https://github.com/RostyslavOnysh/my-taxi-service/assets/98691406/9d4356c3-9f9c-4189-acdb-d0123c93d6f2)


## Requirements
Before getting started with the project, make sure you have the following components installed:

Java Development Kit (JDK) version 11 or above.
Maven: for building the project and managing dependencies.
MySQL: the database used for data storage.
Servlet API: used for implementing web components and interacting with the server.
JSTL (1.2): a Java library used for extending the capabilities of JSP.

## 😺 Tomcat
Tomcat is recommended to have for testing the result and verifying the correctness of the code.

To include Tomcat, add the following configuration to the pom.xml file:

```xml
 
<properties>
  <!-- Other project properties -->
  <tomcat.version>9.0.54</tomcat.version>
</properties>

<build>
  <plugins>
    <!-- Other build plugins -->
    <plugin>
      <groupId>org.apache.tomcat.maven</groupId>
      <artifactId>tomcat7-maven-plugin</artifactId>
      <version>${tomcat.version}</version>
    </plugin>
  </plugins>
</build>
```
After adding these configuration sections to the pom.xml file, you can run your Maven project using the command mvn tomcat7:run to start the embedded Tomcat server and test the result and correctness of your code.


## Installation

1. Clone the repository:

```bash
git clone https://github.com/RostyslavOnysh/my-taxi-service.git
```

### Build the project using Maven:
```bash
mvn clean install
```

## Connection class
In the ConnectionUtil class located at src/main/java/taxi/util/ConnectionUtil, you need to modify the values of the constants URL, USERNAME, PASSWORD, and JDBC_DRIVER to match your specific database credentials.

URL: the URL address of the database you want to connect to.
USERNAME: the username for accessing the database.
PASSWORD: the password for accessing the database.
JDBC_DRIVER: the JDBC driver string for your database.
```java
 
public class ConnectionUtil {
    private static final String URL = "YOUR URL";
    private static final String USERNAME = "YOUR USERNAME";
    private static final String PASSWORD = "YOUR PASSWORD";
    private static final String JDBC_DRIVER = "YOUR DRIVER";
```
You need to find these values for your specific database and replace them in the corresponding places in the ConnectionUtil class.


## License
Feel free to modify this README.md file according to the specifications of your project, including relevant details, functionality descriptions, documentation links, and more.




 




 


