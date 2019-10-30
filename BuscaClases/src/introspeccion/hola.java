package introspeccion;

import java.util.Scanner;

public class hola {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
    }
    public static void main(String[] args){
        String nomb="";
        Scanner entrada= new Scanner(System.in);
        System.out.println("Clase: ");
        nomb=entrada.nextLine();
        System.out.println(confirmarClase(nomb));
    }

}
