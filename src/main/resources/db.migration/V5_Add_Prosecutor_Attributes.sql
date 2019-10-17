DROP TABLE IF EXISTS `prosecutor`

CREATE TABLE `prosecutor`(
      `id` BINARY(16) NOT NULL DEFAULT random_uuid(),
      `name` varchar(255) DEFAULT NULL,
      `age` BINARY(16) NOT NULL,
      `sex` varchar(255) NOT NULL,
      `experience` BINARY(16) NOT NULL,
      `birthday` varchar(255) NOT NULL,
      PRIMARY KEY (`id`)
  );