package ejemplodepredador;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal a= new Animal ("León",1);
		Animal presa= new Animal ("Gacela",0);
		a.cazar(presa);
	}

}
