-- DDL (DATA DEFINITION LANGUAJE)

CREATE DATABASE Personas;

USE Personas;


-- TABLE COUNTRY
CREATE TABLE depCountry(
	idDepCountry INT NOT NULL,
    nameDepCountry VARCHAR(50) NOT NULL,
    PRIMARY KEY (idDepCountry)
);


-- TABLE DEP NAME
CREATE TABLE depName(
	idDepName INT NOT NULL,
    nameDepName VARCHAR(50) NOT NULL,
    PRIMARY KEY (idDepName)
);


-- TABLE DEP CITY
CREATE TABLE depCity(
	idDepCity INT NOT NULL,
    nameDepCity VARCHAR(50) NOT NULL,
	idDepCountry INT NOT NULL,
    PRIMARY KEY (idDepCity),
    FOREIGN KEY (idDepCountry) REFERENCES depCountry (idDepCountry)
);


-- TABLE PERSON
CREATE TABLE person(
	idPerson INT NOT NULL,
    namePerson VARCHAR(50) NOT NULL,
    lastNamePersona VARCHAR(50) NOT NULL,
	idDepName INT NOT NULL,
  	idDepCity INT NOT NULL,
    PRIMARY KEY (idPerson),
    FOREIGN KEY (idDepName) REFERENCES depName (idDepName),	
    FOREIGN KEY (idDepCity) REFERENCES depCity (idDepCity)		
);