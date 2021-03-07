package prueba01;


import java.util.List;

public class Aula {

	
	private List <Alumno> listado;

	public Aula(List<Alumno> listado) {
		super();
		this.listado = listado;
	}

	
	public boolean agregarAlumno(Alumno a) {
		
		return listado.add(a);
		
	}
	
	
	public void mostrarErrorAgregarAlumno(boolean b) {
		
		if(b) {
			System.out.println("El alumno se ha agregado");
		} else {
			System.out.println("El alumno NO se ha agregado");
		}
		
	}
	
	public boolean borrarAlumno(Alumno a) {
		
		return listado.remove(a);
		
	}
	
	
	
	
}
