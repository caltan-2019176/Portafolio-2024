-- DDL 
use db_tienda_online_laptops; 

insert into tbl_marca (marca) values ('Apple '),
('Dell'),
('Lenovo'),
('Asus'),
('Hp'),
('Acer'),
('MSI'),
('Microsoft'),
('Toshiba '),
('Huawei '); 

insert into tbl_producto(producto, precio, id_marca, modelo, estado_producto) values 
('Laptop',4500,2,' 3 14IML05 ',true),
('Laptop',9000,1,'Mac14,7',true);

insert into tbl_cliente ( nombre_cli, apellido_cli, telefono, email, direccion, estado_cli) values
('Rodrigo ','Solorzano','44785602','rod@gmail.com','11 av B, zona 10',true),
('Pedro ','Cardenas ','11203305','pdr@gmail.com','15 av A, zona 18',true );
 
 insert into tbl_usuarios (usuario, contrasena, id_cliente, estado_usuario, rol) values 
 ('rodd','rodri',3,true ,false),
('pepe','setch',4,true ,false);


insert into tbl_compra (id_cliente, precio, fecha_entrega, nit, fecha_pedido) values
(2,4500,'2022-09-29','812402-8','2022-09-27'),
(3,9000,'2022-09-30','850205-0','2022-09-27');

insert into tbl_detalle_compra (id_compra, id_producto) values 
(1,2),
(2,3);


