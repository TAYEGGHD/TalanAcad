-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : lun. 18 avr. 2022 à 10:49
-- Version du serveur : 8.0.27
-- Version de PHP : 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `db_ghadatayeg`
--

-- --------------------------------------------------------

--
-- Structure de la table `ft_table`
--

DROP TABLE IF EXISTS `ft_table`;
CREATE TABLE IF NOT EXISTS `ft_table` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(64) DEFAULT 'toto',
  `groupe` enum('staff','student','other','') NOT NULL,
  `date_de_creation` date NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `ft_table`
--

INSERT INTO `ft_table` (`user_id`, `name`, `groupe`, `date_de_creation`) VALUES
(1, 'loki', 'staff', '2013-05-01'),
(2, 'scadoux', 'student', '2014-01-01'),
(3, 'loki', 'staff', '2013-05-01'),
(4, 'scadoux', 'student', '2014-01-01'),
(5, 'chap', 'staff', '2011-04-27'),
(6, 'bambou', 'staff', '2014-03-01'),
(7, 'fantomet', 'staff', '2010-04-03');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
