public class SistemasNumericos {
    public static void main(String[] args) {

        int numeroDecimal = 500;
        System.out.println("numeroDecimal = " + numeroDecimal);

        System.out.println("numero binario de  " + numeroDecimal+" = " + Integer.toBinaryString(numeroDecimal));

        int numeroBinario = 0b111110100; //0bpara que Java asuma que la combinacion de 0 y 1 corresponde a un binario
        System.out.println("numeroBinario = " + numeroBinario);

        System.out.println("numero octal de " + numeroBinario + " = "+ Integer.toOctalString(numeroDecimal));
        int numeroOctal = 0764; // se antepone un 0 para indicar que es octal
        System.out.println("numeroOctal = " + numeroOctal);

        System.out.println("numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));
        int numeroHex = 0x1f4; // 0x referencía a que es Hexadecimal
        System.out.println("numeroHex = " + numeroHex);
    }
}
