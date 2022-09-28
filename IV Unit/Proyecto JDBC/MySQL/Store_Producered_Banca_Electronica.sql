-- Oscar José Morales Velásquez 2019282 (Coordinador)
-- Jorge Abraham Revolorio Mazariegos 2019058
--  Omar Emiliani Sanchez Mendoza 2019490

-- STORE PROCEDURES BANCA ELECTRONICA

USE Banca_Electronica;

-- --------------------------------------- Store Procedures Compania Telefonica --------------------------------------- 

-- Listar Compania Telefonica
DELIMITER $$
CREATE PROCEDURE sp_listarCompaniaTelefonica ()
BEGIN 
	SELECT * FROM vw_CompaniaTelefonica;
END $$
DELIMITER ;

-- Buscar Compania Telefonica
delimiter $$
CREATE PROCEDURE sp_buscarCompaniaTelefonica (IN id_Compania INT)
BEGIN
	SELECT * FROM vw_CompaniaTelefonica WHERE `ID Compania` = id_Compania;
END$$
delimiter ;

-- Agregar Compania Telefonica
DELIMITER $$
CREATE PROCEDURE sp_agregarCompaniaTelefonica (IN id_Compania INT, nombre_Compania VARCHAR (10), IN extension_Compania INT)
BEGIN
	START TRANSACTION;
	INSERT INTO CompaniaTelefonica (idCompania, nombreCompania, extensionCompania)
	VALUES (id_Compania, nombre_Compania, extension_Compania);
	COMMIT;
END $$
DELIMITER ;

-- Eliminar Compania Telefonica
DELIMITER $$ 
CREATE PROCEDURE sp_eliminarCompaniaTelefonica (IN id_Compania INT)
BEGIN
	START TRANSACTION;
	DELETE FROM CompaniaTelefonica WHERE CompaniaTelefonica.idCompania = id_Compania;
	COMMIT;
END $$
DELIMITER ;

-- Actualizar Compania Telefonica
DELIMITER $$
CREATE PROCEDURE sp_actualizarCompaniaTelefonica (IN id_Compania INT, in nombre_Compania VARCHAR (10), IN extension_Compania INT)
BEGIN
	START TRANSACTION;
	UPDATE CompaniaTelefonica
	SET CompaniaTelefonica.nombreCompania = nombre_Compania, CompaniaTelefonica.extensionCompania = extension_Compania
	WHERE  CompaniaTelefonica.idCompania = id_Compania;
	COMMIT;
END $$
DELIMITER ;



-- --------------------------------------- Store Procedures Tipo Cuentas --------------------------------------- 

-- Listar Tipo Cuentas
DELIMITER $$
CREATE PROCEDURE sp_listarTipoCuentas()
BEGIN 
	SELECT * FROM vw_TipoCuentas;
END $$
DELIMITER ;

-- Buscar Tipo Cuentas
delimiter $$
CREATE PROCEDURE sp_buscarTipoCuentas (IN id_Tipo_Cuenta INT)
BEGIN
	SELECT * FROM vw_TipoCuentas WHERE `ID Tipo Cuenta` = id_Tipo_Cuenta;
END$$
delimiter ;

-- Agregar Tipo Cuentas
DELIMITER $$
CREATE PROCEDURE sp_agregarTipoCuentas(IN id_Tipo_Cuenta INT, IN nombre_TipoCuenta VARCHAR (30), IN descripcion_Cuenta VARCHAR (75))
BEGIN
	START TRANSACTION;
	INSERT INTO TipoCuentas (idTipoCuenta, nombreTipoCuenta, descripcionCuenta)
	VALUES (id_Tipo_Cuenta, nombre_TipoCuenta,descripcion_Cuenta);
	COMMIT;
END $$
DELIMITER ; 
 
 -- Eliminar Tipo Cuentas
 DELIMITER $$ 
