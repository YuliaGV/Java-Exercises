/*
Crea una aplicación que nos genere una cantidad de números enteros aleatorios que nosotros le pasaremos por teclado.
Crea un método donde pasamos como parámetros entre que números queremos que los genere,
podemos pedirlas por teclado antes de generar los números. Este método devolverá un número entero aleatorio.
Muestra estos números por pantalla.
 */


package Func2;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        int  numeroInicio = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer número"));
        int  numeroFin = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo número"));

        int cantidadNumeros = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos números quieres generar?"));

        for(int i=0; i<cantidadNumeros; i++){
            System.out.println(generarNumero(numeroInicio, numeroFin));
        }


    }

    public static int generarNumero(int inicio, int fin){

        return (int)(Math.random()*(fin-inicio+1)+inicio);

    }



}
