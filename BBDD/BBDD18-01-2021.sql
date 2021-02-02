-- 2. Selecciona los clientes que han comprado casas en Almería, 
-- siendo el precio final mayor que el precio medio de las casas vendidas en Almería.

set schema 'inmo';
select precio_final, AVG(precio_final) 
from operacion
join comprador using (id_cliente)
join inmueble using (id_inmueble)
where provincia ='Almería' 
having precio_final>AVG(precio_final)
group by precio_final;


-- 3. Selecciona de todos los vendedores a aquellos que solo vendieron inmuebles de tipo Parking

set schema 'inmo';
select vendedor.nombre as "Nombre Vendedor", tipo.nombre as "Nombre tipo"
FROM operacion JOIN inmueble USING (id_inmueble) JOIN vendedor USING (id_vendedor) join tipo on (id_inmueble=tipo_inmueble)
where tipo.nombre='Parking'

/* 4.Selecciona el origen y el destino de los 10 vuelos con una duración menor.
*/

set schema 'vuelos';
select desde, hasta, (date llegada - date salida as "duracion")
from vuelos
order by duracion asc
limit 10;

/* 5. Selecciona el importe que la aerolínea de la base de datos de vuelos ha ingresado 
por cada uno de los vuelos que se han realizado en fin de semana (es decir, que han salido entre viernes y domingo) 
en los meses de Julio y Agosto (da igual el año).
*/

set schema 'vuelos';
select precio, count (id)
from vuelos
