package introspeccion;

import java.util.ArrayList;
import java.util.List;

public class ObtenerInterfaces {
    public static List conseguirInterfaz(){
        Class NombreClase=Validacion.getNombreClase();
        Class[] interfaces=NombreClase.getInterfaces();
        Class superclase=NombreClase.getSuperclass();
        Class[] superInterfaz=superclase.getInterfaces();
        List<String>listaInterfaces=new ArrayList<String>();
        for (Class elemento:interfaces){
            listaInterfaces.add(elemento.getSimpleName()+"<"+NombreClase.getSimpleName()+">");
        }
        for (Class elemento:superInterfaz){
            listaInterfaces.add(elemento.getSimpleName());
        }
        System.out.println(listaInterfaces);
        return listaInterfaces;
    }
}
