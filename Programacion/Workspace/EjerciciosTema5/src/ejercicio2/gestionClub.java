package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class gestionClub {

	private List<Socio> listSocios;

	public gestionClub(List<Socio> listSocios) {
		super();
		this.listSocios = listSocios;
	}

	public List<Socio> getListSocios() {
		return listSocios;
	}

	public void setListSocios(List<Socio> listSocios) {
		this.listSocios = listSocios;
	}

	@Override
	public String toString() {
		return "gestionClub [listSocios=" + listSocios + "]";
	}

	public void agregarSocio(Socio socio) {
		listSocios.add(socio);
	}

	public int buscarSocios(String dni) {
		int temp = -1;
		boolean salir = false;

		for (int i = 0; i < listSocios.size() && !salir; i++) {
			if (listSocios.get(i).getDni().equalsIgnoreCase(dni)) {
				temp = i;
				salir = true;
			}
		}
		return temp;
	}

	public void modificarSocios(String dni, String nombreNuevo) {

		int index = buscarSocios(dni);

		if (index >= 0) {

			listSocios.get(index).setNombre(nombreNuevo);
		}
	}
	
	
	public void borrarSocios(String dni) {
		int index = buscarSocios(dni);

		if (index >= 0) {
			listSocios.remove(index);
		}
	}
	
	
	public void mostrarErrorAgregar (boolean b) {
		if (b){
			System.out.println("Se ha agregado el Socios correctamente");
		}else {
			System.out.println("Error al insertar");
		}
		
				
	}
}
