create database Recuperacion_Java;
use Recuperacion_Java;

create table Dias(
dia int
);
alter table Dias add primary key (dia);
create table Meses(
mes varchar(25)
);
create table Años(
anio int
);
select * from Meses order by dia;

insert into Años values(1982);