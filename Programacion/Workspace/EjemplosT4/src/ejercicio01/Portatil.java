package ejercicio01;

public class Portatil extends Ordenador {
	
	private int mgCamaraFrontal;

	public Portatil(int capDiscoDuro, int frecProcesador, int memoriaRam, double precioBase, int mgCamaraFrontal) {
		super(capDiscoDuro, frecProcesador, memoriaRam, precioBase);
		this.mgCamaraFrontal = mgCamaraFrontal;
	}

	public int getMgCamaraFrontal() {
		return mgCamaraFrontal;
	}

	public void setMgCamaraFrontal(int mgCamaraFrontal) {
		this.mgCamaraFrontal = mgCamaraFrontal;
	}

	@Override
	public String toString() {
		return "Portátil [mgCamaraFrontal=" + mgCamaraFrontal + "]";
	}

	
	public double CalcularPrecioVentaPublico (double ganancia, double seguro, double descuento) {
	
		int den = 100;
		
		
		return super.CalcularPrecioVentaPublico(ganancia, seguro, descuento)- 
				(super.CalcularPrecioVentaPublico(ganancia, seguro, descuento) * descuento / den);
	}
	
}
