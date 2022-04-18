INSERT INTO ft_table (login , date_de_creation) SELECT nom , date_naissance FROM fiche_personne WHERE (`nom` LIKE '%a%' AND (LENGTH(nom) < 9)) ORDER BY nom ASC LIMIT 10 ;
UPDATE ft_table SET groupe = 'others' WHERE user_id > 5;
UPDATE `ft_table` SET `date_de_creation`= ADDDATE(date_de_creation, INTERVAL 20 YEAR) WHERE user_id>5;
DELETE FROM ft_table WHERE user_id<6;