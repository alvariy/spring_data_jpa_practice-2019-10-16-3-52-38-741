CREATE TABLE 'criminal_element'(
      'id' BINARY(16) NOT NULL,
      'name' varchar(255) DEFAULT NULL,
      'time' date DEFAULT NULL,
      'element_id' BINARY(16) NOT NULL,
      'procuratorate_id' BINARY(16) NOT NULL,

      PRIMARY KEY ('id')
  );