CREATE PROCEDURE sp_eliminarTipoCuentas (IN id_Tipo_Cuenta INT)
BEGIN
	START TRANSACTION;
	DELETE FROM TipoCuentas WHERE TipoCuentas.idTipoCuenta = id_Tipo_Cuenta;
	COMMIT;
END $$
DELIMITER ;

-- Actualizar Tipo Cuentas 
DELIMITER $$
CREATE PROCEDURE sp_actualizarTipoCuentas (IN id_Tipo_Cuenta INT, in nombre_TipoCuenta VARCHAR (30), IN descripcion_Cuenta VARCHAR (75))
BEGIN
	START TRANSACTION;
	UPDATE TipoCuentas
	SET TipoCuentas.nombreTipoCuenta = nombre_TipoCuenta, TipoCuentas.descripcionCuenta = descripcion_Cuenta
	WHERE  TipoCuentas.idTipoCuenta = id_Tipo_Cuenta;
	COMMIT;
END $$
DELIMITER ;



-- --------------------------------------- Store Procedures Tipo Monedas --------------------------------------- 

-- Listar Monedas
DELIMITER $$ 
CREATE PROCEDURE sp_listarMonedas ()
BEGIN 
	SELECT * FROM vw_Monedas;
END $$
DELIMITER ; 

-- Buscar Monedas
delimiter $$
CREATE PROCEDURE sp_buscarMonedas (IN id_Moneda INT)
BEGIN
	SELECT * FROM vw_Monedas WHERE `ID Moneda` = id_Moneda;
END$$
delimiter ;

-- Agregar Moneda 
DELIMITER $$
CREATE PROCEDURE sp_agregarMonedas(IN id_Moneda INT, IN nombre_Moneda VARCHAR(25))
BEGIN
	START TRANSACTION;
	INSERT INTO Monedas (Monedas.idMoneda, Monedas.nombreMoneda)
	VALUES (id_Moneda, nombre_Moneda);
	COMMIT;
END $$
DELIMITER ; 

-- Eliminar Moneda
DELIMITER $$
CREATE PROCEDURE sp_eliminarMonedas(IN id_Moneda INT)
BEGIN
	START TRANSACTION;
	DELETE FROM Monedas WHERE Monedas.idMoneda = id_Moneda;
	COMMIT;
END $$
DELIMITER ;

-- Actualizar Moneda 
DELIMITER $$
CREATE PROCEDURE sp_actualizarMonedas(IN id_Moneda INT, IN nombre_Moneda VARCHAR (25))
BEGIN
	START TRANSACTION;
	UPDATE Monedas
	SET Monedas.nombreMoneda = nombre_Moneda
	WHERE  Monedas.idMoneda = id_Moneda;
	COMMIT;
END $$
DELIMITER ;



-- --------------------------------------- Store Procedures Identificador Clientes --------------------------------------- 

-- Listar Indentificador Clientes
DELIMITER $$
CREATE PROCEDURE sp_listarIdentificadorClientes()
BEGIN 
	SELECT * FROM vw_identificadorcliente;
END $$
DELIMITER ;

-- Buscar Identificador Clientes
DELIMITER $$ 
CREATE PROCEDURE sp_buscarIdentificadorClientes (IN id_identificadorCliente INT)
BEGIN 
	SELECT * FROM vw_identificadorcliente WHERE `Identificador de Cliente` = id_IdentificadorCliente;
END $$
DELIMITER ; 

-- Agregar Indentificador Clientes
DELIMITER $$
CREATE PROCEDURE sp_agregarIdentificadorClientes(IN id_Identificador_Cliente INT, IN nombre_Identificador_Cliente VARCHAR(25))
BEGIN
	START TRANSACTION;
	INSERT INTO IdentificadorClientes (idIdentificadorCliente, nombreIdentificadorCliente)
	VALUES (id_Identificador_Cliente, nombre_Identificador_Cliente);
	COMMIT;
END $$
DELIMITER ; 

