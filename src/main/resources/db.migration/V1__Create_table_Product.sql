CREATE TABLE Product(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    productName VARCHAR(255),
    description VARCHAR(255),
    price  double(11),
    amount INT(11)
) engine=InnoDB DEFAULT CHARSET = gbk;

