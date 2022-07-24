/*Pide un número por teclado e indica si es un número primo o no.
Un número primo es aquel solo puede dividirse 1 y si mismo.
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
Un buen truco para calcular la raíz cuadrada del numero e ir comprobando que si es divisible desde ese numero hasta 1.
NOTA: Si se introduce un numero menor o igual que 1, directamente es no primo.

Muestra los números primos entre 1 y 100
 */


package Basic6;

import javax.swing.*;

public class Main {


    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número"));

        if(numero<=1){
            JOptionPane.showMessageDialog(null, "Este número no es primo");
        }else{

            boolean existeDivisor = false;
            for(int i=2; i<= Math.sqrt(numero); i++){
                if(numero%i == 0){
                    existeDivisor = true;

                }
            }
            if(!existeDivisor){
                JOptionPane.showMessageDialog(null, "Es primo");
            }else{
                JOptionPane.showMessageDialog(null, "No es primo");
            }

        }

        //Parte 2

        System.out.println("Números primos entre 1 y 100");

        for(int i=1; i<=100; i++){
            boolean divisorEncontrado = false;
            for(int j= 2; j <= Math.sqrt(i); j++ ){
                if(i%j == 0){
                    divisorEncontrado = true;
                }
            }
            if(!divisorEncontrado){
                System.out.println(i);
            }
        }



    }





}
