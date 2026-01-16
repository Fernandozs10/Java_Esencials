package MaquinaDeSnacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaquinaSnacks {
    public static void main(String[] args) {
        maquinaSnacks();
    }

    public static void maquinaSnacks(){
        var salir = false;
        var consola = new Scanner(System.in);
        List<Snack> productos = new ArrayList<>();
        System.out.println("*** Maquina de Snacks ***");
        Snacks.mostrarSnack();

        while(!salir){
            try{
                var opcion = mostrarMenu(consola);
                salir = ejecutarOpciones(opcion, consola, productos);
            }catch(Exception e){
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
            finally {
                System.out.println();//Salto de linea en cada iteracion
            }
        }
    }

    private static int mostrarMenu(Scanner consola){
        System.out.println("""
                Menu:
                1. Comprar snack
                2. Mostrar ticket
                3. Agregar Nuevo Snack
                4. Salir
                Elige una opccion\s
                """);
        return Integer.parseInt(consola.nextLine());
    }

    private static boolean ejecutarOpciones(int opccion, Scanner consola, List<Snack> productos){

        var salir = false;
        switch (opccion){
            case 1 -> comprarSnack(consola, productos);
            case 2 -> mostarTicket(productos);
            case 3 -> agregarSnack(consola);
            case 4 -> {
                System.out.println("Regrese Pronto! ");
                salir = true;
            }
            default -> System.out.println("Opcion invalida: " + opccion);
        }
        return salir;
    }

    private static void comprarSnack(Scanner consola, List<Snack> productos){
        System.out.println("Que snack quieres comprar (id)? ");
        var idSnack = Integer.parseInt(consola.nextLine());
        //validar que el snack exista
        var snackEncontrado = false;
        for(var snack : Snacks.getSnacks()){
            if(snack.getIdSnack() == idSnack){
                //si lo encontramos agregamos el snack a nuestra lista de profuctos
                productos.add(snack);
                System.out.println("OK, Snack encontrado");
                snackEncontrado = true;
                break;
            }
        }
        if (!snackEncontrado){
            System.out.println("Snack no encontrado: " + idSnack);
        }
    }

    private static void mostarTicket(List<Snack> productos){
        var ticket = "*** Ticket de Venta ***";
        var total = 0.0;
        for (var producto: productos){
            ticket += "\n\t-" + producto.getNombre() + " Precio: " + producto.getPrecio();
            total += producto.getPrecio();
        }
        ticket += "\n\tTotal -> $" + total;
        System.out.println(ticket);
    }

    private static void agregarSnack(Scanner consola){
        System.out.println("Nombre del snack nuevo: ");
        var nombre = consola.nextLine();
        System.out.println("Precio del snack: ");
        var precio = Double.parseDouble(consola.nextLine());
        Snacks.agregarSnack(new Snack(nombre,precio));
        System.out.println("Tu snack fue agregado");
        Snacks.mostrarSnack();
    }
}
