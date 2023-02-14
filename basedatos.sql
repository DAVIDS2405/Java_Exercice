create database Abarrotes;
use Abarrotes;

create table Productos(
cod_prd int auto_increment,
nbr_prd varchar (50),
tip_prd varchar(50),
fch_ven_prd date,
fch_fab_prd date,
prc_prd double,
can_prd int,
prv_fk int,
primary key (cod_prd),
CONSTRAINT prvfk 
FOREIGN KEY (prv_fk) 
REFERENCES Proveedor(ci_ruc_prv)
);


create table Proveedor(
ci_ruc_prv int,
nombre varchar(30),
marca varchar(40),
primary key (ci_ruc_prv)
);

insert into Proveedor values(
1750974550,
"David Basantes",
"Coca-cola"
);

insert into Productos(nbr_prd,fch_ven_prd,fch_fab_prd,prc_prd,can_prd,prv_fk) values(
"Coca-cola 3 litros",'2023-05-24',curdate(),20.12,10,1750974550);

select * from Productos