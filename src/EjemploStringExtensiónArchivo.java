public class EjemploStringExtensiónArchivo {
    public static void main(String[] args) {
        String archivo = "alguna.imagen.js";
        int i = archivo.indexOf("."); //muestra la primer ocurrencia con el carácter buscado
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(14) = " + archivo.substring(14));
        System.out.println("archivo.substring(archivo.length()-4) = " + archivo.substring(archivo.length()-4));
        System.out.println("archivo.substring(i+1) = " + archivo.substring(i+1)); //En la salida muestra el resultado de la busqueda de la primerocurrencia con el IndexOf()

        int j = archivo.lastIndexOf("."); //muestra la última ocurrencia con el carácter buscado
        System.out.println("archivo.substring(j+1) = " + archivo.substring(j+1));
    }
}
