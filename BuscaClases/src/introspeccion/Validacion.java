package introspeccion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Validacion {
    private static Class NombreClase;
    private static Package pack[]=Package.getPackages();
    private static List<String> listaNombres=new ArrayList<String>();

    public static Class getNombreClase() {
        return NombreClase;
    }

    public static void setNombreClase(Class nombreClase) {
        NombreClase = nombreClase;
    }

    public static List<String> getListaNombres() {
        return listaNombres;
    }

    public static void setListaNombres(List<String> listaNombres) {
        Validacion.listaNombres = listaNombres;
    }

    public static int confirmarClase(String nombre){
        int i=0;
        for(Package elemento:pack){
            String str=elemento.getName();
            str=str.replace("package","");
            str=str.split(",")[0]+".";
            try{
                System.out.println(str);
                Class c=Class.forName(str+nombre);
                System.out.println(c.getCanonicalName());
                listaNombres.add(c.getCanonicalName());
                i++;
            }
            catch(ClassNotFoundException exception){
                System.out.println("No existe la clase.");
            }
        }
        System.out.println(i);
        return i;

    }

}
