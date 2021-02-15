package ejercicio1;

public class Apartamento extends HabitacionEstandar {

	private double costeServicioLimpieza=100;

	public Apartamento(double precioBase, boolean ocupada, String nombreCliente, int diasOcupada, int numOcupantes,
			double costeServicioLimpieza) {
		super(precioBase, ocupada, nombreCliente, diasOcupada, numOcupantes);
		this.costeServicioLimpieza = costeServicioLimpieza;
	}



	public double calcularCantidadPagar (double cantidadPagar) {
		
		cantidadPagar=diasOcupada*precioBase+costeServicioLimpieza;
		return cantidadPagar;

}
}
