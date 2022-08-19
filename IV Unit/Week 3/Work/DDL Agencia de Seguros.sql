-- DDL (DATA DEFINITION LANGUAGE)

CREATE DATABASE AgenciaDeSeguros;

USE AgenciaDeSeguros;

CREATE TABLE Municipio(
	idMunicipio INT AUTO_INCREMENT NOT NULL,
    nombreMunicipio VARCHAR (50) NOT NULL,
    PRIMARY KEY (idMunicipio)
);


CREATE TABLE TipoVehiculo(
	idTipoVehiculo INT AUTO_INCREMENT NOT NULL,
    nombreTipoVehiculo VARCHAR (50) NOT NULL,
	PRIMARY KEY (idTipoVehiculo)
);


CREATE TABLE Persona(
	idPersona INT AUTO_INCREMENT NOT NULL,
	nombrePersona VARCHAR (75) NOT NULL,
    apellidoPersona VARCHAR (75) NOT NULL,
    direccionPersona VARCHAR (75) NOT NULL,
    telefonoPersona INT NOT NULL,
    dpiPersona BIGINT NOT NULL,
    idMunicipio INT NOT NULL,
    PRIMARY KEY (idPersona),
    FOREIGN KEY (idMunicipio) REFERENCES Municipio (idMunicipio)
);


CREATE TABLE Vehiculo(
	idVehiculo INT AUTO_INCREMENT NOT NULL,
    placaVehiculo VARCHAR (50) NOT NULL,
    marcaVehiculo VARCHAR (50) NOT NULL,
    modeloVehiculo VARCHAR (50) NOT NULL,
    idTipoVehiculo INT NOT NULL,
	PRIMARY KEY (idVehiculo),
    FOREIGN KEY (idTipoVehiculo) REFERENCES TipoVehiculo (idTipoVehiculo)
);


CREATE TABLE TarjetaDeCirculacion(
	idTarjetaDeCirculacion INT AUTO_INCREMENT NOT NULL,
    idPersona INT NOT NULL,
    idVehiculo INT NOT NULL,
    PRIMARY KEY (idTarjetaDeCirculacion),
    FOREIGN KEY (idPersona) REFERENCES Persona (idPersona),
    FOREIGN KEY (idVehiculo) REFERENCES Vehiculo (idVehiculo)
);


CREATE TABLE Accidente(
	idAccidente INT AUTO_INCREMENT NOT NULL,
    fechaAccidente DATE NOT NULL,
	horaAccidente TIME NOT NULL,
    lugarAccidente VARCHAR (75) NOT NULL,
    descripcionAccidente VARCHAR (150) NOT NULL,
    idMunicipio INT NOT NULL,
    idTarjetaDeCirculacion INT NOT NULL,
    PRIMARY KEY (idAccidente),
    FOREIGN KEY (idMunicipio) REFERENCES Municipio (idMunicipio),
	FOREIGN KEY (idTarjetaDeCirculacion) REFERENCES TarjetaDeCirculacion (idTarjetaDeCirculacion)
);


CREATE TABLE Multa(
	idMulta INT AUTO_INCREMENT NOT NULL,
    fechaMulta DATE NOT NULL,
    horaMulta TIME NOT NULL,
    lugarDeInfraccionMulta VARCHAR (75) NOT NULL,
    descripcionMulta VARCHAR (150) NOT NULL,
    importeMulta DECIMAL NOT NULL,
    idMunicipio INT NOT NULL,
    idTarjetaDeCirculacion INT NOT NULL,
    PRIMARY KEY (idMulta),
    FOREIGN KEY (idMunicipio) REFERENCES Municipio (idMunicipio),
	FOREIGN KEY (idTarjetaDeCirculacion) REFERENCES TarjetaDeCirculacion (idTarjetaDeCirculacion)
);