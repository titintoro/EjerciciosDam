package examen;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Producto p;
		String nombreT;
		double precioBaseT;
		int seccionT, reb, uno=1;
		boolean rebajadoT;
		double pvpT	;
		System.out.println("Diga nombre");
		nombreT=Leer.dato();
		System.out.println("Diga precio Base");
		precioBaseT=Leer.datoDouble();
		System.out.println("Diga seccion del producto");
		seccionT=Leer.datoInt();
		System.out.println("Diga 1 si es rebajado o 2 si no");
		reb=Leer.datoInt();
		if (reb==uno) {
			rebajadoT=true;
		}
		else {
			rebajadoT=false;
			
		}
		p= new Producto (nombreT,precioBaseT,seccionT,rebajadoT);
		
		System.out.println(p);
		
		
	}

}
