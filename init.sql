CREATE DATABASE BOOK;

USE BOOK;

CREATE TABLE `book`(
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `title` varchar(128) DEFAULT Null,
    `pages` int(11),
    PRIMARY KEY (`id`)
);

INSERT INTO book VALUES (1,'Java',332);
INSERT INTO book VALUES (2,'SpringBoot',80);
INSERT INTO book VALUES (3,'Git',12);
