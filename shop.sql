DROP TABLE IF EXISTS `item`;
CREATE TABLE `item` (
  `item_id` int(100) PRIMARY KEY,
  `item_name` varchar(100) DEFAULT NULL,
  `description` varchar(1000) DEFAULT NULL,
  `PRICE` float(11,2) DEFAULT NULL
) ENGINE=InnoDB;


DROP TABLE IF EXISTS `orderitem`;

CREATE TABLE `orderitem` (
  `orderno` varchar(100) PRIMARY KEY,
  `orderDate` date DEFAULT NULL,
  `item_id` int(100) DEFAULT NULL,
  `shopper_id` varchar(100) DEFAULT NULL,
  `quantity` int(100) DEFAULT NULL,
  `price` float(11,2) DEFAULT NULL,
  `discount` float(11,2) DEFAULT NULL,
  `amount` float(11,2) DEFAULT NULL
) ENGINE=InnoDB;

DROP TABLE IF EXISTS `shopkeeper`;
CREATE TABLE `shopkeeper` (
  `shopper_id` int(100) PRIMARY KEY,
  `name` varchar(100) DEFAULT NULL,
  `city` varchar(100) DEFAULT NULL,
  `phone` varchar(11) DEFAULT NULL,
  `address` varchar(40) DEFAULT NULL
) ENGINE=InnoDB;
