public class Cadenas {

    public static void main(String[] args) {
        String cadena = "Hola, mundo!";
        
        // Usando length() para obtener la longitud de la cadena
        int longitud = cadena.length();
        System.out.println("Longitud de la cadena: " + longitud);

        // Usando substring() para extraer una subcadena
        String subcadena = cadena.substring(0, 4);
        System.out.println("Subcadena: " + subcadena);

        // Usando equals() para comparar cadenas
        String otraCadena = "Hola, mundo!";
        boolean sonIguales = cadena.equals(otraCadena);
        System.out.println("Las cadenas son iguales: " + sonIguales);

        // Usando equalsIgnoreCase() para comparar cadenas sin distinguir mayúsculas y minúsculas
        String mayusculas = "HOLA, MUNDO!";
        boolean sonIgualesIgnoreCase = cadena.equalsIgnoreCase(mayusculas);
        System.out.println("Las cadenas son iguales (sin distinción de mayúsculas y minúsculas): " + sonIgualesIgnoreCase);

        // Usando charAt() para acceder a caracteres individuales
        char primerCaracter = cadena.charAt(0);
        System.out.println("Primer carácter: " + primerCaracter);

        // Usando split() para dividir la cadena en partes
        String[] partes = cadena.split(",");
        System.out.println("Parte 1: " + partes[0]);
        System.out.println("Parte 2: " + partes[1]);

        // Usando compareTo() para comparar lexicográficamente cadenas
        String otraCadena2 = "Adiós, mundo!";
        int comparacion = cadena.compareTo(otraCadena2);
        if (comparacion < 0) {
            System.out.println("La cadena es menor que otraCadena2");
        } else if (comparacion > 0) {
            System.out.println("La cadena es mayor que otraCadena2");
        } else {
            System.out.println("La cadena es igual a otraCadena2");
        }
    }
}
