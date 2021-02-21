set schema 'public';


CREATE TABLE alumnos(
	nombre 			text,
	edad 			numeric,
	DNI 			text,
	telefono 		text,
	direcccion 		text,
	empresa			text
);

CREATE TABLE trabajadores(
	cif 			text,
	nombre			text,
	direccion		text,
	telefono		text
);


CREATE TABLE profesores(
	nombre 			text,
	DNI 			text,
	telefono 		TEXT,
	direcccion 		text,
	apellido 		text
	);
CREATE TABLE cursos(
	n_concreto 		int,
	fecha_inicio 	date,
	fecha_fin		date,
	dni_profesor	text,
	tipo_curso		int
	);
CREATE TABLE tipo_curso(
	cod_curso	int,
	duracion	int,
	programa	text,
	titulo		text
);
CREATE TABLE alumnos_asisten(
	dni			text,
	n_concreto	int
);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	