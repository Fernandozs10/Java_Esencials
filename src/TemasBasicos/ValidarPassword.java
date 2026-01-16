package TemasBasicos;

import java.util.Scanner;

public class ValidarPassword {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        System.out.println("*** Validacion de Password ***");

        System.out.println("Ingresa un password (de al menos 6 caracteres)\n");
        var password = consola.nextLine();

        while(password.length() < 6){
            System.out.println("Ingresa un password valida\n");
            System.out.println("Ingresa un nuevo valor de password\n");
            password = consola.nextLine();
        }
        System.out.println("Password valida:" +  password);
    }
}
