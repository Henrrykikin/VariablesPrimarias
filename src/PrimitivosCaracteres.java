public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = '@'; //un solo caracter "unicode" ejemplo '@' = '\u0040' secuencia de escape
        char unicode = '\u0040';
        char decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("unicode = " + unicode);
        System.out.println("decimal = " + decimal);

        char espacio = '\u0020';
        char retroceso = '\b'; //Para eliminar un caracter
        char tabulador = '\t';
        char nuevaLinea ='\n';
        char retornoCarro = '\r';

        System.out.println("Tipo char corresponde en \tbyte a:"+ retroceso + tabulador + Character.BYTES);
        System.out.println("Tipo char corresponde en bites a: "+ nuevaLinea + Character.SIZE);
        System.out.println("Valor máximo de char: " + Character.MAX_VALUE);
        System.out.println("Valor mínimo de char: "+ Character.MIN_VALUE);
    }
}
