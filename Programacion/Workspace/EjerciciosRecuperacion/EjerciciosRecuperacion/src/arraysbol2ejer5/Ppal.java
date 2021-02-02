package arraysbol2ejer5;

import java.util.Random;

import utilidades.Leer;

public class Ppal {

	public static void main(String[] args) {
		/*
		  Crear un programa que realice lo siguiente:
		  
		  	Solicitar al usuario que introduzca por teclado el tamaño del array. •
		  	Declarar y definir el array de enteros. • Rellenar el array mediante números
		  	aleatorios entre los dos valores que diga el usuario. • Mostrar por pantalla
		  	la suma de todos los elementos. • Mostrar el mayor y el menor guardados en el
		  	array
		 */

		int tam = 0, ale, desde, hasta, suma = 0, mayor=0, menor=0;

		int[] enteros;

		Random r;
		r = new Random(System.nanoTime());

		System.out.println("¿Cuantos números quieres?");
		tam = Leer.datoInt();
		enteros = new int[tam];

		System.out.println("Ingresa el numero mínimo");
		desde = Leer.datoInt();

		System.out.println("Ingresa el tope");
		hasta = Leer.datoInt();

		for (int i = 0; i < enteros.length; i++) {

			ale = r.nextInt((hasta - desde) + 1) + desde;
			enteros[i] = ale;
		}

		for (int i = 0; i < enteros.length; i++) {

			suma = suma + enteros[i];
		}

		System.out.println("La suma de todos los enteros es " + suma);

	

		for (int i = 0; i < enteros.length; i++) {
			
			mayor=enteros[i];
			menor=enteros[i];
			
			if (enteros[i] <= mayor) {
				menor = enteros[i];
				mayor = enteros[i];
			}
		}
		System.out.println("El número menor es " + menor);

	

		for (int i = 0; i > enteros.length; i++) {
			
			mayor=enteros[i];
			menor=enteros[i];
			if (enteros[i] >= menor) {
				mayor = enteros[i];
				menor = enteros[i];
			}
		}

		System.out.println("El número mayor es " + mayor);

	}
}
