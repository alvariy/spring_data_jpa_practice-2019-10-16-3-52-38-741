DROP TABLE IF EXISTS 'prosecutor'

CREATE TABLE 'prosecutor'(
      'id' BINARY(16) NOT NULL DEFAULT random_uuid(),
      'name' varchar(255) DEFAULT NULL,
      PRIMARY KEY ('id')
  );