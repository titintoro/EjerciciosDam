package ejemplodepredador;

public interface IDepredador {
	// Sólo pueden contener constantes o métodos abstractos,
	// los métodos son todos abstractos y no hace falta poner la palabra abstract
	
	void localizar (Animal presa);
	void cazar (Animal presa);
}
