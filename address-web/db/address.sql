CREATE DATABASE
IF NOT EXISTS `address`;

USE address;

CREATE TABLE addressInfo (
	id INT auto_increment PRIMARY KEY,
	`name` VARCHAR (50) NOT NULL,
	phone VARCHAR (50) NOT NULL
);

