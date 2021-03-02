set schema 'public';


CREATE TABLE empleado (
id_empleado        			serial, 		
nombre                    	varchar(30)   	NOT NULL,
primer_apellido        		varchar(50)    	NOT NULL,
segundo_apellido     		varchar(50)		NOT NULL,
sueldo_fijo                	numeric    		NOT NULL,
fecha_de_contratacion 		date       		NOT NULL,
fecha_de_nacimiento 		date         	NOT NULL,
direccion         			varchar(150)  	NOT NULL,
ciudad             			varchar(40)   	NOT NULL,
provincia          			varchar(40)   	NOT NULL,
codigo_postal    			integer     	NOT NULL,
telefono        			varchar(20)   	NOT NULL,
jefe_id            			integer,                              
email             			varchar(320)	NOT NULL,
CONSTRAINT sueldo_positivo CHECK (sueldo_fijo > 0),
CONSTRAINT pk_empleado PRIMARY KEY (id_empleado)
);


CREATE TABLE pago (
id_pago       		serial,
metodo_de_pago    	varchar(20)     NOT NULL,
fecha_de_pago    	date      		NOT NULL,
CONSTRAINT pk_pago PRIMARY KEY (id_pago)
);


CREATE TABLE producto(
id_producto        		serial,
nombre_producto       	text      	NOT NULL,
descripcion          	text,           
id_categoria	     	integer   	NOT NULL,
CONSTRAINT pk_producto PRIMARY KEY (id_producto)
);


ALTER TABLE pago ADD CONSTRAINT fk_producto FOREIGN KEY (id_categoria) REFERENCES categoria 











