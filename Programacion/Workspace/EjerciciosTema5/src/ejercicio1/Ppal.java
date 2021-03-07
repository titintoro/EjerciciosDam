package ejercicio1;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Realizar un programa que permita gestionar notas de texto (como las de un
		 * móvil). Usaremos la clase ArrayList y el listado debe guardar objetos tipo
		 * Notas (tú decides las características/atributos que debe tener una nota).
		 * Debe permitir almacenar un número infinito de notas (significa que se deben
		 * usar colecciones), se podrán mostrar de manera individual (mostrar una nota
		 * buscándola), dar información del número de notas guardadas, agregar una nueva
		 * nota, un método que borre una de las notas guardadas comprobando antes que la
		 * lista no está vacía. Se borrará por número (la nota 1, la 2...), por lo que
		 * habrá que mostrarle al usuario la lista con todas las notas (en un método) y
		 * su número correspondiente, el usuario introducirá el número de la que quiera
		 * borrar. Realmente, esto se debe hacer buscando la nota, pero al ser el primer
		 * ejercicio, no es necesario hacer los métodos buscar.
		 */
		int numNota = 0;
		ArrayList<Nota> listaNotas = new ArrayList<Nota>();

		listaNotas.set(0, new Nota("Comprar el pan"));
		listaNotas.set(1, new Nota("Sacar al perro"));
		listaNotas.set(2, new Nota("Hacer programación"));
		listaNotas.add(new Nota("Cambiar pañales"));

		System.out.println("Tiene " + listaNotas.size() + " notas en su móvil");
		System.out.println("Pulse la nota que quiere ver (1,2,3...)");
		numNota = Leer.datoInt();
		System.out.println(listaNotas.get(numNota));

		for (Nota n : listaNotas) {

			System.out.println(n);
		}
	}

}
