
Smarthire - Job Portal App 

📌 Project Overview
Smarthire is a simple full-stack web application designed to help users browse job listings and create new job posts. It is built using **Java Spring Boot** for the backend, **ReactJS** for the frontend, and **MongoDB** for data persistence.

This project demonstrates how to create a modular and scalable application using a modern technology stack, implementing essential CRUD operations with pagination and keyword-based searching.

 🚀 Features

- 🔍 **Job Feed Page**: View all available job posts fetched from a local MongoDB database.
- 🔎 **Search Functionality**: Filter job posts based on keywords like `Java`, `Python`, etc.
- 📄 **Pagination**: Display 6 jobs per page with clickable page numbers for easy navigation.
- 📝 **Create Job Post**: Submit new job listings through a form and store them in MongoDB.

🛠️ Tech Stack

Backend
- [Java Spring Boot](https://start.spring.io/)
- Spring Web (REST APIs)
- Spring Data MongoDB
- Maven

Frontend
- [ReactJS](https://reactjs.org/)
- Axios for HTTP requests
- React Router for navigation
- TailwindCSS for styling

Database
- [MongoDB](https://www.mongodb.com/) (running locally)

📸 Project Screenshots

### 🏠 Home Page
The Landing Page of the Job Portal Platform.
<img width="1331" height="769" alt="Screenshot 2025-07-21 at 9 42 03 AM" src="https://github.com/user-attachments/assets/6a013f09-e15b-420d-8590-fd8879631f97" />

### 📝 Job Creating Form Page
`POST` - Create a new job
<img width="1335" height="706" alt="Screenshot 2025-07-21 at 9 42 48 AM" src="https://github.com/user-attachments/assets/92ce6dbc-9260-4487-a47c-8ff7ec78bf8b" />


### 💼 Job Listings
`GET` - All job posts Listing here.
<img width="1327" height="635" alt="Screenshot 2025-07-21 at 9 43 12 AM" src="https://github.com/user-attachments/assets/877dbeab-0c41-46cb-b8e8-b2496c52c537" />

### 🔍 Search Job Post by Keyword  
`GET` - Search job listings by entering a keyword related to title, description, or company.  
<img width="1264" height="664" alt="Screenshot 2025-07-21 at 9 43 57 AM" src="https://github.com/user-attachments/assets/101cd0d9-1533-440d-8d88-9dc774f15117" />

### 📌 Prerequisites
Ensure you have the following installed:
- **Java 17+**
- **Node.js & npm**
- **MongoDB installed locally or access to MongoDB Atlas**

🔽 Backend Setup

```bash
cd backend
```
The Spring Boot app will start at **[http://localhost:8080](http://localhost:8080)

🌐 Frontend Setup

```bash
cd frontend
npm install
npm run dev
```

The React app will start at **[http://localhost:5174](http://localhost:5174/)
