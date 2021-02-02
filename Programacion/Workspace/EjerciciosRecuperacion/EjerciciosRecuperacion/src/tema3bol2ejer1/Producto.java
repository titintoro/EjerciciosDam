package tema3bol2ejer1;

public class Producto {

	private double precioFabrica;
	private int cantidad;
	private String color;
	private double precioVentaPublico;
	private double descuento;
	
	public Producto(double precioFabrica, int cantidad, String color, double precioVentaPublico, double descuento) {
		super();
		this.precioFabrica = precioFabrica;
		this.cantidad = cantidad;
		this.color = color;
		this.precioVentaPublico = precioVentaPublico;
		this.descuento = descuento;
	}

	public double getPrecioFabrica() {
		return precioFabrica;
	}

	public void setPrecioFabrica(double precioFabrica) {
		this.precioFabrica = precioFabrica;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecioVentaPublico() {
		return precioVentaPublico;
	}

	public void setPrecioVentaPublico(double precioVentaPublico) {
		this.precioVentaPublico = precioVentaPublico;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	@Override
	public String toString() {
		return "Producto [precioFabrica=" + precioFabrica + ", cantidad=" + cantidad + ", color=" + color
				+ ", precioVentaPublico=" + precioVentaPublico + ", descuento=" + descuento + "]";
	}
	
	public double calcularPrecioFinal (int )
		
		
	
	
	
	
}
