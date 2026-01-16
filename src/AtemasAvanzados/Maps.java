package AtemasAvanzados;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String, String> persona = new HashMap<>();
        persona.put("Nombre", "Diego");
        persona.put("Apellido", "Ramos");
        persona.put("Edad", "31");
        System.out.println("Valores del mapa/diccionario: ");
        //a diferncia del set necesitamos crear un contenedor para el map como un set
        // por eso creamos un entreySet
        persona.entrySet().forEach(System.out::println);
        // El orden de insercion no se controla ya que al hacer el foreach no sigue el mismo orden de insercion
        // tambien no admite elementos duplicados
        persona.put("Edad", "50");
        // para remover
        persona.remove("Apellido");
        System.out.println("\nNuevos valores del mapa/diccionario: ");
        persona.entrySet().forEach(System.out::println);

        //Iterar sobre los elementos del mapa por separado
        System.out.println("\nIterando los valores del mapa/diccionario: ");
        persona.forEach((llave, valor ) ->{
            System.out.println("llave: " + llave);
        });
    }
}
