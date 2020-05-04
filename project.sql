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

insert into users(username,password,email,address,roles) values ("Jon","123","jon@example.com","Boston","ROLE_ADMIN");
insert into users(username,password,email,address,roles) values ("Jack","123","jack@example.com","NYC","ROLE_USER");

select * from users;

