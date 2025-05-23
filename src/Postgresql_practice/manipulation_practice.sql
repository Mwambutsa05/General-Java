
CREATE TABLE IF NOT EXISTS Books(
book_id SERIAL PRIMARY KEY,
title VARCHAR(80),
author VARCHAR(60),
price VARCHAR(50),
stock_quantity VARCHAR(40)
);

CREATE TABLE IF NOT EXISTS Customers(
customer_id SERIAL PRIMARY KEY,
first_name VARCHAR(100),
last_name VARCHAR(100),
email VARCHAR UNIQUE,
phone VARCHAR UNIQUE
);

CREATE TABLE IF NOT EXISTS Orders(
order_id SERIAL PRIMARY KEY,
customer_id INT,
order_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
total_amount VARCHAR(70)
)

INSERT INTO Books (title, author, price, stock_quantity) values 
('The silent patient', 'coolen Hoover', '16000', '6'),
('As long as both shall live', 'Daniel steel', '16000', '9'),
('Maybe someday', 'coolen Hoover', '19000', '4'),
('it start with us', 'coolen Hoover', '23000', '2'),
('it ends with us', 'coolen Hoover', '23000', '3');

INSERT INTO Customers (first_name, last_name, email, phone) values 
('Mwambutsa', 'Daryce', 'mwambutsadaryce@gmail.com', '0781886927'),
('Mwambutsa', 'Divine', 'mwambutsadivine@gmail.com', '0788900804'),
('Mwambutsa', 'Daniella', 'mwambutsadaniella@gmail.com', '0787678615'),
('Mwambutsa', 'Doriane', 'mwambutsadoriane@gmail.com', '0781334412'),
('Mwambutsa', 'Celestin', 'mwambutsacelestin@gmail.com', '0788638762');

INSERT INTO Customers (customer_id, total_amout) values
(1, '30000'),
(2, '66000'),
(3, '50000'),
(4, '10000'),
(5, '30000');


