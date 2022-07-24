/*Simulador de reloj*/

package Basic13;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        int horas = 0;
        int minutos = 0;
        int segundos = 0;

        while (true) { //Esto se ejecuta infinitamente

            if (horas < 10) {
                System.out.print("0");
            }

            System.out.print(horas + ":");

            if (minutos < 10) {
                System.out.print("0");
            }

            System.out.print(minutos + ":");

            if (segundos < 10) {
                System.out.print("0");
            }

            System.out.println(segundos);

            segundos++;

            if (segundos == 60) {
                segundos = 0;
                minutos++;
                if (minutos == 60) {
                    minutos = 0;
                    horas++;
                    if (horas == 24) {
                        horas = 0;
                    }
                }
            }

            Thread.sleep(1000);

        }
    }


}
