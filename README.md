# 🎓 Online Examination System – Java Console Application

A **Java-based Online Examination System** implemented as a **console application** using **Object-Oriented Programming (OOP)** concepts.  
This project simulates the core functionalities of an online exam platform including authentication, profile management, MCQ exams, timer-based auto submission, and logout.

---

## 📌 Project Overview

The Online Examination System allows a user to securely log in using a username and password.  
After authentication, the user can update profile details, change password, attempt a timed multiple-choice examination, and safely log out.

The exam is automatically submitted when the **timer expires**, demonstrating the use of **multithreading in Java**.

---

## ✨ Features

- 🔐 Secure Login (Username & Password)
- 👤 Update Profile (Username)
- 🔑 Change Password
- 📝 Multiple Choice Questions (MCQs)
- ⏰ Timer with Auto-Submit (Thread-based)
- 🚪 Logout / Close Session
- 🧠 Object-Oriented Design

---

## 🧑‍💻 Technologies Used

- **Java (JDK 8+)**
- **Object-Oriented Programming**
- **Multithreading (Timer)**
- **Console I/O**
- **Git & GitHub**

---

## 📂 Project Structure
online-examination-java-oasis/
├── src/
│ └── main/java/com/pranav/exam/
│ ├── Main.java
│ ├── ExamSystem.java
│ ├── User.java
│ ├── Question.java
│ └── Timer.java
│
├── README.md
└── LICENSE


---

## ▶️ How to Run the Project (Windows / Linux / macOS)

### ✅ Prerequisites
- Java JDK 8 or higher installed
- Git installed

---

### 🔹 Step 1: Clone the Repository

```bash
git clone https://github.com/Pranavreddyedula/online-examination-java-oasis.git

🔹 Step 2: Navigate to Source Folder
cd online-examination-java-oasis
cd src/main/java

🔹 Step 3: Compile the Java Files
javac com/pranav/exam/*.java

🔹 Step 4: Run the Application
java com.pranav.exam.Main

🔐 Default Login Credentials
Username: pranav
Password: 1234


(Credentials can be modified in ExamSystem.java)

🧪 Sample Menu Output
=== ONLINE EXAMINATION SYSTEM ===
1. Update Profile
2. Change Password
3. Start Exam
4. Logout
Choose:

⏰ Exam & Timer Behavior

The exam duration is 60 seconds

Timer runs using a separate thread

Exam is auto-submitted when time expires

Score is displayed immediately after submission

🎓 Academic Relevance

This project is suitable for:

Java Mini Project

OOPs Laboratory

Software Engineering Coursework

College Viva / Practical Examination

Beginner to Intermediate Java Projects

🚀 Future Enhancements

Load questions from file or database

Support multiple users

GUI version using Java Swing / JavaFX

Web-based version

Result storage and analytics

👨‍🎓 Author

Edula Sai Pranav Reddy
B.Tech – Computer Science & Engineering

🔗 GitHub Profile:
https://github.com/Pranavreddyedula

🔗 Project Repository:
https://github.com/Pranavreddyedula/online-examination-java-oasis

📜 License

This project is licensed under the MIT License.
Free to use, modify, and distribute for educational purposes.
