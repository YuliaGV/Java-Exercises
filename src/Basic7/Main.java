/*
Del siguiente String «La lluvia en Sevilla es una maravilla» cuenta cuantas vocales hay en total
(recorre el String con charAt)

Reemplaza todas las a del String anterior por una e.

Recorre el String del ejercicio 22 y transforma cada carácter a su código ASCII.
Muestralos en linea recta, separados por un espacio entre cada carácter.
 */


package Basic7;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        String frase = "La lluvia en Sevilla es una maravilla";

        String [] vocals = new String[]{"a","e","i","o","u"};


        int contadorVocales = 0;

        for(int i=0; i < frase.length(); i++) {
            if (Arrays.asList(vocals).contains(Character.toString(frase.charAt(i)))) {
                contadorVocales++;
            }

        }
        System.out.println("La frase 'La lluvia en Sevilla es una maravilla' contiene "+contadorVocales+" vocales");


        /*Parte 2*/

        String nuevaFrase = frase.replaceAll("[a|i|o|u]","e");

        System.out.println(nuevaFrase);

        /*Parte 3*/

        String fraseASCII = "";

        for(int i=0; i<frase.length(); i++){
            fraseASCII = fraseASCII + String.valueOf( (int)(frase.charAt(i))  ) + " ";
        }
        System.out.println(fraseASCII);


    }


}
