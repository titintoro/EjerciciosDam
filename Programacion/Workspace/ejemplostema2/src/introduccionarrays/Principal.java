package introduccionarrays;

import Utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] edades;
		int tam;
		System.out.println("Hola");
		System.out.println("Cuántas edades va a insertar");
		tam=Leer.datoInt();
		edades=new int [tam];
		
		for (int i = 0; i < edades.length; i++) {
			System.out.println("Introduce una edad:");
		edades[i]=Leer.datoInt();
		}
		for (int i = 0; i < edades.length; i++) {
		System.out.println("Las edades son: "+ edades[i]);
		}

		int tam2=15;
		int [] listado;
		System.out.println("¿Qué tamaño quiere?");
		tam=Leer.datoInt();
		listado=new int [tam2];
		
	//forma de inicializar directamente con datos
		//Solo la primera vez
		
		double [] listaPrecios= {2.3,4.5,8.9};
		
		//Cargar el array
		
		for (int i=0; i < listado.length; i++) {
			listado[i]=Leer.datoInt();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}