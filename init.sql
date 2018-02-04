DROP DATABASE IF EXISTS courses;
CREATE DATABASE courses;
use courses;
CREATE TABLE instructors (id INT AUTO_INCREMENT, name VARCHAR(20) UNIQUE NOT NULL, subject VARCHAR(20) NOT NULL, specialization VARCHAR(20) NOT NULL, experience_years INT, PRIMARY KEY (id));
CREATE TABLE course (id INT AUTO_INCREMENT, subject VARCHAR(20) NOT NULL, specialization VARCHAR(20), location_city VARCHAR(20), location_street VARCHAR(20), location_office INT, instructor_id INT NOT NULL, PRIMARY KEY (id), FOREIGN KEY (instructor_id) REFERENCES instructors (id));
CREATE TABLE students (id INT AUTO_INCREMENT, name VARCHAR(20) UNIQUE NOT NULL, phonenumber BIGINT, city VARCHAR(20), street VARCHAR(20), flat INT, course_id INT, PRIMARY KEY (id), FOREIGN KEY (course_id) REFERENCES course(id));
CREATE TABLE grades (id INT AUTO_INCREMENT, value INT, student_id INT, course_id INT, PRIMARY KEY (id), FOREIGN KEY (student_id)REFERENCES students(id),FOREIGN KEY (course_id)REFERENCES course(id));