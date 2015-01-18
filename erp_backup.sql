-- MySQL dump 10.13  Distrib 5.5.35, for debian-linux-gnu (i686)
--
-- Host: localhost    Database: erp
-- ------------------------------------------------------
-- Server version	5.5.35-0ubuntu0.12.04.2

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Department`
--

DROP TABLE IF EXISTS `Department`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Department` (
  `department_name` varchar(20) NOT NULL,
  `department_id` int(5) NOT NULL,
  `manager_id` int(5) NOT NULL,
  `location` varchar(100) NOT NULL,
  `city` varchar(30) NOT NULL,
  `state` varchar(30) NOT NULL,
  `country` varchar(30) NOT NULL,
  `pincode` int(8) NOT NULL,
  PRIMARY KEY (`department_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Department`
--

LOCK TABLES `Department` WRITE;
/*!40000 ALTER TABLE `Department` DISABLE KEYS */;
/*!40000 ALTER TABLE `Department` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Employee`
--

DROP TABLE IF EXISTS `Employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Employee` (
  `employee_id` int(5) NOT NULL,
  `first_name` varchar(15) NOT NULL,
  `middle_name` varchar(15) DEFAULT NULL,
  `last_name` varchar(15) NOT NULL,
  `date_of_birth` date NOT NULL,
  `phone_number` int(10) NOT NULL,
  `mobile_number` int(10) NOT NULL,
  `address` varchar(100) NOT NULL,
  `city` varchar(30) NOT NULL,
  `state` varchar(30) NOT NULL,
  `country` varchar(30) NOT NULL,
  `pincode` int(8) NOT NULL,
  `email_id` varchar(33) NOT NULL,
  `post` varchar(30) NOT NULL,
  `department_id` int(5) NOT NULL,
  `reporting_authority` int(5) DEFAULT NULL,
  `username` varchar(30) NOT NULL,
  `position_id` int(2) NOT NULL,
  PRIMARY KEY (`employee_id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Employee`
--

LOCK TABLES `Employee` WRITE;
/*!40000 ALTER TABLE `Employee` DISABLE KEYS */;
INSERT INTO `Employee` VALUES (1,'Rahul','','Jain','2012-09-12',963258741,123456789,'Sunny Lane','Houston','Texas','United States',632514,'rahuljain@gmail.com','Employee',1,2,'rahul',4),(2,'Stephen','N','Meyers','2010-05-00',125934867,956831427,'Street Avenue	','Los Angeles','California','United States',12436,'stephen@yahoo.com','Manager',1,3,'stephen',3),(3,'temp','tu','hai','2012-12-12',5464,6546,'slkdjfakj	','sdkjf','sdlkjfk','lsdjflk',545,'akkl','Director',1,2,'temp',2);
/*!40000 ALTER TABLE `Employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Employee_Project`
--

DROP TABLE IF EXISTS `Employee_Project`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Employee_Project` (
  `employee_id` int(5) NOT NULL,
  `project_id` int(5) NOT NULL,
  PRIMARY KEY (`employee_id`,`project_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Employee_Project`
--

LOCK TABLES `Employee_Project` WRITE;
/*!40000 ALTER TABLE `Employee_Project` DISABLE KEYS */;
INSERT INTO `Employee_Project` VALUES (1,1),(2,1);
/*!40000 ALTER TABLE `Employee_Project` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Login`
--

DROP TABLE IF EXISTS `Login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Login` (
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `type` int(5) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Login`
--

LOCK TABLES `Login` WRITE;
/*!40000 ALTER TABLE `Login` DISABLE KEYS */;
INSERT INTO `Login` VALUES ('admin','password',1),('rahul','rahul',2),('stephen','stephen',2),('temp','temp',2);
/*!40000 ALTER TABLE `Login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Project`
--

DROP TABLE IF EXISTS `Project`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Project` (
  `proj_id` int(5) NOT NULL,
  `manager_id` int(5) NOT NULL,
  `description` varchar(400) NOT NULL,
  `department_id` int(5) NOT NULL,
  `start_date` date DEFAULT NULL,
  `end_date` date DEFAULT NULL,
  PRIMARY KEY (`proj_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Project`
--

LOCK TABLES `Project` WRITE;
/*!40000 ALTER TABLE `Project` DISABLE KEYS */;
INSERT INTO `Project` VALUES (1,2,'analyze the syntax of the documents.\n',1,'0002-02-02','2010-10-10'),(5,2,'There are no accidents.	',2,'0005-05-05','2010-10-10');
/*!40000 ALTER TABLE `Project` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Project_Department`
--

DROP TABLE IF EXISTS `Project_Department`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Project_Department` (
  `project_id` int(5) NOT NULL,
  `department_id` int(5) NOT NULL DEFAULT '0',
  PRIMARY KEY (`project_id`,`department_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Project_Department`
--

LOCK TABLES `Project_Department` WRITE;
/*!40000 ALTER TABLE `Project_Department` DISABLE KEYS */;
/*!40000 ALTER TABLE `Project_Department` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `leave_form`
--

DROP TABLE IF EXISTS `leave_form`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `leave_form` (
  `apply_id` int(5) NOT NULL AUTO_INCREMENT,
  `employee_id` int(5) NOT NULL,
  `start` date NOT NULL,
  `end` date NOT NULL,
  `approve_id` int(5) NOT NULL,
  `status` varchar(10) NOT NULL,
  PRIMARY KEY (`apply_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `leave_form`
--

LOCK TABLES `leave_form` WRITE;
/*!40000 ALTER TABLE `leave_form` DISABLE KEYS */;
INSERT INTO `leave_form` VALUES (1,1,'0001-01-01','0005-05-05',2,'waiting');
/*!40000 ALTER TABLE `leave_form` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `position_id`
--

DROP TABLE IF EXISTS `position_id`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `position_id` (
  `position_id` int(2) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `description` varchar(30) NOT NULL,
  `salary` int(10) NOT NULL,
  PRIMARY KEY (`position_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `position_id`
--

LOCK TABLES `position_id` WRITE;
/*!40000 ALTER TABLE `position_id` DISABLE KEYS */;
INSERT INTO `position_id` VALUES (1,'CEO','Chief Executive Officer',100000),(2,'Manager','Manager of the Employees',35000),(3,'Director','Director of the managers',55000),(4,'Employee','Worker under manager',20000);
/*!40000 ALTER TABLE `position_id` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `temp`
--

DROP TABLE IF EXISTS `temp`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `temp` (
  `value` int(10) NOT NULL,
  PRIMARY KEY (`value`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `temp`
--

LOCK TABLES `temp` WRITE;
/*!40000 ALTER TABLE `temp` DISABLE KEYS */;
INSERT INTO `temp` VALUES (1),(2);
/*!40000 ALTER TABLE `temp` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-04-25 21:21:19
