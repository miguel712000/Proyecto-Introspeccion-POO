package introspeccion;
import java.util.ArrayList;
import java.util.List;

public class ObtenerJerarquia {
    public static List conseguirJerarquia() {
        Class C = Validacion.getNombreClase();
        List<String> listaJerarquia = new ArrayList<String>();
        while (C != null) {
            System.out.println(C.getName());
            listaJerarquia.add(C.getName());
            C = C.getSuperclass();
        }
        System.out.println(listaJerarquia);
        return listaJerarquia;
    }

}
