package Archivos;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LeerTodo {
    public static void main(String[] args) {
        var nombreArchivo = "src/Archivos/archivo.txt";
        try{
            //leer todas las lienas del archivo
            List<String> lineas = Files.readAllLines(Paths.get(nombreArchivo));
            for (String linea : lineas) {
                System.out.println(linea);
            }
        }catch(Exception e){
            System.out.println("Error al leer archivo");
            e.printStackTrace();
        }
    }
}
