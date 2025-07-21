Smarthire - Job Portal App

📌 Project Overview Smarthire is a simple full-stack web application designed to help users browse job listings and create new job posts. It is built using Java Spring Boot for the backend, ReactJS for the frontend, and MongoDB for data persistence.

This project demonstrates how to create a modular and scalable application using a modern technology stack, implementing essential CRUD operations with pagination and keyword-based searching.

🚀 Features

🔍 Job Feed Page: View all available job posts fetched from a local MongoDB database.
🔎 Search Functionality: Filter job posts based on keywords like Java, Python, etc.
📄 Pagination: Display 6 jobs per page with clickable page numbers for easy navigation.
📝 Create Job Post: Submit new job listings through a form and store them in MongoDB.
🛠️ Tech Stack

Backend

Java Spring Boot
Spring Web (REST APIs)
Spring Data MongoDB
Maven
Frontend

ReactJS
Axios for HTTP requests
React Router for navigation
TailwindCSS for styling
Database

MongoDB (running locally)
📸 Project Screenshots

🏠 Home Page
The Landing Page of the Job Portal Platform. 
Screenshot 2025-07-21 at 9 42 03 AM

📝 Job Creating Form Page
POST - Create a new job 
Screenshot 2025-07-21 at 9 42 48 AM

💼 Job Listings
GET - All job posts Listing here. 
Screenshot 2025-07-21 at 9 43 12 AM

🔍 Search Job Post by Keyword
GET - Search job listings by entering a keyword related to title, description, or company.
Screenshot 2025-07-21 at 9 43 57 AM

📌 Prerequisites
Ensure you have the following installed:

Java 17+
Node.js & npm
MongoDB installed locally or access to MongoDB Atlas
🔽 Backend Setup

cd backend
The Spring Boot app will start at **http://localhost:8080

🌐 Frontend Setup

cd frontend
npm install
npm run dev
The React app will start at **http://localhost:5174
