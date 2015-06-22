delete from centreinteret_utilisateur;
delete from utilisateur;
delete from centreinteret;


INSERT INTO Utilisateur (Nom, Prenom, Email, Civilite, DateInscription, Visite) 
VALUES ('Utilisateur1', 'User1', 'utilisateur1@utilsiateur1.fr', 'Homme', DATE '2015-06-20', '0');
INSERT INTO Utilisateur (Nom, Prenom, Email, Civilite, DateInscription, Visite) 
VALUES ('CROIN', 'Antoine', 'antoine.croin@mail.fr', 'Homme', DATE '2015-03-09', '0');
INSERT INTO Utilisateur (Nom, Prenom, Email, Civilite, DateInscription, Visite) 
VALUES ('FOURNEAUX', 'Pauline', 'pauline.fourneaux@mail.fr', 'Femme', DATE '2012-09-13', '0');
INSERT INTO Utilisateur (Nom, Prenom, Email, Civilite, DateInscription, Visite) 
VALUES ('CRIBEL', 'Maryne', 'maryne.cribel@mail.fr', 'Femme', DATE '2010-04-25', '0');
INSERT INTO Utilisateur (Nom, Prenom, Email, Civilite, DateInscription, Visite) 
VALUES ('MEISSONNIER', 'Kevin', 'kevin.meissonnier@mail.fr', 'Homme', DATE '2013-01-26', '0');
INSERT INTO Utilisateur (Nom, Prenom, Email, Civilite, DateInscription, Visite) 
VALUES ('RODRIGUES', 'Thomas', 'thomas.rodrigues@mail.fr', 'Homme', DATE '2015-04-12', '0');

INSERT INTO CentreInteret (Id, Libelle) 
VALUES ('1', 'C#');
INSERT INTO CentreInteret (Id, Libelle) 
VALUES ('2', 'JEE');
INSERT INTO CentreInteret (Id, Libelle) 
VALUES ('3', 'C++');
INSERT INTO CentreInteret (Id, Libelle) 
VALUES ('4', 'C');
INSERT INTO CentreInteret (Id, Libelle) 
VALUES ('5', 'JavaScript');
INSERT INTO CentreInteret (Id, Libelle) 
VALUES ('6', 'HTML');
INSERT INTO CentreInteret (Id, Libelle) 
VALUES ('7', 'PHP');

INSERT INTO CentreInteret_Utilisateur (FK_IdUtilisateur, FK_IdCentreInterer)
VALUES ('0', '2');
INSERT INTO CentreInteret_Utilisateur (FK_IdUtilisateur, FK_IdCentreInterer)
VALUES ('1', '3');
INSERT INTO CentreInteret_Utilisateur (FK_IdUtilisateur, FK_IdCentreInterer)
VALUES ('2', '1');
INSERT INTO CentreInteret_Utilisateur (FK_IdUtilisateur, FK_IdCentreInterer)
VALUES ('3', '5');
INSERT INTO CentreInteret_Utilisateur (FK_IdUtilisateur, FK_IdCentreInterer)
VALUES ('4', '6');
INSERT INTO CentreInteret_Utilisateur (FK_IdUtilisateur, FK_IdCentreInterer)
VALUES ('5', '4');

