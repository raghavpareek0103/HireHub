# 🚀 HireHub — Full-Stack Job Portal

<p align="center">
  <strong>A modern full-stack recruitment platform connecting candidates with recruiters and job opportunities.</strong>
</p>

<p align="center">
  Built with <strong>React.js</strong> · <strong>Spring Boot</strong> · <strong>MySQL</strong> · <strong>REST APIs</strong>
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Frontend-React.js-61DAFB?style=for-the-badge&logo=react&logoColor=black" alt="React.js">
  <img src="https://img.shields.io/badge/Backend-Spring%20Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white" alt="Spring Boot">
  <img src="https://img.shields.io/badge/Language-Java%2021-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java 21">
  <img src="https://img.shields.io/badge/Database-MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white" alt="MySQL">
</p>

<p align="center">
  <img src="https://img.shields.io/badge/API-REST-02569B?style=flat-square" alt="REST API">
  <img src="https://img.shields.io/badge/Security-JWT-000000?style=flat-square" alt="JWT">
  <img src="https://img.shields.io/badge/ORM-Hibernate-59666C?style=flat-square" alt="Hibernate">
  <img src="https://img.shields.io/badge/Build-Maven-C71A36?style=flat-square" alt="Maven">
  <img src="https://img.shields.io/badge/License-Educational-lightgrey?style=flat-square" alt="License">
</p>

---

## 📌 Overview

**HireHub** is a full-stack job portal designed to simplify the recruitment process by providing a centralized platform for **job seekers, recruiters, and administrators**.

The platform enables candidates to discover relevant job opportunities, explore companies, manage their profiles, submit applications, and track application progress.

Recruiters can manage company profiles, publish job opportunities, manage job listings, and review candidate applications.

The application follows a **layered backend architecture** with a RESTful API design, JWT-based authentication, role-based authorization, and MySQL persistence.

### 🎯 What HireHub Solves

* 🔍 Simplifies job discovery for candidates
* 🏢 Helps recruiters manage job postings
* 📄 Provides a structured application workflow
* 🔐 Secures APIs using JWT authentication
* 📊 Supports scalable job and company listings
* 👥 Separates candidate and recruiter responsibilities

---

## ✨ Key Features

### 👨‍💻 Candidate

* User registration and login
* JWT-based authentication
* Candidate profile management
* Browse available jobs
* Search jobs by keyword
* Filter jobs by location and other criteria
* View detailed job information
* Explore companies
* Apply for jobs
* Track submitted applications
* View application status

### 🏢 Recruiter

* Recruiter registration and authentication
* Recruiter profile management
* Create and update company profiles
* Post new job opportunities
* Update and manage job postings
* View company information
* Review candidate applications
* Track recruitment activity

### 🔐 Authentication & Security

* JWT-based authentication
* Role-based access control
* Protected REST API endpoints
* Candidate and recruiter authorization
* Secure password handling
* Unauthorized access handling

### 🔎 Jobs & Companies

* Job listing
* Job search
* Job filtering
* Company listing
* Company search
* Company details
* Company-specific job listings
* Pagination
* Sorting

---

# 🛠️ Technology Stack

## Frontend

| Technology           | Purpose                             |
| -------------------- | ----------------------------------- |
| **React.js**         | User interface development          |
| **Vite**             | Frontend development and build tool |
| **JavaScript / JSX** | Application development             |
| **CSS**              | Styling                             |
| **React Router**     | Client-side routing                 |
| **Axios**            | REST API communication              |

## Backend

| Technology          | Purpose                        |
| ------------------- | ------------------------------ |
| **Java 21**         | Backend development            |
| **Spring Boot**     | REST API development           |
| **Spring Security** | Authentication & authorization |
| **JWT**             | Token-based authentication     |
| **Spring Data JPA** | Database interaction           |
| **Hibernate**       | Object-relational mapping      |
| **Maven**           | Dependency management          |

## Database

| Technology          | Purpose             |
| ------------------- | ------------------- |
| **MySQL**           | Relational database |
| **JPA / Hibernate** | Persistence layer   |

---

# 🏗️ System Architecture

HireHub follows a layered full-stack architecture where the React frontend communicates with the Spring Boot backend through REST APIs.

```text
                         ┌──────────────────────┐
                         │      HireHub UI      │
                         │      React.js        │
                         └──────────┬───────────┘
                                    │
                                    │ HTTP / REST API
                                    ▼
                         ┌──────────────────────┐
                         │    Spring Boot API   │
                         │      Backend         │
                         └──────────┬───────────┘
                                    │
                 ┌──────────────────┼──────────────────┐
                 │                  │                  │
                 ▼                  ▼                  ▼
          ┌─────────────┐    ┌─────────────┐    ┌─────────────┐
          │ Controllers │    │  Services   │    │  Security   │
          └─────────────┘    └──────┬──────┘    └─────────────┘
                                    │
                                    ▼
                             ┌─────────────┐
                             │ Repositories│
                             │ Spring Data │
                             └──────┬──────┘
                                    │
                                    ▼
                             ┌─────────────┐
                             │    MySQL    │
                             │  Database   │
                             └─────────────┘
```

