import java.util.Scanner;

public class Tarea2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los datos de la factura: ");
        String numeroStr = scanner.nextLine();
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("El número de la factura es: " + numeroInt);

    }
}
