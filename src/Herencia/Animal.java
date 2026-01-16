package Herencia;

public class Animal {
//    protected void comer(){
//        System.out.println("Como muchas veces al dia");
//    }
//    protected void dormir(){
//        System.out.println("Duermo muchas veces al dia");
//    }
    protected void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}

class Perro extends Animal {
    @Override
    public void hacerSonido(){
        System.out.println("Puedo Ladrar");
    }

     public void dormir(){
        System.out.println("Duermo 15 horas al dia");
        System.out.println("Metodo orignal de la clase padre");
//        super.dormir();// para llamar al metodo orignal
    }
}

class Gato extends Animal {
    @Override
    public void hacerSonido(){
        System.out.println("Puedo maullar");
    }
}

class PruebaAnimal{
    static void imprimirSonido(Animal animal){
        animal.hacerSonido();
    }
    public static void main(String[] args) {
        System.out.println("PruebaAnimal");
//
//        System.out.println("Clase padre, Soy un animal");
//        var animal1 = new Animal();
//        animal1.comer();
//        animal1.dormir();
        // animal1.hacerSonido(); // este metodo se definioo solo en la clase hija
//        System.out.println("\nclase HIja, Soy un perro");
//        var perro1 = new Perro();
//        perro1.hacerSonido();
//        perro1.dormir();
//        perro1.comer();

        //Prueba polimorfismo
        //Metodo polimorfico

        //polimorfismo
        var animal = new Perro();
        //polimorfismo
        //var animal = new Animal();
        imprimirSonido(animal);

    }
}