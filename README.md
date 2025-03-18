# 🚀 **Blogging Application - Microservices + JWT Authentication**

![Java](https://img.shields.io/badge/Java-17-blue?style=for-the-badge&logo=java)  
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.7-green?style=for-the-badge&logo=springboot)  
![MySQL](https://img.shields.io/badge/MySQL-Database-blue?style=for-the-badge&logo=mysql)  
![Swagger](https://img.shields.io/badge/Swagger-API%20Docs-green?style=for-the-badge&logo=swagger)  
![Docker](https://img.shields.io/badge/Docker-Containerization-blue?style=for-the-badge&logo=docker)  
![Postman](https://img.shields.io/badge/Postman-Testing-orange?style=for-the-badge&logo=postman)  
![JWT](https://img.shields.io/badge/JWT-Authentication-red?style=for-the-badge&logo=jsonwebtokens)  

---

## 🌍 **Project Overview**  
A **secure and scalable blogging platform** built with **Spring Boot** and **Microservices Architecture**.  

🔹 Users can **create, update, and delete blog posts**.  
🔹 Implemented **JWT Authentication** for secured APIs.  
🔹 Uses **Swagger UI** for easy API documentation.  

---

## 🛠️ **Tech Stack**  
| 🌟 Technology | 🧉 Usage |
|:--------------|:-----------|
| **Java (Spring Boot)** | Backend Framework |
| **Spring Security + JWT** | Authentication & Authorization |
| **Spring Data JPA** | ORM & Database Management |
| **MySQL** | Relational Database |
| **Swagger** | API Documentation |
| **Docker** | Containerization |
| **Postman** | API Testing |

---

## 💽 **Project Structure**  
```
/blogging-app
 ┣ 📂 src/main/java/com/blog/api/Blog_Application
 ┃ ┣ 📂 config                  # Configuration Files  
 ┃ ┣ 📂 controller              # REST API Controllers  
 ┃ ┣ 📂 entities                # Database Entities  
 ┃ ┃ ┣ 📜 Category.java         # Category Model  
 ┃ ┃ ┣ 📜 Comment.java          # Comment Model  
 ┃ ┃ ┣ 📜 Post.java             # Blog Post Model  
 ┃ ┃ ┣ 📜 Role.java             # User Roles  
 ┃ ┃ ┣ 📜 User.java             # User Model  
 ┃ ┣ 📂 exceptions              # Global Exception Handling  
 ┃ ┣ 📂 payloads                # DTOs & API Responses  
 ┃ ┣ 📂 repository              # Data Access Layer  
 ┃ ┣ 📂 security                # JWT Security Implementation  
 ┃ ┣ 📂 service                 # Service Layer  
```

---

## 🔐 **JWT Authentication Flow**  
1⃣ **User Registers:**  
   - Sends a `POST` request to `/register`  

2⃣ **User Logs In:**  
   - Sends credentials to `/login`  
   - Receives a **JWT token**  

3⃣ **User Accesses Protected APIs:**  
   - Adds **JWT Token** in the `Authorization` header:  
     ```bash
     Authorization: Bearer <your_token>
     ```

---

## 📜 **Swagger UI - API Documentation**  
Access **Swagger UI** for interactive API documentation:  

🔗 **API Documentation URL:**  
```
http://localhost:8081/swagger-ui/index.html
```

---

## 🚀 **How to Run the Project**  

### 🔹 **Step 1: Clone the Repository**  
```bash
git clone https://github.com/your-username/blogging-app.git
cd blogging-app
```

### 🔹 **Step 2: Build the Project**  
```bash
mvn clean install
```

### 🔹 **Step 3: Run Services Using Docker**  
```bash
docker-compose up
```

---

## 🛠️ **API Endpoints Summary**  

### 🔹 **Auth Service (JWT Authentication)**  
| Method | Endpoint | Description |
|--------|---------|-------------|
| `POST` | `/register` | Register a new user |
| `POST` | `/login` | Authenticate user and get JWT token |

### 🔹 **Post Service**  
| Method | Endpoint | Description |
|--------|---------|-------------|
| `POST` | `/posts` | Create a new post |
| `GET` | `/posts/{id}` | Get post details |
| `DELETE` | `/posts/{id}` | Delete a post |

### 🔹 **Comment Service**  
| Method | Endpoint | Description |
|--------|---------|-------------|
| `POST` | `/comments` | Add a comment |
| `DELETE` | `/comments/{id}` | Delete a comment |

---

## 🛡️ **Future Enhancements**  
✅ Implement **Role-Based Access Control (RBAC)**  
✅ Add **Caching for Faster Responses**  
✅ Integrate **Kafka** for Real-Time Messaging  

---

## 🤝 **Contributing**  
If you'd like to contribute, feel free to fork the repository and submit a pull request.  

---

## 📩 **Contact**  
📧 **Email:** sriramsrivatsan2001@gmail.com

