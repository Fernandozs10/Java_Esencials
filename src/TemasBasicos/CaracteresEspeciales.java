package TemasBasicos;

public class CaracteresEspeciales {
    public static void main(String[] args) {
        // salto de linea
        var cadena1 = "Hola\nMundo";
        System.out.println("Cadena 1: " + cadena1);

        // tabulador
        var cadena2 = "\tHola\tMundo";
        System.out.println("Cadena 2: " + cadena2);

        // agrega comilla simple
        var cadena3 = "Hola \' Mundo\'";
        System.out.println("Cadena 3: " + cadena3);

        //agrega una comilla doble
        var cadena4 = "Hola \" Mundo ";
        System.out.println("Cadena 4: " + cadena3);

        // caracter de digaonal invertida
        var cadena5 = "Hola \\ Mundo";
        System.out.println("Cadena 5: " + cadena5);
    }
}
