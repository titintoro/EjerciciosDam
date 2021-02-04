package ejercicio01;

public class Tablet extends Ordenador{
	
	private int mgCamaraTrasera;
	private int mgCamaraFrontal;
	
	
	public Tablet(int capDiscoDuro, int frecProcesador, int memoriaRam, double precioBase, int mgCamaraTrasera,
			int mgCamaraFrontal) {
		super(capDiscoDuro, frecProcesador, memoriaRam, precioBase);
		this.mgCamaraTrasera = mgCamaraTrasera;
		this.mgCamaraFrontal = mgCamaraFrontal;
	}


	public int getMgCamaraTrasera() {
		return mgCamaraTrasera;
	}


	public void setMgCamaraTrasera(int mgCamaraTrasera) {
		this.mgCamaraTrasera = mgCamaraTrasera;
	}


	public int getMgCamaraFrontal() {
		return mgCamaraFrontal;
	}


	public void setMgCamaraFrontal(int mgCamaraFrontal) {
		this.mgCamaraFrontal = mgCamaraFrontal;
	}


	@Override
	public String toString() {
		return "Tablet [mgCamaraTrasera=" + mgCamaraTrasera + ", mgCamaraFrontal=" + mgCamaraFrontal + "]";
	}
	
	
	public double CalcularPrecioVentaPublico (double ganancia,double seguro, double descuento) {
		
		
		return super.CalcularPrecioVentaPublico(ganancia, seguro, descuento) + seguro;
	}
	
	
	
	
	
	

	
}