---

# 📂 Project Structure

```text
HireHub/
│
├── backend/
│   ├── src/
│   │   └── main/
│   │       ├── java/
│   │       │   └── com.hirehub.hirehub/
│   │       │       ├── controller/
│   │       │       ├── service/
│   │       │       ├── repository/
│   │       │       ├── entity/
│   │       │       ├── dto/
│   │       │       ├── security/
│   │       │       ├── exception/
│   │       │       └── ...
│   │       │
│   │       └── resources/
│   │           └── application.properties
│   │
│   └── pom.xml
│
├── frontend/
│   ├── src/
│   │   ├── components/
│   │   ├── pages/
│   │   ├── services/
│   │   ├── context/
│   │   ├── assets/
│   │   ├── App.jsx
│   │   └── main.jsx
│   │
│   ├── package.json
│   └── vite.config.js
│
└── README.md
```

---

# 🚀 Getting Started

Follow the steps below to run HireHub locally.

## 1. Clone the Repository

```bash
git clone <https://github.com/raghavpareek0103>
cd hirehub-main
```

---

# ⚙️ Backend Setup

Navigate to the backend directory:

```bash
cd backend
```

### Install Dependencies

```bash
mvn clean package -DskipTests
```

### Start the Backend

```bash
mvn spring-boot:run
```

The Spring Boot application will start on the port configured in the project.

---

# 🗄️ Database Configuration

HireHub uses **MySQL** as its relational database.

### Create the Database

Open MySQL and execute:

```sql
CREATE DATABASE hirehub;
```

Then open:

```text
backend/src/main/resources/application.properties
```

Configure your database connection:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/hirehub
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=false
```

Replace:

```text
YOUR_PASSWORD
```

with your local MySQL password.

> ⚠️ Make sure MySQL is running before starting the Spring Boot backend.

---

# 🎨 Frontend Setup

Open a new terminal and navigate to the frontend directory:

```bash
cd frontend
```

### Install Dependencies

```bash
npm install
```

### Start Development Server

```bash
npm run dev
```

Vite will provide a local development URL similar to:

```text
http://localhost:5173
```

Open the URL in your browser.

---

# 🔄 Running the Complete Application

HireHub requires both the backend and frontend to be running.

### Terminal 1 — Backend

```bash
cd backend
mvn spring-boot:run
```

### Terminal 2 — Frontend

```bash
cd frontend
npm run dev
```

Then open:

```text
http://localhost:5173
```

---

# 📡 Application Flow

```text
┌───────────────────────┐
│       Candidate       │
│       Recruiter       │
└───────────┬───────────┘
            │
            ▼
┌───────────────────────┐
│    React Frontend     │
│        Vite           │
└───────────┬───────────┘
            │
            │ REST API
            ▼
┌───────────────────────┐
│    Spring Boot API    │
│                       │
│ Controllers           │
│ Services              │
│ Repositories          │
│ Security              │
└───────────┬───────────┘
            │
            │ JPA / Hibernate
            ▼
┌───────────────────────┐
│        MySQL          │
└───────────────────────┘
```

---

# 🔐 Authentication Flow

HireHub uses **JWT-based authentication** with Spring Security.

```text
User
  │
  ▼
Login / Registration
  │
  ▼
Spring Boot Authentication
  │
  ▼
JWT Token Generated
  │
  ▼
Frontend Stores Authentication State
  │
  ▼
JWT Included in Protected Requests
  │
  ▼
Spring Security Validates Token
  │
  ▼
