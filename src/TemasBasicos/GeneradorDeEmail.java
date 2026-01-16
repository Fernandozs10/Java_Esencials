package TemasBasicos;

public class GeneradorDeEmail {
    public static void main(String[] args) {
        System.out.println("****Generador de Emails personalizado");

        var NombreUsuario = " Fernando Abraham Zegarra Maratuech ";
        System.out.println("Nombre: " + NombreUsuario);

        var NombreUsuarioNorm = NombreUsuario.strip();
        //Remplazando espacios en blanco por puntos
        NombreUsuarioNorm = NombreUsuarioNorm.replace(" ",".");
        System.out.println("Nombre Normalizado: " + NombreUsuarioNorm);

        //Convertimos a minusculas
        NombreUsuarioNorm = NombreUsuarioNorm.toLowerCase();
        System.out.println("Nombre Normalizado: " + NombreUsuarioNorm);

        //Normalizacion del nombre de la empresa
        var NombreEmpresa = " Empesa Ejemplo 1 ";
        System.out.println("\nNombre de la empresa: " + NombreEmpresa);

        //Quitamos espacios en blanco y quitamos las minisculas
        var NombreEmpresaNorm = NombreEmpresa.strip();
        NombreEmpresaNorm = NombreEmpresaNorm.replace(" ",".").toLowerCase();
        System.out.println("Nombre Normalizado: " + NombreEmpresaNorm);

        var ExtensionDelDominio = ".com.mx";
        var DominioEmpresaEmail = "@"+ NombreEmpresaNorm + ExtensionDelDominio;
        System.out.println("Dominio Empresa: " + DominioEmpresaEmail);

        var EmailFinalGenerado = NombreUsuarioNorm + DominioEmpresaEmail;
        System.out.println("Email Final: " + EmailFinalGenerado);

    }
}
