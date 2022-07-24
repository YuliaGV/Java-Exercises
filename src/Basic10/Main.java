/*Enum para indicar que un día es laborable o no directamente */


package Basic10;

import javax.swing.*;

public class Main {


    public enum dias {

        LUNES(true),
        MARTES(true),
        MIÉRCOLES(true),
        JUEVES(true),
        VIERNES(true),
        SABADO(false),
        DOMINGO(false);

        private boolean laborable;

        private dias(boolean laborable){
            this.laborable = laborable;
        }

        @Override
        public String toString() {

            if(laborable){
                return "El día "+ this.name().toLowerCase() +" es laborable";
            }else{
                return "El día "+  this.name().toLowerCase() +" no es laborable";
            }

        }
    }

    public static void main(String[] args) {

        String dia = JOptionPane.showInputDialog("Ingresa un día de la semana");

        dias diaSemana = dias.valueOf(dia.toUpperCase());

        JOptionPane.showMessageDialog(null, diaSemana.toString());


    }




}
