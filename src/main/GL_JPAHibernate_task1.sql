CREATE DATABASE gl_jpahibernate_task1;
USE gl_jpahibernate_task1;

CREATE TABLE Department (
	id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(40) NOT NULL,
    status TINYINT
);

CREATE TABLE Workers (
	id INT PRIMARY KEY AUTO_INCREMENT,
	age INT NOT NULL,
	availability VARCHAR(40),
	full_name VARCHAR(40),
    department_id INT NOT NULL,
    FOREIGN KEY(department_id) REFERENCES Department(id)
);