package ejemplo1;

public class Empleado extends Trabajador {

	private double sueldo;
	private double impuestos;
	
	public Empleado(String nombre, String puesto, String nss, String direccion, String telefono, double sueldo,
			double impuestos) {
		super(nombre, puesto, nss, direccion, telefono);
		this.sueldo = sueldo;
		this.impuestos = impuestos;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public double getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(double impuestos) {
		this.impuestos = impuestos;
	}

	@Override
	public String toString() {
		return "Empleado [sueldo=" + sueldo + ", impuestos=" + impuestos + ", getSueldo()=" + getSueldo()
				+ ", getImpuestos()=" + getImpuestos() + ", getNombre()=" + getNombre() + ", getPuesto()=" + getPuesto()
				+ ", getNss()=" + getNss() + ", getDireccion()=" + getDireccion() + ", getTelefono()=" + getTelefono()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

	public double CalcularPaga () {
		return(sueldo-impuestos);
	
	
	
	}
}
