package Archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class AgragarContenidoArchivo {
    public static void main(String[] args) {
        boolean anexar = false;
        var nombreArchivo = "src/Archivos/archivo.txt";
        var archivo = new File(nombreArchivo);
        try {
            //revisar si existe el archivo
            anexar = archivo.exists();
            var salida = new PrintWriter(new FileWriter(archivo, anexar));
            var nuevoContenido = "Nuevo\ncontenido";
            salida.println(nuevoContenido);
            salida.close();
        }catch (Exception e){
            System.out.println("Error al escribir el archivo" + e.getMessage());
        }
    }
}
