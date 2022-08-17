-- DML (DATA MANIPULATION LANGUAGE)

-- Le decimos al sistema que DB vamos a utilizar
USE Colegio;

-- Insertando Información

-- GRADO
INSERT INTO Grado (nombreGrado)
VALUES ("Cuarto");
INSERT INTO Grado (nombreGrado)
VALUES ("Quinto");
INSERT INTO Grado (nombreGrado)
VALUES ("Sexto");


-- CARRERA
INSERT INTO Carrera (nombreCarrera)
VALUES ("Informática");
INSERT INTO Carrera (nombreCarrera)
VALUES ("Mecanica");
INSERT INTO Carrera (nombreCarrera)
VALUES ("Dibujo");
INSERT INTO Carrera (nombreCarrera)
VALUES ("Electronica");


-- SALON
INSERT INTO Salon(nombreSalon)
VALUES ('c-26'),
	   ('c-31'),
       ('c-36');


-- JORNADA
INSERT INTO Jornada(nombreJornada)
VALUES ('Matutina');
INSERT INTO Jornada(nombreJornada)
VALUES ('Vespertina');


-- TIPO MATERIA
INSERT INTO TipoMateria(nombreMateria) 
VALUES ("Academica");
INSERT INTO TipoMateria(nombreMateria) 
VALUES ("Técnica");


-- MATERIAS
INSERT INTO Materia (nombreMateria, id_tipo_materia) 
VALUES	("Taller 1", 2);
INSERT INTO Materia (nombreMateria, id_tipo_materia) 
VALUES	("Tecnología 1", 2);
INSERT INTO Materia (nombreMateria, id_tipo_materia) 
VALUES	("Matematicas", 1);
INSERT INTO Materia (nombreMateria, id_tipo_materia) 
VALUES	("Comunicación y Lenguaje", 1);
INSERT INTO Materia (nombreMateria, id_tipo_materia) 
VALUES	("Dibujo", 2);
INSERT INTO Materia (nombreMateria, id_tipo_materia) 
VALUES	("Fisica", 1);


-- ALUMNOS
-- INSERCION MASIVA DE DATOS
INSERT INTO Alumno (nombreAlumno, apellidoAlumno, direccion, edad, id_grado, id_carrera, id_jornada)
VALUES ("Oscar Jose", "Morales Velasquez", "Zona 2, Guatemala", 	16,		1,		1,		1),
	   ("Mario Alejandro", "Castañeda Jimenez", "Zona 7, Mixco",	17,		2,		4,		2),
	   ("Rodrigo Daniel", "Rojas Aguilar", "Zona 21, Guatemala",	16,		1,		3,		1),
	   ("Angel Gabriel", "Solares Mendez", "Zona 3, Guatemala",		19,		3,		2,		2);
       
-- PROFESOR
INSERT INTO Profesor(nombre, apellido, email, edad, id_grado, id_materia, id_salon)
VALUES ('Victor Manuel', 'Cancinos De León', 'victorcancinos@kinal.org.gt', 22, 1, 1, 1),
       ('Brayan', 'Joj', 'brayanjoj@kinal.org.gt', 28, 2, 3, 2),
       ('Mynor', 'Matias', 'maynormatias@kinal.org.gt', 40, 1, 4, 3);


-- SECCION
INSERT INTO Seccion(nombreSeccion, id_alumno, id_profesor)
VALUES ('B', 1, 1),
	   ('A', 3, 1),
       ('A', 2, 2),
       ('B', 4, 3);
       

-- SELEC 
SELECT * FROM Grado;
SELECT * FROM Carrera;
SELECT * FROM Salon;
SELECT * FROM Jornada;
SELECT * FROM TipoMateria;



-- SELECT / INNER JOIN - MATERIA
SELECT * FROM Materia;

SELECT m.idMateria AS 'ID', m.nombreMateria AS 'Materia', m.id_tipo_materia AS 'id tipo materia', 
tm.nombreMateria AS 'Tipo'
FROM Materia AS m
INNER JOIN TipoMateria AS tm ON m.id_tipo_materia = tm.idTipoMateria;



-- SELECT / INNER JOIN - Alumno
SELECT * FROM Alumno;

SELECT a.carnet AS 'Carnet ID', a.nombreAlumno AS 'Nombre', a.apellidoAlumno AS 'Apellido',
	   a.direccion AS 'Ubicación', a.edad AS 'Edad',
       -- a.id_grado AS 'ID Grado', 
       g.nombreGrado AS 'Grado',
       -- a.id_carrera AS 'ID Carrera', 
       c.nombreCarrera AS 'Carrera',
       -- a.id_jornada AS 'ID Jornada', 
       j.nombreJornada AS 'Jornada'
FROM Alumno AS a
INNER JOIN Grado AS g ON a.id_grado = g.idGrado
INNER JOIN Carrera AS c ON a.id_carrera = c.idCarrera
INNER JOIN Jornada AS j ON a.id_jornada = j.idJornada;



-- SELECT / INNER JOIN - Profesor
SELECT * FROM Profesor;

SELECT  p.idProfesor AS 'ID Profesor', p.nombre 'Nombre', p.apellido 'Apellido',
		p.email 'Email', p.edad 'Edad',
        -- p.id_grado 'ID Grado', 
        g.nombreGrado 'Grado',
        -- p.id_materia 'ID Materia', 
        m.nombreMateria 'Materia',
        -- p.id_salon 'ID Salon', 
        s.nombreSalon 'Salón'
FROM Profesor AS p
INNER JOIN Grado AS g ON p.id_grado = g.idGrado
INNER JOIN Materia AS m ON p.id_materia = m.idMateria
INNER JOIN Salon AS s ON p.id_salon = s.idSalon;



-- SELECT / INNER JOIN - Sección
SELECT * FROM Seccion;

SELECT s.idSeccion AS 'ID Sección', s.nombreSeccion AS 'Sección',
	   -- s.id_alumno AS 'ID Alumno',
       a.nombreAlumno AS 'Alumno',
       -- s.id_profesor AS 'ID Profesor',
       p.nombre AS 'Profesor'
FROM Seccion AS s
INNER JOIN Alumno AS a ON s.id_alumno = a.carnet
INNER JOIN Profesor AS p ON s.id_profesor = p.idProfesor;

