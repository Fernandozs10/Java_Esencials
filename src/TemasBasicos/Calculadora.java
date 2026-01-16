package TemasBasicos;

import java.util.Scanner;

public class TemasBasicos.Calculadora {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);
        double resultado1 = 0, operando2 =  0, resultado = 0, operando1 = 0;
        var salir = false;


        while (!salir) {
            System.out.print("""
                    *** TemasBasicos.Calculadora en Java***
                    1. Suma
                    2. Resta
                    3. Multiplicacion
                    4. Division
                    5. Salir
                    escoge una opccion:\s"""
            );
            var opcion = consola.nextInt();
            if (opcion >= 1  && opcion <= 4) {
                System.out.println("Dame el valor 1: ");
                operando1 = consola.nextDouble();
                System.out.println("Dame el valor 2: ");
                operando2 = consola.nextDouble();
            }
            switch (opcion) {
                case 1 -> {
                    resultado =  operando1 + operando2;
                    System.out.printf("Resultado de la suma: %.2f%n%n", resultado);
                }
                case 2 -> {
                    resultado =  operando1 - operando2;
                    System.out.printf("Resultado de la resta: %.2f%n%n", resultado);
                }
                case 3 -> {
                    resultado =  operando1 * operando2;
                    System.out.printf("Resultado de la multiplicacion: %.2f%n%n", resultado);
                }
                case 4 -> {
                    if(operando2 != 0) {
                        resultado = operando1 / operando2;
                        System.out.printf("Resultado de la division: %.2f%n%n", resultado);
                    }
                    else  {
                        System.out.println("Error: Division entre 0");
                    }
                }
                case 5 -> {
                    System.out.println("Saliendo de la TemasBasicos.Calculadora");
                    salir = true;
                }
                default -> System.out.println("Selecciona una opcion valida\n");
            }
        }
    }
}
