package ejercicio03;

public class Furgoneta extends VehiculoAMotor {

	public Furgoneta(int impuesto) {
		super(impuesto);
		// TODO Auto-generated constructor stub
	}
	double impuestoMercancia=100;
	public double CalcularImpuesto () {

		return impuesto+impuestoMercancia;
		}
}
