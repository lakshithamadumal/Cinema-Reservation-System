-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               8.0.39 - MySQL Community Server - GPL
-- Server OS:                    Win64
-- HeidiSQL Version:             12.8.0.6908
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for zgencrms_db
CREATE DATABASE IF NOT EXISTS `zgencrms_db` /*!40100 DEFAULT CHARACTER SET utf8mb3 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `zgencrms_db`;

-- Dumping structure for table zgencrms_db.brand
CREATE TABLE IF NOT EXISTS `brand` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table zgencrms_db.brand: ~13 rows (approximately)
INSERT INTO `brand` (`id`, `name`) VALUES
	(1, 'Munchee'),
	(2, 'Maliban'),
	(3, 'Nestle'),
	(4, 'Nescafe'),
	(5, 'Coca - Cola'),
	(6, 'Pespi'),
	(7, 'Elephant House'),
	(8, 'Krist'),
	(9, 'Keells Krest'),
	(10, 'Sundown'),
	(11, 'Kist'),
	(12, 'Highland'),
	(13, 'Sera');

-- Dumping structure for table zgencrms_db.city
CREATE TABLE IF NOT EXISTS `city` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table zgencrms_db.city: ~10 rows (approximately)
INSERT INTO `city` (`id`, `name`) VALUES
	(1, 'Colombo'),
	(2, 'Kandy'),
	(3, 'Galle'),
	(4, 'Jaffna'),
	(5, 'Matara'),
	(6, 'Kurunegala'),
	(7, 'Negombo'),
	(8, 'Ratnapura'),
	(9, 'Gampaha'),
	(10, 'Badulla');

-- Dumping structure for table zgencrms_db.company
CREATE TABLE IF NOT EXISTS `company` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `hotline` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table zgencrms_db.company: ~10 rows (approximately)
INSERT INTO `company` (`id`, `name`, `hotline`) VALUES
	(1, 'Ceylon Biscuits Limited ', '0112680122'),
	(2, 'Maliban Biscuit Manufactories (Pvt) Ltd.', '0112555565'),
	(3, 'Nestlé Lanka PLC', '1122334455'),
	(4, 'Coca-Cola Beverages Sri Lanka Limited', '0112345678'),
	(5, 'PepsiCo Sri Lanka ', '0112345678'),
	(6, 'Ceylon Cold Stores PLC', '0112245342'),
	(7, 'Keells Food Products PLC', '0110909897'),
	(8, 'Ceylon Fruits & Vegetables PLC', '0112020293'),
	(9, 'Highland (Pvt) Ltd.', '0112343534'),
	(13, 'Sera Foods', '0119999890');

-- Dumping structure for table zgencrms_db.customer
CREATE TABLE IF NOT EXISTS `customer` (
  `mobile` varchar(10) NOT NULL,
  `customer_type_id` int NOT NULL,
  PRIMARY KEY (`mobile`),
  KEY `fk_customer_customer_type1_idx` (`customer_type_id`),
  CONSTRAINT `fk_customer_customer_type1` FOREIGN KEY (`customer_type_id`) REFERENCES `customer_type` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- Dumping data for table zgencrms_db.customer: ~5 rows (approximately)
INSERT INTO `customer` (`mobile`, `customer_type_id`) VALUES
	('0712654117', 1),
	('0719876543', 1),
	('0771234567', 1),
	('0754567890', 2),
	('0766543210', 2),
	('0781122334', 2);

-- Dumping structure for table zgencrms_db.customer_type
CREATE TABLE IF NOT EXISTS `customer_type` (
  `id` int NOT NULL AUTO_INCREMENT,
  `type` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table zgencrms_db.customer_type: ~2 rows (approximately)
INSERT INTO `customer_type` (`id`, `type`) VALUES
	(1, 'Cinema'),
	(2, 'Snack');

-- Dumping structure for table zgencrms_db.employee
CREATE TABLE IF NOT EXISTS `employee` (
  `email` varchar(100) NOT NULL,
  `fname` varchar(45) NOT NULL,
  `lname` varchar(45) NOT NULL,
  `nic` varchar(45) NOT NULL,
  `mobile` varchar(10) NOT NULL,
  `emp_reg_date` date NOT NULL,
  `emp_type_id` int NOT NULL,
  `emp_status_id` int NOT NULL,
  PRIMARY KEY (`mobile`),
  KEY `fk_employee_emp_type_idx` (`emp_type_id`),
  KEY `fk_employee_emp_status1_idx` (`emp_status_id`),
  CONSTRAINT `fk_employee_emp_status1` FOREIGN KEY (`emp_status_id`) REFERENCES `emp_status` (`id`),
  CONSTRAINT `fk_employee_emp_type` FOREIGN KEY (`emp_type_id`) REFERENCES `emp_type` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- Dumping data for table zgencrms_db.employee: ~8 rows (approximately)
INSERT INTO `employee` (`email`, `fname`, `lname`, `nic`, `mobile`, `emp_reg_date`, `emp_type_id`, `emp_status_id`) VALUES
	('kamal.perera@gmail.com', 'Kamal', 'Perera', '123456789V', '0711234567', '2025-01-01', 1, 1),
	('nimal.silva@gmail.com', 'Nimal', 'Silva', '987654321V', '0712345678', '2025-01-02', 1, 1),
	('sunil.fernando@gmail.com', 'Sunil', 'Fernando', '123456780V', '0721234567', '2025-01-03', 1, 1),
	('amali.jayasinghe@gmail.com', 'Amali', 'Jayasinghe', '987654320V', '0722345678', '2025-01-04', 2, 1),
	('rohana.weerasinghe@gmail.com', 'Rohana', 'Weerasinghe', '223456789V', '0771234567', '2025-01-05', 5, 1),
	('kavindi.ratnayake@gmail.com', 'Kavindi', 'Ratnayake', '112233445V', '0772345678', '2025-01-06', 6, 2),
	('chathura.samarasinghe@gmail.com', 'Chathura', 'Samarasinghe', '556677889V', '0781234567', '2025-01-07', 7, 4),
	('hiruni.karunaratne@gmail.com', 'Hiruni', 'Karunaratne', '667788990V', '0782345678', '2025-01-08', 8, 1);

-- Dumping structure for table zgencrms_db.emp_address
CREATE TABLE IF NOT EXISTS `emp_address` (
  `id` int NOT NULL AUTO_INCREMENT,
  `line_1` varchar(45) NOT NULL,
  `line_2` varchar(45) NOT NULL,
  `city_id` int NOT NULL,
  `employee_mobile` varchar(10) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_emp_address_city1_idx` (`city_id`),
  KEY `fk_emp_address_employee1_idx` (`employee_mobile`),
  CONSTRAINT `fk_emp_address_city1` FOREIGN KEY (`city_id`) REFERENCES `city` (`id`),
  CONSTRAINT `fk_emp_address_employee1` FOREIGN KEY (`employee_mobile`) REFERENCES `employee` (`mobile`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table zgencrms_db.emp_address: ~8 rows (approximately)
INSERT INTO `emp_address` (`id`, `line_1`, `line_2`, `city_id`, `employee_mobile`) VALUES
	(1, 'No. 15', 'Galle Road', 1, '0722345678'),
	(2, 'No. 34', 'Lake Road', 2, '0781234567'),
	(3, 'No. 50', 'Main Street', 3, '0782345678'),
	(4, 'No. 12', 'Station Road', 4, '0711234567'),
	(5, 'No. 28', 'Temple Road', 5, '0772345678'),
	(6, 'No. 78', 'Market Road', 6, '0712345678'),
	(7, 'No. 5', 'Beach Road', 7, '0771234567'),
	(8, 'No. 10', 'Hill Street', 8, '0721234567');

-- Dumping structure for table zgencrms_db.emp_qr
CREATE TABLE IF NOT EXISTS `emp_qr` (
  `qr_number` varchar(30) NOT NULL,
  `employee_mobile` varchar(10) NOT NULL,
  `emp_nic` varchar(45) NOT NULL,
  `emp_type` varchar(45) NOT NULL,
  PRIMARY KEY (`qr_number`),
  KEY `fk_emp_qr_employee1_idx` (`employee_mobile`),
  CONSTRAINT `fk_emp_qr_employee1` FOREIGN KEY (`employee_mobile`) REFERENCES `employee` (`mobile`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- Dumping data for table zgencrms_db.emp_qr: ~3 rows (approximately)
INSERT INTO `emp_qr` (`qr_number`, `employee_mobile`, `emp_nic`, `emp_type`) VALUES
	('123456780V', '0721234567', '123456780V', 'Full Time'),
	('123456789V', '0711234567', '123456789V', 'Full Time');

-- Dumping structure for table zgencrms_db.emp_status
CREATE TABLE IF NOT EXISTS `emp_status` (
  `id` int NOT NULL AUTO_INCREMENT,
  `emp_status` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table zgencrms_db.emp_status: ~5 rows (approximately)
INSERT INTO `emp_status` (`id`, `emp_status`) VALUES
	(1, 'Active'),
	(2, 'Inactive'),
	(3, 'Terminated'),
	(4, 'On Leave'),
	(5, 'Retired');

-- Dumping structure for table zgencrms_db.emp_type
CREATE TABLE IF NOT EXISTS `emp_type` (
  `id` int NOT NULL AUTO_INCREMENT,
  `emp_type` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table zgencrms_db.emp_type: ~14 rows (approximately)
INSERT INTO `emp_type` (`id`, `emp_type`) VALUES
	(1, 'Full Time'),
	(2, 'Manager'),
	(3, 'Sales Person'),
	(4, 'Technician'),
	(5, 'Clark'),
	(6, 'Consultant'),
	(7, 'Security'),
	(8, 'Manger Sales Person'),
	(9, 'Plumber'),
	(10, 'Electirician'),
	(11, 'Cleaner'),
	(12, 'Project Technician'),
	(13, 'Head Clark'),
	(14, 'Snack Bar Manager');

-- Dumping structure for table zgencrms_db.grn_item
CREATE TABLE IF NOT EXISTS `grn_item` (
  `id` int NOT NULL AUTO_INCREMENT,
  `qty` double NOT NULL,
  `buying_price` double NOT NULL,
  `snack_stock_id` int NOT NULL,
  `snack_grn_id` bigint NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_grn_item_snack_stock1_idx` (`snack_stock_id`),
  KEY `fk_grn_item_snack_grn1_idx` (`snack_grn_id`),
  CONSTRAINT `fk_grn_item_snack_grn1` FOREIGN KEY (`snack_grn_id`) REFERENCES `snack_grn` (`id`),
  CONSTRAINT `fk_grn_item_snack_stock1` FOREIGN KEY (`snack_stock_id`) REFERENCES `snack_stock` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table zgencrms_db.grn_item: ~0 rows (approximately)
INSERT INTO `grn_item` (`id`, `qty`, `buying_price`, `snack_stock_id`, `snack_grn_id`) VALUES
	(1, 100, 150000, 1, 2);

-- Dumping structure for table zgencrms_db.hall
CREATE TABLE IF NOT EXISTS `hall` (
  `id` int NOT NULL AUTO_INCREMENT,
  `hall_number` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table zgencrms_db.hall: ~3 rows (approximately)
INSERT INTO `hall` (`id`, `hall_number`) VALUES
	(1, 1),
	(2, 2),
	(3, 3);

-- Dumping structure for table zgencrms_db.invoice
CREATE TABLE IF NOT EXISTS `invoice` (
  `id` bigint NOT NULL,
  `date` date NOT NULL,
  `paid_amount` double NOT NULL,
  `qty` varchar(45) NOT NULL,
  `customer_mobile` varchar(10) NOT NULL,
  `ticket_id` int NOT NULL,
  `payment_method_id` int NOT NULL,
  `user_email` varchar(45) NOT NULL,
  `sheet_number` varchar(5) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_invoice_customer1_idx` (`customer_mobile`),
  KEY `fk_invoice_ticket1_idx` (`ticket_id`),
  KEY `fk_invoice_payment_method1_idx` (`payment_method_id`),
  KEY `fk_invoice_user1_idx` (`user_email`),
  KEY `fk_invoice_sheet1_idx` (`sheet_number`),
  CONSTRAINT `fk_invoice_customer1` FOREIGN KEY (`customer_mobile`) REFERENCES `customer` (`mobile`),
  CONSTRAINT `fk_invoice_payment_method1` FOREIGN KEY (`payment_method_id`) REFERENCES `payment_method` (`id`),
  CONSTRAINT `fk_invoice_sheet1` FOREIGN KEY (`sheet_number`) REFERENCES `sheet` (`number`),
  CONSTRAINT `fk_invoice_ticket1` FOREIGN KEY (`ticket_id`) REFERENCES `ticket` (`id`),
  CONSTRAINT `fk_invoice_user1` FOREIGN KEY (`user_email`) REFERENCES `user` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- Dumping data for table zgencrms_db.invoice: ~1 rows (approximately)
INSERT INTO `invoice` (`id`, `date`, `paid_amount`, `qty`, `customer_mobile`, `ticket_id`, `payment_method_id`, `user_email`, `sheet_number`) VALUES
	(1, '2025-01-11', 600, '1', '0712654117', 1, 3, 'amali@gmail.com', '1A'),
	(2, '2025-01-11', 600, '1', '0719876543', 2, 3, 'amali@gmail.com', '2B'),
	(3, '2025-01-11', 600, '1', '0771234567', 1, 3, 'amali@gmail.com', '25A');

-- Dumping structure for table zgencrms_db.invoice_item
CREATE TABLE IF NOT EXISTS `invoice_item` (
  `id` int NOT NULL AUTO_INCREMENT,
  `qty` double NOT NULL,
  `snack_invoice_id` bigint NOT NULL,
  `snack_stock_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_invoice_item_snack_invoice1_idx` (`snack_invoice_id`),
  KEY `fk_invoice_item_snack_stock1_idx` (`snack_stock_id`),
  CONSTRAINT `fk_invoice_item_snack_invoice1` FOREIGN KEY (`snack_invoice_id`) REFERENCES `snack_invoice` (`id`),
  CONSTRAINT `fk_invoice_item_snack_stock1` FOREIGN KEY (`snack_stock_id`) REFERENCES `snack_stock` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table zgencrms_db.invoice_item: ~0 rows (approximately)
INSERT INTO `invoice_item` (`id`, `qty`, `snack_invoice_id`, `snack_stock_id`) VALUES
	(1, 5, 1, 1);

-- Dumping structure for table zgencrms_db.language
CREATE TABLE IF NOT EXISTS `language` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table zgencrms_db.language: ~5 rows (approximately)
INSERT INTO `language` (`id`, `name`) VALUES
	(1, 'Sinhala'),
	(2, 'English (Hollywood)'),
	(3, 'Hindi (Bollywood)'),
	(4, 'Tamil (Kollywood)'),
	(5, 'Telugu (Tollywood)');

-- Dumping structure for table zgencrms_db.movie
CREATE TABLE IF NOT EXISTS `movie` (
  `movie_id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `duration` varchar(30) NOT NULL,
  `relased_date` date NOT NULL,
  `movie_category_id` int NOT NULL,
  `movie_dimension_id` int NOT NULL,
  `language_id` int NOT NULL,
  PRIMARY KEY (`movie_id`),
  KEY `fk_movie_movie_category1_idx` (`movie_category_id`),
  KEY `fk_movie_movie_dimension1_idx` (`movie_dimension_id`),
  KEY `fk_movie_language1_idx` (`language_id`),
  CONSTRAINT `fk_movie_language1` FOREIGN KEY (`language_id`) REFERENCES `language` (`id`),
  CONSTRAINT `fk_movie_movie_category1` FOREIGN KEY (`movie_category_id`) REFERENCES `movie_category` (`id`),
  CONSTRAINT `fk_movie_movie_dimension1` FOREIGN KEY (`movie_dimension_id`) REFERENCES `movie_dimension` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table zgencrms_db.movie: ~2 rows (approximately)
INSERT INTO `movie` (`movie_id`, `name`, `duration`, `relased_date`, `movie_category_id`, `movie_dimension_id`, `language_id`) VALUES
	(1, 'KGF', '02:00:00', '2022-01-09', 1, 1, 4),
	(2, 'PK', '02:30:00', '2009-01-09', 4, 1, 4);

-- Dumping structure for table zgencrms_db.movie_category
CREATE TABLE IF NOT EXISTS `movie_category` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table zgencrms_db.movie_category: ~10 rows (approximately)
INSERT INTO `movie_category` (`id`, `name`) VALUES
	(1, 'Action'),
	(2, 'Horror'),
	(3, 'Drama'),
	(4, 'Comedy'),
	(5, 'Mystery'),
	(6, 'Documentary'),
	(7, 'Thriller'),
	(8, 'Romance'),
	(9, 'Fantasy'),
	(10, 'Science Fiction (Sci-Fi) ');

-- Dumping structure for table zgencrms_db.movie_company
CREATE TABLE IF NOT EXISTS `movie_company` (
  `id` int NOT NULL AUTO_INCREMENT,
  `hotline` varchar(10) NOT NULL,
  `company_name` varchar(45) NOT NULL,
  `company_email` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table zgencrms_db.movie_company: ~10 rows (approximately)
INSERT INTO `movie_company` (`id`, `hotline`, `company_name`, `company_email`) VALUES
	(1, '0112680122', 'EAP Films & Theatres', 'savoymanager@eapmovies.com'),
	(2, '0112555565', 'Ceylon Theatres', 'info@cineplex.com'),
	(3, '9122306135', 'Yash Raj Films (YRF)', 'rajamir@yashrajfilms.com'),
	(4, '9176543298', 'T-Series', 'tseries.arjun@yahoo.com'),
	(5, '4190875567', 'Universal Pictures', 'universalstudios@universalpics.com'),
	(6, '5609234571', '20th Century Studios ', '20thcenturystudios@cstudios.com'),
	(7, '2209678909', 'Sony Pictures Entertainment', 'sony@sonypictures.com'),
	(8, '3409123435', 'Paramount Pictures', 'paramountpics@paramountpics.com'),
	(9, '0987879086', 'Maya Film Distribution', 'mayafilmworks@gmail.com'),
	(10, '1109098978', 'Zee Studios', 'armin.adajania@zee.com');

-- Dumping structure for table zgencrms_db.movie_customer_type
CREATE TABLE IF NOT EXISTS `movie_customer_type` (
  `id` int NOT NULL AUTO_INCREMENT,
  `customer_type_name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table zgencrms_db.movie_customer_type: ~2 rows (approximately)
INSERT INTO `movie_customer_type` (`id`, `customer_type_name`) VALUES
	(1, 'Full'),
	(2, 'Half');

-- Dumping structure for table zgencrms_db.movie_dimension
CREATE TABLE IF NOT EXISTS `movie_dimension` (
  `id` int NOT NULL AUTO_INCREMENT,
  `type` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table zgencrms_db.movie_dimension: ~5 rows (approximately)
INSERT INTO `movie_dimension` (`id`, `type`) VALUES
	(1, '2D'),
	(2, '3D'),
	(3, 'IMAX'),
	(4, '4DX'),
	(5, 'VR (Virtual Reality)');

-- Dumping structure for table zgencrms_db.movie_grn
CREATE TABLE IF NOT EXISTS `movie_grn` (
  `id` bigint NOT NULL,
  `date` date NOT NULL,
  `payed_amount` double NOT NULL,
  `movie_movie_id` int NOT NULL,
  `movie_supplier_supplier_mobile` varchar(10) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_movie_grn_movie1_idx` (`movie_movie_id`),
  KEY `fk_movie_grn_movie_supplier1_idx` (`movie_supplier_supplier_mobile`),
  CONSTRAINT `fk_movie_grn_movie1` FOREIGN KEY (`movie_movie_id`) REFERENCES `movie` (`movie_id`),
  CONSTRAINT `fk_movie_grn_movie_supplier1` FOREIGN KEY (`movie_supplier_supplier_mobile`) REFERENCES `movie_supplier` (`supplier_mobile`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- Dumping data for table zgencrms_db.movie_grn: ~0 rows (approximately)
INSERT INTO `movie_grn` (`id`, `date`, `payed_amount`, `movie_movie_id`, `movie_supplier_supplier_mobile`) VALUES
	(1, '2025-01-01', 18000000, 1, '0765432198');

-- Dumping structure for table zgencrms_db.movie_supplier
CREATE TABLE IF NOT EXISTS `movie_supplier` (
  `supplier_mobile` varchar(10) NOT NULL,
  `fname` varchar(45) NOT NULL,
  `lname` varchar(45) NOT NULL,
  `email` varchar(100) NOT NULL,
  `movie_company_id` int NOT NULL,
  PRIMARY KEY (`supplier_mobile`),
  KEY `fk_movie_supplier_movie_company1_idx` (`movie_company_id`),
  CONSTRAINT `fk_movie_supplier_movie_company1` FOREIGN KEY (`movie_company_id`) REFERENCES `movie_company` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- Dumping data for table zgencrms_db.movie_supplier: ~9 rows (approximately)
INSERT INTO `movie_supplier` (`supplier_mobile`, `fname`, `lname`, `email`, `movie_company_id`) VALUES
	('0701545854', 'Hesha', 'kalhara', 'hesha@gmail.com', 1),
	('0702454543', 'Madu', 'Dias', 'madu@gmail.com', 2),
	('0704567890', 'Thineth', 'Dimanka', 'thineth@gmail.com', 10),
	('0719876343', 'Chaminda ', 'Kumara', 'chaminda@gmail.com', 8),
	('0719876543', 'Wajira', 'Ahamad', 'waji00@gmail.com', 3),
	('0754567890', 'Kasun', 'Madushanka', 'kasun@gmail.com', 9),
	('0765432198', 'piyumi', 'Nawodya', 'piyumi@gmail.com', 4),
	('0771234567', 'Cathupa', 'Ranveer', 'chathupa@gmail.com', 7),
	('0776787678', 'Deneth', 'Jayaweera', 'deneth@gmil.com', 5),
	('0777654321', 'Thilina', 'Samarakoon', 'thilina@gmail.com', 6);

-- Dumping structure for table zgencrms_db.payment_method
CREATE TABLE IF NOT EXISTS `payment_method` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table zgencrms_db.payment_method: ~4 rows (approximately)
INSERT INTO `payment_method` (`id`, `name`) VALUES
	(1, 'Credit Card'),
	(2, 'Debit Card'),
	(3, 'Cash'),
	(4, 'Mobile Payment');

-- Dumping structure for table zgencrms_db.schedule
CREATE TABLE IF NOT EXISTS `schedule` (
  `id` int NOT NULL AUTO_INCREMENT,
  `schedule_date` date NOT NULL,
  `movie_movie_id` int NOT NULL,
  `hall_id` int NOT NULL,
  `time_slot_id` int NOT NULL,
  `start_date` date NOT NULL,
  `end_date` date NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_schedule_movie1_idx` (`movie_movie_id`),
  KEY `fk_schedule_hall1_idx` (`hall_id`),
  KEY `fk_schedule_time_slot1_idx` (`time_slot_id`),
  CONSTRAINT `fk_schedule_hall1` FOREIGN KEY (`hall_id`) REFERENCES `hall` (`id`),
  CONSTRAINT `fk_schedule_movie1` FOREIGN KEY (`movie_movie_id`) REFERENCES `movie` (`movie_id`),
  CONSTRAINT `fk_schedule_time_slot1` FOREIGN KEY (`time_slot_id`) REFERENCES `time_slot` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table zgencrms_db.schedule: ~1 rows (approximately)
INSERT INTO `schedule` (`id`, `schedule_date`, `movie_movie_id`, `hall_id`, `time_slot_id`, `start_date`, `end_date`) VALUES
	(1, '2025-01-01', 1, 1, 1, '2025-01-01', '2025-02-01'),
	(10, '2025-01-01', 2, 2, 1, '2025-01-01', '2024-12-01');

-- Dumping structure for table zgencrms_db.sheet
CREATE TABLE IF NOT EXISTS `sheet` (
  `number` varchar(5) NOT NULL,
  `hall_id` int NOT NULL,
  PRIMARY KEY (`number`),
  KEY `fk_sheet_hall1_idx` (`hall_id`),
  CONSTRAINT `fk_sheet_hall1` FOREIGN KEY (`hall_id`) REFERENCES `hall` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- Dumping data for table zgencrms_db.sheet: ~0 rows (approximately)
INSERT INTO `sheet` (`number`, `hall_id`) VALUES
	('1A', 1),
	('25A', 1),
	('2A', 1),
	('1B', 2),
	('2B', 2),
	('1C', 3),
	('2C', 3);

-- Dumping structure for table zgencrms_db.snack_grn
CREATE TABLE IF NOT EXISTS `snack_grn` (
  `id` bigint NOT NULL,
  `date` date NOT NULL,
  `paid_amount` double NOT NULL,
  `snack_supplier_mobile` varchar(10) NOT NULL,
  `user_email` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_snack_grn_snack_supplier1_idx` (`snack_supplier_mobile`),
  KEY `fk_snack_grn_user1_idx` (`user_email`),
  CONSTRAINT `fk_snack_grn_snack_supplier1` FOREIGN KEY (`snack_supplier_mobile`) REFERENCES `snack_supplier` (`mobile`),
  CONSTRAINT `fk_snack_grn_user1` FOREIGN KEY (`user_email`) REFERENCES `user` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- Dumping data for table zgencrms_db.snack_grn: ~2 rows (approximately)
INSERT INTO `snack_grn` (`id`, `date`, `paid_amount`, `snack_supplier_mobile`, `user_email`) VALUES
	(1, '2025-01-09', 150000, '0772578663', ''),
	(2, '2025-01-09', 200000, '0712548773', '');

-- Dumping structure for table zgencrms_db.snack_invoice
CREATE TABLE IF NOT EXISTS `snack_invoice` (
  `id` bigint NOT NULL,
  `date` date NOT NULL,
  `paid_amount` double NOT NULL,
  `payment_method_id` int NOT NULL,
  `customer_mobile` varchar(10) NOT NULL,
  `user_email` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_snack_invoice_payment_method1_idx` (`payment_method_id`),
  KEY `fk_snack_invoice_customer1_idx` (`customer_mobile`),
  KEY `fk_snack_invoice_user1_idx` (`user_email`),
  CONSTRAINT `fk_snack_invoice_customer1` FOREIGN KEY (`customer_mobile`) REFERENCES `customer` (`mobile`),
  CONSTRAINT `fk_snack_invoice_payment_method1` FOREIGN KEY (`payment_method_id`) REFERENCES `payment_method` (`id`),
  CONSTRAINT `fk_snack_invoice_user1` FOREIGN KEY (`user_email`) REFERENCES `user` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- Dumping data for table zgencrms_db.snack_invoice: ~2 rows (approximately)
INSERT INTO `snack_invoice` (`id`, `date`, `paid_amount`, `payment_method_id`, `customer_mobile`, `user_email`) VALUES
	(1, '2025-01-09', 1200, 3, '0712654117', ''),
	(2, '2025-01-09', 1800, 3, '0719876543', '');

-- Dumping structure for table zgencrms_db.snack_product
CREATE TABLE IF NOT EXISTS `snack_product` (
  `id` int NOT NULL AUTO_INCREMENT,
  `product` varchar(45) NOT NULL,
  `brand_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_snack_product_brand1_idx` (`brand_id`),
  CONSTRAINT `fk_snack_product_brand1` FOREIGN KEY (`brand_id`) REFERENCES `brand` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table zgencrms_db.snack_product: ~10 rows (approximately)
INSERT INTO `snack_product` (`id`, `product`, `brand_id`) VALUES
	(1, 'Potato Chips', 1),
	(2, 'Cheese Puffs', 2),
	(3, 'Salted Peanuts', 1),
	(4, 'Chocolate Cookies', 3),
	(5, 'Trail Mix', 4),
	(6, 'Popcorn (Butter)', 2),
	(7, 'Pretzels', 4),
	(8, 'Granola Bar', 5),
	(9, 'Fruit Snacks', 5),
	(10, 'Rice Crackers', 1);

-- Dumping structure for table zgencrms_db.snack_stock
CREATE TABLE IF NOT EXISTS `snack_stock` (
  `id` int NOT NULL AUTO_INCREMENT,
  `selling_price` double NOT NULL,
  `qty` double NOT NULL,
  `mfd` date NOT NULL,
  `exp` date NOT NULL,
  `snack_product_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_snack_stock_snack_product1_idx` (`snack_product_id`),
  CONSTRAINT `fk_snack_stock_snack_product1` FOREIGN KEY (`snack_product_id`) REFERENCES `snack_product` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table zgencrms_db.snack_stock: ~2 rows (approximately)
INSERT INTO `snack_stock` (`id`, `selling_price`, `qty`, `mfd`, `exp`, `snack_product_id`) VALUES
	(1, 150, 100, '2024-01-09', '2026-01-09', 1),
	(2, 200, 100, '2024-01-09', '2026-01-09', 10);

-- Dumping structure for table zgencrms_db.snack_supplier
CREATE TABLE IF NOT EXISTS `snack_supplier` (
  `mobile` varchar(10) NOT NULL,
  `fname` varchar(45) NOT NULL,
  `lname` varchar(45) NOT NULL,
  `email` varchar(100) NOT NULL,
  `company_id` int NOT NULL,
  PRIMARY KEY (`mobile`),
  KEY `fk_snack_supplier_company1_idx` (`company_id`),
  CONSTRAINT `fk_snack_supplier_company1` FOREIGN KEY (`company_id`) REFERENCES `company` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- Dumping data for table zgencrms_db.snack_supplier: ~1 rows (approximately)
INSERT INTO `snack_supplier` (`mobile`, `fname`, `lname`, `email`, `company_id`) VALUES
	('0712548773', 'Lalith ', 'Kumara', 'lalith@gmail.com', 1),
	('0772578663', 'Kumara', 'Welgama', 'kumara@gmail.com', 2);

-- Dumping structure for table zgencrms_db.ticket
CREATE TABLE IF NOT EXISTS `ticket` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ticket_price` double NOT NULL,
  `movie_customer_type_id` int NOT NULL,
  `movie_dimension_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_ticket_movie_customer_type1_idx` (`movie_customer_type_id`),
  KEY `fk_ticket_movie_dimension1_idx` (`movie_dimension_id`),
  CONSTRAINT `fk_ticket_movie_customer_type1` FOREIGN KEY (`movie_customer_type_id`) REFERENCES `movie_customer_type` (`id`),
  CONSTRAINT `fk_ticket_movie_dimension1` FOREIGN KEY (`movie_dimension_id`) REFERENCES `movie_dimension` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table zgencrms_db.ticket: ~2 rows (approximately)
INSERT INTO `ticket` (`id`, `ticket_price`, `movie_customer_type_id`, `movie_dimension_id`) VALUES
	(1, 600, 2, 1),
	(2, 1200, 1, 1);

-- Dumping structure for table zgencrms_db.time_slot
CREATE TABLE IF NOT EXISTS `time_slot` (
  `id` int NOT NULL AUTO_INCREMENT,
  `start_time` time NOT NULL,
  `end_time` time NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table zgencrms_db.time_slot: ~4 rows (approximately)
INSERT INTO `time_slot` (`id`, `start_time`, `end_time`) VALUES
	(1, '10:00:00', '12:00:00'),
	(2, '12:30:00', '02:30:00'),
	(3, '03:00:00', '05:00:00'),
	(4, '06:30:00', '08:30:00');

-- Dumping structure for table zgencrms_db.user
CREATE TABLE IF NOT EXISTS `user` (
  `email` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `user_fname` varchar(45) NOT NULL,
  `employee_mobile` varchar(10) NOT NULL,
  `user_type_id` int NOT NULL,
  PRIMARY KEY (`email`),
  KEY `fk_user_employee1_idx` (`employee_mobile`),
  KEY `fk_user_user_type1_idx` (`user_type_id`),
  CONSTRAINT `fk_user_employee1` FOREIGN KEY (`employee_mobile`) REFERENCES `employee` (`mobile`),
  CONSTRAINT `fk_user_user_type1` FOREIGN KEY (`user_type_id`) REFERENCES `user_type` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- Dumping data for table zgencrms_db.user: ~5 rows (approximately)
INSERT INTO `user` (`email`, `password`, `user_fname`, `employee_mobile`, `user_type_id`) VALUES
	('amali@gmail.com', '123', 'amali', '0722345678', 3),
	('hiruni@gmail.com', '123', 'hiruni', '0782345678', 5),
	('kamal@gmail.com', '123', 'kamal', '0711234567', 1),
	('nimal@gmail.com', '123', 'nimal', '0712345678', 2),
	('sunil@gmail.com', '123', 'sunil', '0721234567', 4);

-- Dumping structure for table zgencrms_db.user_type
CREATE TABLE IF NOT EXISTS `user_type` (
  `id` int NOT NULL AUTO_INCREMENT,
  `type` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table zgencrms_db.user_type: ~4 rows (approximately)
INSERT INTO `user_type` (`id`, `type`) VALUES
	(1, 'Super admin'),
	(2, 'Manager'),
	(3, 'Cashier'),
	(4, 'Snack Bar Manager'),
	(5, 'Snack Bar Cashier');

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
