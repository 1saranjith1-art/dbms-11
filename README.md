# Experiment 11: GUI Application with Database Connectivity

## Aim
To design and develop a GUI application with database connectivity using Java Swing, JDBC and MySQL.

## Technologies Used
- Java
- Java Swing
- JDBC
- MySQL
- VS Code

## Description
This application provides a student login interface. It verifies the username and password entered by the user against records stored in a MySQL database.

## Database Details
- Database: `swing_demo`
- Table: `student`
- Columns: `name`, `password`

## How to Run
1. Start the MySQL server.
2. Execute `database.sql` in MySQL Workbench.
3. Configure the MySQL username and password in `Login.java`.
4. Download MySQL Connector/J and place the JAR file inside the `lib` folder.
5. Open the terminal in the project directory.
6. Compile using `javac -cp ".;lib\*" Login.java`.
7. Run using `java -cp ".;lib\*" Login`.

## Sample Credentials
- Username: `aadi`
- Password: `1234`

## Expected Output
The application displays a login window. Correct credentials display "Login Successful"; incorrect credentials display "Invalid Login".

## Result
Thus, a GUI application with database connectivity was successfully designed and developed using Java Swing, JDBC and MySQL.