create database db_veterinaria; 
use db_veterinaria; 
DROP DATABASE db_veterinaria; 
describe tbl_cliente; 
-- ********************DEPARTAMENTO*******************************
create table if not exists tbl_departamento(
id_departamento int not null auto_increment, 
primary key (id_departamento), 
unique (id_departamento), 
departamento varchar (30)
);
-- **************************MUNICIPIO***********************************
create table if not exists tbl_municipio(
id_municipio int not null auto_increment, 
primary key (id_municipio), 
unique (id_municipio), 
municipio varchar (30)
);
-- ****************************DIRECCION********************************
create table if not exists tbl_direccion(
id_direccion int not null auto_increment, 
primary key (id_direccion), 
unique (id_direccion), 
direccion varchar (100),
id_departamento int not null, 
id_municipio int not null, 
foreign key (id_departamento) references tbl_departamento (id_departamento), 
foreign key (id_municipio) references tbl_municipio (id_municipio)
);
-- **************************ESPECIALIDAD****************************
create table if not exists tbl_especialidad(
id_especialidad int not null auto_increment, 
primary key (id_especialidad), 
unique (id_especialidad), 
especialidad varchar (50)
);
-- **************************DOCTOR***********************************
create table if not exists tbl_doctor(
id_doctor int not null auto_increment, 
primary key (id_doctor), 
unique (id_doctor), 
nombre_doctor varchar (150),
apellido_doctor varchar (100), 
telefono_doctor varchar (12), 
colegiado varchar (18), 
email_doctor varchar (35), 
id_direccion int not null, 
id_especialidad int not null,
estado_doc boolean,  
foreign key (id_direccion) references tbl_direccion (id_direccion), 
foreign key (id_especialidad) references tbl_especialidad (id_especialidad)
);
-- **************************MASCOTA***************************
create table if not exists tbl_mascota (
id_mascota int not null auto_increment, 
primary key (id_mascota),
unique (id_mascota), 
nombre_mascota varchar (30), 
raza varchar (35)
);
-- ********************************CLIENTE**************************
create table if not exists tbl_cliente(
id_cliente int not null auto_increment, 
primary key (id_cliente), 
unique (id_cliente), 
nombre_cliente varchar (150),
apellido_cliente varchar (100), 
telefono_cliente varchar (12), 
email_cliente varchar (35), 
dpi_cliente int not null, 
estado boolean
);
alter table tbl_cliente add column dpi_cliente varchar (16); ;
-- ********************CITA**************************************
create table if not exists tbl_cita(
id_cita int not null auto_increment, 
primary key (id_cita), 
unique (id_cita), 
hora varchar (100),  
costo_cita float, 
id_mascota int not null, 
id_cliente int not null,
estado_cita boolean,
fecha  date ,
foreign key (id_mascota) references tbl_mascota (id_mascota), 
foreign key (id_cliente) references tbl_cliente (id_cliente)
);
alter table tbl_cita modify column fecha varchar(50); 
-- ********************SERVICIO*********************
create table if not exists tbl_servicio(
id_servicio int not null auto_increment, 
primary key (id_servicio), 
unique (id_servicio), 
servicio varchar (50),
costo_servicio float 
);
-- ***********************DETALLE CITA MEDICO **************************
create table if not exists tbl_detalle_cita_doctor(
id_detalle_cita_doctor int not null auto_increment, 
primary key (id_detalle_cita_doctor), 
unique (id_detalle_cita_doctor), 
id_cita  int not null ,
id_doctor int not null,  
id_servicio int not null,
foreign key (id_cita) references tbl_cita (id_cita), 
foreign key (id_doctor) references tbl_doctor (id_doctor), 
foreign key(id_servicio) references tbl_servicio (id_servicio)
);
-- ******************USUARIOS**************************
create table if not exists tbl_usuarios(
id_usuario int not null auto_increment, 
primary key (id_usuario), 
usuario varchar (15), 
contraseña varchar (10)
); 
alter table tbl_usuarios add column cliente_admini boolean; 
-- ********************************************************************************************************************************
show tables; 
select *from tbl_cliente ; 

