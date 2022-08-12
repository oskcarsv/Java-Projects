-- DDL (DATA DEFINITION LANGUAGE)

CREATE DATABASE GestionProductos;

USE GestionProductos;

-- TABLE CATEGORIAS
CREATE TABLE Categorias(
	idCategoria INT AUTO_INCREMENT NOT NULL,
    nombreCategoria VARCHAR(50) NOT NULL,
    descripcionCategoria VARCHAR(100) NOT NULL,
    PRIMARY KEY (idCategoria)
);


-- TABLE USUARIO
CREATE TABLE Usuario(
	idUsuario INT AUTO_INCREMENT NOT NULL,
    nombreUsuario VARCHAR(50) NOT NULL,
    apellidoUsuario VARCHAR(50) NOT NULL,
    fechaDeNacimiento DATE NOT NULL,
    edad INT NOT NULL,
    PRIMARY KEY (idUsuario)
);


-- TABLE PRODUCTOS
CREATE TABLE Productos(
	idProducto INT AUTO_INCREMENT NOT NULL,
    nombreProducto VARCHAR(50) NOT NULL,
    cantidadStock INT NOT NULL,
    idCategoria INT NOT NULL,
    PRIMARY KEY (idProducto),
    FOREIGN KEY (idCategoria) REFERENCES Categorias (idCategoria)
);


-- TABLE VENTAS
CREATE TABLE Ventas(
	idVentas INT AUTO_INCREMENT NOT NULL,
    fechaRetiro DATE NOT NULL,
    totalVentas DOUBLE NOT NULL,
    idUsuario INT NOT NULL,
    PRIMARY KEY (idVentas),
    FOREIGN KEY (idUsuario) REFERENCES Usuario (idUsuario)
);


-- TABLE COMPRAS
CREATE TABLE Compras(
	idCompras INT AUTO_INCREMENT NOT NULL,
    nombreProveedor VARCHAR(50) NOT NULL,
    fechaAdquisicion DATE NOT NULL,
    fechaCaducidad DATE NOT NULL,
    totalCompras DOUBLE NOT NULL,
    idUsuario INT NOT NULL,
    PRIMARY KEY (idCompras),
    FOREIGN KEY (idUsuario) REFERENCES Usuario (idUsuario)
);


-- TABLE DETALLE COMPRAS
CREATE TABLE DetalleCompras(
	idDetalleCompra INT AUTO_INCREMENT NOT NULL,
    cantidadIngreso INT NOT NULL,
    totalCompra DOUBLE NOT NULL,
    idCompras INT NOT NULL,
    idProducto INT NOT NULL,
    PRIMARY KEY (idDetalleCompra),
    FOREIGN KEY (idCompras) REFERENCES Compras (idCompras),
    FOREIGN KEY (idProducto) REFERENCES Productos (idProducto)
);


-- TABLE DETALLE VENTAS
CREATE TABLE DetalleVentas(
	idDetalleVentas INT AUTO_INCREMENT NOT NULL,
    cantidadRetiro INT NOT NULL,
    descuentoRetiro INT NOT NULL,
    totalRetiro DOUBLE NOT NULL,
    idVentas INT NOT NULL,
    idProducto INT NOT NULL,
    PRIMARY KEY (idDetalleVentas),
    FOREIGN KEY (idVentas) REFERENCES Ventas (idVentas),
    FOREIGN KEY (idProducto) REFERENCES Productos (idProducto)
);