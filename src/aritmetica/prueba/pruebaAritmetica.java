package aritmetica.prueba;
import aritmetica.Aritmetica;

public class pruebaAritmetica {
    public static void main(String[] args) {
        System.out.println("Prueba Aritmetica ");
        var aritmetica1 = new Aritmetica(15,10);
        aritmetica1.sumar();
        aritmetica1.restar();

        System.out.println();
        var aritmetica2 = new Aritmetica(12, 16);
        aritmetica2.sumar();

        System.out.println("atributo operando1: " + aritmetica1.getOperando1());
        aritmetica1.setOperando1(10);
        aritmetica1.setOperando2(15);

        aritmetica1.sumar();
        aritmetica1.restar();
    }
}
