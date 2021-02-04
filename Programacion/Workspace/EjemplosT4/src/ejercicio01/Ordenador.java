package ejercicio01;

public class Ordenador {
	
	private int capDiscoDuro;
	private int frecProcesador;
	private int memoriaRam;
	private double precioBase;
	
	public Ordenador(int capDiscoDuro, int frecProcesador, int memoriaRam, double precioBase) {
		this.capDiscoDuro = capDiscoDuro;
		this.frecProcesador = frecProcesador;
		this.memoriaRam = memoriaRam;
		this.precioBase = precioBase;
	}

	public int getCapDiscoDuro() {
		return capDiscoDuro;
	}

	public void setCapDiscoDuro(int capDiscoDuro) {
		this.capDiscoDuro = capDiscoDuro;
	}

	public int getFrecProcesador() {
		return frecProcesador;
	}

	public void setFrecProcesador(int frecProcesador) {
		this.frecProcesador = frecProcesador;
	}

	public int getMemoriaRam() {
		return memoriaRam;
	}

	public void setMemoriaRam(int memoriaRam) {
		this.memoriaRam = memoriaRam;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	@Override
	public String toString() {
		return "Ordenador [capDiscoDuro=" + capDiscoDuro + ", frecProcesador=" + frecProcesador + ", memoriaRam="
				+ memoriaRam + ", precioBase=" + precioBase + "]";
	}
	
	
	
	
	public double CalcularPrecioVentaPublico (double ganancia, double seguro, double descuento) {
		int den=100;

		return precioBase + (precioBase*ganancia/den);
	}
	
	
}
