# 🖱️ Click Tracker with Spring Boot & Apache Kafka

This is a simple project that tracks user clicks through a web page and sends those click events to **Apache Kafka** using **Spring Boot**.

## 📸 Overview

- A webpage with a button.
- When you click the button, a message is sent to Kafka.
- The message says: "user1 clicked".

---

## 🧱 Technologies Used

- Java 17+
- Spring Boot
- Apache Kafka (via Docker)
- Docker Compose
- Thymeleaf (for the HTML page)
- KafkaTemplate (for sending messages)

---

## 🚀 How to Run It

### 1. Clone the Repository


```bash
git clone https://github.com/yourusername/click-tracker.git
cd click-tracker

### 2. Start Kafka & Zookeeper with Docker

docker-compose up -d
### 3. Run the Spring Boot Application
.You can use your IDE (IntelliJ, Eclipse, etc.) or the terminal:

```bash
./mvnw spring-boot:run

Author : Lamsiyeh Khawla
