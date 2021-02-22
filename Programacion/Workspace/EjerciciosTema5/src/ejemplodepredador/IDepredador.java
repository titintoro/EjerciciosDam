package ejemplodepredador;

public interface IDepredador {
	// S�lo pueden contener constantes o m�todos abstractos,
	// los m�todos son todos abstractos y no hace falta poner la palabra abstract
	
	void localizar (Animal presa);
	void cazar (Animal presa);
}
