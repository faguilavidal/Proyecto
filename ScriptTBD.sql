create table tipousuario
(
idtipousuario int primary key,
nombre varchar2(30) not null
);

create table ciudad
(
idciudad int,
nombre varchar2(30) not null,
constraint pk_Ciudad primary key (idciudad)
);

create table comuna
(
idcomuna int,
nombre varchar2(30) not null,
idciudad int not null,
constraint pk_idComuna primary key (idcomuna),
constraint fk_Ciudad foreign key (idciudad) references ciudad(idciudad)
);

create table mall
(
idmall int,
nombre varchar2(50) not null,
direccion varchar2(50) not null,
idcomuna int not null,
constraint pk_Mall primary key (idmall),
constraint fk_Comuna foreign key (idcomuna) references comuna(idcomuna)
);

create table sucursal
(
codsucursal int,
nombre varchar2(50) not null,
direccion varchar2(50) not null,
idmall int,
idcomuna int not null,
constraint pk_idSucursal primary key (codsucursal),
constraint fk_Mall_sucursal foreign key (idmall) references mall(idmall),
constraint fk_Comuna_sucursal foreign key (idcomuna) references comuna(idcomuna)
);

create table usuario
(
rut int not null,
contraseña varchar2(30) not null,
nombre varchar2(30) not null,
apellido varchar(30) not null,
Email varchar2(50) not null,
idtipousuario int not null,
codsucursal int not null,
constraint pk_Rut primary key (rut),
constraint uq_Email unique(email),
constraint fk_Tipo_Usuario foreign key (idtipousuario) references tipousuario(idtipousuario),
constraint fk_Sucursal foreign key (codsucursal) references sucursal(codsucursal)
);

create table pais
(
codpais int,
nombre varchar2(30),
constraint pk_Pais primary key (codpais)
);

create table tipocliente
(
idtipocliente int,
nombre varchar2(30) not null,
constraint pk_TipoCliente primary key (idtipocliente)
);

create table cliente
(
rut int,
nombre varchar2(30) not null,
apellido varchar2(30) not null,
direccion varchar2(30),
telefono int, 
fechanac date not null,
idtipocliente int not null,
idcomuna int not null,
idsucursal int not null,
constraint pk_Cliente primary key (rut),
constraint fk_TipoCliente foreign key (idtipocliente) references tipocliente(idtipocliente),
constraint fk_Comuna_Cliente foreign key(idcomuna) references comuna(idcomuna),
constraint fk_Sucursal_Cliente foreign key(idsucursal) references sucursal(codSucursal)
);

create table compra
(
idcompra int,
precio int not null,
fechacompra date not null,
rutcliente int not null,
constraint pk_Compra primary key (idcompra),
constraint fk_cliente foreign key (rutcliente) references cliente(rut)
);

create table mercaderia
(
idmercaderia int,
nombre varchar2(30) not null,
precio int not null,
cantidad int not null,
idcompra int not null,
constraint pk_Mercaderia primary key(idmercaderia),
constraint fk_Compra foreign key(idcompra) references compra(idcompra)
);

create table sala
(
idsala int,
numero int not null,
codSucursal int not null,
constraint pk_sala primary key(idsala),
constraint fk_Sucursal_sala foreign key(codsucursal) references sucursal(codsucursal)
);

create table asiento
(
idasiento int,
numero int not null,
idsala int not null,
constraint pk_Asiento primary key(idasiento),
constraint fk_Sala foreign key(idsala) references sala(idsala)
);

create table Productora
(
codproductora int,
nombre varchar2(30),
constraint pk_Productora primary key(codproductora)
);

create table Genero
(
codigo int,
nombre varchar2(30) not null,
constraint pk_Genero primary key(codigo)
);

create table tipoActor
(
codigo int,
nombre  varchar2(20) not null,
constraint pk_TipoActor primary key(codigo)
);

create table actor
(
codigo int,
nombre varchar2(50) not null,
codTipoActor int not null,
codPais int not null,
constraint pk_Actor primary key(codigo),
constraint fk_TipoActor foreign key(codtipoactor) references tipoactor(codigo),
constraint fk_Pais foreign key(codpais) references pais(codpais)
);

create table director
(
codigo int,
nombre varchar2(40) not null,
codPais int not null,
constraint pk_Director primary key(codigo),
constraint fk_Pais_director foreign key(codPais) references pais(codpais)
);

create table cartelera
(
codigo int,
codSucursal int not null,
constraint pk_cartelera primary key(codigo),
constraint fk_Sucursal_cartelera foreign key(codSucursal) references sucursal(codsucursal)
);

