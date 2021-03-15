package ejercicio5;

import java.util.Comparator;

public class CompararPorEdad implements Comparator<Personas> {

	@Override
	public int compare(Personas p1, Personas p2) {
		
		if (p1.getEdad() > p2.getEdad())
			return 1;
		else if (p1.getEdad() < p2.getEdad())
			return -1;
		return 0;
	}

}
