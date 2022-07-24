/*
Crea una aplicación llamada CalculadoraPolacaInversaApp, nos pedirá 2 operandos (int) y un signo aritmético (String),
según este último se realizara la operación correspondiente. Al final mostrara el resultado en un cuadro de dialogo.
Los signos aritméticos disponibles son:

+: suma los dos operandos.
-: resta los operandos.
*: multiplica los operandos.
/: divide los operandos, este debe dar un resultado con decimales (double)
^:  1º operando como base y 2º como exponente.
%:  módulo, resto de la división entre operando1 y operando2.
 */



package Basic8;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        int operando1  = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer operando"));
        int operando2  = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo operando"));
        String signo = JOptionPane.showInputDialog("Ingresa el signo");

        JOptionPane.showMessageDialog(null, CalculadoraPolacaInversaApp(operando1,operando2,signo));

    }

    public static double CalculadoraPolacaInversaApp(int operando1, int operando2, String signo){

        double resultado = 0;
        switch(signo){
            case "+":
                resultado =  operando1 + operando2;
                break;
            case "-":
                resultado =  operando1 - operando2;
                break;
            case "*":
                resultado =  operando1 * operando2;
                break;
            case "/":
                resultado =  operando1 / operando2;
                break;
            case "^":
                resultado = Math.pow(operando1, operando2);
            case "%":
                resultado = operando1 % operando2;
        }
        return resultado;

    }



}
