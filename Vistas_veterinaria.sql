use db_veterinaria; 
-- ****************************************VISTAS**************************************************************
describe tbl_cita; 
drop view vista_doctor;
create view vista_doctor as 
select d.nombre_doctor as Nombre, d.apellido_doctor as Apellido, d.telefono_doctor as Telefono, d.colegiado as colegiado, di.direccion as Direccion, 
e.especialidad as Especialidad, c.fecha as Fecha_Cita, c.estado_cita as Estado_Cita
from tbl_doctor as d 
inner join tbl_direccion as di 
on di.id_direccion = d.id_direccion
inner join tbl_especialidad as e 
on e.id_especialidad = d.id_especialidad
inner join tbl_detalle_cita_doctor as de
on de.id_doctor = d.id_doctor
inner join tbl_cita as c 
on c.id_cita = de.id_cita; 

select *from vista_doctor; 

-- *************************************************************************************************************
create view vista_cita_mayor as 
select c.hora as Hora, c.costo_cita as Cita, c.fecha as Fecha, l.nombre_cliente as Nombre, l.apellido_cliente as Apellido, l.dpi_cliente as DPI, m.nombre_mascota as Nombre_Mascota, 
 d.colegiado as Colegiado_Doctor
 from tbl_cita as c
 inner join tbl_cliente as l
 on l.id_cliente = c.id_cliente
 inner join tbl_mascota as m
 on m.id_mascota = c.id_mascota
 inner join tbl_detalle_cita_doctor as det
 on det.id_cita = c.id_cita
 inner join tbl_doctor as d
 on d.id_doctor = det.id_doctor 
 where c.costo_cita > 120; 
 select *from vista_cita_mayor; 
 
 
 -- *********************************************************************
 create view vista_citas as 
 select c.hora as Hora, c.costo_cita as Costo, c.fecha as Fecha, l.nombre_cliente as Nombre_Cliente, l.apellido_cliente as Apellido, m.nombre_mascota as Mascota, 
 m.raza as Raza, s.servicio as Servicio 
 from tbl_cita as c 
 inner join tbl_cliente as l
 on l.id_cliente = c.id_cliente
 inner join tbl_mascota as m
 on m.id_mascota = c.id_mascota
 inner join tbl_detalle_cita_doctor as det
 on det.id_cita = c.id_cita
 inner join tbl_servicio as s
 on s.id_servicio = det.id_servicio; 
 select *from vista_citas; 
 
 describe tbl_servicio; 
 -- *****************************************************************************************************
 create view vista_mascotas_doc as 
 select m.nombre_mascota as Mascota, m.raza as Raza, d.nombre_doctor as Nombre_Doctor, d.apellido_doctor as Apellido, d.telefono_doctor as telefono, e.especialidad as Especialidad
 from tbl_cita as c 
 inner join tbl_mascota as m
 on m.id_mascota = c.id_mascota
 inner join tbl_detalle_cita_doctor as det
 on det.id_cita = c.id_cita
 inner join tbl_doctor as d
 on d.id_doctor = det.id_doctor
 inner join tbl_especialidad as e
 on e.id_especialidad = d.id_especialidad;
 select *from vista_mascotas_doc; 
 -- ********************************************************************************
 create view vista_cliente as 
 select c.nombre_cliente as Nombre, c.apellido_cliente as Apellido, c.telefono_cliente as Telefono , c.email_cliente as Email, c.dpi_cliente as Dpi, 
  m.nombre_mascota as Mascota, m.raza as Raza
  from tbl_cita as ci
  inner join tbl_mascota as m
  on ci.id_mascota = m.id_mascota
  inner join tbl_cliente as c 
  on c.id_cliente = ci.id_cliente; 
  select *from vista_cliente; 