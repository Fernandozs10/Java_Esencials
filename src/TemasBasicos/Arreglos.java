package TemasBasicos;

import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {
        int[] enteros;
        enteros = new int[5];
        //int[] numeros = new int[3];
        var numeros = new int[3];// necesitamos darle un valor para que el compilador infiera el tipo de dato

        //modificacion de valores en arreglos
        enteros[0] = 13;
        enteros[1] = 14;
        enteros[4] = 15;
        //
        enteros[0] = 18;
        System.out.println("valor 1: " + enteros[0]);//mostrar el valor del array posicion 1

        //int [] enteros2 = {100,200,300,400,500};
        var enteros2 = new int[]{100,200,300,400,500};//sintaxis simplificada
        for (int i = 0; i < enteros2.length; i++) {
            System.out.printf("indice: %d%n valor: %d%n",i,enteros2[i]);
        }

        //ingresar valores desde consola a un array
        var consola = new Scanner(System.in);
        System.out.println("Proporciona el largo del arreglo");
        var largoArreglo = consola.nextInt();
        var enteros3 = new int[largoArreglo];
        for (int i = 0; i < enteros3.length; i++) {
            System.out.printf("Propociona el valor del indice " + i + "] = ");
            enteros3[i] = Integer.parseInt(consola.next());
            System.out.println("valor 1: " + enteros3[i]);
        }
    }
}
