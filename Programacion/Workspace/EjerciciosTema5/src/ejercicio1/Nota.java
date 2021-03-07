package ejercicio1;

public class Nota {

	private String anotacion;

	public String getAnotacion() {
		return anotacion;
	}

	public void setAnotacion(String anotacion) {
		this.anotacion = anotacion;
	}

	public Nota(String anotacion) {
		super();
		this.anotacion = anotacion;
	}

	@Override
	public String toString() {
		return "Nota [anotacion=" + anotacion + "]";
	}
	
}
