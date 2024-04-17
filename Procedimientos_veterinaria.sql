-- PROCEDIMIENTOS
use db_veterinaria;
drop procedure sp_insertarDoctor; 
describe tbl_cliente; 
call sp_insertarDoctor ('juan pedro', 'guzman', '555858', '2019185', 'jsss@gmail.com', 2,  true, '5ta calle vA', 1, 1);
select *from tbl_cita; 


-- **************************************************Doctor*****************************************************************

-- ********************************INSERTAR***************************************
drop procedure sp_insertarDoctor; 
delimiter //
create procedure sp_insertarDoctor(in nombre_doctor varchar (150), in apellido_doctor varchar (100), in telefono_doctor varchar (12),
in _colegiado varchar (18), in email_doctor varchar (35), in id_especialidad int, in estado_doc boolean,
in direccion varchar(100), in id_depart int , in id_muninci int )
begin 
declare id_direccion int; 
insert into tbl_direccion ( direccion, id_departamento, id_municipio) values (direccion, id_depart, id_muninci);
call sp_insertarDireccion (direccion, id_depart, id_muninci); 
SET id_direccion = LAST_INSERT_ID();
insert into tbl_doctor (nombre_doctor, apellido_doctor, telefono_doctor, colegiado, email_doctor, id_direccion, id_especialidad, estado_doc) 
values (nombre_doctor, apellido_doctor, telefono_doctor, _colegiado, email_doctor, id_direccion, id_especialidad, estado_doc);

end //
delimiter ;
-- *************************************ACTUALIZAR****************************************
call sp_actualizarDoc (2, 'juan Esteban', 'guzman', '55886699', '2018176', 'js@gmail.com', 1, 1, true, '5ta calle A', 1, 1);
drop procedure sp_actualizarDoc; 
delimiter //
create procedure sp_actualizarDoc (in id_doc int, in nombre_doctor varchar (150), in apellido_doctor varchar (100), in telefono_doctor varchar (12),
in _colegiado varchar (18), in email_doctor varchar (35), in _id_direccion int, in id_especialidad int, in estado_doc boolean,
in direccion varchar(100), in id_depart int , in id_muninci int)
begin 
update tbl_direccion set direccion = direccion, id_departamento = id_depart  , id_municipio = id_muninci   where id_direccion = _id_direccion;
update tbl_doctor set nombre_doctor = nombre_doctor, apellido_doctor=apellido_doctor, telefono_doctor=telefono_doctor, colegiado = _colegiado , 
email_doctor = email_doctor, id_direccion = id_direccion, id_especialidad = id_especialidad, estado_doc = estado_doc where id_doc = id_doctor ; 
end //
delimiter ; 
-- ********************************ELIMINAR********************************
drop procedure sp_eliminarEstado;
delimiter //
create procedure sp_eliminarDocEstado (in id_doc int, in estado_doc boolean) 
begin 
update tbl_doctor set estado_doc = estado_doc where id_doctor = id_doc ;
end //
delimiter ; 

