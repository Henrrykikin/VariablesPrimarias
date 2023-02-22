import java.sql.SQLOutput;
import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la factura: ");
        String nombreFactura = scanner.nextLine();

        System.out.println("Ingresa el valor del primer producto: ");
        Double numeroUno = scanner.nextDouble();

        System.out.println("Ingresa el valor del segundo producto: ");
        Double numeroDos = scanner.nextDouble();

        double total = numeroUno+numeroDos;
        double impuesto = total*.19;
        double totImp = total + impuesto;

        System.out.println("La factura "+nombreFactura+" tiene un total bruto de "+total+", \ncon un impuesto de "+impuesto+" y \nel monto después del impuesto es de "+totImp);

    }
}
