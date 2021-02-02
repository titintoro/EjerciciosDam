package examen;

public class Producto {

	 //Los nombres de los atributos empiezan en minuscula, a los atributos no se les da valor inicial
	String nombre;
	double precioBase;
	int seccion;
	boolean rebajado;
	double pvp;
	
	//Constructores
	
	public Producto(String nombre, double precioBase, int seccion, boolean rebajado, double pvp) {
		super();
		this.nombre = nombre;
		this.precioBase = precioBase;
		this.seccion = seccion;
		this.rebajado = rebajado;
		this.pvp = pvp;}
	
		public Producto(String nombre, double precioBase, int seccion, boolean rebajado) {
			super();
			this.nombre = nombre;
			this.precioBase = precioBase;
			this.seccion = seccion;
			this.rebajado = rebajado;
			
	
	
	
	
	
}}
