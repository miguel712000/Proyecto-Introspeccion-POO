package introspeccion;

import java.util.List;
import java.lang.reflect.*;
import java.util.ArrayList;


public class ObtenerAtributo {
	
	public static ArrayList ObtenerAtributo(Class NombreClase) {
		return inspect(NombreClase);
	}
	
	static<T> ArrayList inspect(Class<T> nombreClase) {
		ArrayList<List> atributos = new ArrayList<List>();
		Field[] fields = nombreClase.getDeclaredFields();
		System.out.printf("%d fields: %n",fields.length);
		for (Field field : fields) {
			List<String> lista = new ArrayList<String>();
			lista.add(Modifier.toString(field.getModifiers()));
			lista.add(field.getType().getSimpleName().toString());
			lista.add(field.getName().toString());
			System.out.println(lista);
			atributos.add(lista);
			
		}
		System.out.println(atributos);
		return atributos;
		
	}
}
