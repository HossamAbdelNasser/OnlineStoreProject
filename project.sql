create database store;
use store;

create table users (
id INT AUTO_INCREMENT PRIMARY KEY,
username varchar(255),
password varchar(255),
email varchar(255),
address varchar(255),
roles varchar(255)
);

insert into users(username,password,email,address,roles) values ("Mo","123","Mo@example.com","Cairo","ROLE_ADMIN");

select * from users;

