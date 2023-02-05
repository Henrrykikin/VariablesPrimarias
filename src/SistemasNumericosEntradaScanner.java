import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero:");
        //String numeroStr = scanner.nextLine();

        //Para le manejo de errores en el caso de que se ingrese una letra en lugar de numero
        int numeroDecimal = 0;
        try{
            numeroDecimal = scanner.nextInt();//Integer.parseInt(numeroStr);
        }catch(InputMismatchException e){ //InputMismatchException se usa para el caso de nextInt(), o se utiliza Exception en general
            System.out.println("Debe ingresar un número entero");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "numero binario de  " + numeroDecimal +" = " + Integer.toBinaryString(numeroDecimal);

        String resultadoOctal = "numero octal de " + numeroDecimal + " = "+ Integer.toOctalString(numeroDecimal);

        String resultadoHex = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = resultadoBinario;
        mensaje += "\n"+ resultadoOctal;
        mensaje += "\n" + resultadoHex;
        System.out.println(mensaje);
    }
}
