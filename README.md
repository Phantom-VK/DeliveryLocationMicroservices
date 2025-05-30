# 📦 Kafka Spring Boot Producer-Consumer Example

[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.7.0-brightgreen.svg?logo=springboot)](https://spring.io/projects/spring-boot)
[![Kafka](https://img.shields.io/badge/Kafka-3.0.0-blue.svg?logo=apachekafka)](https://kafka.apache.org/)
[![Java](https://img.shields.io/badge/Java-17-blue.svg?logo=java)](https://www.oracle.com/java/)
---

## 🚀 Project Overview

This project demonstrates the power and simplicity of integrating **Apache Kafka** with **Spring Boot** for asynchronous, high-throughput messaging.

> Imagine a **Delivery Boy Microservice** sending 1,00,000 messages 📦 (orders, locations, updates etc.), while the **End User Service** consumes them instantly — real-time and scalable.

---

## 🛠 Tech Stack

- **Java 17**
- **Spring Boot Web**
- **Spring Kafka**
- **Postman** (for testing the producer API)

---

## 📚 Features

- REST API endpoint to publish messages to Kafka.
- Kafka consumer to process and log those messages.
- Can simulate a large number of messages (e.g., 1,00,000) efficiently.
- Easy to extend for real-time systems like food delivery, logistics, etc.

---

## 📦 Dependencies

```kotlin
dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.kafka:spring-kafka")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.springframework.kafka:spring-kafka-test")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}
````

---


## 📥 Kafka Consumer

* Automatically listens on the configured topic.
* Logs messages in real-time as they arrive.

---

## 🧪 Running the Project

### ▶️ Start Kafka (if not embedded)

Make sure Kafka is running locally on default port (9092) or configure it in `application.yml`.

### ▶️ Run Spring Boot

```bash
./gradlew bootRun
```

### ▶️ Hit the producer endpoint from Postman

Send a `POST` request to `http://localhost:8080/location/update`

---

## 📈 Sample Logs

```bash
Location sent to kafka topic (23, 55)
Location sent to kafka topic (45, 56)
...
Location sent to kafka topic (34, 67)
```
