package ejercicio1;

public class HabitacionEstandar {

	private double precioBase=100;
	private boolean ocupada;
	private String nombreCliente;
	private int diasOcupada;
	private int numOcupantes;
	
	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public boolean isOcupada() {
		return ocupada;
	}

	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public int getDiasOcupada() {
		return diasOcupada;
	}

	public void setDiasOcupada(int diasOcupada) {
		this.diasOcupada = diasOcupada;
	}

	public int getNumOcupantes() {
		return numOcupantes;
	}

	public void setNumOcupantes(int numOcupantes) {
		this.numOcupantes = numOcupantes;
	}

	public HabitacionEstandar(double precioBase, boolean ocupada, String nombreCliente, int diasOcupada,
			int numOcupantes) {
		this.precioBase = precioBase;
		this.ocupada = ocupada;
		this.nombreCliente = nombreCliente;
		this.diasOcupada = diasOcupada;
		this.numOcupantes = numOcupantes;
	}

	@Override
	public String toString() {
		return "HabitacionEstandar [precioBase=" + precioBase + ", ocupada=" + ocupada + ", nombreCliente="
				+ nombreCliente + ", diasOcupada=" + diasOcupada + ", numOcupantes=" + numOcupantes + "]";
	}

	public double calcularCantidadPagar (double cantidadPagar) {
		
		cantidadPagar=diasOcupada*precioBase;
		return cantidadPagar;
		
	}
}
