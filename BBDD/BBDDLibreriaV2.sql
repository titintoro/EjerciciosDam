SET SCHEMA 'public';

CREATE TABLE Libro(
ISBN 				text	PRIMARY KEY,
Titulo				text	NOT NULL,
Dni_autor			text	NOT NULL,
Cod_genero			int		NOT NULL,	
Cod_editorial		int		NOT NULL
);

CREATE TABLE Autor (
DNI 				text	PRIMARY KEY,
Nombre				text	NOT NULL,
Nacionalidad		text
);

CREATE TABLE Editorial (
Cod_editorial		bigint 	PRIMARY KEY,
Nombre				text 	NOT NULL,
Direccion			text,
Poblacion			text
);

CREATE TABLE Genero(
Id_genero 			bigint	PRIMARY KEY,
Nombre				text	NOT NULL,
Descripción			text
);

CREATE TABLE Edicion(
ISBN				text,
Fecha_publicacion	date,
Cantidad			int 	CHECK (Cantidad>0),
CONSTRAINT pk_Edicion PRIMARY KEY (Fecha_publicacion,ISBN)
);

ALTER TABLE Libro ADD CONSTRAINT fk_autor FOREIGN KEY (Dni_autor) REFERENCES Autor;
ALTER TABLE Libro ADD CONSTRAINT fk_genero FOREIGN KEY (Cod_genero) REFERENCES Genero;
ALTER TABLE Libro ADD CONSTRAINT fk_editorial FOREIGN KEY (Cod_editorial) REFERENCES Editorial;
ALTER TABLE Edicion ADD CONSTRAINT fk_libros FOREIGN KEY (ISBN) REFERENCES Libro;























