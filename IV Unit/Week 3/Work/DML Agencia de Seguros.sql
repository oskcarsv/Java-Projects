-- DML (DATA MANIPULATION LANGUAGE)

USE AgenciaDeSeguros;


-- MUNICIPIO
INSERT INTO Municipio (nombreMunicipio)
VALUES ("Amatitlán"),
	   ("Chinautla"),
	   ("Chuarrancho"),
	   ("Ciudad de Guatemala"),
       ("Fraijanes"),
       ("Mixco"),
       ("Palencia"),
       ("San José del Golfo"),
       ("San José Pinula"),
       ("San Juan Sacatepéquez"),
       ("San Miguel Petapa"),
       ("San Pedro Ayampuc"),
       ("San Pedro Sacatepéquez"),
       ("San Raymundo"),
       ("Santa Catarina Pinula"),
       ("Villa Canales"),
       ("Villa Nueva");


-- TIPO VEHICULO
INSERT INTO TipoVehiculo (nombreTipoVehiculo)
VALUES ("Carro"),
	   ("Moto"),
       ("Camión"),
       ("Transporte Pesado"),
       ("Construcción");
       
       
 -- PERSONA
 INSERT INTO Persona (nombrePersona, apellidoPersona, idMunicipio, direccionPersona, telefonoPersona, dpiPersona)
 VALUES ("Oscar José", "Morales Velásquez", "4", "12av. 1-52 Zona 2", "55685980", "2320556340101"),
		("Juan Jose", "Arévalo Bermejo", "1", "15av. 3-30 Zona 4", "23568965","7894561230114"),
		("Miguel Ángel", "Asturias Rosales", "6", "4av. 5-16 Zona 7", "78451298","5821693570108"),
        ("Vicente Alejandro", "Aguilar Gonzales", "17", "9av. 7-15 Zona 8", "32057802","2478963150115"),
		("Daniel Mariano", "Méndez Perez", "7", "13av. 1-16 Zona 10", "36080903","3218759630105");
       
       
-- Vehiculo
INSERT INTO Vehiculo (placaVehiculo, marcaVehiculo, modeloVehiculo, idTipoVehiculo)
VALUES ("P492GZC", "Mazda", "Sedan", 1),
	   ("M123WER", "Yamaha", "100", 2),
       ("C456RTU", "Blue Bird", "Fort Valley", 3),
       ("P789MNG", "Honda", "Sedan", 1),
       ("M725QWE", "Bajaj", "Deportiva", 2);
  
  
-- TARJETA DE CIRCULACIÓN 
  INSERT INTO TarjetaDeCirculacion(idPersona, idVehiculo)
  VALUES (1, 4),
		 (2, 1),
         (3, 3),
         (4, 5),
         (5, 2);
  
  
-- ACCIDENTE
INSERT INTO Accidente (fechaAccidente, horaAccidente, lugarAccidente, descripcionAccidente, idMunicipio, idTarjetaDeCirculacion)
VALUES ('2020-08-22', '23:30:49', "16av. y 13 calle", "Choque entre dos autos", 17, 1),
	   ('2019-09-13', '06:15:55', "17av. y 20 calle", "Carro choca con poste", 7, 4),
       ('2022-05-22', '12:25:07', "20av. y 18 calle", "Moto se resbala", 11, 2),
       ('2022-09-25', '08:32:05', "12av. y 30 calle", "Bus cae a un barranco", 3, 3),
       ('2022-01-15', '23:16:25', "6av. y 18 calle", "Choque por carrera ilegal de motos", 1, 5);
 
 
       
-- MULTA
INSERT INTO Multa (fechaMulta, horaMulta, lugarDeInfraccionMulta, descripcionMulta, importeMulta, idMunicipio, idTarjetaDeCirculacion)       
VALUES ('2022-03-25', '16:04:31', "15av. y 25 calle", "Conducir sin licencia", 400.00, 4, 1),
	   ('2019-04-20', '10:18:45', "4av. y 10 calle", "Tarjeta de circulación vencida", 500.00, 8, 2),
       ('2020-12-24', '18:54:12', "8av. y 17 calle", "Obstaculizar la  vía pública", 500.00, 12, 3),
       ('2022-08-22', '09:03:10', "7av. y 13 calle", "Exceso de velocidad", 300.00, 5, 4),
       ('2020-01-13','01:08:51', "16av. y 22 calle", "Conducir en estado de ebriedad", 500.00, 2, 5);

UPDATE Accidente SET descripcionAccidente = "Moto se resbala" WHERE idAccidente = 3;


