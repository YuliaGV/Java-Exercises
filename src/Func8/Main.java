/*
Calcular edad ingresando la fecha de nacimiento de una persona.
 */

package Func8;

import javax.swing.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {

        String fechaN = JOptionPane.showInputDialog("Ingresa tu fecha de nacimiento en el formato dd-MM-yyyy");

        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");

        Date fechaNacimiento = formato.parse(fechaN);
        Date hoy = new Date();


        int milisecondsByDay = 86400000;
        int edad = (int) (( (hoy.getTime()-fechaNacimiento.getTime() ) / milisecondsByDay) /365);

        JOptionPane.showMessageDialog(null, "Tienes "+edad);


    }


}
