-- DML (DATA MANIPULATION LANGUAJE)

-- Le decimos al sistema que DB vamos a utilizar
USE Colegio;

-- Insertando Informacion 

-- GRADO
INSERT INTO Grado (nombreGrado)
VALUES("1ro. Basico");
INSERT INTO Grado (nombreGrado)
VALUES("2do. Basico");
INSERT INTO Grado (nombreGrado)
VALUES("3ro. Basico");
INSERT INTO Grado (nombreGrado)
VALUES("4to. Diversificado");
INSERT INTO Grado (nombreGrado)
VALUES("5to. Diversificado");
INSERT INTO Grado (nombreGrado)
VALUES("6to. Diversificado");
-- UPDATE Grado SET nombreGrado = "5to. Diversificado" WHERE idGrado = 5;


-- CARRERA
INSERT INTO Carrera (nombreCarrera)
VALUES("Informatica");
INSERT INTO Carrera (nombreCarrera)
VALUES("Mecanica");
INSERT INTO Carrera (nombreCarrera)
VALUES("Dibujo");
INSERT INTO Carrera (nombreCarrera)
VALUES("Electronica");


-- SALON
INSERT INTO Salon (nombreSalon)
VALUES("C-26");
INSERT INTO Salon (nombreSalon)
VALUES("C-36");
INSERT INTO Salon (nombreSalon)
VALUES("D-15");
INSERT INTO Salon (nombreSalon)
VALUES("E-26");

-- JORNADA
INSERT INTO Jornada (nombreJornada)
VALUES("Matutina");
INSERT INTO Jornada (nombreJornada)
VALUES("Vespertina");


-- TIPO MATERIA
INSERT INTO TipoMateria (nombreTipoMateria)
VALUES ("Academica");
INSERT INTO TipoMateria (nombreTipoMateria)
VALUES ("Tecnica");


-- MATERIAS
INSERT INTO Materia (nombreMateria, idTipoMateria)
VALUES ("Taller", 2);
INSERT INTO Materia (nombreMateria, idTipoMateria)
VALUES ("Calculo", 2);
INSERT INTO Materia (nombreMateria, idTipoMateria)
VALUES ("Matematicas", 1);
INSERT INTO Materia (nombreMateria, idTipoMateria)
VALUES ("Comunicacion y Lenguaje", 1);
-- DELETE FROM Materia WHERE idMateria = 4; 


-- ALUMNOS
INSERT INTO Alumno (nombreAlumno, apellidoAlumno, direccion, edad, idGrado, idCarrera, idJornada)
VALUES ("Jose Miguel","Perez Hernandez","12 av, 1-52, Zona 2", 15, 4, 1, 2);
INSERT INTO Alumno (nombreAlumno, apellidoAlumno, direccion, edad, idGrado, idCarrera, idJornada)
VALUES ("Mario Daniel","Aguilar Montoya","15 av. 3-25, Zona 5", 13, 1, 1, 1);
INSERT INTO Alumno (nombreAlumno, apellidoAlumno, direccion, edad, idGrado, idCarrera, idJornada)
VALUES ("Rodrigo Jacob","Castellanos Velasquez","8 av. 18.36, Zona 16", 16, 3, 2, 1);


-- PROFESOR
INSERT INTO Profesor (nombreProfesor, apellidoProfesor, edadProfesor, idGrado, idMateria, idSalon)
VALUES ("Oscar Rodrigo ","Bernard Castillo",50, 6, 3, 1);
INSERT INTO Profesor (nombreProfesor, apellidoProfesor, edadProfesor, idGrado, idMateria, idSalon)
VALUES ("Bryan Estuardo","Sanchez Aguilar",25, 4, 2, 2);
INSERT INTO Profesor (nombreProfesor, apellidoProfesor, edadProfesor, idGrado, idMateria, idSalon)
VALUES ("Jorge Natanael ","Perez Rojas",37, 5, 1, 3);
INSERT INTO Profesor (nombreProfesor, apellidoProfesor, edadProfesor, idGrado, idMateria, idSalon)
VALUES ("Victo Daniel ","Cancinos Velasquez",37, 5, 4, 3);


-- SECCION
INSERT INTO Seccion (nombreSeccion, carnet, idProfesor)
VALUES ("PE4EM", 1, 4);
INSERT INTO Seccion (nombreSeccion, carnet, idProfesor)
VALUES ("PE4AM", 2, 2);
INSERT INTO Seccion (nombreSeccion, carnet, idProfesor)
VALUES ("PE4BM", 3, 3);



SELECT * FROM Grado;
SELECT * FROM Carrera;
SELECT * FROM Salon;
SELECT * FROM Jornada;
SELECT * FROM TipoMateria;
SELECT * FROM Materia;
SELECT * FROM Alumno;
SELECT * FROM Profesor;
SELECT * FROM Seccion;