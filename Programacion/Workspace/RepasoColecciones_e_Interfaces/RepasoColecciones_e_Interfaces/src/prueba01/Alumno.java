package prueba01;

public class Alumno implements  IEstudiable, Comparable <Alumno>{

	private String nombre;
	private int edad;
	private int nota;
	
	
	public Alumno() {
		
	}
	
	public Alumno(String nombre, int edad, int nota) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.nota = nota;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", edad=" + edad + ", nota=" + nota + "]";
	}

	//ESTO LO IMPLEMENTA COMPARABLE
	
	@Override
	public int compareTo(Alumno a) {
		
		if(this.edad > a.edad ) {
			return -1;
		} else if(this.edad < a.edad) {
			return 1;
		}
		
		return 0;
	}

	
	
	
	
}
