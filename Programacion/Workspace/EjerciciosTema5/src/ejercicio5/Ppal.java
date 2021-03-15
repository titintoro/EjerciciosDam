package ejercicio5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crear una pequeña lista con los datos personales de algunas personas, y
		 * mostrarla por pantalla de forma NO ordenada y de forma ordenada (elegid la
		 * forma de ordenar vosotros, podéis empezar con orden natural, es decir,
		 * alfabéticamente y después crear otra “no natural”).
		 */

		List<Personas> listaPersonas = new ArrayList<Personas>();

		listaPersonas.add(new Personas("Lucas", 19));
		listaPersonas.add(new Personas("Marta", 30));
		listaPersonas.add(new Personas("Ale", 20));
		listaPersonas.add(new Personas("Antonio", 15));
		listaPersonas.add(new Personas("Titin", 16));

		System.out.println(listaPersonas);

		Collections.sort(listaPersonas, new CompararPorEdad());

		System.out.println(listaPersonas);

	}

}
