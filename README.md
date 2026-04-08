# 🎬 Movie Ticket Booking System

## 📌 Project Description

This project is a Java-based movie ticket booking system that allows users to:

* Check seat availability
* Book seats
* Prevent duplicate bookings

## 🚀 Features

* Seat availability validation
* Duplicate booking prevention
* REST API endpoints
* Docker containerization
* Kubernetes deployment
* CI/CD using Jenkins

## 🛠️ Tech Stack

* Java (Core / Spring Boot)
* Maven
* JUnit (Testing)
* Docker
* Kubernetes
* Jenkins

## 📡 API Endpoints

### Check Seat Availability

```
GET /check/{seatId}
```

### Book Seat

```
GET /book/{seatId}/{user}
```

## 🧪 Example

* `/check/A1` → Seat Available
* `/book/A1/user1` → Booked successfully
* `/book/A1/user2` → Already booked

## ⚙️ Deployment

* Docker Image: sourabhip/movie-booking
* Kubernetes Service: NodePort (30007)

## 🔄 CI/CD Pipeline

1. Clone from GitHub
2. Build using Maven
3. Build Docker image
4. Push to DockerHub
5. Deploy to Kubernetes

## 🎯 Real-world Use

Used in online cinema ticket booking systems like BookMyShow.

---
