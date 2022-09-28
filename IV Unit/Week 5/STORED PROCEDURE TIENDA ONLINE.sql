USE Tienda_Online;

-- Procedimiento almacenado para mostra las Categorias
DELIMITER $$
CREATE PROCEDURE sp_MostrarCategoria ()
BEGIN 
	SELECT * FROM vw_categoria;
END$$
DELIMITER ;

-- Procedimiento almacenado para Agregar Categorías
DELIMITER $$
CREATE PROCEDURE sp_AgregarCategoria(IN addCategoria VARCHAR (50))
BEGIN 
	INSERT INTO Categoria (nombreCategoria) VALUES (addCategoria);
END$$
DELIMITER ;  

-- Procedimiento para Modificar Categorias 
DELIMITER $$
CREATE PROCEDURE sp_ModificarCategoria(IN id_ModificarCategoria INT, IN nuevaCategoria VARCHAR(50))
BEGIN 
	START TRANSACTION;
	UPDATE Categoria SET nombreCategoria = nuevaCategoria WHERE id_ModificarCategoria = idCategoria;
	COMMIT;
END$$
DELIMITER ;

-- Procedimiento almacenado para Eliminar Categorias
DELIMITER $$
CREATE PROCEDURE sp_EliminarCategoria (IN id_eliminarCategoria INT)
BEGIN
	START TRANSACTION;
	DELETE FROM Categoria WHERE id_eliminarCategoria = idCategoria;
	COMMIT;
END$$
DELIMITER ;

-- Procedimiento almacenado para mostrar Clientes
DELIMITER $$
CREATE PROCEDURE sp_MostrarCliente ()
BEGIN 
	SELECT * FROM vw_cliente;
END$$
DELIMITER ;

-- Procedimiento almacenado para Agregar Clientes
DELIMITER $$
CREATE PROCEDURE sp_AgregarCliente (IN addNombre VARCHAR (50),IN addApellido VARCHAR (50), IN addTelefono INT,
IN addCorreo VARCHAR (50),IN addDireccion VARCHAR (50))
BEGIN 
	INSERT INTO Cliente (nombre, apellido, telefono, correo, direccion) 
    VALUES(addNombre, addApellido, addTelefono, addCorreo, addDireccion);
END$$ 
DELIMITER ;

-- Procedimiento almacenado para Modificar Clientes
DELIMITER $$
CREATE PROCEDURE sp_ModificarCliente (IN id_ModificarCliente INT, IN nuevoNombre VARCHAR (50),
IN nuevoApellido VARCHAR (50), IN nuevoTelefono INT, IN nuevoCorreo VARCHAR(50), IN nuevaDireccion VARCHAR(50))
BEGIN 
	START TRANSACTION;
	UPDATE Cliente SET nombre = nuevoNombre, apellido = nuevoApellido, telefono = nuevoTelefono,
			correo = nuevoCorreo, direccion = nuevaDireccion
    WHERE id_ModificarCliente = idCliente;
    COMMIT;
END$$
DELIMITER ;

-- Procedimiento almacenado para Eliminar Clientes
DELIMITER $$
CREATE PROCEDURE sp_EliminarCliente (IN id_EliminarCliente INT)
BEGIN 
	START TRANSACTION;
	DELETE FROM Cliente WHERE id_EliminarCliente = idCliente;
    COMMIT;
END$$
DELIMITER ;

-- Procedimiento almacenado para Mostrar Productos
DELIMITER $$
CREATE PROCEDURE sp_MostrarProducto()
BEGIN 
	SELECT * FROM vw_producto;
END$$
DELIMITER ;

-- Procedimiento almacenado para Agregar Productos
DELIMITER $$
CREATE PROCEDURE sp_AgregarProducto (IN addNombreProducto VARCHAR (50), IN addPrecioProducto DOUBLE,
IN addFechaDeVencimiento DATE,IN id_addCategoria INT)
BEGIN 
	INSERT INTO Producto (nombreProducto, precioProducto, fechaDeVencimiento, id_Categoria)
    VALUES (addNombreProducto, addPrecioProducto, addFechaDeVencimiento, id_addCategoria);
END$$
DELIMITER ;

-- Procedimiento almacenado para Modificar Productos
DELIMITER $$
CREATE PROCEDURE sp_ModificarProducto (IN id_updateProducto INT, IN updateNombreProducto VARCHAR (50), 
IN updatePrecioProducto DOUBLE, IN updateFechaDeVencimiento DATE,IN id_updateCategoria INT)
BEGIN 
	START TRANSACTION;
	UPDATE Producto SET  nombreProducto = updateNombreProducto, precioProducto = updatePrecioProducto,
			fechaDeVencimiento = updateFechaDeVencimiento, id_Categoria = id_updateCategoria
    WHERE id_updateProducto = idProducto;
END$$
DELIMITER ;

-- Procedimiento almacenado para Eliminar Productos 
DELIMITER $$
CREATE PROCEDURE sp_EliminarProducto (IN id_EliminarProducto INT)
BEGIN 
	START TRANSACTION;
	DELETE FROM Producto WHERE id_EliminarProducto = idProducto;
    COMMIT;
