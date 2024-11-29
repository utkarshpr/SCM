# SCM - Smart Contact Manager  

SCM (Smart Contact Manager) is a web-based application designed to manage personal and professional contacts effectively. Built with **Spring Boot** and **Thymeleaf**, it provides users with a secure, role-based platform for storing, organizing, and retrieving contact details.

---

## ✨ Features  

- **Contact Management**:  
  Add, update, delete, and view contact details.  
- **User Authentication**:  
  Secure login and role-based access control for users.  
- **User-Specific Data**:  
  Each user can manage their own contact list privately.  
- **Dynamic Frontend**:  
  Responsive UI built with Thymeleaf templates and Bootstrap.  
- **RESTful API Support**:  
  Easily integrate the contact manager with external systems.  

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

---  
