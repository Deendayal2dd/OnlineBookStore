-- MySQL dump 10.11
--
-- Host: localhost    Database: bookstore
-- ------------------------------------------------------
-- Server version	5.0.45-community-nt

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
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `bcode` int(100) NOT NULL,
  `title` varchar(255) default NULL,
  `author` varchar(255) default NULL,
  `publishr` varchar(255) default NULL,
  `subject` varchar(255) default NULL,
  `price` varchar(255) default NULL,
  PRIMARY KEY  (`bcode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `book`
--

LOCK TABLES `book` WRITE;
/*!40000 ALTER TABLE `book` DISABLE KEYS */;
INSERT INTO `book` VALUES (1001,'programing and problem solving','Eric Freeman','Elisabeth Freeman','Computer','400'),(1002,'Data Structures and Algorithms Made Easy','Narasimha Karumanchi','Narasimha Karumanchi','Computer','600'),(1003,'Cracking the Coding Interview','Gayle Laakmann McDowell ','Gayle Laakmann McDowell ','Computer','599'),(1004,'Data Structures Using C','Reema Thareja ','Reema Thareja ','Computer','450'),(1005,'Java - The Complete Reference','Herbert Schildt','Herbert Schildt','Computer','650'),(1006,'C in Depth','Deepali Srivastava ',' S. K. Srivastava','Computer','371'),(1007,'Data Structures Through C in Depth',' S. K. Srivastava ','Deepali Srivastava','Computer','320'),(1008,'Operating Systems','Rajiv Chopra','Rajiv Chopra','Computer','499'),(1009,'Automata Theory','Manish Kumar Jha ','Manish Kumar Jha ','Computer','300'),(1010,'Database Management Systems (DBMS)','Rajiv Chopra ','Rajiv Chopra ','Computer','425'),(1011,'Problems in Physical Chemistry for JEE (Main & Advanced)','NARENDRA AVASTHI ','NARENDRA AVASTHI ','Physics','470'),(1012,'Chemistry for JEE Main','Seema Saini/K.S. Saini','Seema Saini/K.S. Saini','Chemistry','799'),(1013,'Discrete Mathematics and Its Applications (SIE)','Kenneth Rosen ','Kenneth Rosen ','Computer','638'),(1014,'MATHEMATICS for IIT-JEE by R. D. SHARMA','R.D sharma','R.D. SHARMAA','Computer','1377'),(1015,'MATHEMATICS for IIT-JEE by R. D. SHARMA','R.D sharma','R.D. SHARMAA','Maths','1300'),(1016,'IIT Mathematics For JEE (Main & Advanced) ','N/A','N/A','Maths','1199'),(1017,'IIT JEE Physics',' Jitender Singh',' Jitender Singh','Physics','499'),(1018,'Word Power Made Easy','Norman Lewis ','Norman Lewis ','English','200'),(1019,'English Pronunciation in Use Advanced Book',' Martin Hewings',' Martin Hewings','English','1000'),(1020,'Indian Polity 5th Edition','M. Laxmikanth','M. Laxmikanth','Others','520'),(1021,'Learning How to Fly: Life Lessons for the Youth','A.P.J. Abdul Kalam ','A.P.J. Abdul Kalam ','Others','193');
/*!40000 ALTER TABLE `book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `books`
--

DROP TABLE IF EXISTS `books`;
CREATE TABLE `books` (
  `bcode` int(11) NOT NULL,
  `title` varchar(100) default NULL,
  `author` varchar(50) default NULL,
  `publishr` varchar(50) default NULL,
  `subject` varchar(50) default NULL,
  `price` varchar(30) default NULL,
  PRIMARY KEY  (`bcode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `books`
--

LOCK TABLES `books` WRITE;
/*!40000 ALTER TABLE `books` DISABLE KEYS */;
INSERT INTO `books` VALUES (1001,'Computer Fundamentals','Goel Anita','Pearson','CompSc','391'),(1002,'C in Depth','Deepali ','BPB publishers','CompSc','400'),(1003,'The Oxford','John Seely ','John Seely ','English','500'),(1004,'Englis grammer','Farlex International ','Farlex International ','English','449'),(1005,'Concepts of Physics','HC Verma','HC Verma','Physics','700'),(1006,'ARIHANT MATHEMATICS JEE MAIN','AMIT M. AGARWAL ','ARIHANT','Maths','2200'),(1007,'Fundamentals of Physic','Halliday & Resnick','Halliday & Resnick','Physics','800'),(1008,'Basic Concepts of Chemistry','Pegasus','Pegasus','Chemistry','200'),(1009,'Conceptual Chemistry','S.K jain','shailesh K jain','Chemistry','900'),(1010,'web designing','moris','nakoda publication','Others','5000');
/*!40000 ALTER TABLE `books` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userid` varchar(255) NOT NULL,
  `password` varchar(255) default NULL,
  `name` varchar(255) default NULL,
  `address` varchar(255) default NULL,
  `mobile` varchar(12) default NULL,
  `email` varchar(255) default NULL,
  PRIMARY KEY  (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES ('user','user','user','allahabad','8787654535','user@gmail.com'),('user1','user1','user1','bhopal','6767564534','user1@gmail.com');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `userid` varchar(20) NOT NULL,
  `password` varchar(20) default NULL,
  `name` varchar(20) default NULL,
  `address` varchar(30) default NULL,
  `mobile` varchar(20) default NULL,
  `email` varchar(20) default NULL,
  PRIMARY KEY  (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES ('111','user','user','indore','7453625376','user@gmail.com'),('112','abc','abc','bhopal','7846352617','abc@gmail.com'),('abhi','Bhishm786@','Abhishek','64,pg','9589223138','anony@gmail.com'),('monu','','triloki','bonai','9311283181','ma2325@gmail.com'),('monu1','aaaa','triloki','bonai','9311283181','ma2325@gmail.com'),('user1','user1','user1','sehore','9837483728','user1@gmail.com'),('user3','user3',NULL,'sehore','7865345212','user3@gmail.com'),('user4','user4','user4','bhpl','78675775363','user4@gmail.com'),('user5','user5','user5','jhansi','6778786756','user5@gmail.com'),('xyz','xyz',NULL,'indore east','6745363783','xyz@gmail.com');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-09-12 14:59:51
