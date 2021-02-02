package ejemplo1;

import java.util.Random;

import utilidades.Leer;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op;
		int tam=4, hasta, desde;
		Random r=new Random (System.nanoTime());
		int [] lista2;
		//Cómo se declara un array
		
		//Forma 1 
		int [] lista1= new int [tam];
		
		//Forma 2, mejor
		lista2=new int [tam];
		
		//Forma 3, dando valores inicialmente, 
		//solo se puede hacer la primera vez que se declare el array
		int []lista3 = {3,2,6,7,8,9};
		
		
		
		do {
		
			System.out.println("Bienvenido");
			System.out.println("Pulse:");
			System.out.println("1. Para rellenar");
			System.out.println("2. Para rellenar con aleatorios");
			System.out.println("0. Para salir");
		op=Leer.datoInt();
		
		switch (op) {
			
			case 1:
				//Nunca ponemos el tamaño en la salida del array ponemos o usamos el nombre nombreArrays.lenght
				for (int i = 0; i < lista1.length; i++) {
				lista1 [i]=Leer.datoInt();
				}
				break;
			case 2:
				
				for (int i = 0; i < lista1.length; i++) {
					lista1[i]=r.nextInt (hasta-desde+1)+desde;
				}
					lista1 [i]=Leer.datoInt();
				break;
			case 0:
				
				break;
			default:
				System.out.println("Opción incorrecta");
				break;
		}
		
		} while	(op!=0);
	}

}
