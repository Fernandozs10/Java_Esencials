package TemasBasicos;

public class Persona {
    String nombre;
    String apellido;
    int celular;
    String email;

    void mostraPersona() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
    }

    public static void main(String[] args) {
        System.out.println("*** Creacion de clase y objetos TemasBasicos.Persona***");
        Persona persona = new Persona();
        persona.nombre = "fernando";
        persona.apellido = "Zegarra";
        persona.mostraPersona();

        //segundo objeto

        var objeto2 = new Persona();
        objeto2.nombre = "Debora";
        objeto2.apellido = "Rodgriguez";
        objeto2.mostraPersona();
    }
}

class clase2{

}
class clase3{

}