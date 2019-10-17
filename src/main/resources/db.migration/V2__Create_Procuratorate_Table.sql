DROP TABLE IF EXISTS `procuratorate`

CREATE TABLE `procuratorate`(
      `id` BINARY(16) NOT NULL,
      `name` varchar(255) DEFAULT NULL,
      PRIMARY KEY (`id`)
  );