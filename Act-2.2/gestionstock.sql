--
-- Structure de la table `fournisseurs`
--

DROP TABLE IF EXISTS `fournisseurs`;
CREATE TABLE IF NOT EXISTS `fournisseurs` (
  `id_fourn` int NOT NULL AUTO_INCREMENT,
  `nom_fourn` varchar(24) NOT NULL,
  PRIMARY KEY (`id`)
) ;

--
-- Déchargement des données de la table `fournisseurs`
--

INSERT INTO `fournisseurs` (`id_fourn`, `nom_fourn`) VALUES
(1, 'fourn1'),
(2, 'fourn2'),
(3, 'fourn3'),
(4, 'fourn4');

--
-- Structure de la table `produits`
--

DROP TABLE IF EXISTS `produits`;
CREATE TABLE IF NOT EXISTS `produits` (
  `id_produit` int NOT NULL AUTO_INCREMENT,
  `nom_produit` varchar(24) NOT NULL,
  `type` varchar(36) NOT NULL,
  `marque` varchar(36) NOT NULL,
  `nom_fourn` varchar(36) NOT NULL,
  PRIMARY KEY (`id_produit`)
) ;

--
-- Déchargement des données de la table `produits`
--

INSERT INTO `produits` (`id_produit`, `no_produit`, `type`, `marque`, `nom_fourn`) VALUES
(1, nom1, 'vetements', 'Adidas', 'fourn1'),
(2, nom2, 'type-x', 'marque-x', 'fourn2'),
(3, nom3, 'type-y', 'marque-y', 'fourn3'),
(4, nom4, 'type-z', 'marque-z', 'fourn4');
--
-- Structure de la table `clients`
--

DROP TABLE IF EXISTS `clients`;
CREATE TABLE IF NOT EXISTS `clients` (
  `id_client` int NOT NULL AUTO_INCREMENT,
  `nom_client` varchar(24) NOT NULL,
  `telephone` int NOT NULL,
  `abonnement` enum('premium','vip','classique','') NOT NULL,
  `interet` set('sport','cinema','musique','') NOT NULL,
  PRIMARY KEY (`id_client`)
) ;

--
-- Déchargement des données de la table `clients`
--

INSERT INTO `clients` (`id_client`, `nom_client`, `telephone`, `abonnement`, `interet`) VALUES
(1, 'Liam Armstrong', 95801972, 'vip', 'sport,musique'),
(2, 'Emma Baker', 95874632, 'classique', 'musique'),
(3, 'Noah Bennet', 58452412, 'vip', 'cinema'),
(4, 'Olivia Black', 96547852, 'premium', 'musique'),
(5, 'James Carter', 93568745, 'classique', 'sport,musique'),
(6, 'William Miller', 98521473, 'premium', 'sport');

--
--Afficher la liste de tous les clients
--
SELECT id_client, nom_client, telephone, abonnement, interet   FROM clients;

--
--Afficher la liste des produits
--
SELECT id_produit, nom_produit, type, marque, nom_fourn  FROM produits;
--
--Afficher les types de produits qui existent dans la BD
-- 
SELECT type FROM produits;
--
--Afficher le nombre de produits disponibles pour chaque type de produit
--
SELECT type, COUNT(nom_produit)FROM produits GROUP BY type;
--
--Afficher les infos sur les clients dont le nom des clients 'S'
--
SELECT id_client, nom_client, telephone, abonnement, interet   FROM clients WHERE `nom_client` LIKE '%S%';
--
--Ajouter une colonne prix dans la table produits 
--
ALTER TABLE produits ADD prix FLOAT(3) NOT NULL DEFAULT '200' AFTER type;
--
--Afficher pour tous les produits les infos suivantes :nom, type, prix, nom du fournisseur 
--
SELECT nom_produit, type, prix, nom_fourn FROM produits;
--
--Afficher le nombre de produit pour chaque fournisseur
--
SELECT nom_fourn, COUNT(nom_produit) FROM produits GROUP BY nom_fourn;

