-- Eliminar Indentificador Clientes
DELIMITER $$
CREATE PROCEDURE sp_eliminarIdentificadorClientes(IN id_Identificador_Cliente INT)
BEGIN
	START TRANSACTION;
	DELETE FROM IdentificadorClientes 
    WHERE IdentificadorClientes.idIdentificadorCliente = id_Identificador_Cliente;
	COMMIT;
END $$
DELIMITER ;

-- Actualizar Indentificador Clientes
DELIMITER $$
CREATE PROCEDURE sp_actualizarIdentificadorClientes (IN id_Identificador_Cliente INT, IN nombre_Identificador_Cliente VARCHAR (25))
BEGIN
	START TRANSACTION;
	UPDATE IdentificadorClientes
	SET IdentificadorClientes.nombreIdentificadorCliente = nombre_Identificador_Cliente
	WHERE  IdentificadorClientes.idIdentificadorCliente = id_Identificador_Cliente;
	COMMIT;
END $$
DELIMITER ;



-- --------------------------------------- Store Procedures Proveedor Servicios --------------------------------------- 

-- Listar Proveedor Servicios
DELIMITER $$
CREATE PROCEDURE sp_listarProveedorServicios()
BEGIN 
	SELECT * FROM vw_proveedorServicios;
END $$
DELIMITER ;

-- Buscar Proveedor Servicios
DELIMITER $$ 
CREATE PROCEDURE sp_buscarProveedorServicios (IN id_Tipo_Proveedor INT)
BEGIN 
	SELECT * FROM vw_proveedorServicios WHERE `ID Tipo Proveedor` = id_Tipo_Proveedor;
END $$
DELIMITER ; 

-- Agregar Proveedor Servicios
DELIMITER $$
CREATE PROCEDURE sp_agregarProveedorServicios(IN id_Tipo_Proveedor INT, IN nombre_Proveedor_Servicio VARCHAR(40),
											  IN tipo_Servicio VARCHAR(50), IN descripcion_Servicio VARCHAR (75))
BEGIN
	START TRANSACTION;
	INSERT INTO ProveedorServicios (ProveedorServicios.idTipoProveedor,ProveedorServicios.nombreProveedorServicio, 
									ProveedorServicios.tipoServicio, ProveedorServicios.descripcionServicio)
	VALUES (id_Tipo_Proveedor, nombre_Proveedor_Servicio, tipo_Servicio, descripcion_Servicio);
	COMMIT;
END $$
DELIMITER ; 

-- Eliminar Proveedor Servicio
DELIMITER $$
CREATE PROCEDURE sp_eliminarProveedorServicios(IN id_Tipo_Proveedor INT)
BEGIN
	START TRANSACTION;
	DELETE FROM ProveedorServicios WHERE ProveedorServicios.idTipoProveedor = id_Tipo_Proveedor;
	COMMIT;
END $$
DELIMITER ;

-- Actualizar Proveedor Servicio
DELIMITER $$
CREATE PROCEDURE sp_actualizarProveedorServicios (IN id_Tipo_Proveedor INT, IN nombre_Proveedor_Servicio VARCHAR (40), 
												  IN tipo_Servicio VARCHAR(50), IN descripcion_Servicio VARCHAR(75))
BEGIN
	START TRANSACTION;
	UPDATE ProveedorServicios
	SET ProveedorServicios.nombreProveedorServicio = nombre_Proveedor_Servicio, ProveedorServicios.tipoServicio = tipo_Servicio,
		ProveedorServicios.descripcionServicio = descripcion_Servicio
	WHERE  ProveedorServicios.idTipoProveedor = id_Tipo_Proveedor;
	COMMIT;
END$$
DELIMITER ;



-- --------------------------------------- Store Procedures Clientes --------------------------------------- 

-- Listar Clientes
DELIMITER $$
CREATE PROCEDURE sp_listarClientes()
BEGIN
	SELECT * FROM vw_Clientes;
END $$
DELIMITER ;

