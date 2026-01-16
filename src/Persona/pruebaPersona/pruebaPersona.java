package Persona.pruebaPersona;

import Persona.Persona;

public class pruebaPersona {
    public static void main(String[] args) {
        var persona = new Persona("Fernando", "Zegarra");
        persona.mostrarPersona();
        persona.setApellido("Fernando");
        persona.setNombre("zegarra");
        persona.mostrarPersona();

        System.out.println("Apellido: " + persona.getApellido());
        System.out.println("Nombre: " + persona.getNombre());

        //usamos el metodo toString
        System.out.println("datos:" + persona.toString());

    }
}
