package AtemasAvanzados;

import java.util.TreeSet;
import java.util.Set;


public class Sets {
    public static void main(String[] args) {
        Set<String> conjunto = new TreeSet<>();
        // el tipo set no admite elementos duplicados
        conjunto.add("Carlos");
        conjunto.add("Carlos");
        conjunto.add("Pedro");
        conjunto.add("Victoria");

        System.out.println("Elementos del set: ");
        conjunto.forEach(System.out::println);

        conjunto.remove("Pedro");
        System.out.println("Elementos del set: ");
        conjunto.forEach(System.out::println);
    }
}
