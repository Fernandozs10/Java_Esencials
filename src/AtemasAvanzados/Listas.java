package AtemasAvanzados;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List<String> miLista = new ArrayList();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        // Una lista permite objetos duplicados

        for (String elemento : miLista) {
            System.out.println(elemento);
        }

        // Funciones lambda (funcion anonima de un codigo muy compacto)

        miLista.forEach(elemento -> {
            System.out.println("Elemento: " + elemento);
        }); //variable que almacena y cuerpo de la funcion

        // Funcion aun mas reducitdo ya que ln lo hace internamente pero se pierde que esta sucediendo
        miLista.forEach(System.out::println);

        // una manera mas simplidicada para crear listas
        List<String> nombres = Arrays.asList("Pedro", "Ivone", "Nohemi");
        System.out.println("\nLista de nombres");
        nombres.forEach(System.out::println);

    }
}
