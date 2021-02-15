package ejercicio03;

public class Coche extends VehiculoAMotor {

	public Coche(int impuesto) {
		super(impuesto);
		// TODO Auto-generated constructor stub
	}
	double impuestoMercancia=100;
	public double CalcularImpuesto (double cilindrada) {

		cilindrada=225;
		double den=100;
		double porcentImpuesto=60;
		return impuesto+(cilindrada*porcentImpuesto/den);
		}
}


