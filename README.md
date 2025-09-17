
# Message Service Spring Boot App

A simple Spring Boot application demonstrating dependency injection, service interface, and component usage. When the application starts, it prints a notification message using a `MessageService` implementation.

---

## Project Structure

| File | Purpose |
|------|---------|
| `MessageService.java` | Interface defining the contract `sendMessage()` |
| `EmailService.java` | Implements `MessageService` — returns a message string |
| `Notification.java` | Spring component that depends on `MessageService`; it has method `notifyUser()` which prints message to console |
| `BootP01Application.java` | The Spring Boot application entry point; implements `CommandLineRunner` so it runs code after startup |

---

## How It Works

1. Spring Boot starts via `SpringApplication.run(...)` in `BootP01Application`.
2. Component scanning picks up beans:
   - `EmailService` (annotated `@Service`)
   - `Notification` (annotated `@Component`)
3. Dependency Injection:
   - `Notification` is injected with `EmailService` (because it implements `MessageService`)
   - `BootP01Application` is injected with `Notification`
4. After context setup, Spring Boot calls the `run(String... args)` method in `BootP01Application` (because of `CommandLineRunner`)
5. Inside that, it calls `notification.notifyUser()`, which calls `messageService.sendMessage()` and prints the returned string

---

## Setup & Run

1. Clone this repo  
   ```bash
   git clone https://github.com/YOUR_USERNAME/message‑service‑app.git
   cd message‑service‑app

   
##Build & run (using Maven)

1) mvn clean install
2) mvn spring-boot:run

##You should see output in the console:

*Email: you have got new message!

##Dependencies

1) Java 8 or above

2) Spring Boot (version 4.5.9)

3) Maven (or Gradle) as build system

##Possible Improvements

1) Use constructor injection instead of field injection in Notification

2) Add more implementations of MessageService (e.g. SMS, Push) and demonstrate picking different ones

Add unit tests for Notification using mocks

Add configuration for selecting which MessageService to use
