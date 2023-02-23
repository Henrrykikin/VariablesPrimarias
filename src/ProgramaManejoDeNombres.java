import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el primer nombre: ");
        String nombre1 = teclado.nextLine();//nombre1.toUpperCase(teclado.nextLine());
        String mayuscula = nombre1.toUpperCase();

        char[] may1 = mayuscula.toCharArray();

        char[] nom1 = nombre1.toCharArray();
        int largo1 = nom1.length;

        System.out.println( may1[1]+"."+nombre1.substring(nombre1.length()-3));


        System.out.println("Ingresa el segundo nombre: ");
        String nombre2 = teclado.nextLine();

        char[]

        System.out.println("Ingresa el tercer nombre: ");
        String nombre3 = teclado.nextLine();



    }
}
