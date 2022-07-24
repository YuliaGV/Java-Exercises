/*
Crea una aplicación que nos calcule el factorial de un número pedido por teclado,
lo realizara mediante un método al que le pasamos el número como parámetro.
Para calcular el factorial, se multiplica los números anteriores hasta llegar a uno.
Por ejemplo, si introducimos un 5, realizara esta operación 5*4*3*2*1=120.
 */

package Func4;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        int numeroIngresado = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número entero positivo"));
        System.out.println(factorial(numeroIngresado));


    }

    public static int factorial(int numero){
        if(numero == 0){
            return 1;
        }else{
            int resultado = numero;
            for(int i = numero-1; i>0; i--){
                resultado *= i;
            }
            return resultado;
        }



    }

}
