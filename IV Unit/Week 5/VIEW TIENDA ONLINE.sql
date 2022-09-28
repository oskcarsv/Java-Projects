USE Tienda_Online;

-- Vista para ver lista de categorias y cantidad total de categorias
CREATE VIEW vw_categoria AS
SELECT idCategoria AS 'ID Categoría', 
	   nombreCategoria AS 'Nombre de la Categoría',
       null AS 'Cantidad de categorias'
FROM Categoria
UNION SELECT null, null, COUNT(nombreCategoria)
FROM Categoria WHERE EXISTS (SELECT idCategoria, nombreCategoria FROM categoria);

-- Vista para ver lista de productos y cantidad total de productos
CREATE VIEW vw_producto AS
SELECT pr.idProducto AS 'ID Producto', 
	   pr.nombreProducto AS 'Producto', 
	   pr.precioProducto AS 'Precio', 
	   DATE_FORMAT(pr.fechaDeVencimiento, "%d-%m-%Y") AS 'Fecha de Vencimiento',
       ca.nombreCategoria AS 'Categoría',
       null AS 'Cantidad de productos'
FROM Producto AS pr
INNER JOIN Categoria AS ca ON pr.id_Categoria = ca.idCategoria
UNION SELECT null, null, null, null, null, COUNT(nombreProducto)
FROM Producto WHERE EXISTS (SELECT idProducto, nombreProducto, precioProducto, 
								   fechaDeVencimiento, id_categoria FROM Producto);

-- Vista para ver lista de clientes y cantidad total de clientes
CREATE VIEW vw_cliente AS
SELECT idCliente AS 'ID Cliente',		nombre AS 'Nombre',
	apellido AS 'Apellido',		telefono AS 'Telefono',
    correo AS 'Email',		direccion AS 'Dirección',
	   null AS 'Cantidad de clientes'
FROM Cliente
UNION SELECT null,null, null, null, null, null, COUNT(nombre)
FROM Cliente WHERE EXISTS (SELECT nombre, apellido, telefono, correo,direccion FROM Cliente);

-- Vista para ver Reporte de Ventas y el promedio de ventas en el mes de septiembre
CREATE VIEW vw_reporteVentas AS
SELECT rv.idVentas AS 'ID Venta',
	   date_format(rv.fechaVenta, "%d-%m-%Y") AS 'Fecha de la Venta',
       rv.direccionVenta AS 'Dirección',
       rv.id_Cliente AS 'ID Cliente',
       cl.nombre AS 'Cliente',
       rv.id_Producto AS 'ID Producto',
       pr.nombreProducto AS 'Producto',
       rv.totalCompra AS 'Total Compra',
       null AS 'Promedio de compras septiembre'
FROM ReporteVentas AS rv
INNER JOIN Cliente AS cl ON rv.id_Cliente = cl.idCliente
INNER JOIN Producto AS pr ON rv.id_Producto = pr.idProducto
UNION SELECT null, null, null,null,null, null, null, null, AVG(totalCompra)
FROM ReporteVentas WHERE MONTH (fechaVenta)=09;

-- consulta para ver la lista de categorias
SELECT * FROM vw_categoria;
-- consulta para ver la lista de clientes
SELECT * FROM vw_cliente;
-- consulta para ver la lista de productos
SELECT * FROM vw_producto;
-- consulta para ver la lista de reporte de ventas
SELECT * FROM vw_reporteVentas;