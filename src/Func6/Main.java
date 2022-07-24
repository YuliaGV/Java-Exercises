/* Crea una aplicación que nos cuente el número de cifras de un número entero positivo (hay que controlarlo) pedido por teclado.
Crea un método que realice esta acción, pasando el número por parámetro, devolverá el número de cifras.
 */


package Func6;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        int numero;
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número positivo"));
        }while(numero<0);

        JOptionPane.showMessageDialog(null, "El número ingresado tiene "+contarCifras(numero)+" cifra(s)");

    }

    public static int contarCifras(int numero){

        int cantidadCifras = 0;

        for(int i=numero; i>0; i/=10){
            cantidadCifras++;
        }

        return cantidadCifras;


    }



}
