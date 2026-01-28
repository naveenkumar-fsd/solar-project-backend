# ⚙️ SolarAI – Smart Solar Solutions (Backend)

Backend service for the **SolarAI** platform, built to handle solar estimation logic, lead management, admin operations, and future AI integrations.  
This backend is designed to work seamlessly with the SolarAI React frontend and is scalable for real-world production use.

---

## 🚀 Project Overview

The **SolarAI Backend** provides REST APIs to support the frontend application.  
It manages:

- Solar estimation calculations
- User & lead data
- Admin dashboard data
- Future integrations like AI chatbot, payments, and notifications

The backend follows a **clean layered architecture** and is optimized for maintainability and scalability.

---

## ✨ Features

### 📊 Solar Estimator API
- Calculates:
  - Required system size (kW)
  - Required roof area
  - Installation cost
  - Yearly savings
- Performs roof feasibility checks
- Reusable logic shared across APIs

### 👥 Lead Management
- Save user details from:
  - Estimator
  - Chatbot
  - Contact form
- Fields:
  - Name
  - Phone number
  - City
  - Monthly bill
  - Roof area
- Timestamped entries

### 🔐 Admin APIs
- Fetch all leads
- View estimator usage
- Future-ready for authentication & role-based access

### 🤖 AI Chatbot (Future Ready)
- Endpoint placeholders for:
  - OpenAI / Gemini integration
  - Chat history storage
  - Lead capture via chatbot

---

## 🛠️ Tech Stack

### Backend
- Java
- Spring Boot
- Spring Web (REST APIs)
- Spring Data JPA
- Hibernate

### Database
- MySQL

### Tools
- Maven
- Git & GitHub
- Postman (API testing)

---

## 📂 Project Structure

backend/
├── src/main/java/com/solarai/
│ ├── controller/
│ │ ├── EstimatorController.java
│ │ ├── LeadController.java
│ │ └── AdminController.java
│ │
│ ├── service/
│ │ ├── EstimatorService.java
│ │ └── LeadService.java
│ │
│ ├── repository/
│ │ └── LeadRepository.java
│ │
│ ├── model/
│ │ └── Lead.java
│ │
│ └── SolarAiApplication.java
│
├── src/main/resources/
│ ├── application.properties
│ └── data.sql (optional)
│
└── pom.xm

---

## ⚙️ Installation & Setup

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/your-username/solarai-backend.git
cd solarai-backend

## 🧮 Estimator Logic (Backend)

Unit rate: ₹6 per unit

Power generation: 120 units per kW per month

Roof area required: 100 sq.ft per kW

Cost per kW: ₹55,000

Roof feasibility validated before calculation

This logic is shared conceptually with the frontend utility for consistency

##🔐 Security (Future Scope)

JWT-based authentication

Admin-only protected routes

Role-based access control

##🚧 Future Enhancements

AI chatbot integration (OpenAI / Gemini)

Payment gateway (Razorpay / Stripe)

Email & SMS notifications

Analytics dashboard

Cloud deployment (AWS / Azure)

##)

📌 Use Cases

Full-stack solar company application

Backend for estimator & chatbot

Admin dashboard data provider

Scalable startup backend architecture



