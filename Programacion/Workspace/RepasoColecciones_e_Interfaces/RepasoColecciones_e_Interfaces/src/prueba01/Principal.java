package prueba01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Principal {

	public static void main(String[] args) {

		List<Alumno> listado = new ArrayList<Alumno>();

		
		 listado.add(new Alumno("Juan", 15, 7));
		 listado.add(new Alumno("Antonio", 14, 9));
		 listado.add(new Alumno("Ángel", 18, 6)); 
		 listado.add(new Alumno("María", 16, 8));
		
		String nombre= null;
		int edad = 0, nota = 0;

		Collections.sort(listado, new CompararPorNombre());
		
		
		for (Alumno alumno : listado) {
			
			System.out.println(alumno);
			
		}
		
		
		
		Aula aula = new Aula(listado);
/*
 * 
 * 
 * 
		System.out.println("Introduzca un nombre");
		nombre = Leer.dato();
		System.out.println("Introduzca una edad");
		edad = Leer.datoInt();
		System.out.println("Introduzca una nota");
		nota = Leer.datoInt();
		
		
		
		aula.mostrarErrorAgregarAlumno(aula.agregarAlumno(new Alumno(nombre, edad, nota)));
	*/	
	}

}