create table pelicula
(
idpelicula int,
nombre varchar2(30) not null,
sinopsis varchar2(255) not null,
censura int not null,
fechaProd date not null,
fechaEst date not null,
paginaWeb varchar2(50) not null,
estado int not null,
codProductora int not null,
codGenero int not null,
codPais int not null,
codCartelera int not null,
constraint pk_Pelicula primary key(idpelicula),
constraint fk_Productora_Pelicula foreign key(codProductora) references productora(codProductora),
constraint fk_Genero_Pelicula foreign key(codGenero) references genero(codigo),
constraint fk_Pais_Pelicula foreign key(codPais) references pais(codPais),
constraint fk_Cartelera_Pelicula foreign key(codCartelera) references cartelera(codigo)
);

create table actorPelicula
(
codpelicula int not null,
codActor int not null,
constraint fk_Pelucla_APelicula foreign key(codpelicula) references pelicula(idpelicula),
constraint fk_Actor_actorPelicula foreign key(codactor) references actor(codigo)
);

create table directorPelicula
(
codpelicula int not null,
codDirector int not null,
constraint fk_Pelicula_Dpelicula foreign key(codpelicula) references pelicula(idpelicula),
constraint fk_Director_DPelicula foreign key(codDirector) references director(codigo)
);

create table proyeccion
(
idproyeccion int,
idSala int not null,
codPelicula int not null,
horaInicio date not null,
horaTermino date not null,
constraint pk_Proyeccion primary key(idproyeccion),
constraint fk_Sala_proyeccion foreign key(idsala) references sala(idsala),
constraint fk_Pelicula_proyeccion foreign key(codpelicula) references pelicula(idpelicula)
);

create table ticket
(
idticket int,
codProyeccion int not null,
codCompra not null,
constraint pk_ticket primary key(idticket),
constraint fk_Proyeccion_ticket foreign key(codproyeccion) references proyeccion(idproyeccion),
constraint fk_Compra_ticket foreign key(codcompra) references compra(idcompra)
);


insert into tipousuario values(0,'Usuario');
insert into tipousuario values(1,'Administrador');

insert into ciudad values(1,'Santiago');

insert into comuna values(1,'La florida',1);
insert into comuna values(2,'Providencia',1);
insert into comuna values(3,'Cerrillos',1);
insert into comuna values(4,'Las Condes',1);
insert into comuna values(5,'La Dehesa',1);
insert into comuna values(6,'Macul',1);
insert into comuna values(7,'San Joaquin',1);
insert into comuna values(8,'La Granja',1);
insert into comuna values(9,'Puente Alto',1);
insert into comuna values(10,'San Bernardo',1);
insert into comuna values(11,'San Ramon',1);
insert into comuna values(12,'Quilicura',1);
insert into comuna values(13,'Pudahuel',1);
insert into comuna values(14,'Huechuraba',1);
insert into comuna values(15,'Lo Prado',1);
insert into comuna values(16,'Peñalolen',1);
insert into comuna values(17,'Conchali',1);


insert into mall values(1,'Florida Center','Vicuña Mackena 6100',1);
insert into mall values(2,'Plaza Cespucio','Vicuña Mackena 65800',1);
insert into mall values(3,'Costanera Center','Avenida Andrés Bello 2425',2);
insert into mall values(4,'Vivo Panorámico','Av. Nueva Providencia 2155',2);
insert into mall values(5,'Plaza Puente Alto','Avenida Camilo Henríquez 3296',9);
insert into mall values(6,'Apumanque','Av. Manquehue Sur 31',4);
insert into mall values(7,'Mall Sport','Av. Las Condes 13451',4);

insert into sucursal values(1,'CinedeMark la Florida','Vicuña Mackena 6100 inter',1,1);
insert into sucursal values(2,'CinedeMark Plaza vespucio','Vicuña Mackena 5800 inter',2,1);
insert into sucursal values(3,'CinedeMark Costanera center','Avenida Andrés Bello 2425 inter',3,2);
insert into sucursal values(4,'CinedeMark Vivo Panoramico','Av. Nueva Providencia 2155 inter',4,2);
insert into sucursal values(5,'CinedeMark Plaza puente alto','Av Camilo Henríquez 3296 int',5,9);
insert into sucursal values(6,'CinedeMark Apumanque','Av. Manquehue Sur 31 inter',6,4);
insert into sucursal values(7,'CinedeMark Mall Sport','Av. Las Condes 13451 inter',7,4);


insert into tipocliente values (1,'Normal');
insert into tipocliente values (2,'Premium');
insert into tipocliente values (3,'Estudiantes');
insert into tipocliente values (4,'Tercera Edad');

