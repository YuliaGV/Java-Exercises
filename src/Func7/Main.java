/*
Crea un aplicación que nos convierta una cantidad de euros introducida por teclado a otra moneda,
estas pueden ser a dolares, yenes o libras.
El método tendrá como parámetros, la cantidad de euros y la moneda a pasar que sera una cadena,
este no devolverá ningún valor, mostrara un mensaje indicando el cambio (void).
El cambio de divisas son:

0.86 libras es un 1 €
1.28611 $ es un 1 €
129.852 yenes es un 1 €
 */


package Func7;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        double dinero = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la cantidad de euros a convertir"));
        String moneda = JOptionPane.showInputDialog("Ingresa la moneda a la que quieres convertir");
        convertirMonedas(dinero, moneda);

    }

    public static void convertirMonedas(double euros, String moneda){

        double resultado;

        switch (moneda.toUpperCase()){
            case "DOLARES":
                resultado = euros*1.28;
                System.out.println("La cantidad ingresada equivale a: "+resultado+ " dolares");
                break;
            case "YENES":
                resultado = euros*129.8;
                System.out.println("La cantidad ingresada equivale a: "+resultado+ " yenes");
                break;
            case "LIBRAS":
                resultado = euros*0.86;
                System.out.println("La cantidad ingresada equivale a: "+resultado+ " libras");
                break;
            default:
                System.out.println("Moneda no válida");
        }
    }

}
