-- DDL TIENDA ONLINE CARLOS ALTÁN-IN4AM
create DATABASE db_tienda_online_laptops;
use db_tienda_online_laptops; 
-- CLIENTE
create table if not EXISTS tbl_cliente(
id_cliente int not null AUTO_INCREMENT, 
PRIMARY KEY(id_cliente), 
nombre_cli VARCHAR(30),
apellido_cli VARCHAR(30), 
telefono VARCHAR(12), 
email varchar(30), 
id_direccion varchar(70), 
estado_cli boolean
);  

-- USUARIOS 
create table if not exists tbl_usuarios (
id_usuario int not null AUTO_INCREMENT, 
PRIMARY KEY(id_usuario), 
usuario varchar (25), 
contrasena VARCHAR (10), 
id_cliente int not null, 
estado_usuario BOOLEAN, 
rol BOOLEAN, 
FOREIGN KEY (id_cliente) REFERENCES tbl_cliente (id_cliente)
);  

-- MARCA 
CREATE TABLE IF NOT EXISTS tbl_marca(
id_marca int not null AUTO_INCREMENT, 
PRIMARY KEY (id_marca), 
marca varchar(35)
); 

-- Producto 
create table if not EXISTS tbl_producto(
id_producto int not null AUTO_INCREMENT, 
PRIMARY KEY (id_producto), 
producto varchar (30), 
precio float, 
id_marca int not null, 
modelo VARCHAR (30), 
estado_producto boolean, 
FOREIGN KEY (id_marca) REFERENCES tbl_marca(id_marca)
); 

-- COMPRA 
create table if not EXISTS tbl_compra (
id_compra int not null AUTO_INCREMENT, 
PRIMARY key (id_compra), 
id_cliente int not null, 
precio float, 
fecha_entrega varchar (12), 
nit varchar (15), 
FOREIGN KEY (id_cliente) REFERENCES tbl_cliente (id_cliente)
);

-- DETALLE 
create table if not EXISTS tbl_detalle_compra (
id_detalle int not null AUTO_INCREMENT, 
PRIMARY KEY(id_detalle), 
id_compra int not null, 
id_producto int not null, 
FOREIGN KEY (id_compra) REFERENCES tbl_compra (id_compra), 
FOREIGN KEY (id_producto) REFERENCES tbl_producto (id_producto)
); 
