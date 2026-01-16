package Persona;

public class Persona {
    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //metodo toString normal retorna las atributos de la clase, ahora lo reescribimos para
    // que nos devuelva los valores que tenemos
    @Override
    public String toString() {
        return "Nombre: " + this.nombre + "Apellido: " + this.apellido;
    }

    public void mostrarPersona() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
