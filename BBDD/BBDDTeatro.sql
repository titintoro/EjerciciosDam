SET SCHEMA 'public';

CREATE TABLE Invitados (
numInvitado		integer		PRIMARY KEY,
nombre			text,
categoria		text,
origen			text
);

CREATE TABLE Teatros (
CodTeat			integer		PRIMARY KEY,
Nombre			text,
Direccion		text,
CantAsientos	integer
);

CREATE TABLE Obras (
codObra			integer		PRIMARY KEY,
nombreObra		text,
autor			text
);

CREATE TABLE Exhibe (
codTeat			integer,
fecha			date,
codObra			integer,
CONSTRAINT pk_Exhibe PRIMARY KEY (codTeat,fecha)
);

CREATE TABLE Tipos_asientos(
tipo			text		PRIMARY KEY,
nombre			text,	
descripcion		text	
);

CREATE TABLE Asientos_tipos (
numAsiento		integer		PRIMARY KEY,
tipo			text
);

CREATE TABLE Precio (
codTeat			integer,
fecha			date,
numAsiento		integer,
numInvit		integer
);

CREATE TABLE Entradas (
codTeat			integer,
fecha			date,
numAsiento		integer,
numInvit		integer
);


ALTER TABLE Entradas ADD CONSTRAINT fk_exhibe FOREIGN KEY (codTeat,fecha) REFERENCES Exhibe;
ALTER TABLE Entradas ADD CONSTRAINT fk_asientos_tipos FOREIGN KEY (numAsiento) REFERENCES Asientos_tipos;
ALTER TABLE Entradas ADD CONSTRAINT fk_Invitados FOREIGN KEY (numInvit) REFERENCES Invitados;
ALTER TABLE Asientos_tipos ADD CONSTRAINT fk_tipos_asientos FOREIGN KEY (Tipo) REFERENCES Tipos_asientos;
ALTER TABLE Exhibe ADD CONSTRAINT fk_teatros FOREIGN KEY (codTeat) REFERENCES Teatros;
ALTER TABLE Exhibe ADD CONSTRAINT fk_obras FOREIGN KEY (codObra) REFERENCES Obras;

INSERT INTO invitados (numInvitado,nombre,categoria,origen) VALUES 
(1,'Miguel','Drama','España'),
(2,'Miguel','Drama','España'),
(3,'Miguel','Drama','España'),
(4,'Miguel','Drama','España');