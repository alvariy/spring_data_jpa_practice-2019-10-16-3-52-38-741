DROP TABLE IF EXISTS `criminal_element`

CREATE TABLE `criminal_element`(
          `id` BINARY(16) NOT NULL,
          `subjectiveElementDescription` varchar(255) NOT NULL,
          `objectiveElementDescription` varchar(255) NOT NULL,
          PRIMARY KEY (`id`)
      );