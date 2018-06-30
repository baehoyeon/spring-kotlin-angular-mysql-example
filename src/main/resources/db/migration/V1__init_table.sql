-- CREATE SCHEMA `springkotlinangular` DEFAULT CHARACTER SET utf8 ;

CREATE TABLE `springkotlinangular`.`users` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NOT NULL,
  `phoneNumber` VARCHAR(100) NOT NULL,
  `email` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id`));

INSERT INTO `springkotlinangular`.`users` (`name`, `phoneNumber`, `email`) VALUES ('qoo', '010-1234-1234', 'baehoyeon@gmail.com');