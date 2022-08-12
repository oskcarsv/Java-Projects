-- DDL (DATA DEFINITION LANGUAJE)

-- Creamos la DB
CREATE DATABASE Colegio;

-- Hacemos uso de la DB que creamos
USE Colegio;

-- DDL - CREACION DE LAS TABLAS

CREATE TABLE Grado(
	idGrado INT AUTO_INCREMENT NOT NULL,
    nombreGrado VARCHAR(50) NOT NULL,
    PRIMARY KEY (idGrado)
);

CREATE TABLE Carrera(
	idCarrera INT AUTO_INCREMENT NOT NULL,
    nombreCarrera VARCHAR(50) NOT NULL,
    PRIMARY KEY (idCarrera)
);

CREATE TABLE Salon(
	idSalon INT AUTO_INCREMENT NOT NULL,
    nombreSalon VARCHAR(50) NOT NULL,
    PRIMARY KEY (idSalon)
);

CREATE TABLE Jornada(
	idJornada INT AUTO_INCREMENT NOT NULL,
    nombreJornada VARCHAR(50) NOT NULL,
    PRIMARY KEY (idJornada)
);

CREATE TABLE TipoMateria(
	idTipoMateria INT AUTO_INCREMENT NOT NULL,
    nombreMateria VARCHAR(50) NOT NULL,
    PRIMARY KEY (idTipoMateria)
);

CREATE TABLE Materia(
	idMateria INT AUTO_INCREMENT NOT NULL,
    nombreMateria VARCHAR(50) NOT NULL,
    idTipoMateria INT NOT NULL, ## LLAVE FORANEA
    PRIMARY KEY (idMateria),
    FOREIGN KEY (idTipoMateria) REFERENCES TipoMateria (idTipoMateria)
);

CREATE TABLE Alumno(
	carnet INT AUTO_INCREMENT NOT NULL,
    nombreAlumno VARCHAR(50) NOT NULL,
    apellidoAlumno VARCHAR(50) NOT NULL,
    direccion VARCHAR (50) NOT NULL,
    edad INT NOT NULL,
    idGrado INT NOT NULL,		##LLAVE FORANEA
    idcarrera INT NOT NULL,		##LLAVE FORANEA
    idJornada INT NOT NULL,		##LLAVE FORANEA
    PRIMARY KEY(carnet),
    FOREIGN KEY(idGrado) REFERENCES Grado(idGrado),
    FOREIGN KEY(idCarrera) REFERENCES Carrera(idCarrera),
    FOREIGN KEY(idJornada) REFERENCES Jornada(idJornada)   
);

CREATE TABLE Profesor(
	idProfesor INT AUTO_INCREMENT NOT NULL,
    nombreProfesor VARCHAR(50) NOT NULL,
    apellidoProfesor VARCHAR(50) NOT NULL,
    edadProfesor INT NOT NULL,
    idGrado INT NOT NULL,		##LLAVE FORANEA
    idMateria INT NOT NULL,		##LLAVE FORANEA
    idSalon INT NOT NULL,		##LLAVE FORANEA
    PRIMARY KEY(idProfesor),
    FOREIGN KEY(idGrado) REFERENCES Grado(idGrado),
    FOREIGN KEY(idMateria) REFERENCES Materia(idMateria),
    FOREIGN KEY(idSalon) REFERENCES Salon(idSalon)   
);

CREATE TABLE Seccion(
	idSeccion INT AUTO_INCREMENT NOT NULL,
    nombreSeccion VARCHAR(50) NOT NULL,
	carnet INT NOT NULL,		##LLAVE FORANEA
    idProfesor INT NOT NULL,	##LLAVE FORANEA
    PRIMARY KEY(idSeccion),
	FOREIGN KEY(carnet) REFERENCES Alumno(carnet),
    FOREIGN KEY(idProfesor) REFERENCES Profesor(idProfesor)
);