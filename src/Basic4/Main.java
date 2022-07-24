/*
Escribe una aplicación con un String que contenga una contraseña cualquiera.
Después se te pedirá que introduzcas la contraseña, con 3 intentos.
Cuando aciertes ya no pedirá mas la contraseña y mostrara un mensaje diciendo «Enhorabuena».
Piensa bien en la condición de salida (3 intentos y si acierta sale, aunque le queden intentos).
 */


package Basic4;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String clave = "AvadaKedavra";

        for(int i=1; i<=3; i++){
            String entrada = JOptionPane.showInputDialog("Ingresa la clave, intento # "+i);
            if(entrada.equals(clave)){
                JOptionPane.showMessageDialog(null, "Enhorabuena, clave correcta");
                return;
            }else{
                JOptionPane.showMessageDialog(null, "Clave errónea");
            }
        }



    }


}
