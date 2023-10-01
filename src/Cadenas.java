
import java.util.Scanner;

public class Cadenas {

    public static void main(String[] args) {
        //Digito la cadena para el ejercicio
        Scanner scanner = new Scanner(System.in);

        //Solicitar al usuario digitar la cadena
        System.out.println("\nPor favor digita una cadena de caracteres: ");

        //Leo la candena digitada por el usuario
        String cadena = scanner.nextLine();
        System.out.println("\n La cadena digitada es : " + cadena);

        // 1. Usando length() para obtener la longitud de la cadena
        int longitud = cadena.length();
        System.out.println("\n Longitud de la cadena: " + longitud);

        // 2. Usando substring() para extraer una subcadena
        String subcadena = cadena.substring(0, 4);
        System.out.println("\n Subcadena: " + subcadena);

        // 3. Usando charAt() para acceder a caracteres individuales
        char primerCaracter = cadena.charAt(0);
        System.out.println("\n Primer carácter: " + primerCaracter);
    }
}
