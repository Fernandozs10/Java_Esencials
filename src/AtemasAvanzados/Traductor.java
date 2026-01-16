package AtemasAvanzados;

import javax.naming.StringRefAddr;

public interface Traductor {
    // public y abstract
    void traducir();

    default void iniciarTraductor() {
        System.out.println("Iniciando traductor....");
    }

}

class Ingles implements Traductor {
    @Override
    public void traducir() {
        System.out.println("Traduciendo al Ingles...");
    }
}

class frances implements Traductor {
    public void traducir() {
        System.out.println("Traduciendo al Frances...");
    }
    @Override
    public void iniciarTraductor() {
        System.out.println("Iniciando traductor en Frances....");
    }
}

class PruebaTraductor{
    public static void main(String[] args) {
        Traductor ingles = new Ingles();
        ingles.iniciarTraductor();
        ingles.traducir();
        //traductor en frances
        Traductor frances = new frances();
        frances.iniciarTraductor();
        frances.traducir();
    }
}