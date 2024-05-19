-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:4306
-- Generation Time: May 19, 2024 at 06:25 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hydrationsystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `activities`
--

CREATE TABLE `activities` (
  `id` int(11) NOT NULL,
  `act` varchar(100) NOT NULL,
  `interest` varchar(100) NOT NULL,
  `actLvl` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `activities`
--

INSERT INTO `activities` (`id`, `act`, `interest`, `actLvl`) VALUES
(1, '', '', 'Very Active: Intense exercise regularly.');

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `adminid` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(255) NOT NULL,
  `fname` varchar(50) NOT NULL,
  `mname` varchar(50) DEFAULT NULL,
  `lname` varchar(50) DEFAULT NULL,
  `security_question` varchar(255) DEFAULT NULL,
  `securityA` varchar(255) DEFAULT NULL,
  `RegDate` timestamp NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`adminid`, `username`, `password`, `fname`, `mname`, `lname`, `security_question`, `securityA`, `RegDate`) VALUES
(1, 'admin', 'Password', 'arjhond', 'g', 'galia', 'What is your pet\'s name?', 'EncryptedAnswer', '2024-05-15 03:24:13');

-- --------------------------------------------------------

--
-- Table structure for table `contacts`
--

CREATE TABLE `contacts` (
  `id` int(11) NOT NULL,
  `contact` varchar(15) NOT NULL,
  `email` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `contacts`
--

INSERT INTO `contacts` (`id`, `contact`, `email`) VALUES
(1, '0', 'user1@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `usersid` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(255) NOT NULL,
  `fname` varchar(50) NOT NULL,
  `mname` varchar(50) DEFAULT NULL,
  `lname` varchar(50) DEFAULT NULL,
  `securityQ` varchar(255) DEFAULT NULL,
  `securityA` varchar(255) DEFAULT NULL,
  `RegDate` timestamp NULL DEFAULT current_timestamp(),
  `visitTime` timestamp NOT NULL DEFAULT current_timestamp(),
  `birthdate` date NOT NULL,
  `contact_id` int(11) NOT NULL,
  `activity_id` int(11) NOT NULL,
  `bio` varchar(150) NOT NULL,
  `weight` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`usersid`, `username`, `password`, `fname`, `mname`, `lname`, `securityQ`, `securityA`, `RegDate`, `visitTime`, `birthdate`, `contact_id`, `activity_id`, `bio`, `weight`) VALUES
(2, 'user1', '123', 'john', 'm', 'smith', 'What is your pet\'s name?', 'enzo', '2024-05-16 04:04:05', '2024-05-16 04:04:05', '0000-00-00', 1, 1, '', 70.00);

-- --------------------------------------------------------

--
-- Table structure for table `water_intake_log`
--

CREATE TABLE `water_intake_log` (
  `log_id` int(11) NOT NULL,
  `usersid` int(11) NOT NULL,
  `intake_date` date NOT NULL,
  `intake_time` time NOT NULL,
  `intake_ml` decimal(10,2) NOT NULL,
  `intake_goal` decimal(10,2) DEFAULT 2180.00
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `water_intake_log`
--

INSERT INTO `water_intake_log` (`log_id`, `usersid`, `intake_date`, `intake_time`, `intake_ml`, `intake_goal`) VALUES
(1, 2, '2024-05-19', '18:37:32', 200.00, 2180.00),
(2, 2, '2024-05-19', '05:04:00', 114.00, 2180.00),
(13, 2, '2024-05-19', '00:05:00', 200.00, 2180.00);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `activities`
--
ALTER TABLE `activities`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`adminid`),
  ADD UNIQUE KEY `username` (`username`);

--
-- Indexes for table `contacts`
--
ALTER TABLE `contacts`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`usersid`),
  ADD UNIQUE KEY `username` (`username`),
  ADD KEY `contact_id` (`contact_id`),
  ADD KEY `activity_id` (`activity_id`);

--
-- Indexes for table `water_intake_log`
--
ALTER TABLE `water_intake_log`
  ADD PRIMARY KEY (`log_id`),
  ADD KEY `fk_user_id` (`usersid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `activities`
--
ALTER TABLE `activities`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `adminid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `contacts`
--
ALTER TABLE `contacts`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `usersid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `water_intake_log`
--
ALTER TABLE `water_intake_log`
  MODIFY `log_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `water_intake_log`
--
ALTER TABLE `water_intake_log`
  ADD CONSTRAINT `fk_user_id` FOREIGN KEY (`usersid`) REFERENCES `users` (`usersid`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `water_intake_log_ibfk_1` FOREIGN KEY (`usersid`) REFERENCES `water_intake_log` (`log_id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
