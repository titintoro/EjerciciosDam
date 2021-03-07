package prueba01;

import java.util.Comparator;

public class CompararPorNotas implements Comparator <Alumno> {

	@Override
	public int compare(Alumno a1, Alumno a2) {
		
		if(a1.getEdad() > a2.getEdad())
			return 1;
		else if(a1.getEdad() < a2.getEdad())
			return -1;
		
		return 0;
	}

}
