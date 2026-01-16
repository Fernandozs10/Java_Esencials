package TemasBasicos;

import java.util.Scanner;

public class LeerTiposDatos {
    public static void main(String[] args) {
        // Leer distintos tipos de datos
        // Tipo int
        var consola = new Scanner(System.in);
        System.out.println("Ingresa tu edad: ");
        var edad = consola.nextInt();
        System.out.println("Edad : " + edad);

        //Leer un tipo double
        System.out.println("Ingresa tu altura: ");
        var altura = consola.nextDouble();
        System.out.println("Altura : " + altura);

        // Consumimos el salto de linea ya que los anteriores no lo consumen
        consola.nextLine();

        // Leer un tipo string
        System.out.println("Ingresa tu nombre: ");
        var nombre = consola.nextLine();
        System.out.println("Nombre: " + nombre);

        // Conversion de datos
        System.out.print("Proporciona un valor entero: ");
        var enteroString = consola.nextLine();
        var entero = Integer.parseInt(enteroString);
        System.out.println("Entero: " + entero );

        // Tipo flotante
        System.out.print("Proporciona un valor flotante: ");
        var flotante = Float.parseFloat(consola.nextLine());
        System.out.println("Flotante: " + flotante);

        //Double.parseDouble();
        //Boolean.parseBoolean();
    }
}
