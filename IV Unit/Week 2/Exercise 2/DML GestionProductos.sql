-- DML (DATA MANIPULATION LENGUAGE)

USE GestionProductos;

-- CATEGORIAS
INSERT INTO Categorias (nombreCategoria, descripcionCategoria)
VALUES ("Electrónicos", "Dispositivos electrónicos");
INSERT INTO Categorias (nombreCategoria, descripcionCategoria)
VALUES ("Hogar", "Utensilios para el hogar");
INSERT INTO Categorias (nombreCategoria, descripcionCategoria)
VALUES ("Cocina", "Utensilios para la cocina");
INSERT INTO Categorias (nombreCategoria, descripcionCategoria)
VALUES ("Escolar", "Útiles escolares");
INSERT INTO Categorias (nombreCategoria, descripcionCategoria)
VALUES ("Aseo personal", "Productos de aseo personal");

SELECT * FROM Categorias;


-- USUARIO
INSERT INTO Usuario (nombreUsuario, apellidoUsuario, fechaDeNacimiento, edad)
VALUES ("Oscar", "Morales", "2006-08-22", 15);
INSERT INTO Usuario (nombreUsuario, apellidoUsuario, fechaDeNacimiento, edad)
VALUES ("Juan", "Vasquez","2000-01-15", 22);
INSERT INTO Usuario (nombreUsuario, apellidoUsuario, fechaDeNacimiento, edad)
VALUES ("Jorge", "Perez","1970-06-29", 52);
INSERT INTO Usuario (nombreUsuario, apellidoUsuario, fechaDeNacimiento, edad)
VALUES ("Mario", "Aguilar","1999-07-17", 23);
INSERT INTO Usuario (nombreUsuario, apellidoUsuario, fechaDeNacimiento, edad)
VALUES ("José", "Velasquez","2002-05-07", 20);

SELECT * FROM Usuario;


-- PRODUCTO
INSERT INTO Productos (nombreProducto, cantidadStock, idCategoria)
VALUES ("Laptop", 5, 1);
INSERT INTO Productos (nombreProducto, cantidadStock, idCategoria)
VALUES ("Cuchillos", 50, 3);
INSERT INTO Productos (nombreProducto, cantidadStock, idCategoria)
VALUES ("Amaca", 20, 2);
INSERT INTO Productos (nombreProducto, cantidadStock, idCategoria)
VALUES ("Shampoo", 100, 5);
INSERT INTO Productos (nombreProducto, cantidadStock, idCategoria)
VALUES ("Cuaderno", 15, 4);

SELECT * FROM Productos;


-- VENTAS
INSERT INTO Ventas (fechaRetiro, totalVentas, idUsuario)
VALUES (NOW(), 5, 1);
INSERT INTO Ventas (fechaRetiro, totalVentas, idUsuario)
VALUES (NOW(), 45, 4);
INSERT INTO Ventas (fechaRetiro, totalVentas, idUsuario)
VALUES (NOW(), 20, 2);
INSERT INTO Ventas (fechaRetiro, totalVentas, idUsuario)
VALUES (NOW(), 30, 5);
INSERT INTO Ventas (fechaRetiro, totalVentas, idUsuario)
VALUES (NOW(), 1, 3);

SELECT * FROM Ventas;

-- UPDATE Ventas SET totalVentas = 10.83 WHERE idVentas = 5;

-- COMPRAS
INSERT INTO Compras (nombreProveedor, fechaAdquisicion, fechaCaducidad, totalCompras, idUsuario)
VALUES ("Cuchillos", "2022-06-25", "2023-09-30", 300.68, 1);
INSERT INTO Compras (nombreProveedor, fechaAdquisicion, fechaCaducidad, totalCompras, idUsuario)
VALUES ("Laptops S.A", "2022-05-11", "2023-11-15", 8600.89, 5);
INSERT INTO Compras (nombreProveedor, fechaAdquisicion, fechaCaducidad, totalCompras, idUsuario)
VALUES ("Amacas S.A", "2022-01-28", "2023-01-18", 1025.75, 2);
INSERT INTO Compras (nombreProveedor, fechaAdquisicion, fechaCaducidad, totalCompras, idUsuario)
VALUES ("Cuadernos S.A", "2022-07-05", "2023-12-24", 2500.25, 4);
INSERT INTO Compras (nombreProveedor, fechaAdquisicion, fechaCaducidad, totalCompras, idUsuario)
VALUES ("Shampoo S.A", "2022-03-22", "2023-09-15", 10.83, 3);

SELECT * FROM Compras;


-- DETALLE COMPRAS
INSERT INTO DetalleCompras (cantidadIngreso, totalCompra, idCompras, idProducto)
VALUES (5, 987.60, 2, 1);
INSERT INTO DetalleCompras (cantidadIngreso, totalCompra, idCompras, idProducto)
VALUES (50, 300.68, 1, 2);
INSERT INTO DetalleCompras (cantidadIngreso, totalCompra, idCompras, idProducto)
VALUES (20, 1025.75, 3, 3);
INSERT INTO DetalleCompras (cantidadIngreso, totalCompra, idCompras, idProducto)
VALUES (15, 2500.25, 4, 5);
INSERT INTO DetalleCompras (cantidadIngreso, totalCompra, idCompras, idProducto)
VALUES (100, 10.83, 5, 4);

SELECT * FROM DetalleCompras;


-- DETALLE VENTAS
INSERT INTO DetalleVentas (cantidadRetiro, descuentoRetiro, totalRetiro, idVentas, idProducto)
VALUES (5, 45, 987.60, 1, 1);
INSERT INTO DetalleVentas (cantidadRetiro, descuentoRetiro, totalRetiro, idVentas, idProducto)
VALUES (50, 10, 300.68, 4, 2);
INSERT INTO DetalleVentas (cantidadRetiro, descuentoRetiro, totalRetiro, idVentas, idProducto)
VALUES (20, 25, 1025.75, 5, 3);
INSERT INTO DetalleVentas (cantidadRetiro, descuentoRetiro, totalRetiro, idVentas, idProducto)
VALUES (15, 5, 2500.25, 3, 4);
INSERT INTO DetalleVentas (cantidadRetiro, descuentoRetiro, totalRetiro, idVentas, idProducto)
VALUES (25, 11, 10.83, 2, 5);

SELECT * FROM DetalleVentas;