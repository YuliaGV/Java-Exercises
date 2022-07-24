/*
Realiza una aplicación que nos calcule una ecuación de segundo grado.
Debes pedir las variables a, b y c por teclado
y comprobar antes que el discriminante (operación en la raíz cuadrada) sea mayor a 0.
 */


package Basic3;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        double a, b, c;

        String entrada = JOptionPane.showInputDialog("Ecuación de la forma ax² + bx + c = 0. Ingresa los valores de a, b y c separados por comas");

        String[] valores = entrada.split(",");

        a = Double.parseDouble(valores[0].trim());
        b = Double.parseDouble(valores[1].trim());
        c = Double.parseDouble(valores[2].trim());

        double radicando = Math.pow(b, 2) - 4*a*c;

        if(radicando >= 0){

            double x1 = (-b + Math.sqrt(radicando) )/(2*a);

            double x2 = (-b - Math.sqrt(radicando) )/(2*a);


            JOptionPane.showMessageDialog(null, "x1: "+x1+" x2: "+x2);

        }



    }


}
