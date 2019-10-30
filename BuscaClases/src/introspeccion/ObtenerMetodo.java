package introspeccion;
import java.lang.reflect.Method;
import java.util.List;
import java.util.ArrayList;

public class ObtenerMetodo {
    public static ArrayList obtenerMetodos() {
        try {
            Class ClaseObjeto = Validacion.getNombreClase();

            Method[] methods = ClaseObjeto.getMethods();

            ArrayList<List> listaMetodos = new ArrayList<List>();

            for (Method method : methods) {
                List<String> lista = new ArrayList<String>();
                String parametro = "";
                String tipo = method.getReturnType().toString();
                Class[] parametros = method.getParameterTypes();
                for (Class elemento:parametros) {
                    parametro = parametro + elemento.toString() + ", ";
                }
                if (parametro.length() > 1) {
                    parametro = parametro.substring(0, parametro.length()-2);
                }
                lista.add(tipo);
                lista.add(method.getName());
                lista.add(parametro);
                String MethodName = method.getName();
                System.out.println(lista);
                listaMetodos.add(lista);
            }
            return listaMetodos;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
