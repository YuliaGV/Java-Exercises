/*
1. Pide por teclado dos número y genera 10 números aleatorios entre esos números.
Usa el método Math.random para generar un número entero aleatorio (recuerda el casting de double a int).


2. Pide por teclado un número entero positivo (debemos controlarlo) y muestra  el número de cifras que tiene.
 Por ejemplo: si introducimos 1250, nos muestre que tiene 4 cifras. Tendremos que controlar si tiene una o mas cifras,
 al mostrar el mensaje.
 */



package Basic5;

import javax.swing.*;

public class Main {


    public static void main(String[] args) {

        /*Ejercicio 1*/

        int numeroA = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer numero"));

        int numeroB = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo numero"));

        for (int i=0;i<10;i++){
            double randomNum =  Math.round((Math.random() * ( numeroB  - numeroA ) + numeroA));
            System.out.println(randomNum);
        }


        /*Ejercicio 2*/

        int numeroC = Math.abs(Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero")));

        int contador = 0;

        while(numeroC > 0){
            numeroC /=10;
            contador++;
        }
        JOptionPane.showMessageDialog(null, "El numero ingresado tiene "+contador+" cifras");












    }





}
