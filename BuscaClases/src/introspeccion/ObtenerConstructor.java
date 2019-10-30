package introspeccion;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

public class ObtenerConstructor {

    public static List conseguirConstructor(){
        Class NombreClase=Validacion.getNombreClase();
        List<String>listaConstructores=new ArrayList<String>();
        Constructor[] declararConstructores=NombreClase.getDeclaredConstructors();
        for (int i=0;i<declararConstructores.length;i++){
            listaConstructores.add(declararConstructores[i].toString());
        }
        System.out.println(listaConstructores);
        return listaConstructores;

    }
}