-- ********************************************CITAS-CLIENTE-MASCOTA-DETALL_CITA***********************************************************
-- ***************************INSERTAR******************************************
CALL sp_ingresarCita_Cli ('2022-01-01', '10:00', 400, true, 'cheto', 'pitbull', 'Jose', 'Galileo', '741236', 'jg@outlook.com', '88552233', true, 
1, 1); 
describe tbl_cita; 
drop procedure sp_ingresarCita_Cli;
delimiter //
create procedure sp_ingresarCita_Cli (in _fecha varchar (50), in _hora varchar(100), in _costo float, in _estado boolean, in nombre_masc varchar (30), 
in _raza varchar (35), in nombre_cli varchar (150), in apellido_cli varchar (100), in telefono_cli varchar (12), in email_cli varchar (35), 
in dpi varchar (16) , estado_cli boolean, in id_doc int, in _id_servicio int)
begin 
declare id_cli int; 
declare id_masc int; 
declare _id_cita int; 
insert into tbl_cliente (nombre_cliente, apellido_cliente, telefono_cliente, email_cliente, estado, dpi_cliente) 
values (nombre_cli, apellido_cli, telefono_cli, email_cli, estado_cli,dpi); 
SET id_cli = LAST_INSERT_ID();
insert into tbl_mascota (nombre_mascota, raza) values (nombre_masc, _raza); 
SET id_masc = LAST_INSERT_ID();
insert into tbl_cita(hora, costo_cita, id_mascota, id_cliente, estado_cita, fecha) values 
( _hora, _costo, id_masc, id_cli, _estado, _fecha); 
SET _id_cita = LAST_INSERT_ID();
insert into tbl_detalle_cita_doctor (id_cita, id_doctor, id_servicio) values 
(_id_cita, id_doc, _id_servicio);
end //
delimiter ;
describe tbl_cita;
-- *************************************Actulizar MASCOTA*****************************************************
call sp_actualizarMascota(1, 'chato', 'boxer');
delimiter //
create procedure sp_actualizarMascota (in id int, in nombre varchar (30), in _raza varchar (30))
begin 
update tbl_mascota set 
nombre_mascota = nombre , raza = _raza  where id_mascota = id ; 
end //
delimiter ; 
-- ****************************************Actualizar CLIENTE*****************************
drop procedure  sp_actualizarCliente;
DELIMITER //
create procedure sp_actualizarCliente (in id int, in nombre varchar (150), in apellido varchar (100), in  _telefono varchar (12), 
in email varchar (35), in dpi varchar(16), in estado_ boolean)
begin 
update tbl_cliente set 
nombre_cliente = nombre, apellido_cliente = apellido , telefono_cliente = _telefono , email_cliente = email ,estado = estado_ , dpi_cliente = dpi where id_cliente = id ;
end //
delimiter ;
-- ******************************************Actualizar Cita***************************************** 
drop procedure sp_actualizarCita;
delimiter //
create procedure sp_actualizarCita (in id int, in _fecha varchar (50), _hora varchar (100), _costo float) 
begin 
update tbl_cita set 
hora = _hora , costo_cita = _costo , fecha = _fecha  where id_cita= id; 
end // 
delimiter ; 
-- ***********************************ELIMINAR CLIENTE ************************

DELIMITER //
CREATE PROCEDURE sp_eliminarCliente (IN id int, _estado boolean) 
begin 
update  tbl_cliente set 
estado = _estado  where id_cliente = id ; 
end // 
delimiter ; 
-- ********************************ELIMINAR CITA*******************************

delimiter //
create procedure sp_eliminarCita (in id int, in estado_ boolean) 
begin 
update tbl_cita set estado_cita = estado_  where  id_cita = id  ; 
end //
delimiter ; 
-- ***********************usuarios******************************
delimiter //
create procedure sp_agregarUsuario (in _usuario varchar (15), in contraseña_ varchar (10), in cliente_est boolean) 
begin 
insert into tbl_usuarios (usuario, contraseña, cliente_admini) values 
(_usuario, contraseña_, cliente_est); 
end//
delimiter ;
-- **************************************************Enlistar Categorias************************************
delimiter //
create procedure sp_especialidad()
begin 
select *from tbl_especialidad;
end //
delimiter ; 

-- ***************************direccion
delimiter //
create procedure sp_insertarDireccion(in direccion varchar (35), in id_muni int, in id_depart int) 
begin 
insert into tbl_direccion (direccion, id_departamento, id_municipio) values (direccion, id_muni, id_depart); 
end //
delimiter ; 
-- ***************************************LOGIN**********************************
drop procedure sp_login; 
-- in cliente_e boolean
delimiter //
create procedure sp_login (in usuario_ varchar (15), in contra varchar(10) )
begin 
select *from tbl_usuarios where usuario = usuario_ and contraseña = contrasp_login; 
end//
delimiter ; 
select *from tbl_municipio; 
call sp_insertarDireccion ('9ta calle, 4ta AV, Zona 9', 2, 1); 

describe tbl_doctor;
select * from tbl_cliente;
select *from tbl_usuarios; 


