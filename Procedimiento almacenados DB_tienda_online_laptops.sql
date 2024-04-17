-- Procedimientos almacenados
use db_tienda_online_laptops; 
-- ********************************************PRODUCTO***************************** 
describe tbl_producto; 
-- *********INSERTAR*************
delimiter //
create procedure sp_insertarProducto(in producto_ varchar (30), in precio_ float, in id_marc int, in modelo varchar(30), in estado_ boolean)
begin 
insert into tbl_producto(producto, precio, id_marca, modelo, estado_producto) 
values (producto_, precio_, id_marc, modelo, estado_); 
end //
delimiter ;

-- *********ACTUALIZAR***************
drop procedure sp_eliminarProduc;
delimiter //
create procedure sp_actualizarProduc(in id int, in producto_ varchar (30), in precio_ float, in id_marc int, in modelo varchar(30))
begin 
update tbl_producto set  id_producto = id, producto = producto_, precio = precio_, id_marca = id_marc, modelo = modelo where id_producto = id; 
end //
delimiter ; 
call sp_actualizarProduc(1, 'laptop', 8500, 6, 'as55d');
-- ***********eliminar************
delimiter //
create procedure sp_eliminarProduc (in id int, in estado_ boolean)
begin 
update tbl_producto set estado_producto = estado_ where id_producto = id; 
end //
delimiter ; 
call sp_eliminarProduc(6, true);

-- ***************************************************USUARIOS Cliente***************************************
describe tbl_cliente; 
-- *******INSERTAR**************
delimiter //
create procedure sp_insertarUser (in usuario varchar (25), in contrasena  varchar(10), in estado_usuario boolean, in rol boolean,
in nombre_cli varchar(30), in apellido_cli varchar(30), in telefono varchar(12), in email varchar (30), in direccion varchar (70), in estado_cli boolean)
begin 
declare id_cliente int; 
insert into tbl_cliente ( nombre_cli, apellido_cli, telefono, email, direccion, estado_cli) values 
(nombre_cli, apellido_cli, telefono, email, direccion, estado_cli); 
SET id_cliente = LAST_INSERT_ID();
insert into tbl_usuarios (usuario, contrasena, id_cliente, estado_usuario, rol) values 
(usuario, contrasena,id_cliente, estado_usuario, rol);
end //
delimiter ; 

-- *************ACTUALIZAR CLIENTE*****************
delimiter //
create procedure sp_actualizarCli (in id int, in nombre_cli varchar(30), in apellido_cli varchar(30), in telefono varchar(12),
 in email varchar (30), in direccion varchar (70), in estado_cli boolean)
 begin 
 update tbl_cliente set nombre_cli = nombre_cli, apellido_cli =  apellido_cli, telefono = telefono, email = email, direccion = direccion, estado_cli = estado_cli
 where id_cliente = id; 
 end //
 delimiter ; 

-- *********ELIMINAR CLI***********
delimiter //
create procedure sp_eliminarCli(IN id int, in estado boolean)
begin
update tbl_cliente set  estado_cli = estado where id_cliente = id; 
end //
delimiter ;

-- *****************ACTUALIZAR USUARIO**************
drop procedure sp_iniciarSesionAdmin; 
delimiter //
create procedure sp_actualizarUsua (in id int, in usuario varchar (25), in contrasena  varchar(10))
begin 
update tbl_usuarios set usuario = usuario, contrasena = contrasena where id_usuario = id; 
end //
delimiter ; 
-- **********LOGIN
delimiter //
create procedure sp_iniciarSesionCliente ( in u varchar (25), in c  varchar(10))
begin 
select usuario, contrasena from tbl_usuarios  where usuario = u and contrasena = c and rol = false; 
end //
delimiter ; 

delimiter //
create procedure sp_iniciarSesionAdmin ( in u varchar (25), in c  varchar(10))
begin 
select usuario, contrasena from tbl_usuarios  where usuario = u and contrasena = c and rol = true; 
end //
delimiter ; 
call sp_insertarUser ('caralt', 'caralt', true, true, 'Carlos', 'Cortez', '55223311', 'caral@gmail.com', '3ra calle pato, 5ta av', true);
select *from tbl_usuarios; 
-- ******************************************COMPRA******************************************
describe tbl_compra; 
-- **********INSERTAR 
drop procedure sp_insertarCompra; 
delimiter //
create procedure sp_insertarCompra (in id_cliente int, in precio float, in fecha_entrega varchar (12), in nit varchar(15), 
in id_producto int )
begin 
declare id_compra int; 
declare fecha_pedido date; 
set fecha_pedido =  CURDATE();
insert into tbl_compra (id_cliente, precio, fecha_entrega, nit, fecha_pedido) values 
(id_cliente, precio, fecha_entrega, nit, fecha_pedido); 
set id_compra = LAST_INSERT_ID();
insert into tbl_detalle_compra (id_compra, id_producto) values (id_compra, id_producto); 
end //
delimiter ; 

select *from tbl_producto; 

select *from  tbl_usuarios; 