-- SELECT MUNICIPIO
SELECT * FROM Municipio;		##Select normal
SELECT idMunicipio AS "ID", nombreMunicipio AS "Municipio" FROM Municipio;


-- SELECT TIPO VEHICULO
SELECT * FROM TipoVehiculo;		##Select normal
SELECT idTipoVehiculo AS "ID", nombreTipoVehiculo AS "Tipo de Vehiculo" FROM TipoVehiculo;


-- SELECT PERSONA
SELECT * FROM Persona;			##Select normal

SELECT p.idPersona AS "ID", p.nombrePersona AS "Nombres", 
	   p.apellidoPersona AS "Apellidos", 
       p.direccionPersona AS "Dirección",
	   p.telefonoPersona AS "Teléfono", 
       p.dpiPersona AS "DPI", 
--     p.idMunicipio AS " ID Municipio",
       m.nombreMunicipio AS "Municipio"
FROM Persona AS p
INNER JOIN 	Municipio AS m ON p.idMunicipio = m.idMunicipio;


-- SELECT VEHICULO
SELECT * FROM Vehiculo;			##Select normal

SELECT v.idVehiculo AS "ID", v.placaVehiculo AS "Placa", 
	   v.marcaVehiculo AS "Marca",
       v.modeloVehiculo AS "Modelo",
--     v.idTipoVehiculo AS "ID Tipo de Vehículo",
       tv.nombreTipoVehiculo AS "Tipo de Vehículo"
FROM Vehiculo AS V
INNER JOIN TipoVehiculo AS tv ON v.idTipoVehiculo = tv.idTipoVehiculo;


-- SELECT TARJETA DE CIRCULACION
SELECT * FROM TarjetaDeCirculacion;

SELECT tdc.idTarjetaDeCirculacion AS "ID", 
-- 	   tdc.idPersona AS "ID Persona",
       p.nombrePersona AS "Nombres",
       p.apellidoPersona AS "Apeliidos",
--     tdc.idVehiculo AS "ID Vehiculo",
       v.placaVehiculo AS "Placa",
       v.marcaVehiculo AS "Marca",
       v.modeloVehiculo AS "Modelo"
FROM TarjetaDeCirculacion AS tdc
INNER JOIN Persona AS p ON tdc.idPersona = p.idPersona
INNER JOIN Vehiculo AS v ON tdc.idVehiculo = v.idVehiculo;


-- SELECT ACCIDENTE
SELECT * FROM Accidente;

SELECT ac.idAccidente AS "ID",
	   ac.fechaAccidente AS "Fecha",
       ac.horaAccidente AS "Hora",
       ac.lugarAccidente AS "Lugar",
       ac.descripcionAccidente AS "Descripción",
--     ac.idMunicipio AS "ID Municipio",
       m.nombreMunicipio AS "Municipio del accidente",
--     ac.idTarjetaDeCirculacion AS "ID Tarjeta de circulación",
       p.nombrePersona AS "Persona",
       v.placaVehiculo AS "Placa",
       v.marcaVehiculo AS "Vehiculo"
FROM Accidente AS ac
INNER JOIN Municipio AS m ON ac.idMunicipio = m.idMunicipio
INNER JOIN TarjetaDeCirculacion AS tdc ON ac.idTarjetaDeCirculacion = tdc.idTarjetaDeCirculacion
INNER JOIN Persona AS p ON tdc.idTarjetaDeCirculacion = p.idPersona
INNER JOIN Vehiculo AS v ON tdc.idTarjetaDeCirculacion = v.idVehiculo;


SELECT * FROM Multa;

SELECT mul.idMulta AS "ID",
	   mul.fechaMulta AS "Fecha",
       mul.horaMulta AS "Hora",
       mul.lugarDeInfraccionMulta AS "Lugar",
       mul.descripcionMulta AS "Descripción",
       mul.importeMulta AS "Importe",
--     mul.idMunicipio AS "ID Municipio",
       m.nombreMunicipio AS "Municipio de la multa",
--     mul.idTarjetaDeCirculacion AS "ID Tarjeta de circulación",
       p.nombrePersona AS "Persona",
       v.placaVehiculo AS "Placa",
       v.marcaVehiculo AS "Vehiculo"
FROM Multa AS mul
INNER JOIN Municipio AS m ON mul.idMunicipio = m.idMunicipio
INNER JOIN TarjetaDeCirculacion AS tdc ON mul.idTarjetaDeCirculacion = tdc.idTarjetaDeCirculacion
INNER JOIN Persona AS p ON mul.idTarjetaDeCirculacion = p.idPersona
INNER JOIN Vehiculo AS v ON mul.idTarjetaDeCirculacion = v.idVehiculo;