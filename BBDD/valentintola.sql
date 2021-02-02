--1. Seleccionar el COMPANY_NAME y CONTACT_NAME de aquellos CUSTOMERS que hayan hecho pedidos (ORDERS).
set schema 'northwind';
SELECT company_name,contact_name
FROM customers JOIN orders USING (customer_id);

--2. Seleccionar el número de pedidos que hemos enviado en la década de los 90 con las empresas Federal Shiping o United Package.



--3. Seleccionar el nombre de aquellos productos que han sido solicitados en algún pedido.
set schema 'northwind';
SELECT product_name
FROM products JOIN order_details USING (product_id);

--4.Seleccionar la suma de los importes "cobrados" en todos los pedidos realizados en el año 96.
--5. Seleccionar el nombre de contacto del cliente y el del empleado para aquellos clientes y empleados que han participado en pedidos donde la diferencia entre la fecha de envío y la fecha de requisito sea menos de 20 días
--6. Diseña una consulta (incluyendo su solución) para la base de datos NORTHWIND que contenga los siguientes elementos.
--La salida del select no será SELECT *
--Debe realizar el JOIN de al menos 4 tablas.
--Uno de los JOINs debe, obligatoriamente, ser un JOIN ON
--Al menos, tendrá cuatro condiciones en el WHERE (conectadas con AND u OR)
--Debe ordenar la salida por algún criterio.
