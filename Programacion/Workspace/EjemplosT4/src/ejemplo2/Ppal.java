package ejemplo2;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Documento d= new Documento ();
		TarjetaDeVisita t= new TarjetaDeVisita();
		Carta c= new Carta();
		
		System.out.println(d.ImprimirDocumento());
		System.out.println(t.ImprimirDocumento());
		System.out.println(c.ImprimirDocumento());
	}

}
