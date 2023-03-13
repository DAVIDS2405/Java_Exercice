create database Final_Java;
use Final_Java;

create table Personas(
cedula int primary key auto_increment,
Nombre varchar (20),
Apellido varchar (20),
Celular int,
Dirreccion varchar (30),
Descripcion varchar (30)
);
select * from Personas;
insert into Personas values (1750974550,"David","Basantes",0990095964,"Magdalena","Desarrollador de software")

