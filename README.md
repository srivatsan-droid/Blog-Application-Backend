🌍 Project Overview
A secure and scalable blogging platform built with Spring Boot and Microservices Architecture.

🔹 Users can create, update, and delete blog posts.
🔹 Implemented JWT Authentication for secured APIs.
🔹 Uses Swagger UI for easy API documentation.

🛠️ Tech Stack
🌟 Technology	🧩 Usage
Java (Spring Boot)	Backend Framework
Spring Security + JWT	Authentication & Authorization
Spring Data JPA	ORM & Database Management
MySQL	Relational Database
Swagger	API Documentation
Docker	Containerization
Postman	API Testing
📁 Project Structure
pgsql
Copy
Edit
/blogging-app
 ┣ 📂 .mvn                      # Maven Wrapper Files  
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
 ┃ ┃ ┣ 📜 ApiException.java  
 ┃ ┃ ┣ 📜 GlobalExceptionHandler.java  
 ┃ ┃ ┣ 📜 ResourceNotFoundException.java  
 ┃ ┣ 📂 payloads                # DTOs & API Responses  
 ┃ ┃ ┣ 📜 ApiResponse.java  
 ┃ ┃ ┣ 📜 CategoryDTO.java  
 ┃ ┃ ┣ 📜 CommentDto.java  
 ┃ ┃ ┣ 📜 JwtAuthRequest.java  
 ┃ ┃ ┣ 📜 JwtAuthResponse.java  
 ┃ ┃ ┣ 📜 PostDto.java  
 ┃ ┃ ┣ 📜 PostResponse.java  
 ┃ ┃ ┣ 📜 RoleDto.java  
 ┃ ┃ ┣ 📜 UserDto.java  
 ┃ ┣ 📂 repository              # Data Access Layer  
 ┃ ┃ ┣ 📜 CategoryRepo.java  
 ┃ ┃ ┣ 📜 CommentRepo.java  
 ┃ ┃ ┣ 📜 PostRepo.java  
 ┃ ┃ ┣ 📜 UserRepo.java  
 ┃ ┣ 📂 security                # JWT Security Implementation  
 ┃ ┃ ┣ 📜 CustomUserDetailService.java  
 ┃ ┃ ┣ 📜 JwtAuthenticationEntryPoint.java  
 ┃ ┃ ┣ 📜 JwtAuthenticationFilter.java  
 ┃ ┃ ┣ 📜 JwtTokenHelper.java  
 ┃ ┣ 📂 service                 # Service Layer  
 ┃ ┃ ┣ 📂 impl                  # Service Implementations  
 ┃ ┃ ┃ ┣ 📜 CategoryServiceImpl.java  
 ┃ ┃ ┃ ┣ 📜 CommentServiceImpl.java  
 ┃ ┃ ┃ ┣ 📜 FileServiceImpl.java  
 ┃ ┃ ┃ ┣ 📜 PostServiceImpl.java  
 ┃ ┃ ┃ ┣ 📜 UserServiceImpl.java  
 ┃ ┃ ┣ 📜 CategoryService.java  
 ┃ ┃ ┣ 📜 CommentService.java  
 ┃ ┃ ┣ 📜 FileService.java  
 ┃ ┃ ┣ 📜 PostService.java  
 ┃ ┃ ┣ 📜 UserService.java  
🔐 JWT Authentication Flow
1️⃣ User Registers:

Sends a POST request to /register
2️⃣ User Logs In:

Sends credentials to /login
Receives a JWT token
3️⃣ User Accesses Protected APIs:

Adds JWT Token in the Authorization header:
bash
Copy
Edit
Authorization: Bearer <your_token>
📜 Swagger UI - API Documentation
Access Swagger UI for interactive API documentation:

🔗 API Documentation URL:

bash
Copy
Edit
http://localhost:8081/swagger-ui/index.html
🚀 How to Run the Project
🔹 Step 1: Clone the Repository
bash
Copy
Edit
git clone https://github.com/your-username/blogging-app.git
cd blogging-app
🔹 Step 2: Build the Project
bash
Copy
Edit
mvn clean install
🔹 Step 3: Run Services Using Docker
bash
Copy
Edit
docker-compose up
🚧 API Endpoints Summary
🔹 Auth Service (JWT Authentication)
Method	Endpoint	Description
POST	/register	Register a new user
POST	/login	Authenticate user and get JWT token
🔹 Post Service
Method	Endpoint	Description
POST	/posts	Create a new post
GET	/posts/{id}	Get post details
DELETE	/posts/{id}	Delete a post
🔹 Comment Service
Method	Endpoint	Description
POST	/comments	Add a comment
DELETE	/comments/{id}	Delete a comment
🚀 Future Enhancements
✅ Implement Role-Based Access Control (RBAC)
✅ Add Caching for Faster Responses
✅ Integrate Kafka for Real-Time Messaging

🤝 Contributing
If you'd like to contribute, feel free to fork the repository and submit a pull request.

📬 Contact
📧 Email: sriramsrivatsan2001@gmail.com
