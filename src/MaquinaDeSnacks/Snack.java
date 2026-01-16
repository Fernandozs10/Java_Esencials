package MaquinaDeSnacks;

import java.io.Serializable;
import java.util.Objects;

public class Snack implements Serializable {
    private String Nombre;
    private double Precio;
    private int idSnack;
    private static int ContadorSnacks;

    public Snack() {
        this.idSnack = ++Snack.ContadorSnacks;
    }
    public Snack(String nombre, double precio){
        this(); // la llamada a un constructor interna debe ser la primera linea
        this.Nombre = nombre;
        this.Precio = precio;
    }

    public Boolean equals() {
        return null;
    }
    public int HashCode() {
        return 0;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        this.Precio = precio;
    }

    public int getIdSnack() {
        return idSnack;
    }

    public static int getContadorSnacks() {
        return ContadorSnacks;
    }

    @Override
    public String toString() {
        return "Snack{" +
                "Nombre='" + Nombre + '\'' +
                ", Precio=" + Precio +
                ", idSnack=" + idSnack +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Snack snack = (Snack) o;
        return Double.compare(Precio, snack.Precio) == 0 && idSnack == snack.idSnack && Objects.equals(Nombre, snack.Nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Nombre, Precio, idSnack);
    }
}