Authorized Resource
```

---

# 🧩 Backend Architecture

The backend follows a layered architecture to maintain separation of concerns and improve maintainability.

### Controller Layer

Responsible for:

* Handling HTTP requests
* Validating request inputs
* Exposing REST endpoints
* Returning API responses

```text
controller/
```

### Service Layer

Contains the application's business logic.

```text
service/
```

### Repository Layer

Responsible for database operations using Spring Data JPA.

```text
repository/
```

### Entity Layer

Contains the application's database entities, including:

* `User`
* `Job`
* `Company`
* `Application`

```text
entity/
```

### DTO Layer

Data Transfer Objects are used to transfer structured data between the frontend and backend.

```text
dto/
```

### Security Layer

Handles:

* JWT authentication
* Authorization
* Protected endpoints
* Security configuration

```text
security/
```

### Exception Layer

Provides centralized application error handling.

```text
exception/
```

---

# 👥 User Roles

HireHub supports role-based access control.

| Role             | Capabilities                                                       |
| ---------------- | ------------------------------------------------------------------ |
| 👤 **Candidate** | Search jobs, explore companies, apply for jobs, track applications |
| 🏢 **Recruiter** | Manage companies, post jobs, manage applications                   |
| 🛡️ **Admin**    | Administrative access and platform management                      |

---

# 💼 Core Modules

## Jobs

Candidates can:

* Browse jobs
* Search jobs
* Filter jobs
* View job details
* Apply for jobs

Recruiters can:

* Create jobs
* Update jobs
* Manage job postings
* View job-related applications

---

## Companies

Users can:

* Browse companies
* Search companies
* View company details
* View jobs posted by a company

Recruiters can:

* Create company profiles
* Update company information
* Manage company details

---

## Applications

Candidates can:

* Submit job applications
* Track submitted applications
* View application status

Recruiters can:

* View applications
* Review candidates
* Manage applications for their jobs

---

# 📊 Pagination & Sorting

The application supports paginated API responses for scalable job and company listings.

Example response:

```json
{
  "content": [],
  "page": 0,
  "size": 10,
  "totalElements": 0,
  "totalPages": 0,
  "last": true
}
```

Sorting can be performed using configurable sorting parameters.

---

# 🖥️ Frontend Pages

The frontend includes dedicated pages for:

* 🏠 Home
* 💼 Jobs
* 🏢 Companies
* 🔐 Login
* 📝 Registration
* 👤 Candidate Dashboard
* 🏢 Recruiter Dashboard
* 📄 Job Details
* 🏢 Company Details
* 📋 Applications
* ⚙️ Profile

---

# 🌐 API Structure

The backend exposes REST APIs for the major application modules.

### Authentication

```text
/api/auth
```

### Users

```text
/api/users
```

### Jobs

```text
/api/jobs
```

### Companies

```text
/api/companies
```

### Applications

```text
/api/applications
```

> API paths may vary depending on the controller configuration.

---

# 🧪 Build & Verification

## Backend

### Build

```bash
mvn clean package -DskipTests
```

### Run Tests

```bash
mvn test
```

### Run Application

```bash
mvn spring-boot:run
```

---

## Frontend

### Install Dependencies

```bash
npm install
```

### Development Server

```bash
npm run dev
```

### Production Build

```bash
npm run build
```

### Preview Production Build

```bash
npm run preview
```

---

# 🔧 Environment Configuration

Before running the application, configure the required database and backend settings.

Example:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/hirehub
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
```

### 🔒 Production Security

Never commit sensitive credentials directly to the repository.

Sensitive values such as:

* Database passwords
* JWT secrets
* API keys
* Environment-specific configuration

should be managed using **environment variables or a secure secret-management solution**.

---

# 🚢 Deployment

HireHub is structured so that the frontend, backend, and database can be deployed independently.

### Frontend

Potential deployment platforms:

* Vercel
* Netlify
* Render

### Backend

Potential deployment platforms:

* Render
* Railway
* AWS
* Azure
* Any Java-compatible hosting platform

### Database

Potential MySQL hosting options:

* AWS RDS
* Railway
* Aiven
* Other managed MySQL providers

---

# 🔮 Future Improvements

Planned or possible enhancements include:

* 🤖 Advanced job recommendation system
* 📄 Resume upload and parsing
* 📧 Email notifications
* ⚡ Real-time application updates
* 📊 Recruiter analytics dashboard
* 🎯 Candidate skill matching
* ❤️ Saved jobs
* 🔔 Job alerts
* 📈 Admin analytics
* ☁️ Cloud deployment
* 🔄 Automated CI/CD pipeline

---

# 🤝 Contributing

Contributions are welcome.

### 1. Fork the repository

```bash
git fork <https://github.com/raghavpareek0103>
```

### 2. Create a feature branch

```bash
git checkout -b feature/your-feature
```

### 3. Commit your changes

```bash
git commit -m "Add your feature"
```

### 4. Push the branch

```bash
git push origin feature/your-feature
```

### 5. Create a Pull Request

Open a pull request describing your changes.

---

# 👨‍💻 Author

<p align="center">
  <strong>Raghav Pareek</strong>
  <br>
  B.Tech — Computer Science & Engineering
</p>

---

# 📄 License

This project is developed for **educational and portfolio purposes**.

---

<p align="center">
   If you found this project useful, consider giving it a star!
</p>

<p align="center">
  <strong>Built with Java, Spring Boot, React.js & MySQL ❤</strong>
</p>
