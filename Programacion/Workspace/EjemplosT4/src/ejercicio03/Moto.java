package ejercicio03;

public class Moto extends VehiculoAMotor {

	public Moto(int impuesto) {
		super(impuesto);
		// TODO Auto-generated constructor stub
	}

	public double CalcularImpuesto (double potencia) {
		int den=100;
		potencia =100;
		double porcentImpuesto=60;
		return impuesto+(potencia*porcentImpuesto/den);
		}
	
}