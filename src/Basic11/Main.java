/*
Crea el enum Mes, que contenga como parametros el orden(1,2,3,etc) y el numero de dias (febrero tendra 28 dias siempre).
Estos datos pueden pedirse por separado, asi que tienes que hacer sus respectivos get. No son necesarios los setters.
Create un arrays de Mes (mirate la funcion values),
pide un numero por teclado e indica que meses tienen ese numero de dias (toda su informacion).
Por ejemplo, si escribes un 28, este te devolvera la informacion de FEBRERO.
 */



package Basic11;

import javax.swing.*;

public class Main {

    public enum meses {

        ENERO(1,31),
        FEBRERO(2,28),
        MARZO(3,31),
        ABRIL(4,30),
        MAYO(5,31),
        JUNIO(6,30),
        JULIO(7,31),
        AGOSTO(8,31),
        SEPTIEMBRE(9,30),
        OCTUBRE(10,31),
        NOVIEMBRE(11,30),
        DICIEMBRE(12,31);

        private int orden;
        private int numeroDias;

        private meses(int orden, int numeroDias){

            this.orden=orden;
            this.numeroDias=numeroDias;

        }

        public int getOrden() {
            return orden;
        }

        public int getNumDias() {
            return numeroDias;
        }


        @Override
        public String toString() {
            return this.name().toLowerCase()+" es el mes # "+orden+", con "+numeroDias+" días";
        }


    }

    public static void main(String[] args) {

        String mesEntrada = JOptionPane.showInputDialog("Ingresa un mes");

        meses mes = meses.valueOf(mesEntrada.toUpperCase());

        JOptionPane.showMessageDialog(null, mes.toString());
    }




}