-- Buscar Clientes
DELIMITER $$ 
CREATE PROCEDURE sp_buscarClientes (IN cui_Cliente BIGINT)
BEGIN 
	SELECT * FROM vw_Clientes WHERE `DPI o Pasaporte` = cui_Cliente;
END $$
DELIMITER ; 

call sp_listarClientes();

-- Agregar Clientes
DELIMITER $$
CREATE PROCEDURE sp_agregarClientes(IN cui_Cliente BIGINT , IN nombre_Cliente VARCHAR(30), IN apellido_Cliente VARCHAR(30), 
									IN direccion_Cliente VARCHAR (75), IN telefono_Cliente INT, IN  sexo_Cliente VARCHAR(15), 
									IN nacionalidad_Cliente VARCHAR(25), IN  _id_Compania INT, IN _id_Identificador_Cliente INT)
BEGIN
	START TRANSACTION;
	INSERT INTO Clientes (CuiCliente, nombreCliente, apellidoCliente, direccionCliente, telefonoCliente, 
						  sexoCliente , nacionalidadCliente, id_Compania, id_Identificador_Cliente)
	VALUES (cui_Cliente, nombre_Cliente, apellido_Cliente, direccion_Cliente, telefono_Cliente, sexo_Cliente, 
			nacionalidad_Cliente, _id_Compania, _id_Identificador_Cliente);
	COMMIT;
END $$
DELIMITER ;

-- Eliminar Clientes
DELIMITER $$
CREATE PROCEDURE sp_eliminarClientes(IN cui_Cliente BIGINT)
begin
	START TRANSACTION;
	DELETE FROM Clientes WHERE Clientes.cuiCliente = cui_Cliente;
	COMMIT;
END $$
DELIMITER ;

-- Actualizar Cliente
DELIMITER $$
CREATE PROCEDURE sp_actualizarClientes (IN cui_Cliente BIGINT , IN nombre_Cliente VARCHAR(30), IN apellido_Cliente VARCHAR(30), 
										IN direccion_Cliente VARCHAR (75), IN telefono_Cliente INT, IN sexo_Cliente VARCHAR(15), 
                                        IN nacionalidad_Cliente VARCHAR(25), IN  _id_Compania INT, IN _id_Identificador_Cliente_ INT)
BEGIN
	START TRANSACTION;
	UPDATE Clientes
	SET Clientes.nombreCliente = nombre_Cliente, Clientes.apellidoCliente = apellido_Cliente, Clientes.direccionCliente = direccion_Cliente,
		Clientes.telefonoCliente = telefono_Cliente, Clientes.sexoCliente = sexo_Cliente, Clientes.nacionalidadCliente = nacionalidad_Cliente, 
		Clientes.id_Compania = _id_Compania, Clientes.id_identificador_Cliente = _id_Identificador_Cliente_
	WHERE Clientes.cuiCliente = cui_Cliente;
	COMMIT;
END $$
DELIMITER ;



-- --------------------------------------- Store Procedures Cuentas --------------------------------------- 

-- Listar Cuentas
DELIMITER $$
CREATE PROCEDURE sp_listarCuentas()
BEGIN
	SELECT * FROM vw_Cuentas;
END $$
DELIMITER ;

-- Buscar Cuentas
DELIMITER $$ 
CREATE PROCEDURE sp_buscarCuentas (IN idCuenta BIGINT)
BEGIN 
	SELECT * FROM vw_Cuentas WHERE `ID Cuenta` = idCuenta;
END $$
DELIMITER ; 

-- Agregar Cuentas
DELIMITER $$
CREATE PROCEDURE sp_agregarCuentas(IN id_Cuenta BIGINT, IN saldo_Cuenta DOUBLE, IN _id_Tipo_Cuenta INT, IN _id_Moneda INT)
BEGIN
	START TRANSACTION;
	INSERT INTO Cuentas (idCuenta, saldoCuenta, id_Tipo_Cuenta, id_Moneda)
	VALUES (id_Cuenta, saldo_Cuenta, _id_Tipo_Cuenta, _id_Moneda);
