DROP TABLE IF EXISTS tbl_employee;
CREATE TABLE tbl_employee (
  id int(11) NOT NULL AUTO_INCREMENT,
  last_name varchar(50) DEFAULT NULL,
  email varchar(50) DEFAULT NULL,
  gender char(1) DEFAULT NULL,
  age int(11) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;