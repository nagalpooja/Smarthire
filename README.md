Smarthire - Job Portal App

📌 Project Overview 

Smarthire is a simple full-stack web application designed to help users browse job listings and create new job posts. It is built using Java Spring Boot for the backend, ReactJS for the frontend, and MongoDB for data persistence.

This project demonstrates how to create a modular and scalable application using a modern technology stack, implementing essential CRUD operations with pagination and keyword-based searching.

🚀 Features

🔍 Job Feed Page: View all available job posts fetched from a local MongoDB database.

🔎 Search Functionality: Filter job posts based on keywords like Java, Python, etc.

📄 Pagination: Display 6 jobs per page with clickable page numbers for easy navigation.

📝 Create Job Post: Submit new job listings through a form and store them in MongoDB.

📝 Delete Job Post: Users can delete job posts with confirmation prompt.

🛠️ Tech Stack

##Backend

Java Spring Boot
Spring Web (REST APIs)
Spring Data MongoDB
Maven

##Frontend

ReactJS
Axios for HTTP requests
React Router for navigation
TailwindCSS for styling

##Database

MongoDB (running locally)

📸 Project Screenshots

🏠 Home Page
The Landing Page of the Job Portal Platform. 

<img width="1312" height="770" alt="Screenshot 2025-07-21 at 9 50 51 AM" src="https://github.com/user-attachments/assets/5f91bdda-cd5a-499d-aab5-bf13d63817b7" />


📝 Job Creating Form Page
POST - Create a new job 

<img width="1219" height="704" alt="Screenshot 2025-07-21 at 9 51 09 AM" src="https://github.com/user-attachments/assets/01ed43d1-39d8-45bf-b40e-7dc4ff95bc19" />


💼 Job Listings
GET - All job posts Listing here. 

<img width="1320" height="633" alt="Screenshot 2025-07-21 at 9 51 29 AM" src="https://github.com/user-attachments/assets/e224ab4f-c4cf-43ce-880e-0e8f213e3b73" />


🔍 Search Job Post by Keyword
GET - Search job listings by entering a keyword related to title, description, or company.

<img width="1012" height="573" alt="Screenshot 2025-07-21 at 9 52 09 AM" src="https://github.com/user-attachments/assets/dc388c14-f6b5-49a0-b056-b308362d675b" />

📌 Prerequisites

##Ensure you have the following installed:

1. Java 17+
2. Node.js & npm
3. MongoDB installed locally or access to MongoDB Atlas

🔽 Backend Setup

cd backend

The Spring Boot app will start at **http://localhost:8080

🌐 Frontend Setup

cd frontend
npm install
npm run dev

The React app will start at **http://localhost:5174
