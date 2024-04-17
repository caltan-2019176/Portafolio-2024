-- Vistas 

drop procedure vista_Producto;
create view vista_Producto As
select p.id_producto as ID,p.producto as Producto, p.precio as Precio, m.marca as Marca, p.modelo as Modelo 
from tbl_producto as p
inner join tbl_marca as m
on m.id_marca = p.id_marca
where p.estado_producto = true ; 

create view vistas_cliente_usuario AS
select c.nombre_cli as Nombre, c.apellido_cli as Apellido, c.telefono as Telefono, c.email as Email, c.direccion as Direccion, u.usuario as Usuario, 
u.contrasena as Contraseña from tbl_cliente as c
inner join tbl_usuarios as u
on u.id_cliente = c.id_cliente;

create view vista_cliente_compras as
select c.nombre_cli as Nombre, c.apellido_cli as Apellido, c.telefono as Telefono, o.precio as Precio,o.nit as NIT, o.fecha_entrega as Entrega, o.fecha_pedido as Pedido,
p.producto as Produco, p.modelo as Modelo, m.marca as Marca from tbl_compra as o
inner join tbl_cliente as c 
on c.id_cliente = o.id_cliente
inner join tbl_detalle_compra as d
on d.id_compra = o.id_compra
inner join tbl_producto as p
on p.id_producto = d.id_producto 
inner join tbl_marca as m
on m.id_marca = p.id_marca; 

select *from vistas_cliente_usuario;

drop procedure sp_llenarVenta;
delimiter //
create procedure sp_llenarVenta (in id varchar(50)) 
begin
select c.nombre_cli as Nombre, c.apellido_cli as Apellido, c.telefono as Telefono, o.precio as Precio,o.nit as NIT, o.fecha_entrega as Entrega, o.fecha_pedido as Pedido,
p.producto as Produco, p.modelo as Modelo, m.marca as Marca from tbl_compra as o
inner join tbl_cliente as c 
on c.id_cliente = o.id_cliente
inner join tbl_detalle_compra as d
on d.id_compra = o.id_compra
inner join tbl_producto as p
on p.id_producto = d.id_producto 
inner join tbl_marca as m
on m.id_marca = p.id_marca
where c.nombre_cli = id; 
end //
delimiter ; 

call sp_llenarVenta (2); 
select *from tbl_cliente;


SELECT * FROM tbl_usuarios;