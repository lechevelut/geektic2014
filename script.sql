DROP TABLE Visite
DROP TABLE CentreInteret_Utilisateur
DROP TABLE CentreInteret
DROP TABLE Utilisateur

CREATE TABLE Utilisateur
(
Id INTEGER NOT NULL IDENTITY,
Nom VARCHAR(60) NOT NULL,
Prenom VARCHAR(60) NOT NULL,
Email VARCHAR(60) NOT NULL,
Civilite VARCHAR(15) NOT NULL,
DateInscription DATE NOT NULL,
Visite INTEGER NOT NULL
)

CREATE TABLE CentreInteret
(
Id INTEGER NOT NULL,
Libelle VARCHAR (50) NOT NULL,
PRIMARY KEY (Id)
)

CREATE TABLE CentreInteret_Utilisateur
(
Id INTEGER NOT NULL IDENTITY ,
FK_IdUtilisateur INT NOT NULL,
FK_IdCentreInterer INT NOT NULL,
FOREIGN KEY (FK_IdUtilisateur) REFERENCES Utilisateur(Id),
FOREIGN KEY (FK_IdCentreInterer) REFERENCES CentreInteret(Id)
)

CREATE TABLE Visite
(
Id INTEGER NOT NULL IDENTITY,
FK_IdUtilisateur INTEGER NOT NULL,
InstantVisite DATE NOT NULL,
AdresseIp VARCHAR (15) NOT NULL,
FOREIGN KEY (FK_IdUtilisateur) REFERENCES Utilisateur(Id),
)