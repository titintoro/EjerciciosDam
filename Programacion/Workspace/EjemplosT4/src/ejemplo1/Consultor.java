package ejemplo1;

public class Consultor extends Trabajador {

	private int horas;
	private double tarifa;
	
	public Consultor(String nombre, String puesto, String nss, String direccion, String telefono, int horas,
			double tarifa) {
		super(nombre, puesto, nss, direccion, telefono);
		this.horas = horas;
		this.tarifa = tarifa;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public double gettarifa() {
		return tarifa;
	}

	public void settarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	@Override
	public String toString() {
		return "Consultor [horas=" + horas + ", tarifa=" + tarifa + ", getNombre()=" + getNombre() + ", getPuesto()="
				+ getPuesto() + ", getNss()=" + getNss() + ", getDireccion()=" + getDireccion() + ", getTelefono()="
				+ getTelefono() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	public double CalcularPaga () {
		return horas*tarifa;
	
	
	
	}
	
	
}
