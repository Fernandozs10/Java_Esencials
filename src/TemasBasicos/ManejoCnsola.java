package TemasBasicos;

import java.util.Scanner;

public class ManejoCnsola {
    public static void main(String[] args) {
        //Introducir valores por consola
        var consola = new Scanner(System.in);// in - entrada estandar
        System.out.println("Escribe tu nombre: ");
        var nombre = consola.nextLine();
        System.out.println("Nombre: " + nombre);
    }
}
