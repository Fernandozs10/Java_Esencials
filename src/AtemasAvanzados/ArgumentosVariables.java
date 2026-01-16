package AtemasAvanzados;

public class ArgumentosVariables {

    public static void main(String[] args) {
        //imprimirNumeros(1,2,3,4,5);
        variosParametros("Karla",10,20,30);

    }

    //los argumentos variables siempre deben ir al principio si lo hacemos
    //al reves dara problemas
    private static void variosParametros(String karla, int... numeros) {
        System.out.println("Nombre: " + karla);
        imprimirNumeros(numeros);
    }

    static void imprimirNumeros(int... numero){
       for(var i=0;i<numero.length;i++){
           System.out.print(numero[i] + " ");
       }
    }

}
