CREATE TABLE `Meal` (
    `id` BIGINT(10) NOT NULL AUTO_INCREMENT,
    `name_of_meal` VARCHAR(50) NULL DEFAULT NULL,
    `price` DOUBLE(50) NULL DEFAULT NULL,
    PRIMARY KEY (`id`)
);