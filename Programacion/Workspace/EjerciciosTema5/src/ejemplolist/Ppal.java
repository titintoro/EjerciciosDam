package ejemplolist;
import java.util.ArrayList;
import java.util.List;
public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	NOSOTROS NO LO HACEMOS ASI
		ArrayList <String>lista = new ArrayList <String>();
		
		//LO HAREMOS ASI
		List <String>listadoBueno= new ArrayList <String> ();
		
		listadoBueno.add("Titin");
		listadoBueno.add("Moi");
		listadoBueno.add("Lolo");
		
		System.out.println(listadoBueno);
	}

}
