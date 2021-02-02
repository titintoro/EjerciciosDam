package ejemplo1;

public class Trabajador {

	private String nombre;
	private String puesto;
	private String nss;
	private String direccion;
	private String telefono;
	
	public Trabajador(String nombre, String puesto, String nss, String direccion, String telefono) {
		super();
		this.nombre = nombre;
		this.puesto = puesto;
		this.nss = nss;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String getNss() {
		return nss;
	}

	public void setNss(String nss) {
		this.nss = nss;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", puesto=" + puesto + ", nss=" + nss + ", direccion=" + direccion
				+ ", telefono=" + telefono + ", getNombre()=" + getNombre() + ", getPuesto()=" + getPuesto()
				+ ", getNss()=" + getNss() + ", getDireccion()=" + getDireccion() + ", getTelefono()=" + getTelefono()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public double CalcularPaga () {
		return 0.0;
		
		
	}
	
	
	
}
