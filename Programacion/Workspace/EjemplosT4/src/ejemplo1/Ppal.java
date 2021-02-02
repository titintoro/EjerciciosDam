package ejemplo1;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Trabajador t= new Trabajador ("Ángel", "Jefe sección", null, null, null);
		Empleado e= new Empleado ("Pepe", "Informático", null, null, null, 1200.0 ,20);
		
		Consultor c= new Consultor ("Miguel", "Asistente", null, null, null, 0, 0.0);
		
		
		System.out.println(t.CalcularPaga());
		System.out.println(e.CalcularPaga());
		
	}

}
