package ejemplo1;

public class Persona {
	
	//Atributos, no le damos valores iniciales
	
	String nombre;
	int edad;
	double altura;
	

	//Constructores
	public Persona (String nombre, int edad, double altura) {
		this.nombre=nombre;
		this.edad=edad;
		this.altura=altura;
	}
	
	public Persona (String nombre, int edad) {
		this.nombre=nombre;
		this.edad=edad;}
	
	//M�TODOS: trozos de c�digo que hacen una sola cosa

	//public tipo devoluci�n nombre (par�metros)

	//Versi�n 1, sin darle nada:

	public int calcularEdadDias () {

			int diasAnyo=365;
			int resul=0;
			resul=edad*diasAnyo;
			return resul;
	}	
			
	//Versi�n 2:Dando la edad desde fuera
			
			public int calcularEdadDiasV2(int edad) {
				int diasAnyo=365;
				int resul=0;
				resul=edad*diasAnyo;
				return resul;
			}}
