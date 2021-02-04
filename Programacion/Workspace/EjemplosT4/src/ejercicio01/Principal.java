package ejercicio01;

public class Principal {

	public static void main(String[] args) {
		
		int capDiscoDuro = 500000;
		int frecProcesador = 1000000;
		int memoriaRam = 32;
		double precioBase = 500;
		int mgCamaraTrasera = 18;
		int mgCamaraFrontal = 13;
		
		double ganancia = 20;
		double seguro = 50;
		double oferta = 20;
		
		Ordenador o = new Ordenador (capDiscoDuro, frecProcesador, memoriaRam, precioBase);
		Tablet t = new Tablet (capDiscoDuro, frecProcesador, memoriaRam, precioBase, mgCamaraTrasera, mgCamaraFrontal);
		Portatil p = new Portatil (capDiscoDuro, frecProcesador, memoriaRam, precioBase, mgCamaraFrontal);
		
		System.out.println("Bienvenido al programa que le ayudará a saber el precio los distintos dispositivos a la venta"
				+ "disponibles en nuestra tienda.");
		System.out.println("______________________________________________________________________________________________\n\n");
		
		
		
		System.out.println("El precio de su ordenador es de " + o.CalcularPrecioVentaPublico(ganancia, seguro, oferta) + " €");
		
		System.out.println("\nEl precio de su tablet más el seguro de rotura de pantalla  es " + t.CalcularPrecioVentaPublico(ganancia, seguro, oferta) + " €");
		
		System.out.println("\nEl precio con descuento por el Black Friday de su portátil es de " + p.CalcularPrecioVentaPublico(ganancia, seguro, oferta) + " €");
		
		
	}

}
