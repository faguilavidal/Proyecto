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

create table tipousuario
(
idtipousuario int primary key,
nombre varchar2(20) not null
);

create table sucursal
(
codsucursal int,
nombre varchar2(30) not null,
direccion varchar2(30) not null,
idmall int not null,
idcomuna int not null,
constraint pk_idSucursal primary key (codsucursal),
constraint fk_Mall_sucursal foreign key (idmall) references mall(idmall),
constraint fk_Comuna_sucursal foreign key (idcomuna) references comuna(idcomuna)
);

create table mall
(
idmall int,
nombre varchar2(30) not null,
direccion varchar2(30) not null,
idcomuna int not null,
constraint pk_Mall primary key (idmall),
constraint fk_Comuna foreign key (idcomuna) references comuna(idcomuna)
);

create table comuna
(
idcomuna int,
nombre varchar2(30) not null,
idciudad int not null,
constraint pk_idComuna primary key (idcomuna),
constraint fk_Ciudad foreign key (idciudad) references ciudad(idciudad)
);

create table ciudad
(
idciudad int,
nombre varchar2(30) not null,
constraint pk_Ciudad primary key (idciudad)
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
fechanac date not null,
email varchar2(30) not null,
idtipocliente int not null,
constraint pk_Cliente primary key (rut),
constraint uq_Email_Cliente unique(email),
constraint fk_TipoCliente foreign key (idtipocliente) references tipocliente(idtipocliente)
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

create table tipoSala
(
idtiposala int,
nombre varchar2(20) not null,
constraint pk_tiposala primary key(idtiposala)
);

create table sala
(
idsala int,
numero int not null,
codSucursal int not null,
idTipoSala int not null,
constraint pk_sala primary key(idsala),
constraint fk_Sucursal_sala foreign key(codsucursal) references sucursal(codsucursal),
constraint fk_TipoSala_sala foreign key(idtiposala) references tiposala(idtiposala)
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

create table reparto
(
codreparto int,
codDirector int not null,
codactor int not null,
constraint pk_Reparto primary key(codreparto),
constraint fk_Actor foreign key(codactor) references actor(codigo),
constraint fk_director foreign key(codDirector) references director(codigo)
);

create table actorReparto
(
codReparto int not null,
codActor int not null,
constraint fk_Reparto foreign key(codreparto) references reparto(codreparto),
constraint fk_Actor_actorReparto foreign key(codactor) references actor(codigo)
);

create table directorReparto
(
codReparto int not null,
codDirector int not null,
constraint fk_Reparto_dirReparto foreign key(codReparto) references reparto(codreparto),
constraint fk_Director_dirReparto foreign key(codDirector) references director(codigo)
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
codReparto int not null,
codPais int not null,
codCartelera int not null,
constraint pk_Pelicula primary key(idpelicula),
constraint fk_Productora_Pelicula foreign key(codProductora) references productora(codProductora),
constraint fk_Genero_Pelicula foreign key(codGenero) references genero(codigo),
constraint fk_Reparto_Pelicula foreign key(codReparto) references reparto(codReparto),
constraint fk_Pais_Pelicula foreign key(codPais) references pais(codPais),
constraint fk_Cartelera_Pelicula foreign key(codCartelera) references cartelera(codigo)
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
insert into mall values(1,'Florida Center','Vicuña Mackena 6100',1);
insert into sucursal values(1,'CinedeMark la Florida','Vicuña Mackena 6100 inter',1,1);
insert into mall values(2,'Plaza Cespucio','Vicuña Mackena 65800',1);
insert into sucursal values(2,'CinedeMark Plaza vespucio','Vicuña Mackena 5800 inter',2,1);