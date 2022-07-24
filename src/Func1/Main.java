/*
Crea una aplicación que nos calcule el área de un circulo, cuadrado o triangulo.
Pediremos que figura queremos calcular su área y según lo introducido pedirá los valores necesarios
para calcular el área. Crea un método por cada figura para calcular cada área, este devolverá un número real.
Muestra el resultado por pantalla

Aquí te mostramos que necesita cada figura:

Circulo: (radio^2)*PI
Triangulo: (base * altura) / 2
Cuadrado: lado * lado
 */


package Func1;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        double base, altura, lado, radio, area;

        int figura = Integer.parseInt(JOptionPane.showInputDialog("Escribe el número de la figura " +
                "a la que quieres calcular el área: \n 1.Triángulo \n 2.Cuadrado \n 3.Círculo"));

        if(figura == 1){

            base = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la medida de la base"));
            altura = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la medida de la altura"));

            area = (base*altura)/2;

            JOptionPane.showMessageDialog(null, "El área del triángulo es: "+area);

        }else if(figura == 2){

            lado = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la medida del lado"));

            area = (lado*lado);

            JOptionPane.showMessageDialog(null, "El área del cuadrado es: "+area);

        }else if(figura == 3){

            radio = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la medida del radio"));

            area = Math.PI*Math.pow(radio,2);

            JOptionPane.showMessageDialog(null, "El área del círculo es: "+area);

        }else{

            JOptionPane.showMessageDialog(null, "No es una figura válida");
        }

    }


}

