package ejemplodepredador;

public class Animal implements IDepredador {

	private String nombre;
	private int tipoAlimentacion;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTipoAlimentacion() {
		return tipoAlimentacion;
	}

	public void setTipoAlimentacion(int tipoAlimentacion) {
		this.tipoAlimentacion = tipoAlimentacion;
	}

	
	
	public Animal(String nombre, int tipoAlimentacion) {
		super();
		this.nombre = nombre;
		this.tipoAlimentacion = tipoAlimentacion;
	}

	
	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", tipoAlimentacion=" + tipoAlimentacion + "]";
	}

	@Override
	public void localizar(Animal presa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cazar(Animal presa) {
		// TODO Auto-generated method stub
		System.out.println("Al ataquerrr!!");
		System.out.println("A por la "+presa.nombre);
	}

	
}
