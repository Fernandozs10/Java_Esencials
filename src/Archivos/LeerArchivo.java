package Archivos;

import java.io.*;

public class LeerArchivo {
    public static void main(String[] args) {
        //leer el archivo
        var nombreArchivo = "src/Archivos/archivo.txt";
        var archivo = new File(nombreArchivo);
        try{
            System.out.println("Contenido del archivo");
            //abrimos el archivo para lectura
            var entrada = new BufferedReader(new FileReader(archivo));
            //leemos la primera linea
            var linea = entrada.readLine();
            //leemos todas las lineas mediante un while
            while(linea != null){
                System.out.println(linea);
                // antes de terminar el cilo, nos movemos a la siguiente linea
                linea = entrada.readLine();
            }
            // cerramos el archivo
            entrada.close();
        }catch (Exception e){
            System.out.println("Error al leer archivo" + e);
        }
    }
}
