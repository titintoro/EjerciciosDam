package ejercicio02;

public class Principal {

	public static void main(String[] args) {
		Carta c = new Carta ();
		TarjetaVisita t = new TarjetaVisita ();
		
		t.ImprimirDocumento();
		
		System.out.println("\n\n");
		
		c.ImprimirDocumento();

	}

}
