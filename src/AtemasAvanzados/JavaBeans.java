package AtemasAvanzados;

import java.io.Serializable;

public class JavaBeans {
    public static void main(String[] args) {
        var persona = new Persona();
        persona.setNombre("Juanito");
        persona.setApellido("Perez");
        System.out.println("persona: " + persona);
        System.out.println("nombre: " + persona.getNombre());
        System.out.println("apellido: " + persona.getApellido());

    }
}


class Persona implements Serializable {
    //debe tener atributos privados
    private String nombre;
    private String apellido;

    // constructor vacio
    public Persona(){}

    // Debe tener metodos getter and setter
    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "TemasBasicos.Persona{" +
                "nombre=" + nombre +
                ", apellido="
                + apellido + '}';
    }
}
