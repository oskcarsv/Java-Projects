USE Tienda_Online;
# Agregando Categorías
CALL sp_AgregarCategoria ('Consumo'); 
CALL sp_AgregarCategoria ('Decoración');
CALL sp_AgregarCategoria ('Electrodoméstico'); 
CALL sp_AgregarCategoria ('Limpieza');
CALL sp_AgregarCategoria ('Salud');
CALL sp_AgregarCategoria ('Tecnología');

# Agregando Clientes
CALL sp_AgregarCliente ('Hilary','Cruz',19747848,'hcruz@gmail.com','4 calle, 15-12, zona 11');
CALL sp_AgregarCliente ('David','Cruz',43018915,'dcruz@gmail.com','1 calle, 4-6, zona 6');
CALL sp_AgregarCliente ('Adrián','Sánchez',25310124,'asanchez@gmail.com','8 calle, 9-32, zona 6');
CALL sp_AgregarCliente ('Ximena','García',15544743,'xgarcia@gmail.com','9 calle, 3-14, zona 7');
CALL sp_AgregarCliente ('Paola','Sánchez',76264269,'psanchez@gmail.com','10 calle, 13-9, zona 4');
CALL sp_AgregarCliente ('Marcos','Morris',93756786,'mmorris@gmail.com','7 calle, 4-10, zona 2');
CALL sp_AgregarCliente ('Pablo','Morris',58917220,'pmorris@gmail.com','5 calle, 8-12, zona 1');

# Agregando Productos
CALL sp_AgregarProducto ('Baby Yoda',15.00,('0000-00-00'),2);
CALL sp_AgregarProducto ('Salsa de Tomate',20.00,('2023-05-17'),1);
CALL sp_AgregarProducto ('Teclado logitech g213',250.00,('0000-00-00'),6);
CALL sp_AgregarProducto ('Marcarillas KN95',2.00,('2022-10-02'),5);
CALL sp_AgregarProducto ('Suavitel',15.00,('2023-10-10'),4);
CALL sp_AgregarProducto('Cloro Magia Blanca',10.00,('2023-05-08'),5);

# Agregando Reporte Ventas
CALL sp_AgregarReporteVenta (('2022-09-10'),'5 calle, 20-23, zona 11',1,2,480.00);
CALL sp_AgregarReporteVenta (('2022-09-08'),'2 calle, 10-35, zona 6',2,3,3000.00);
CALL sp_AgregarReporteVenta (('2022-08-19'),'8 calle, 9-32, zona 6',3,1,180.00);
CALL sp_AgregarReporteVenta (('2022-07-25'),'5 calle, 15-27, zona 5',5,5,180.00);
CALL sp_AgregarReporteVenta (('2022-09-15'),'3 calle, 8-20, zona 7',4,4,48.00);
CALL sp_AgregarReporteVenta (('2022-10-14'),'5 calle, 15-27, zona 5',5,3,3000.00);
CALL sp_AgregarReporteVenta (('2022-01-13'),'8 calle, 9-32, zona 6',6,6,120.0);
CALL sp_AgregarReporteVenta (('2022-11-01'),'8 calle, 9-32, zona 6',7,6,240.00);
