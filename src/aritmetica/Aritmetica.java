package aritmetica;

public class Aritmetica {
    private int operando1;
    private int operando2;

    public Aritmetica() {}

    public Aritmetica(int operando1, int operando2) {
        System.out.println("Ejecutando constructor");
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    public void sumar() {
        //buenas practicas es usar this para identificar los atributos de la clase en el codigo
        var resultado = this.operando1 + operando2;
        System.out.println("resultado: " + resultado);
    }
    public void restar() {
        var resultado = operando1 - operando2;
        System.out.println("resultado: " + resultado);
    }

    public int  getOperando1() {
        return this.operando1;
    }

    public void setOperando1(int operando1) {
        this.operando1 = operando1;
    }

    public int  getOperando2() {
        return this.operando2;
    }
    public void setOperando2(int operando2) {
        this.operando2 = operando2;
    }

    public static void main(String[] args) {
        System.out.println("Iniciando programa...");



        var aritmetica3 = new Aritmetica(1,2);
        aritmetica3.sumar();
        aritmetica3.restar();


    }
}
