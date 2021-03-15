package ejercicio5;

public class Personas {

	
	private String nombre;
	private int edad;
	public Personas(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
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
	@Override
	public String toString() {
		return "Personas [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	
}
