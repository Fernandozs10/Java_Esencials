package TemasBasicos;

import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanzas {
    public static void main(String[] args) {
        System.out.println("Juego Adivinanzas");
        var consola = new Scanner(System.in);
        var random = new Random();

        var numeroSecreto = random.nextInt(50);
        var intentos = 0;
        var adivinanza = 0;
        final var INTENTOS_MAXIMOS = 5;
        while (adivinanza != numeroSecreto && intentos < INTENTOS_MAXIMOS) {
            System.out.println("Adivina el numero secreto (1-50) ");
            adivinanza = consola.nextInt();

            if (adivinanza < numeroSecreto)
                System.out.println("El numero secreto es mayor");
            else if (adivinanza > numeroSecreto) {
                System.out.println("El numero secreto es menor");
            }
            intentos++;
        }
        if (adivinanza == numeroSecreto){
            System.out.printf("Feliciades adivininaste el numero secreto en %d intentos\n", intentos);
        }
        else {
            System.out.printf("Lo siento agotaste los intentos maximos %d%n", INTENTOS_MAXIMOS);
            System.out.printf("El numero secreto era: %d%n", numeroSecreto);
        }
    }
}
