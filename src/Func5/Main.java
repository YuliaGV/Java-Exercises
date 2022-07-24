/*
Crea una aplicación que nos convierta un número en base decimal a binario.
Esto lo realizara un método al que le pasaremos el numero como parámetro, devolverá un String con el numero convertido a binario.
Para convertir un numero decimal a binario, debemos dividir entre 2 el numero
y el resultado de esa división se divide entre 2 de nuevo hasta que no se pueda dividir mas,
el resto que obtengamos de cada división formara el numero binario, de abajo a arriba.

Veamos un ejemplo: si introducimos un 8 nos deberá devolver 1000
 */

package Func5;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número decimal"));
        JOptionPane.showMessageDialog(null, "El binario es: "+convertirDecimalABinario(numero));

    }

    public static String convertirDecimalABinario(int numero){

        StringBuilder resultado = new StringBuilder();

        while(numero>0){
            String residuo = String.valueOf(numero%2);
            resultado.insert(0, residuo);
            numero /= 2;
        }
        return resultado.toString();

    }

}
