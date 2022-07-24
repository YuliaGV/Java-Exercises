/*Realiza una aplicación que nos pida un número de ventas a introducir,
 después nos pedirá tantas ventas por teclado como número de ventas se hayan indicado.
  Al final mostrara la suma de todas las ventas.
 */


package Basic2;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        int cantidadVentas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de ventas"));

        double totalVentas = 0;

        for(int i=1; i<cantidadVentas+1; i++){
            double venta = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la venta # "+i) );
            totalVentas += venta;
        }

        JOptionPane.showMessageDialog(null, "Total de ventas: "+totalVentas);





    }




}
