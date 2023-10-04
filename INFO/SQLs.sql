CREATE DATABASE demo_db;


CREATE TABLE IF NOT EXISTS products (
    id INT AUTO_INCREMENT PRIMARY KEY,
    product_name VARCHAR(255) NOT NULL,
    quota INT NOT NULL,
    price DECIMAL(10, 2) NOT NULL
);
