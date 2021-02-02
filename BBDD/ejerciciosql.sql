--1. Seleccionar los nombres de los productos que hayan sido solicitados en pedidos que hayan sido enviados por la empresa United Package.

SET SCHEMA 'northwind';
SELECT product_name, company_name('United Package')
FROM suppliers JOIN products USING (supplier_id);

--2 Seleccionar el nombre del producto y el de su categoría que se hayan incluido en algún pedido, 
--para todos aquellos pedidos solicitados en un día de Agosto.
SET SCHEMA 'northwind';
SELECT product_name, category_name ('United Package')
FROM suppliers JOIN products USING (supplier_id)
WHERE order_date ('Agosto')

--3. Seleccionar el nombre de todas las empresas que sean clientes, hayan realizado pedidos o no.
SET SCHEMA 'northwind';
SELECT company_name, 
FROM suppliers;

--4. Seleccionar el nombre de los empleados que han atendido pedidos realizados por clientes de Brasil (Brazil).
SET SCHEMA 'northwind';
SELECT first_name, 
FROM orders JOIN employees USING (employee_id)
WHERE ship_country=('Brazil');

--5. Seleccionar el nombre de la categoría y los productos que se han pedido en aquellos pedidos 
--que han sido atendidos por Janet Leverling (EMPLOYEE).
SET SCHEMA 'northwind';
SELECT category_name, products_name, 
FROM orders JOIN employees USING (employee_id)
WHERE first_name='Janet' and Last_name='Leverling';

--6. Diseña una consulta (incluyendo su solución) para la base de datos NORTHWIND que contenga los siguientes elementos.
--La salida del select no será SELECT *
--Debe realizar el JOIN de al menos 4 tablas.
--Uno de los JOINs debe, obligatoriamente, ser un JOIN ON
--Al menos, tendrá cuatro condiciones en el WHERE (conectadas con AND u OR)
--Debe ordenar la salida por algún criterio.


































