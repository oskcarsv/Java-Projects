CREATE DATABASE Tienda_Online;

USE Tienda_Online;

CREATE TABLE Categoria (
	idCategoria INT AUTO_INCREMENT NOT NULL,
    nombreCategoria VARCHAR (50) NOT NULL,
    PRIMARY KEY (idCategoria)
);

CREATE TABLE Cliente (
	idCliente INT AUTO_INCREMENT NOT NULL,
    nombre VARCHAR (50) NOT NULL,
    apellido VARCHAR (50) NOT NULL,
    telefono INT NOT NULL,
    correo VARCHAR (50) NOT NULL,
    direccion VARCHAR (50) NOT NULL,
    PRIMARY KEY (idCliente)
);

CREATE TABLE Producto (
	idProducto INT AUTO_INCREMENT NOT NULL,
    nombreProducto VARCHAR (50) NOT NULL,
    precioProducto DOUBLE NOT NULL,
    fechaDeVencimiento DATE NOT NULL,
    id_Categoria INT NOT NULL,
    PRIMARY KEY(idProducto),
    FOREIGN KEY (id_Categoria) REFERENCES Categoria (idCategoria)
);

CREATE TABLE ReporteVentas (
	idVentas INT AUTO_INCREMENT NOT NULL,
    fechaVenta VARCHAR (50) NOT NULL,
    direccionVenta VARCHAR (50) NOT NULL,
    id_Cliente INT NOT NULL,
    id_Producto INT NOT NULL,
    totalCompra DOUBLE NOT NULL,
    PRIMARY KEY (idVentas),
    FOREIGN KEY (id_Cliente) REFERENCES Cliente (idCliente),
    FOREIGN KEY (id_Producto) REFERENCES Producto (idProducto)
);