create database bddeportes;
use bddeportes;

create table deportista (
	codDeportista int(6) auto_increment primary key,
    identificacion int(10) not null,
    nombres varchar(30) not null,
    direccion varchar(150) not null,
    telefono int(10) not null,
    codDeporte int(2) not null,
    sexo int(1) not null,
    fechaNac date);
    
create table deporte (
	codDeporte int(2) primary key auto_increment,
    nombre varchar(30) not null);
    
alter table deportista add foreign key (codDeporte) 
references deporte(codDeporte);

insert into deporte(nombre) 
values ("Soccer"),("Softball"),("Golf");

select nombre from deporte;