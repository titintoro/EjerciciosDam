set schema 'public';

create table usuarios (

DNI					text PRIMARY KEY,
Nombre				text NOT NULL,
Apellidos			text NOT NULL,
Dirección			text,
Teléfono			text NOT NULL,
Email				text NOT NULL,
Passw				text,
Saldo_disponible	numeric DEFAULT 0 AND NOT NULL

)

create table estaciones (

Cod_estacion	text PRIMARY KEY,
Num_estacion	bigserial NOT NULL,
Direccion		text NOT NULL,
Latitud			Numeric NOT NULL,
Longitud		Numeric NOT NULL
)

create table uso (

Estacion_salida			text PRIMARY KEY,
fecha_salida			date PRIMARY KEY,
dni_usuario				text PRIMARY KEY,
cod_bicicleta			int PRIMARY KEY,
estacion_llegada		text PRIMARY KEY,
fecha_llegada			date NOT NULL
)



