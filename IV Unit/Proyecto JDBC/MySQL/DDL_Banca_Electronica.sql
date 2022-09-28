-- Oscar José Morales Velásquez - 2019282 (Coordinador)
-- Jorge Abraham Revolorio Mazariegos - 2019058
--  Omar Emiliani Sanchez Mendoza - 2019490

-- DDL BANCA ELECTRONICA

CREATE DATABASE Banca_Electronica;

USE Banca_Electronica;


-- Tabla Compania Telefonica
CREATE TABLE CompaniaTelefonica(
	idCompania INT NOT NULL,
    nombreCompania VARCHAR(10) NOT NULL,
    extensionCompania INT NOT NULL,
    PRIMARY KEY (idCompania)
);


-- Tabla Tipo Cuenta
CREATE TABLE TipoCuentas(
	idTipoCuenta INT NOT NULL,
    nombreTipoCuenta VARCHAR(30) NOT NULL,
    descripcionCuenta VARCHAR(75) NOT NULL,
    PRIMARY KEY (idTipoCuenta)
);


-- Tabla Tipo Moneda
CREATE TABLE Monedas(
	idMoneda INT NOT NULL,
    nombreMoneda VARCHAR(25) NOT NULL,
    PRIMARY KEY(idMoneda)
);


-- Tabla Identificador Extranjero o Nacional 
CREATE TABLE IdentificadorClientes(
	idIdentificadorCliente INT NOT NULL,
    nombreIdentificadorCliente VARCHAR(25),
    PRIMARY KEY(idIdentificadorCliente)
);


-- Tabla Proveedor Servicio
CREATE TABLE ProveedorServicios(
	idTipoProveedor INT NOT NULL,
    nombreProveedorServicio VARCHAR(40) NOT NULL,
    tipoServicio VARCHAR(50) NOT NULL,
    descripcionServicio VARCHAR(75) NOT NULL,
    PRIMARY KEY(idTipoProveedor)
);


-- Tabla Clientes
CREATE TABLE Clientes(
	cuiCliente BIGINT NOT NULL,
    nombreCliente VARCHAR(30) NOT NULL,
    apellidoCliente VARCHAR(30) NOT NULL,
    direccionCliente VARCHAR(75) NOT NULL,
    telefonoCliente INT NOT NULL,
    sexoCliente VARCHAR(15) NOT NULL,
    nacionalidadCliente VARCHAR(25),
    id_Compania INT NOT NULL,
    id_Identificador_Cliente INT NOT NULL,
    PRIMARY KEY(cuiCliente),
    FOREIGN KEY (id_Compania) REFERENCES CompaniaTelefonica (idCompania),
    FOREIGN KEY (id_Identificador_Cliente) REFERENCES IdentificadorClientes (idIdentificadorCliente)
);


-- Cuentas
CREATE TABLE Cuentas(
	idCuenta BIGINT NOT NULL,
    saldoCuenta DOUBLE NOT NULL,
    id_Tipo_Cuenta INT NOT NULL,
    id_Moneda INT NOT NULL,
    PRIMARY KEY (idCuenta),
    FOREIGN KEY (id_Tipo_Cuenta) REFERENCES TipoCuentas (idTipoCuenta),
    FOREIGN KEY (id_Moneda) REFERENCES Monedas (idMoneda)
);


-- Tabla Usuarios
CREATE TABLE Usuarios(
	idUsuario BIGINT NOT NULL,
    nombreUsuario VARCHAR(15) NOT NULL,
    passwordUsuario VARCHAR(35) NOT NULL,
    estadoUsuario VARCHAR(30) NOT NULL,
    fechaCreacionUsuario DATE NOT NULL,
    cui_Cliente BIGINT NOT NULL,
    PRIMARY KEY (idUsuario),
    FOREIGN KEY (cui_Cliente) REFERENCES Clientes (cuiCliente),
	UNIQUE (nombreUsuario)
);


-- Tabla Transacciones
CREATE TABLE Transacciones(
	idTransacciones BIGINT NOT NULL,
    identificadorPago VARCHAR(50) NOT NULL,
	descripcionTransaccion VARCHAR(50) NOT NULL,
    montoPagoTransaccion DOUBLE NOT NULL,
    fechaDeTransaccion DATE NOT NULL,
    id_Usuario BIGINT NOT NULL,
    id_Tipo_Proveedor INT NOT NULL,    
    id_Cuenta BIGINT NOT NULL,
    PRIMARY KEY (idTransacciones),
    FOREIGN KEY (id_Usuario) REFERENCES Usuarios (idUsuario),    
    FOREIGN KEY (id_Tipo_Proveedor) REFERENCES ProveedorServicios (idTipoProveedor),
    FOREIGN KEY (id_Cuenta) REFERENCES Cuentas (idCuenta)
);