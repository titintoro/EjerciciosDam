SET SCHEMA 'public';

CREATE TABLE Libro(
ISBN 				text,
Titulo				text,
Dni_autor			text,
Cod_genero			int,	
Cod_editorial		int
);

CREATE TABLE Autor (
DNI 				text,
Nombre				text,
Nacionalidad		text
);

CREATE TABLE Editorial (
Cod_editorial		bigint,
Nombre				text,
Direccion			text,
Poblacion			text
);

CREATE TABLE Genero(
Id_genero 			bigint,
Nombre				text,
Descripción			text
);

CREATE TABLE Edicion(
ISBN				text,
Fecha_publicacion	date,
Cantidad			int 	
);
























