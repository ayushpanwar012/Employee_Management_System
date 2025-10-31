# Employee Management System (Java + JDBC + MySQL)

A simple backend CRUD application built using **Java, JDBC, and MySQL**.

## 🚀 Features
- Add, View, Update, and Delete Employees
- Uses PreparedStatement for secure database access
- DAO architecture for clean code organization
- Console-based user interaction

## 🧩 Technologies Used
- Java (JDK 8+)
- JDBC
- MySQL
- Eclipse IDE

## 🛠 Setup Instructions
1. Clone this repository:
   ```bash
   git clone https://github.com/<your-username>/Employee-Management-System-Java.git
2.**Create a MySQL database:**
```
CREATE DATABASE employee_db;
USE employee_db;
CREATE TABLE employees (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    department VARCHAR(50),
    salary DOUBLE
);
```
4.**Update EmployeeDBConnection.java with your MySQL username and password.**

5.**Add mysql-connector-j-8.3.0.jar to your project’s classpath.**

6.**Run EmployeeMain.java and enjoy!**

📸 **Sample Console Output**
~~~
=== Employee Management ===
1. Add Employee
2. View Employees
3. Update Employee Salary
4. Delete Employee
5. Exit
~~~
