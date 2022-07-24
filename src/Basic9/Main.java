/*
-Crea un enum con los días de la semana, pide un día de la semana e indica si es laboral o no (en el main).

 */


package Basic9;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        enum dias{
            DOMINGO, LUNES, MARTES, MIÉRCOLES, JUEVES, VIERNES, SÁBADO
        }

        String diaSemana = JOptionPane.showInputDialog("Ingresa un día de la semana");

        dias listaDias = dias.valueOf(diaSemana.toUpperCase());

        switch(listaDias){
            case LUNES:
            case MARTES:
            case MIÉRCOLES:
            case JUEVES:
            case VIERNES:
                JOptionPane.showMessageDialog(null, "El día "+listaDias.name().toLowerCase()+" es laborable");
                break;
            case SÁBADO:
            case DOMINGO:
                JOptionPane.showMessageDialog(null, "El día "+listaDias.name().toLowerCase()+" no es laborable" );
                break;
        }

        /*Parte 2 */



    }

}
