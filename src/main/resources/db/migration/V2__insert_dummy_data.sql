SELECT @UserId := max(id) FROM `springkotlinangular`.`users`;

INSERT INTO `springkotlinangular`.`users` (`id`, `name`, `phoneNumber`, `email`) VALUES ((@UserId := @UserId + 1), 'pooh', '010-1234-4321', 'pooh@gmail.com');
INSERT INTO `springkotlinangular`.`users` (`id`, `name`, `phoneNumber`, `email`) VALUES ((@UserId := @UserId + 1), 'kotlin', '010-4321-1234', 'kotlin@gmail.com');
INSERT INTO `springkotlinangular`.`users` (`id`, `name`, `phoneNumber`, `email`) VALUES ((@UserId := @UserId + 1), 'java', '010-4321-4321', 'java@gmail.com');