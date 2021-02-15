package ejercicio03;

public class VehiculoAMotor {

	protected int impuesto=100;

	public int getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(int impuesto) {
		this.impuesto = impuesto;
	}

	public VehiculoAMotor(int impuesto) {
		super();
		this.impuesto = impuesto;
	}

	@Override
	public String toString() {
		return "VehiculoAMotor [impuesto=" + impuesto + "]";
	}
	
	
}
