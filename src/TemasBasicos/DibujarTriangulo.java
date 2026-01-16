package TemasBasicos;

import java.util.Scanner;

public class DibujarTriangulo {
    public static void main(String[] args) {
        System.out.println("Dibujar Triangulo");
        var consola = new Scanner(System.in);
        System.out.println("Proporciona el numeor de filas para el triaingulo");
        var numerofilas = consola.nextInt();

        for (var fila = 1; fila <= numerofilas; fila++) {
            var espaciosBlanco = " ".repeat(numerofilas - fila);
            var asteriscos = "*".repeat(2 * fila - 1);
            System.out.println(espaciosBlanco + asteriscos);
        }
    }
}
