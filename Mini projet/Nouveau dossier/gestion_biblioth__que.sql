-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : jeu. 21 avr. 2022 à 15:09
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
-- Base de données : `gestion_bibliothèque`
--

-- --------------------------------------------------------

--
-- Structure de la table `book`
--

DROP TABLE IF EXISTS `book`;
CREATE TABLE IF NOT EXISTS `book` (
  `id_book` int NOT NULL AUTO_INCREMENT,
  `title` varchar(128) NOT NULL,
  `author` varchar(128) NOT NULL,
  `editor` varchar(128) NOT NULL,
  `pageNb` int NOT NULL,
  `summary` varchar(526) NOT NULL,
  `library` int NOT NULL,
  PRIMARY KEY (`id_book`)
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `book`
--

INSERT INTO `book` (`id_book`, `title`, `author`, `editor`, `pageNb`, `summary`, `library`) VALUES
(1, 'La métamorphose', 'Franz Kafka', 'Claude David', 144, 'La métamorphose', 2),
(2, 'Le Seigneur des Anneaux ', 'JRR tolkien', 'EAN', 1400, 'Le Seigneur des Anneaux ', 1),
(3, 'l\'étranger', 'Albert Camus ', 'EAN', 191, 'l\'étranger', 1),
(4, 'La Vie devant soi', 'Romain Gary', 'EAN', 273, 'La Vie devant soi', 1),
(6, 'La peste', 'Albert camus', 'EAN', 288, 'La peste', 1),
(7, '1984', 'George orwell', 'EAN', 438, 'résumé', 1);

-- --------------------------------------------------------

--
-- Structure de la table `library`
--

DROP TABLE IF EXISTS `library`;
CREATE TABLE IF NOT EXISTS `library` (
  `id_library` int NOT NULL AUTO_INCREMENT,
  `name` varchar(128) NOT NULL,
  `adress` varchar(128) NOT NULL,
  `numTel` int NOT NULL,
  PRIMARY KEY (`id_library`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `library`
--

INSERT INTO `library` (`id_library`, `name`, `adress`, `numTel`) VALUES
(1, 'librairie municipale', 'Ezzahra', 71025269),
(2, 'Maison des jeunes ', 'Radés', 71452894);

-- --------------------------------------------------------

--
-- Structure de la table `rent`
--

DROP TABLE IF EXISTS `rent`;
CREATE TABLE IF NOT EXISTS `rent` (
  `id_rent` int NOT NULL AUTO_INCREMENT,
  `DatePret` date NOT NULL,
  `DateFin` date NOT NULL,
  `ref_book` int NOT NULL,
  `ref_user` int NOT NULL,
  PRIMARY KEY (`id_rent`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `rent`
--

INSERT INTO `rent` (`id_rent`, `DatePret`, `DateFin`, `ref_book`, `ref_user`) VALUES
(1, '2022-04-20', '2022-04-23', 6, 2),
(2, '2022-04-20', '2022-04-29', 1, 3),
(3, '2022-04-27', '2022-04-30', 7, 4),
(4, '2022-04-25', '2022-04-30', 5, 1);

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `id_user` int NOT NULL AUTO_INCREMENT,
  `prenom` varchar(128) NOT NULL,
  `nom` varchar(128) NOT NULL,
  `adress` varchar(128) NOT NULL,
  `numTel` int NOT NULL,
  `mail` varchar(128) NOT NULL,
  `ref_rent` int NOT NULL,
  PRIMARY KEY (`id_user`)
) ENGINE=MyISAM AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `user`
--

INSERT INTO `user` (`id_user`, `prenom`, `nom`, `adress`, `numTel`, `mail`, `ref_rent`) VALUES
(1, 'jihene', 'saidene', 'ezzahra', 52081543, 'jihene.saidene@gmail.com', 4),
(2, 'Ghada', 'Ghram', 'Mourouj', 52081544, 'ghada.ghram@gmail.com', 1),
(3, 'ines', 'masmoudi', 'tunis', 52081545, 'ines.masmoudi@gmail.com', 2),
(4, 'ghada', 'tayeg', 'Ariana', 52081543, 'ghada.tayeg@gmail.com', 3),
(15, 'mohamed', 'ali', 'tunis', 52081555, 'mohamed.ali@gmail.com', 1);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
