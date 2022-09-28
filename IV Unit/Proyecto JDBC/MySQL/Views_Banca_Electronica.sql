-- Oscar José Morales Velásquez - 2019282 (Coordinador)
-- Jorge Abraham Revolorio Mazariegos - 2019058
--  Omar Emiliani Sanchez Mendoza - 2019490

-- VIEWS BANCA ELECTRONICA

USE Banca_Electronica;


-- Vista Compania Telefónica
CREATE VIEW 
vw_CompaniaTelefonica AS
SELECT idCompania AS "ID Compania", nombreCompania AS "Compania", 
	   extensionCompania AS "Numero de Servicio al cliente"
FROM CompaniaTelefonica;


-- Vista Tipo Cuentas
CREATE VIEW
vw_TipoCuentas AS
SELECT idTipoCuenta AS "ID Tipo Cuenta", nombreTipoCuenta AS "Tipo de Cuenta", 
	   descripcionCuenta AS "Descripcion"
FROM TipoCuentas;


-- Vista Monedas
CREATE VIEW
vw_Monedas AS
SELECT idMoneda AS "ID Moneda", nombreMoneda AS "Moneda"
FROM Monedas;


-- Vista Identificador Clientes
CREATE VIEW
vw_IdentificadorCliente AS
SELECT idIdentificadorCliente AS "Identificador de Cliente", 
       nombreIdentificadorCliente AS "Residencia"
FROM IdentificadorClientes;


-- Vista Tipo Proveedor
CREATE VIEW
vw_ProveedorServicios AS
SELECT idTipoProveedor AS "ID Tipo Proveedor", nombreProveedorServicio AS "Proveedor de Servicio", 
	   tipoServicio AS "Tipo de Servicio", 
	   descripcionServicio AS "Descripcion de Servicio"
FROM ProveedorServicios;


-- Vista Clientes
CREATE VIEW
vw_Clientes AS
SELECT c.cuiCliente AS "DPI o Pasaporte", c.nombreCliente AS "Nombre", c.apellidoCliente AS "Apeliido", 
	   c.direccionCliente AS "Dirección", c.sexoCliente AS "Sexo", c.nacionalidadCliente AS "Nacionalidad",
       c.telefonoCliente AS "Telefono", ct.nombreCompania AS "Compania Telefonica",
       ic.nombreIdentificadorCliente AS "Residencia"
FROM Clientes AS c
INNER JOIN CompaniaTelefonica AS ct ON c.id_Compania = ct.idCompania
INNER JOIN IdentificadorClientes AS ic ON c.id_Identificador_Cliente = ic.idIdentificadorCliente;


-- Vista cuentas
CREATE VIEW
vw_Cuentas AS
SELECT c.idCuenta AS "ID Cuenta", c.saldoCuenta AS "Saldo de Cuenta", 
	   tc.nombreTipoCuenta AS "Tipo de Cuenta", tc.descripcionCuenta AS "Descripcion de Cuenta",
	   m.nombreMoneda AS "Moneda"
FROM Cuentas AS c
INNER JOIN TipoCuentas AS tc ON c.id_Tipo_Cuenta = tc.idTipoCuenta
INNER JOIN Monedas AS m ON c.id_Moneda =  m.idMoneda;


-- Vista Usuarios
CREATE VIEW
vw_Usuarios AS
SELECT u.idUsuario AS "ID Usuario", u.nombreUsuario AS "Nombre de usuario", u.passwordUsuario AS "Password",
	   u.estadoUsuario AS "Estado",
       u.fechaCreacionUsuario AS "Fecha de creacion",
       c.nombreCliente AS "Nombre", c.apellidoCliente AS "Apellido",
	   c.direccionCliente AS "Dirección", c.sexoCliente AS "Sexo", c.nacionalidadCliente AS "Nacionalidad",
       c.telefonoCliente AS "Telefono"
FROM Usuarios AS u
INNER JOIN Clientes AS c ON u.cui_Cliente = c.cuiCliente;


-- Vista Transacciones
CREATE VIEW
vw_Transacciones AS
SELECT t.idTransacciones AS "ID Transaccion", t.identificadorPago AS "Indentificador de Pago",
	   t.descripcionTransaccion AS "Descripcion de Transaccion", t.montoPagoTransaccion AS "Monto de Pago",
	   t.fechaDeTransaccion AS "Fecha de Transaccion",
       u.nombreUsuario AS "Usuario",
       tp.nombreProveedorServicio AS "Proveedor",
       tp.tipoServicio AS "Servicio",
       c.saldoCuenta AS "Saldo en la cuenta"
FROM Transacciones AS t
INNER JOIN Usuarios AS u ON t.id_Usuario = u.idUsuario
INNER JOIN ProveedorServicios AS tp ON t.id_Tipo_Proveedor = tp.idTipoProveedor
INNER JOIN cuentas AS c ON t.id_Cuenta = c.idCuenta;


-- Vista Consulta Fechas
CREATE VIEW 
vw_Consulta_Fechas AS
SELECT t.descripcionTransaccion AS "Descripcion de Transaccion", 
	   t.fechaDeTransaccion AS "Fecha de Transaccion",
       u.nombreUsuario AS "Usuario"
FROM Transacciones AS t
INNER JOIN Usuarios AS u ON t.id_Usuario = u.idUsuario
WHERE (t.fechaDeTransaccion BETWEEN "2022-09-01" AND "2022-12-31");


-- Vista Historial
CREATE VIEW 
vw_Historial AS
SELECT u.nombreUsuario AS "Usuario",
       c.saldoCuenta AS "Saldo en la cuenta",
	   t.identificadorPago AS "Indentificador de Pago",
	   t.descripcionTransaccion AS "Descripcion de Transaccion", t.montoPagoTransaccion AS "Monto de Pago",
	   t.fechaDeTransaccion AS "Fecha de Transaccion",
       tp.nombreProveedorServicio AS "Proveedor",
       tp.tipoServicio AS "Servicio"
FROM Transacciones AS t
INNER JOIN Usuarios AS u ON t.id_Usuario = u.idUsuario
INNER JOIN ProveedorServicios AS tp ON t.id_Tipo_Proveedor = tp.idTipoProveedor
INNER JOIN cuentas AS c ON t.id_Cuenta = c.idCuenta;

-- SELECT FOR VIEWS
SELECT * FROM vw_CompaniaTelefonica;
SELECT * FROM vw_TipoCuentas;
SELECT * FROM vw_Monedas;
SELECT * FROM vw_IdentificadorCliente;
SELECT * FROM vw_ProveedorServicios;
SELECT * FROM vw_Clientes;
SELECT * FROM vw_Cuentas;
SELECT * FROM vw_Usuarios;
SELECT * FROM vw_Transacciones;
SELECT * FROM vw_Consulta_Fechas;
SELECT * FROM vw_Historial;