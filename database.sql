
CREATE DATABASE IF NOT EXISTS swing_demo;
USE swing_demo;

CREATE TABLE IF NOT EXISTS student (
    name VARCHAR(30),
    password VARCHAR(30)
);

INSERT INTO student (name, password)
SELECT 'aadi', '1234'
WHERE NOT EXISTS (
    SELECT 1 FROM student WHERE name = 'aadi'
);

SELECT * FROM student;
