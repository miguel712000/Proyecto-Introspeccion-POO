package introspeccion;


import java.util.ArrayList;
import java.util.List;



public class ObtenerJerarquia {
	
	public static List ObtenerJerarquia() {
		Class C = Validacion.getNombreClase();
		List<String> lista = new ArrayList<String>();
		while (C != null) {
			System.out.println(C.getName());
			lista.add(C.getName());
			C = C.getSuperclass();
		}
		System.out.println(lista);
		return lista;
	}
}
