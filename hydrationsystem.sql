-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:4306
-- Generation Time: May 19, 2024 at 02:09 AM
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
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `adminid` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `fname` varchar(50) NOT NULL,
  `mname` varchar(50) DEFAULT NULL,
  `lname` varchar(50) DEFAULT NULL,
  `securityQ` varchar(100) DEFAULT NULL,
  `securityA` varchar(50) DEFAULT NULL,
  `RegDate` timestamp NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`adminid`, `username`, `password`, `fname`, `mname`, `lname`, `securityQ`, `securityA`, `RegDate`) VALUES
(1, 'admin', 'Password', 'arjhond', 'g', 'galia', NULL, NULL, '2024-05-15 03:24:13');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `usersid` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `fname` varchar(50) NOT NULL,
  `mname` varchar(50) DEFAULT NULL,
  `lname` varchar(50) DEFAULT NULL,
  `securityQ` varchar(100) DEFAULT NULL,
  `securityA` varchar(50) DEFAULT NULL,
  `RegDate` timestamp NULL DEFAULT current_timestamp(),
  `visitTime` timestamp NOT NULL DEFAULT current_timestamp(),
  `birthdate` date NOT NULL DEFAULT '0000-00-00',
  `contact` varchar(15) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `act` varchar(100) NOT NULL,
  `interest` varchar(100) NOT NULL,
  `bio` varchar(150) NOT NULL,
  `actLvl` varchar(100) NOT NULL,
  `weight` decimal(10,2) NOT NULL,
  `intake_date` date NOT NULL DEFAULT '0000-00-00',
  `intake_time` time NOT NULL DEFAULT current_timestamp(),
  `intake_ml` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`usersid`, `username`, `password`, `fname`, `mname`, `lname`, `securityQ`, `securityA`, `RegDate`, `visitTime`, `birthdate`, `contact`, `email`, `act`, `interest`, `bio`, `actLvl`, `weight`, `intake_date`, `intake_time`, `intake_ml`) VALUES
(1, 'bro', 'Password', 'arjhond', 'g', 'galia', NULL, NULL, '2024-05-15 02:53:36', '2024-05-16 03:52:17', '0000-00-00', '0', '', '', '', '', '', 0.00, '0000-00-00', '00:00:00', 0),
(2, 'user1', '1234', 'bro', '', '', 'What is your pet\'s name?', 'enzo', '2024-05-16 04:04:05', '2024-05-16 04:04:05', '0000-00-00', '0', '', '', '', '', '', 0.00, '0000-00-00', '00:00:00', 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`adminid`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`usersid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `adminid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `usersid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
