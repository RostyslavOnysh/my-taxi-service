 

## My Taxi Service(EN)

![GitHub last commit](https://img.shields.io/github/last-commit/RostyslavOnysh/my-taxi-service)
![GitHub license](https://img.shields.io/github/license/RostyslavOnysh/my-taxi-service)

My Taxi Service is a web application for managing a taxi service. This project implements features for taxi management, user registration and authentication, taxi booking, order tracking, and more.

## Table of Contents
- [Project Description](#project-description)
- [Requirements](#requirements)
- [Installation](#installation)
- [License](#license)

## Project Description

This project is developed for the "My Taxi Service" web application. The project provides functionality for managing a taxi service, taxi booking, user authentication, and much more.

Key features of the project include:

- User registration with the ability to create a customer or driver account.
- User authentication using tokens or sessions.
- Customer's ability to book a taxi and track the status of their order.
- List of available drivers and their locations.
- Management and planning of driver trips.
- Administrator interface for managing users, taxis, and other system parameters.

## Requirements

Before getting started with the project, make sure you have the following components installed:

- Java Development Kit (JDK) version 11 or higher.
- Maven - for project building and dependency management.

## Installation

1. Clone the repository:

```bash
git clone https://github.com/RostyslavOnysh/my-taxi-service.git
```

### Build the project using Maven:
```bash
mvn clean install
```


## ConnectionUtil class


## License
Feel free to modify this README.md file according to the specifications of your project, including relevant details, functionality descriptions, documentation links, and more.





 
 
## My Taxi Service(UA)

![GitHub last commit](https://img.shields.io/github/last-commit/RostyslavOnysh/my-taxi-service)
![GitHub license](https://img.shields.io/github/license/RostyslavOnysh/my-taxi-service)

My Taxi Service є веб-додатком для управління таксі-сервісом. Цей проект реалізовує функції керування таксі, реєстрацію та авторизацію користувачів, замовлення таксі, відстеження стану замовлення та інше.

## Вміст

- [Опис проекту](#опис-проекту)
- [Вимоги](#вимоги)
- [Інсталяція](#інсталяція)
- [Connection class](#connection-class)
- [Ліцензія](#ліцензія)


## Опис проекту

Цей проект розробляється для веб-додатку "My Taxi Service".Надає функціональність для керування таксі-сервісом, замовлення таксі, авторизації користувачів і багато іншого.

Основні функції проекту включають:

- Реєстрацію користувачів з можливістю створення облікового запису клієнта або водія.
- Авторизацію користувачів з використанням токенів або сесій.
- Можливість клієнтів замовляти таксі та відстежувати стан свого замовлення.
- Список доступних водіїв та їх розташування.
- Керування та планування рейсів водіїв.
- Інтерфейс адміністратора для керування користувачами, таксі та іншими параметрами системи.

## Вимоги

Перед початком роботи з проектом, переконайтеся, що у вас встановлені наступні компоненти:

- Java Development Kit (JDK) версії 11 або вище.
- Maven - для збирання проекту та управління залежностями.

## Інсталяція

1. Склонуйте репозиторій:

```bash
git clone https://github.com/RostyslavOnysh/my-taxi-service.git
```

## Connection class
У класі ConnectionUtil який знаходится за шляхом 
 ***src/main/java/taxi/util/ConnectionUtil***,
 треба змінити значення констант URL, USERNAME, PASSWORD та JDBC_DRIVER на відповідні дані для вашої бази даних.
* URL - це URL-адреса бази даних, яку ви хочете підключити.
* USERNAME - це ім'я користувача для доступу до бази даних.
* PASSWORD - це пароль для доступу до бази даних.
* JDBC_DRIVER - це рядок, що представляє драйвер JDBC для вашої бази даних.

```java
  public class ConnectionUtil {
    private static final String URL = "YOUR URL";
    private static final String USERNAME = "YOUR USERNAME";
    private static final String PASSWORD = "YOUR PASSWORD";
    private static final String JDBC_DRIVER = "YOUR DRIVER";
 ```

Вам потрібно знайти ці значення для вашої ***конкретної*** бази даних і замінити їх у відповідних місцях у класі ConnectionUtil.


## Ліцензія
Цей проект поширюється під ліцензією MIT.

Ви можете внести зміни у цей файл README.md згідно зі специфікаціями вашого проекту, включивши в нього відповідні деталі, опис функціональності, посилання на документацію та інше.