END $$
DELIMITER ;

-- Eliminar Cuentas
DELIMITER $$
CREATE PROCEDURE sp_eliminarCuentas(IN id_Cuenta BIGINT)
BEGIN
	START TRANSACTION;
	DELETE FROM Cuentas WHERE Cuentas.idCuenta = id_Cuenta;
	COMMIT;
END $$
DELIMITER ;

-- Actualizar Cuenta
DELIMITER $$
CREATE PROCEDURE sp_actualizarCuenta (IN id_Cuenta BIGINT , IN saldo_Cuenta DOUBLE, IN _id_Tipo_Cuenta INT, IN _id_Moneda INT)
BEGIN
	START TRANSACTION;
	UPDATE Cuentas
	SET Cuentas.idCuenta = id_Cuenta, Cuentas.saldoCuenta = saldo_Cuenta, Cuentas.id_Tipo_Cuenta = id_Tipo_Cuenta, 
		Cuentas.id_Moneda = _id_Moneda
	WHERE  Cuentas.idCuenta = id_Cuenta;
	COMMIT;
END $$
DELIMITER ;


-- --------------------------------------- Store Procedures Usuarios --------------------------------------- 

-- Listar Usuarios
DELIMITER $$
CREATE PROCEDURE sp_listarUsuarios()
BEGIN 
	SELECT * FROM vw_Usuarios;
END $$
DELIMITER ;

-- Buscar Usuarios
DELIMITER $$ 
CREATE PROCEDURE sp_buscarUsuarios (IN idUsuario BIGINT)
BEGIN 
	SELECT * FROM vw_Usuarios WHERE `ID Usuario` = idUsuario;
END $$
DELIMITER ; 

-- Agregar Usuarios
DELIMITER $$
CREATE PROCEDURE sp_agregarUsuarios(IN id_Usuario BIGINT, IN nombre_Usuario VARCHAR(15), IN password_Usuario VARCHAR(35), 
									IN estado_Usuario VARCHAR (30), IN fecha_Creacion_Usuario DATE, IN cui_Cliente_ BIGINT)
BEGIN
START TRANSACTION;
	INSERT INTO Usuarios (idUsuario, nombreUsuario, passwordUsuario, estadoUsuario, fechaCreacionUsuario, cui_Cliente)
	VALUES (id_Usuario, nombre_Usuario, password_Usuario, estado_Usuario, fecha_Creacion_Usuario, cui_Cliente_);
	COMMIT;
END $$
DELIMITER ; 

-- Eliminar Usuarios
DELIMITER $$
CREATE PROCEDURE sp_eliminarUsuarios(IN id_Usuario BIGINT)
BEGIN
	START TRANSACTION;
	DELETE FROM Usuarios 
    WHERE Usuarios.idUsuario = id_Usuario;
	COMMIT;
END $$
DELIMITER ;

-- Actualizar Usuarios
DELIMITER $$
CREATE PROCEDURE sp_actualizarUsuarios (IN id_Usuario BIGINT, IN nombre_Usuario VARCHAR(15), IN password_Usuario VARCHAR(35), 
										IN estado_Usuario VARCHAR (30), IN fecha_Creacion_Usuario DATE, IN cui_Cliente_ BIGINT)
BEGIN
	START TRANSACTION;
	UPDATE Usuarios
	SET Usuarios.nombreUsuario = nombre_Usuario, Usuarios.passwordUsuario = password_Usuario, Usuarios.estadoUsuario = estado_Usuario,
		Usuarios.fechaCreacionUsuario = fecha_Creacion_Usuario, Usuarios.cui_Cliente = cui_Cliente_
	WHERE  Usuarios.idUsuario = id_Usuario;
	COMMIT;
END $$
DELIMITER ;



-- --------------------------------------- Store Procedures Transacciones --------------------------------------- 

