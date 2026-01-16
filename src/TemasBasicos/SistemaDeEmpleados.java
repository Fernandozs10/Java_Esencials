package TemasBasicos;

import java.util.Scanner;

public class SistemaDeEmpleados {
    public static void main(String[] args) {
        System.out.println("Iniciando Sistema de Empleados");

        var consola = new Scanner(System.in);
        // nombre del empleado
        System.out.print("Ingresa el nombre del empleado: ");
        var nombreEmpleado = consola.nextLine();

        System.out.print("Ingresa la edad del empleado: ");
        var edadEmpleado = Integer.parseInt(consola.nextLine());

        System.out.print("Ingresa la sueldo del empleado: ");
        var sueldoEmpleado = Double.parseDouble(consola.nextLine());

        System.out.print("Es jefe de departamento ? (true/false)  ");
        var esJefe = Boolean.parseBoolean(consola.nextLine());

        System.out.println("\nNombre del empleado: " + nombreEmpleado);
        System.out.println("\tLa edad del empleado: " + edadEmpleado);
        System.out.println("\tLa sueldo del empleado: " + sueldoEmpleado);
        // le damos un formato
        System.out.printf("\tLa sueldo del empleado: $%.2f%n", sueldoEmpleado);
        System.out.println("\tEs jefe de departamento: " + esJefe);

    }
}
