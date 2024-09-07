CREATE DATABASE  IF NOT EXISTS users_cards;
USE users_cards;

Drop table if exists user_card; 

CREATE TABLE user_card (
  id int NOT NULL AUTO_INCREMENT,
  first_name varchar(45) DEFAULT NULL,
  last_name varchar(45) DEFAULT NULL,
  age int(100) DEFAULT NULL,
  email varchar(45) DEFAULT NULL,
  normal_cards int(100) DEFAULT NULL,
  rare_cards int(100) DEFAULT NULL,
  superrare_cards int(100) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

-- Data for table employee

INSERT INTO user_card VALUES 
	(1,'Jose','Villarreal',22,'josevillarreal@cartas.com', 33, 45, 4),
	(2,'Jack','Bauer',44,'jackbauer@cartas.com',23,42,2),
	(3,'Joey','Wheeler',17,'Joeywheeler@cartas.com',2,24,25),
	(4,'Leon','Kennedy',25,'LeonKennedy@cartas.com', 99, 22, 23),
	(5,'Ada','Wong',25 ,'Adawong@cartas.com', 50,23,2),
	(0,'Connor','Mcgregor',26 ,'ConnorMcgregor@cartas.com', 1,2,3);

INSERT INTO `user_card` VALUES 
    (6,'John','Doe',30,'johndoe@cards.com', 10, 5, 1),
    (7,'Emily','Clark',28,'emilyclark@cards.com', 15, 8, 0),
    (8,'Michael','Smith',35,'michaelsmith@cards.com', 12, 9, 3),
    (9,'Sarah','Johnson',22,'sarahjohnson@cards.com', 8, 6, 2),
    (10,'David','Brown',45,'davidbrown@cards.com', 20, 10, 4),
    (11,'Sophia','Wilson',19,'sophiawilson@cards.com', 5, 3, 1),
    (12,'James','Taylor',32,'jamestaylor@cards.com', 25, 14, 7),
    (13,'Olivia','Miller',27,'oliviamiller@cards.com', 18, 12, 5),
    (14,'Daniel','Davis',40,'danieldavis@cards.com', 9, 4, 3),
    (15,'Liam','Martinez',29,'liammartinez@cards.com', 7, 5, 6);
