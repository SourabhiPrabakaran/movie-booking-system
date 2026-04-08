# 🎬 Movie Ticket Booking System

A Java-based movie ticket booking system with seat validation and duplicate booking prevention, containerized with Docker, deployed on Kubernetes, and automated via Jenkins CI/CD.

---

## 📌 Project Overview

This system was developed as part of a Software Configuration Management (SCM) project to demonstrate a full DevOps lifecycle — from code to container to cluster.

**Core Capabilities:**
- Check seat availability in real-time
- Book seats with user assignment
- Prevent duplicate bookings automatically
- REST API exposure via Spring Boot
- Automated build, test, and deployment pipeline

---

## 🛠️ Tech Stack

| Layer | Technology |
|-------|------------|
| Language | Java 17 |
| Framework | Spring Boot |
| Build Tool | Maven |
| Testing | JUnit 5 |
| Containerization | Docker |
| Orchestration | Kubernetes |
| CI/CD | Jenkins |
| Version Control | Git & GitHub |
| Base Image | eclipse-temurin:17-jdk-jammy |

---

## 🏗️ Project Structure

```
movie-booking-system/
├── src/
│   ├── main/java/
│   │   ├── BookingSystem.java      # Core booking logic
│   │   └── Seat.java               # Seat state management
│   └── test/java/
│       └── BookingSystemTest.java  # JUnit test cases
├── Dockerfile                      # Container definition
├── deployment.yaml                 # Kubernetes deployment & service
├── pom.xml                         # Maven configuration
└── README.md
```

---

## 📡 API Endpoints

| Method | Endpoint | Description | Sample Response |
|--------|----------|-------------|-----------------|
| GET | `/check/{seatId}` | Check seat availability | `Seat Available` |
| GET | `/book/{seatId}/{user}` | Book a seat for a user | `Booked successfully by user1` |
| GET | `/book/{seatId}/{user}` | Attempt duplicate booking | `Already booked` |

### Example Responses

```
GET http://localhost:30007/check/A1
→ Seat Available

GET http://localhost:30007/book/A1/user1
→ Booked successfully by user1

GET http://localhost:30007/book/A1/user2
→ Already booked
```

---

## 🧪 Running Tests

```bash
mvn test
```

Test cases cover:
- Seat availability check
- Successful booking confirmation
- Duplicate booking prevention

---

## ⚙️ Build with Maven

```bash
mvn clean package
```

This compiles the source code and packages it into a `.jar` file inside the `target/` directory.

---

## 🐳 Docker Setup

### Build the Image

```bash
docker build -t sourabhip/movie-booking:latest .
```

### Run the Container

```bash
docker run -p 8080:8080 sourabhip/movie-booking:latest
```

### Push to DockerHub

```bash
docker push sourabhip/movie-booking:latest
```

---

## ☸️ Kubernetes Deployment

### Apply the Deployment

```bash
kubectl apply -f deployment.yaml
```

### Verify Pods are Running

```bash
kubectl get pods
kubectl get services
```

The `deployment.yaml` configures:
- **Deployment** — manages replicas of the application pod
- **Service** — exposes the app via NodePort on port `30007`

### Access the Application

```
http://localhost:30007
```

---

## 🔄 CI/CD Pipeline (Jenkins)

The Jenkins pipeline automates the full DevOps lifecycle:

```
Stage 1: Clone from GitHub
    ↓
Stage 2: Build with Maven
    ↓
Stage 3: Run JUnit Tests
    ↓
Stage 4: Build Docker Image
    ↓
Stage 5: Push to DockerHub
    ↓
Stage 6: Deploy to Kubernetes
```

---

## 📸 Screenshots

### ✅ Seat Available
`GET /check/A1`

![Seat Available](screenshots/check-seat.png)

### ✅ Booking Successful
`GET /book/A1/user1`

![Booking Successful](screenshots/book-success.png)

### ✅ Duplicate Booking Prevented
`GET /book/A1/user2`

![Already Booked](screenshots/already-booked.png)

---

## 🏆 Outcome

| Feature | Status |
|---------|--------|
| Seat availability check | ✅ |
| Successful booking | ✅ |
| Duplicate booking prevention | ✅ |
| JUnit test coverage | ✅ |
| Maven build automation | ✅ |
| Docker containerization | ✅ |
| Kubernetes deployment | ✅ |
| Jenkins CI/CD pipeline | ✅ |
| GitHub version control | ✅ |

---

## 👩‍💻 Developed By

**Sourabhi Prabakaran**  
M.Tech Software Engineering — VIT, Vellore  
GitHub: [@SourabhiPrabakaran](https://github.com/SourabhiPrabakaran)

---

> *"We developed a Java-based movie booking system with seat validation and duplicate prevention, automated using Jenkins CI/CD, containerized with Docker, and deployed on Kubernetes."*
