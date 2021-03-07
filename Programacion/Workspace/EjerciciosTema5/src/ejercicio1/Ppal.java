package ejercicio1;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Realizar un programa que permita gestionar notas de texto (como las de un
		 * m�vil). Usaremos la clase ArrayList y el listado debe guardar objetos tipo
		 * Notas (t� decides las caracter�sticas/atributos que debe tener una nota).
		 * Debe permitir almacenar un n�mero infinito de notas (significa que se deben
		 * usar colecciones), se podr�n mostrar de manera individual (mostrar una nota
		 * busc�ndola), dar informaci�n del n�mero de notas guardadas, agregar una nueva
		 * nota, un m�todo que borre una de las notas guardadas comprobando antes que la
		 * lista no est� vac�a. Se borrar� por n�mero (la nota 1, la 2...), por lo que
		 * habr� que mostrarle al usuario la lista con todas las notas (en un m�todo) y
		 * su n�mero correspondiente, el usuario introducir� el n�mero de la que quiera
		 * borrar. Realmente, esto se debe hacer buscando la nota, pero al ser el primer
		 * ejercicio, no es necesario hacer los m�todos buscar.
		 */
		int numNota = 0;
		ArrayList<Nota> listaNotas = new ArrayList<Nota>();

		listaNotas.set(0, new Nota("Comprar el pan"));
		listaNotas.set(1, new Nota("Sacar al perro"));
		listaNotas.set(2, new Nota("Hacer programaci�n"));
		listaNotas.add(new Nota("Cambiar pa�ales"));

		System.out.println("Tiene " + listaNotas.size() + " notas en su m�vil");
		System.out.println("Pulse la nota que quiere ver (1,2,3...)");
		numNota = Leer.datoInt();
		System.out.println(listaNotas.get(numNota));

		for (Nota n : listaNotas) {

			System.out.println(n);
		}
	}

}
