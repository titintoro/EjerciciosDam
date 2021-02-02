package ejemplo1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Crear un objeto
		
		Persona p1=new Persona("Ángel", 44, 1.83);
		
		System.out.println("La persona se llama "+p1.nombre);
		System.out.println("Tiene " +p1.edad +" años");
		System.out.println("Mide "+ p1.altura);
		
		
		
		
		
/* Ejemplo de introducir a la persona por teclado:

		
package ejemplo1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 String nombreTeclado;
		 int edadTeclado;
		 double alturaTeclado;
		 int resultado;
		 	System.out.println("Diga nombre");
		nombreTeclado=Leer.dato();
		System.out.println("Diga edad");
		nombreTeclado=Leer.datoInt();
		System.out.println("Diga altura");
		nombreTeclado=Leer.datoDouble();
		
		Persona p1= new Persona (nombreTeclado,edadTeclado,alturaTeclado);
		
		System.out.println("La persona se llama "+p1.nombre);
		System.out.println("Tiene " +p1.edad +" años");
		System.out.println("Mide "+ p1.altura);
	
		resultado=p1.calcularEdadDias();
		System.out.println("Tiene " +resultado +" días");




		
		
		
		
		
		
		*/
	}

}
