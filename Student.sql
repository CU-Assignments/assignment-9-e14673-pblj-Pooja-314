-- Create database
CREATE DATABASE IF NOT EXISTS studentdb;

-- Use the database
USE studentdb;

-- Create Student table
CREATE TABLE IF NOT EXISTS student (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    age INT NOT NULL
);
