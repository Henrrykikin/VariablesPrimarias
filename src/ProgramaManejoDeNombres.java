import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        // Lectura de strings
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el primer nombre: ");
        String nombre1 = teclado.nextLine();//nombre1.toUpperCase(teclado.nextLine());

        System.out.println("Ingresa el segundo nombre: ");
        String nombre2 = teclado.nextLine();


        System.out.println("Ingresa el tercer nombre: ");
        String nombre3 = teclado.nextLine();
        String mayuscula3 = nombre3.toUpperCase();

         // Procedimiento 1er. nombre
        String mayuscula1 = nombre1.toUpperCase();

        char[] may1 = mayuscula1.toCharArray();

        char[] nom1 = nombre1.toCharArray();
        int largo1 = nom1.length;

      // Procedimiento 2o. nombre
        String mayuscula2 = nombre2.toUpperCase();

        char[] may2 = mayuscula2.toCharArray();

        char[] nom2 = nombre2.toCharArray();
        int largo2 = nom2.length;

       // Procedimiento 3er. nombre

        char[] may3 = mayuscula3.toCharArray();

        char[] nom3 = nombre3.toCharArray();
        int largo3 = nombre3.length();

        System.out.println("\nResultado:");
        System.out.println(may1[1]+"."+nombre1.substring(nombre1.length()-2)+"_"+may2[1]+"."+nombre2.substring(nombre2.length()-2)+"_"+may3[1]+"."+nombre3.substring(nombre3.length()-2));

    }
}
