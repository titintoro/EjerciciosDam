package crud;

import model.Producto;


public class CrudProducto {

	
	private Producto [] lista;

	/*Hacemos esto de instanciar el array dentro del constructor
	para evitar complicaciones, m�s adelante veremos otras formas
	Con esto evitamos tener que pasarle un array concreto a un objeto tipo CRUDProducto*/
	
	public CrudProducto() {
		int cien=4;
		lista = new Producto [cien];
	}

	/*Pasamos un producto y una posici�n y se añade dicho producto en dicha posición.
	 * Ojo, porque no se comprueba nada, se pierde lo que había*/
	
	public void add(Producto p, int posicion) {
		lista[posicion]=p;
	}

	/*Método que modifica el precio de un producto
	 * Se pasa como parámetros el código del producto que queremos modificar y el nuevo precio 
	 * (ambos cosas dse le pedirán al usuario por teclado en el main, 
	 * se busca dentro del método el producto por código y se le "setea" el precio
	 * Podría devolver boolean si todo es correcto o algún índice
	 *  pero en nuestro caso, en este programa tan sencillo no es necesario*/
	
	public void editPrecio(String codigo, float precioN) {
		int index = findByIdV2(codigo);
		if (index >= 0) {
			lista[index].setPrecioUnitario(precioN);
			
		} 

	}

	/*Método que "borra" un producto de la lista (pasa a no activo).
	 * En este caso, para que veas el uso de otra forma de buscar, se pasa el producto a borrar
	 * completo, se busca dicho producto y se setea a falso su atributo "activo"
	 * ya que en realizadad no queremos borrarlo todo de nuestros datos, sino 
	 * dejarlo como "no a la venta". Esto permitiría poder sacar datos en un futuro
	 * no perder datos de ventas anteriores, etc.*/
	
	public void delete(Producto p) {
		int index = findProduct(p);//Devuelve el índice del array donde se encuentra el producto
		if (index >= 0)
			lista[index].setActivo(false);
	}

	
	/*Buscar producto por código id y devuelve el producto buscado completo*/
	
	public Producto findById(String codigo) {
		int i = 0;
		boolean encontrado = false;

		//Mientras no hayamos llegado al final o encontrado lo que buscamos repetimos el bucle
		//Al encotrarlo, el bucle para
		while (i < lista.length && !encontrado) {
			Producto deLista = lista[i];
			if (deLista.getCodigo().equalsIgnoreCase(codigo))
				encontrado = true;
			else
				i++;
		}
		
		if (encontrado)
			return lista[i];//Devolvemos el producto buscado
		else
			return null;
	}
	

	/*Buscar producto por código id y devuelve el índice del array donde se encuentra
	 * el producto buscado*/
	
	public int findByIdV2(String codigo) {
		int i = 0;
		boolean encontrado = false;

		while (i < lista.length && !encontrado) {
			Producto deLista = lista[i];
			if (deLista.getCodigo().equalsIgnoreCase(codigo))
				encontrado = true;
			else
				i++;
		}
		if (encontrado)
			return i;
		else
			return -1;
	}
	
	//Buscar todos los productos, devuelve la lista completa
	//Es un getLista pero se suele tener un buscar todos independiente
	
	public Producto [] findAll() {
		return lista;
	}

	/*Busca un producto completo y devuelve el índice donde se encuentra
	 * Utiliza compareTo para ver si dos productos son iguales, se estudiará más adelante */
	
	
	public int findProduct(Producto p) {
		int i = 0;
		boolean encontrado = false;

		while (i < lista.length && !encontrado) {
			Producto deLista = lista[i];
			if (p.compareTo(deLista) == 0)
				encontrado = true;
			else
				i++;
		}

		if (encontrado)
			return i;
		else
			return -1;
	}

	
	//Mostrar todos los productos de la lista
	
	public void imprimirTodosLosProductos () {
		for(int i=0; i<lista.length;i++) {
			System.out.println((i+1)+". "+lista[i]);
		}
	}
	
	//Mostrar solo los productos cuyo atributo activo es true, es decir, los que en este momento
	//están a la venta
	
	public void imprimirSoloActivos () {
		
		for(int i=0; i<lista.length && lista[i]!=null;i++) {
			if (lista[i].isActivo()) {
				System.out.println((i+1)+". "+lista[i]);
			}
			
				
		}
	}
	
}