END$$
DELIMITER ;

-- Procedimiento almacenado para Mostrar Reporte de Ventas
DELIMITER $$
CREATE PROCEDURE sp_MostrarReporteVenta()
BEGIN 
	SELECT * FROM vw_reporteVentas;
END$$
DELIMITER ;

-- Procedimiento almacenado para Agregar Reporte de Ventas
DELIMITER $$
CREATE PROCEDURE sp_AgregarReporteVenta (IN addFechaVenta VARCHAR(50), IN addDireccionVenta VARCHAR (50),
IN id_addCliente INT, IN id_addProducto INT, IN addTotalCompra DOUBLE)
BEGIN 
	INSERT INTO ReporteVentas (fechaVenta, direccionVenta, id_Cliente, id_Producto, totalCompra)
    VALUES (addFechaVenta, addDireccionVenta, id_addCliente, id_addProducto, addTotalCompra);
END$$
DELIMITER ;

-- Procedimiento almacenado para Modificar Reporte de Ventas
DELIMITER $$
CREATE PROCEDURE sp_ModificarReporteVenta (IN id_updateVenta INT,IN updateFechaVenta VARCHAR(50),
IN updateDireccionVenta VARCHAR (50), IN id_updateCliente INT, IN id_updateProducto INT, IN updateTotalCompra DOUBLE )
BEGIN 
	START TRANSACTION;
	UPDATE ReporteVentas SET fechaVenta = updateFechaVenta, direccionVenta = updateDireccionVenta, id_Cliente = id_updateCliente,
    id_Producto = id_updateProducto, totalCompra = updateTotalCompra WHERE id_updateVenta = idVentas;
    COMMIT;
END$$
DELIMITER ;

-- Procedimiento almacenado para Eliminar Reporde de Ventas
DELIMITER $$
CREATE PROCEDURE sp_EliminarReporteVenta (IN id_deleteReporteVenta INT)
BEGIN 
	START TRANSACTION;
	DELETE FROM ReporteVentas WHERE id_deleteReporteVenta=idVentas;
    COMMIT;
END$$
DELIMITER ;
-- Procedimiento almacenado para Buscar un Cliente 
DELIMITER $$
CREATE PROCEDURE sp_BuscarCliente (IN idBuscarCliente INT)
BEGIN 
	SELECT `ID Venta`,	`Fecha de la Venta`,	`Dirección`,	`ID Cliente`,	`Cliente`,	`ID Producto`,
			`Producto`,	`Total Compra`, null AS 'Gasto Total' 
	FROM vw_reporteVentas WHERE `ID Cliente` = idBuscarCliente
    UNION 
    SELECT 'NOT FOUND', null, null,	null,	null,	null,	null,	null,	null FROM DUAL 
    WHERE NOT EXISTS (SELECT `ID Venta`, `Fecha de la Venta`, `Dirección`, `ID Cliente`, `Cliente`, `ID Producto`,
							`Producto`, `Total Compra`
    FROM vw_reporteVentas WHERE `ID Cliente` = idBuscarCliente)
    UNION SELECT null, null, null,	null,	null,	null,	null,	null, SUM(`Total Compra`) 
    FROM vw_reporteVentas WHERE `ID Cliente` = idBuscarCliente;
END$$
DELIMITER ;

-- CRUD de la tabla Categoria 
CALL sp_AgregarCategoria ('nuevoNombreCategoria'); 
CALL sp_MostrarCategoria();
CALL sp_ModificarCategoria(idUpdate,'nuevaCategoria'); 
CALL sp_EliminarCategoria(idDeleteCategoria);

-- CRUD de la tabla Cliente
CALL sp_AgregarCliente ('nombre','apellido',00000000,'correo','direccion');
CALL sp_MostrarCliente;
CALL sp_ModificarCliente(idUpdate,'nuevoNombre','nuevoApellido',00000000nuevoTel,'nuevoCorreo','nuevaDireccion');
CALL sp_EliminarCliente (idDeleteCliente);

-- CRUD de la tabla Producto
CALL sp_AgregarProducto ('nombreProducto',0.0,('0000-00-00'),idCategoria);
CALL sp_MostrarProducto;
CALL sp_ModificarProducto (idUpdateProduct,'nuevoNombre',0.0,('0000-00-00nuevafechavencimiento'),idNuevaCategoria);
CALL sp_EliminarProducto (idDeleteProducto);

-- CRUD de la tabla Reporte de Ventas
CALL sp_AgregarReporteVenta (('0000-00-00fechaVenta'),'direccion',idCliente,idProducto,0.0);
CALL sp_MostrarReporteVenta;
CALL sp_ModificarReporteVenta (idUpdateReportVent,('0000-00-00nuevaFecha'),'nuevaDireccion',idNuevoCliente,idNuevoProducto,0.0);
CALL sp_EliminarReporteVenta (idDeleteReporteVenta);

-- Procedimiento de buscar cliente, mostrar productos comprados y cuanto gasto en total
CALL sp_BuscarCliente(5);
