/*
Crea una aplicación que nos pida un número por teclado y con un método se lo pasamos por parámetro para que nos indique
si es o no un número primo, debe devolver true si es primo sino false.
Un número primo es aquel solo puede dividirse entre 1 y si mismo. P
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
Un buen truco para calcular la raíz cuadrada del numero e ir comprobando que si es divisible desde ese numero hasta 1.
 */


package Func3;

import javax.swing.*;

public class Main {


    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número entero"));
        if(esPrimo(numero)){
            JOptionPane.showMessageDialog(null,"El número "+numero+" es primo");
        }else{
            JOptionPane.showMessageDialog(null,"El número "+numero+" no es primo");
        }


    }

    public static boolean esPrimo(int numero){

        for(int i=2; i<Math.sqrt(numero); i++){
            if(numero % i == 0){
                return false;
            }
        }

        return true;
    }


}
