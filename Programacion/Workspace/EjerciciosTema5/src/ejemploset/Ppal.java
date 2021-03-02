package ejemploset;

import java.util.HashSet;
import java.util.Set;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> primerSet = new HashSet<String>();
		primerSet.add("one");
		primerSet.add("second");
		primerSet.add("3rd");
		primerSet.add("second"); // duplicado, no se agrega
		System.out.println(primerSet.add("second"));
		
		
		/* En la siguiente l�nea, se imprime el objeto set como salida est�ndar. Esto
		funciona porque la clase HashSet anula el m�todo heredado toString y crea una secuencia
		separada por comas con los elementos delimitados por los corchetes inicial y final*/
		System.out.println(primerSet);
		}
		
		//Ojo, pues los elementos no aparecen en el mismo orden en el que se agregan
	}


