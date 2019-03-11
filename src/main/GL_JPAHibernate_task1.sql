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

INSERT INTO Department (name, status) VALUES 
	('Oracle', 0),
    ('GlobalLogic', 1),
    ('Apple', 0),
	('Microsoft', 1),
    ('Epam', 0),
    ('SoftServe', 1)
;

INSERT INTO Workers (age, availability, full_name, department_id) VALUES 
	(22, 'full time', 'Taras Tkhir', 3),
    (19, 'full time', 'Ilona Sofianidi', 1),
    (25, 'full time', 'Yevhen Yarema', 4),
    (20, 'part time', 'Iryna Kvasnytsya', 2),
    (19, 'full time', 'Anastasiia Strontsitska', 5),
    (19, 'part time', 'Roman Korostenskyi', 1),
    (21, 'full time', 'Oleg Sakharuk', 6),
    (20, 'part time', 'Dmytro Kaminsckyi', 4),
    (18, 'part time', 'Mykhash Andrii', 3),
    (18, 'full time', 'Nazar Vladyka', 5),
    (20, 'full time', 'Andrii Kazimirov', 2),
    (20, 'full time', 'Nazar Uniyat', 4)
;