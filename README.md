# SCM - Student Course Management System  

SCM (Student Course Management) is a web-based application designed to simplify academic information management in educational institutions. This project provides features for managing students, courses, and administrative tasks efficiently. Built using **Spring Boot** and **Thymeleaf**, it combines a robust backend with a responsive frontend.

---

## ✨ Features  

- **Student Management**:  
  Add, update, delete, and view student details.  
- **Course Management**:  
  Create and manage courses, assign them to students.  
- **Role-Based Access Control**:  
  Secure authentication and authorization for administrators and students.  
- **Dynamic Frontend**:  
  Responsive UI built with Thymeleaf templates and Bootstrap.  
- **RESTful API Support**:  
  APIs for integrating external systems and automating workflows.  

---

## 🛠️ Technologies Used  

| **Category** | **Technology** |
|--------------|----------------|
| Backend      | Spring Boot, Hibernate, Java |
| Frontend     | Thymeleaf, Bootstrap |
| Database     | MySQL |
| Build Tool   | Maven |

---

## 🚀 Getting Started  

### Prerequisites  

Before running the project, ensure you have the following installed on your system:  

1. **Java 17+**  
2. **MySQL**  
3. **Maven**  

---

### Installation  

1. **Clone the Repository**  
   ```bash
   git clone https://github.com/utkarshpr/SCM.git
   cd SCM
   ```

2. **Configure the Database**  
   Update the `application.properties` file located in `src/main/resources`:  
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/scm_database
   spring.datasource.username=your-username
   spring.datasource.password=your-password
   spring.jpa.hibernate.ddl-auto=update
   ```

3. **Build and Run the Application**  
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

4. **Access the Application**  
   Open your browser and go to:  
   [http://localhost:8080](http://localhost:8080)  

---

## 📂 Project Structure  

```
SCM/
├── src/
│   ├── main/
│   │   ├── java/com/example/scm/
│   │   │   ├── controller/      # Handles HTTP requests
│   │   │   ├── model/           # Entity classes
│   │   │   ├── repository/      # Data access layer
│   │   │   ├── service/         # Business logic
│   │   └── resources/
│   │       ├── templates/       # Thymeleaf HTML files
│   │       ├── static/          # CSS, JS, images
│   │       ├── application.properties
├── pom.xml                      # Maven dependencies
└── README.md                    # Documentation
```

---

## 🎥 Video Tutorial Series  

This project is inspired by the **SCM 2.0** tutorial series from **Learn Code With Durgesh**, which provides step-by-step instructions for building this application.  

### Topics Covered:  
1. **Spring Boot Basics**  
   Setting up Spring Boot and project dependencies.  
2. **Database Integration**  
   Using MySQL and Hibernate ORM.  
3. **API Development**  
   Building RESTful APIs for CRUD operations.  
4. **Frontend Development**  
   Integrating Thymeleaf and Bootstrap.  
5. **Authentication & Authorization**  
   Securing the application with role-based access.  
6. **Deployment**  
   Packaging and deploying the application for production.  

### Watch the Playlist:  
[**Spring Boot SCM 2.0 Complete Project**](https://www.youtube.com/playlist?list=PL0zysOflRCemNS641tpw66bcaFylyIGsA)  

---

## 📜 License  

This project is licensed under the **MIT License**. See the [LICENSE](LICENSE) file for details.  

---

## 🤝 Contributing  

Contributions are welcome! To contribute:  

1. **Fork the Repository**  
   ```bash
   git fork https://github.com/utkarshpr/SCM.git
   ```

2. **Create a New Branch**  
   ```bash
   git checkout -b feature-branch
   ```

3. **Commit Your Changes**  
   ```bash
   git commit -m "Add a new feature"
   ```

4. **Push to Your Forked Repository**  
   ```bash
   git push origin feature-branch
   ```

5. **Submit a Pull Request**  

---

## 📧 Contact  

**Author**: Utkarsh Pr  
For questions or feedback, feel free to:  
- Open a GitHub issue: [Report Issue](https://github.com/utkarshpr/SCM/issues)  
- Connect via the repository: [SCM GitHub](https://github.com/utkarshpr/SCM)  
