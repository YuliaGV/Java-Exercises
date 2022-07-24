/*
 Pedir números al usuario y cuando el usuario meta un -1 se terminará el programa.
Al terminar, mostrará lo siguiente:
– mayor numero introducido
– menor numero introducido
– suma de todos los numeros
– suma de los numeros positivos
– suma de los numeros negativos
– media de la suma

El número -1 no contara como número.
 */


package Basic12;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        int menorNumero = 0;
        int mayorNumero = 0;

        int contador = 0;

        int sumaTotal = 0;
        int sumaPositivos = 0;
        int sumaNegativos = 0;

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número"));


        while(numero != -1) {

            contador++;

            sumaTotal += numero;

            if(numero < menorNumero){
                menorNumero = numero;
            }

            if(numero > menorNumero) {
                mayorNumero = numero;
            }

            if(numero > 0){
                sumaPositivos += numero;
            }else{
                sumaNegativos += numero;
            }

            numero =  Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número"));
        }


        System.out.println("El menor número introducido es: "+menorNumero);
        System.out.println("El mayor número introducido es: "+mayorNumero);
        System.out.println("El total es: "+sumaTotal);
        System.out.println("El total de positivos es: "+sumaPositivos);
        System.out.println("El total de negativos es: "+sumaNegativos);
        System.out.println("La media es: "+sumaTotal/contador);
    }






}
