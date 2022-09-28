-- Oscar José Morales Velásquez - 2019282 (Coordinador)
-- Jorge Abraham Revolorio Mazariegos - 2019058
--  Omar Emiliani Sanchez Mendoza - 2019490

-- DML BANCA ELECTRONICA
USE Banca_Electronica;


-- Compania Telefonica
CALL sp_agregarCompaniaTelefonica (1, "Claro", 22851000);
CALL sp_agregarCompaniaTelefonica (2, "Tigo", 611);
CALL sp_listarCompaniaTelefonica ();
-- CALL sp_buscarCompaniaTelefonica (2);
-- CALL sp_actualizarCompaniaTelefonica(1, "Claro", 555);


-- Tipo Cuentas
CALL sp_agregarTipoCuentas (1, "Depositos Monetarios", "Deposita a extranjero o nacinal retirando mediante cheques.");
CALL sp_agregarTipoCuentas (2, "Ahorro", "Cuenta dedicada al ahorro monetario.");
CALL sp_agregarTipoCuentas (3, "Tarjeta de Credito", "Cuenta de pago mediante una tarjeta con dinero de un acreedor");
CALL sp_agregarTipoCuentas (4, "Prestamo", "Dinero brindado por un acreedor, con lineamientos especificos de tiempo");
CALL sp_agregarTipoCuentas (5, "Fondo Pension", "Gestionan los flujos monetarios de los planes de pensiones.");
CALL sp_listarTipoCuentas();
-- CALL sp_buscarTipoCuentas(4);
-- CALL sp_actualizarTipoCuentas (4, "Prestamo", "Cantidad de dinero u otra cosa que se presta." );


-- Monedas
CALL sp_agregarMonedas (1, "Euros");
CALL sp_agregarMonedas (2, "Dolares");
CALL sp_agregarMonedas (3, "Quetzales");
CALL sp_agregarMonedas (4, "Libra Esterlina");
CALL sp_listarMonedas ();
-- CALL sp_buscarMonedas (3);
-- CALL sp_actualizarMonedas (4, "Pesos");
-- CALL sp_eliminarMonedas (4);


-- Identificador Extranjero o Nacional
CALL sp_agregarIdentificadorClientes(1, "Extranjero");
CALL sp_agregarIdentificadorClientes(2, "Nacional");
CALL sp_listarIdentificadorClientes();
-- CALL sp_buscarIdentificadorClientes(2);


-- Proveedor Servicio
CALL sp_agregarProveedorServicios (1, "EGGSA", "Electricidad", "Servicio de luz");
CALL sp_agregarProveedorServicios (2, "Kinal", "Colegio", "Servicio estudiantil");
CALL sp_agregarProveedorServicios (3, "Claro", "Telefono", "Servicio telefonico");
CALL sp_agregarProveedorServicios (4, "Zeta Gas", "Gas", "Servicio de gas");
CALL sp_agregarProveedorServicios (5, "EMPAGUA", "Agua", "Servicio de agua");
CALL sp_listarProveedorServicios();
-- CALL sp_buscarProveedorServicios(4);
-- CALL sp_actualizarProveedorServicios(3, "Tigo", "Telefono", "Servicio telefonico");


-- Clientes
CALL sp_agregarClientes (7541201236985475, "Jorge", "Perez", "Cementerio las Rosas Zona 11 Mixco", 
						 45632871, "Masculino", "Guatemalteco", 2, 2);
CALL sp_agregarClientes (5214236598745214, "Samuel", "Lopez", "Residencia el Sol, Zona 2 Guatemala", 
						 78542121, "Masculino", "Argentino", 2, 1);
CALL sp_agregarClientes (8754213658965478, "Maria", "Medina", "Colonia Villa de Afrodita, Zona 5 Guatemala", 
						 85632014, "Femenino", "Guatemalteca", 1, 2);
CALL sp_agregarClientes (1234587913256879, "Oscar", "Ozorio", "Colonia Landivar, Zona 7 Guatemala", 
						 21458789, "Masculino", "Argentino", 1, 1);
CALL sp_listarClientes();
CALL sp_buscarClientes(5214236598745214);
CALL sp_actualizarClientes(5214236598745214, "Pedro", "Lopez", "Residencia el Sol, Zona 2 Guatemala", 
						   78542121, "Masculino", "Mexicano", 1, 1);


-- Cuentas
CALL sp_agregarCuentas(78541201236589, 150000.99, 3, 3);
CALL sp_agregarCuentas(98547521522125, 50000.00, 2, 1);
CALL sp_agregarCuentas(85441252362412, 8500.59, 1, 2);
CALL sp_agregarCuentas(85632458200452, 1000000000.25, 5, 3);
CALL sp_listarCuentas();
-- CALL sp_buscarCuentas(85441252362412);
-- CALL sp_actualizarCuenta (98547521522125, 50415.00, 4, 2);


-- Usuarios
CALL sp_agregarUsuarios(7896541230125472, "Jorge2005", "12Abril2005", "Habilitado", "2015-04-12", 7541201236985475);
CALL sp_agregarUsuarios(3021057562025305, "Samuel!", "elpepe22", "Habilitado", "2005-12-25", 5214236598745214);
CALL sp_agregarUsuarios(9854210125258423, "mMedina25", "12345", "Deshabilitado Temporalmente", "2022-07-01", 8754213658965478);
CALL sp_listarUsuarios();
CALL sp_buscarUsuarios(3021057562025305);
-- CALL sp_eliminarUsuarios (7896541230125472);

-- Transaciones
CALL sp_agregarTransacciones(965473102365412, "78964135", "Pago del Servicio de luz de los ultimos 8 meses", 1350.00, "2022-04-25", 
	 3021057562025305, 1, 85441252362412);
CALL sp_agregarTransacciones(987654101358745, "PE987456", "Pago del Servicio del agua", 1100.00, "2021-07-14", 
	 7896541230125472, 5, 85632458200452);
CALL sp_agregarTransacciones(634148968754145, "CO745698", "Pago del Gas", 125.00, "2022-09-14", 
	 9854210125258423, 4, 78541201236589);
CALL sp_listarTransacciones();
CALL sp_actualizarTransacciones(987654101358745, "PE987456", "Pago del Servicio del agua", 1100.00, "2022-10-14", 
	 7896541230125472, 5, 85632458200452);
CALL sp_buscarTransacciones(987654101358745);

-- Pagos Mayores
CALL sp_VistaPagosMayores();

-- Consulta Fechas
CALL sp_Consulta_Fechas ();