-- Listar Transacciones
DELIMITER $$
CREATE PROCEDURE sp_listarTransacciones()
BEGIN
	SELECT * FROM vw_Transacciones;
END $$
DELIMITER ;

-- Buscar Transacciones
DELIMITER $$ 
CREATE PROCEDURE sp_buscarTransacciones (IN id_Transacciones BIGINT)
BEGIN 
	SELECT * FROM vw_Transacciones WHERE `ID Transaccion` = id_Transacciones;
END $$
DELIMITER ; 

-- Agregar Transacciones
DELIMITER $$
CREATE PROCEDURE sp_agregarTransacciones(IN _id_Transacciones BIGINT , IN _identificadorPago VARCHAR(50), IN _descripcionTransaccion VARCHAR(50), 
										 IN _montoPagoTransaccion DOUBLE , IN _fechaDeTransaccion DATE , IN  _id_Usuario BIGINT,
                                         IN _id_Tipo_Proveedor INT, IN _id_Cuenta BIGINT)
BEGIN
	START TRANSACTION;
	INSERT INTO Transacciones (idTransacciones, identificadorPago, descripcionTransaccion, montoPagoTransaccion, fechaDeTransaccion, 
							   id_Usuario , id_Tipo_Proveedor, id_Cuenta)
	VALUES (_id_Transacciones, _identificadorPago, _descripcionTransaccion, _montoPagoTransaccion, _fechaDeTransaccion,
			_id_Usuario, _id_Tipo_Proveedor, _id_Cuenta);
	COMMIT;
END $$
DELIMITER ;

-- Eliminar Transacciones
DELIMITER $$
CREATE PROCEDURE sp_eliminaTransacciones(IN _id_Transacciones BIGINT)
BEGIN
	START TRANSACTION;
	DELETE FROM Transacciones 
    WHERE Transacciones.idTransacciones= _id_Transacciones;
	COMMIT;
END $$
DELIMITER ;

-- Actualizar Transacciones
DELIMITER $$
CREATE PROCEDURE sp_actualizarTransacciones (IN _id_Transacciones BIGINT , IN _identificadorPago VARCHAR(50), IN _descripcionTransaccion VARCHAR(50), 
											 IN _montoPagoTransaccion DOUBLE , IN _fechaDeTransaccion DATE , IN  _id_Usuario BIGINT,
                                             IN _id_Tipo_Proveedor INT, IN _id_Cuenta BIGINT)
BEGIN
	START TRANSACTION;
	UPDATE Transacciones
	SET Transacciones.idTransacciones = _id_Transacciones, Transacciones.identificadorPago = _identificadorPago, 
		Transacciones.descripcionTransaccion = _descripcionTransaccion, Transacciones.montoPagoTransaccion = _montoPagoTransaccion, 
		Transacciones.fechaDeTransaccion = _fechaDeTransaccion, Transacciones.id_Usuario= _id_Usuario, 
        Transacciones.id_Tipo_Proveedor = _id_Tipo_Proveedor, Transacciones.id_Cuenta = _id_Cuenta
	WHERE  Transacciones.idTransacciones = _id_Transacciones;
	COMMIT;
END $$
DELIMITER ;



-- --------------------------------------- Store Procedures Vista Mayores a 1000 -----------------------------
-- Vista Pagos Mayores a 1000
DELIMITER $$ 
CREATE PROCEDURE sp_VistaPagosMayores ()
BEGIN 
	SELECT * FROM vw_Transacciones WHERE `Monto de Pago` >= 1000.00;
END $$
DELIMITER ; 



-- --------------------------------------- Store Procedures Consulta de Fechas --------------------------------------- 
-- Consulta de Fechas
DELIMITER $$ 
CREATE PROCEDURE sp_Consulta_Fechas ()
BEGIN 
	SELECT `Usuario`,`Fecha de Transaccion`,`Descripcion de Transaccion` FROM vw_Consulta_Fechas;
END $$
DELIMITER ;
