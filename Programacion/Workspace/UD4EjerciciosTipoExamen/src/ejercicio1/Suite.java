package ejercicio1;

public class Suite extends HabitacionEstandar {

	private double metrosCuadrados;
	private double dineroServicioHabitaciones;
	private double descuento=20;
	
	public Suite(double precioBase, boolean ocupada, String nombreCliente, int diasOcupada, int numOcupantes,
			double metrosCuadrados, double dineroServicioHabitaciones) {
		super(precioBase, ocupada, nombreCliente, diasOcupada, numOcupantes);
		this.metrosCuadrados = metrosCuadrados;
		this.dineroServicioHabitaciones = dineroServicioHabitaciones;
	}
	
	public double calcularCantidadPagar (double cantidadPagar ) {
		
		double den = 100;
		cantidadPagar=diasOcupada*precioBase+dineroServicioHabitaciones;
		cantidadPagar=cantidadPagar-(cantidadPagar*descuento/den);
		return cantidadPagar;
		
	}
}

