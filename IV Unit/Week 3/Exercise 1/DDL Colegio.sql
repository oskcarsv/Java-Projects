-- DDL (DATA DEFINITION LANGUAGE)

-- Creamos la DB
CREATE DATABASE Colegio;

-- Hacemos uso de la DB que creamos
USE Colegio;

-- DDL - CREACIÓN DE LAS TABLAS

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
    id_tipo_materia INT NOT NULL, ## LLAVE FORANEA
    PRIMARY KEY (idMateria),
    FOREIGN KEY (id_tipo_materia) REFERENCES TipoMateria (idTipoMateria)
);

CREATE TABLE Alumno(
	carnet INT AUTO_INCREMENT NOT NULL,
    nombreAlumno VARCHAR(50) NOT NULL,
    apellidoAlumno VARCHAR(50) NOT NULL,
    direccion VARCHAR(50) NOT NULL,
    edad INT NOT NULL,
    id_grado INT NOT NULL,     ## LLAVE FORANEA
    id_carrera INT NOT NULL,   ## LLAVE FORANEA
    id_jornada INT NOT NULL,   ## LLAVE FORANEA
    PRIMARY KEY (carnet),
    FOREIGN KEY (id_grado) REFERENCES Grado (idGrado),
    FOREIGN KEY (id_carrera) REFERENCES Carrera (idCarrera),
    FOREIGN KEY (id_jornada) REFERENCES Jornada (idJornada)
);

CREATE TABLE Profesor(
	idProfesor INT AUTO_INCREMENT NOT NULL,
    nombre VARCHAR (50) NOT NULL,
    apellido VARCHAR (50) NOT NULL,
    email VARCHAR (50) NOT NULL,
    edad INT NOT NULL,
    id_grado INT NOT NULL,   ## LLAVE FORANEA 
	id_materia INT NOT NULL, ## LLAVE FORANEA 
    id_salon INT NOT NULL,   ## LLAVE FORANEA 
	PRIMARY KEY (idProfesor),
    FOREIGN KEY (id_grado) REFERENCES Grado (idGrado),
    FOREIGN KEY (id_materia) REFERENCES Materia (idMateria),
    FOREIGN KEY (id_salon) REFERENCES Salon (idSalon)
);

CREATE TABLE Seccion(
	idSeccion INT AUTO_INCREMENT NOT NULL,
    nombreSeccion CHAR NOT NULL,
    id_alumno INT NOT NULL,
    id_profesor INT NOT NULL,
    PRIMARY KEY (idSeccion),
    FOREIGN KEY (id_alumno) REFERENCES Alumno (carnet),
    FOREIGN KEY (id_profesor) REFERENCES Profesor (idProfesor)
);