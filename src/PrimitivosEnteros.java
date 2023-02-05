public class PrimitivosEnteros {
    public static void main(String[] args) {
        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Tipo byte corresponde en byte a: "+ Byte.BYTES);
        System.out.println("Tipo byte corresponde en byte a: "+ Byte.SIZE);
        System.out.println("Valor máximo de byte: "+ Byte.MAX_VALUE);
        System.out.println("Valor mínimo de byte: "+ Byte.MIN_VALUE);

        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Tipo short corresponde en byte a: "+ Short.BYTES);
        System.out.println("Tipo short corresponde en bites a: "+ Short.SIZE);
        System.out.println("Valor máximo de short: "+ Short.MAX_VALUE);
        System.out.println("Valor mínimo de short: "+ Short.MIN_VALUE);

        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Tipo Int corresponde en byte a: "+ Integer.BYTES);
        System.out.println("Tipo Int corresponde en bites a: "+ Integer.SIZE);
        System.out.println("Valor máximo de Int: "+ Integer.MAX_VALUE);
        System.out.println("Valor mínimo de Int: "+ Integer.MIN_VALUE);

        long numeroLong = 9223372036854775807L;// se agrega la L para indicar que es un número Long
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Tipo long corresponde en byte a: "+ Long.BYTES);
        System.out.println("Tipo long corresponde en bites a: "+ Long.SIZE);
        System.out.println("Valor máximo de long: "+ Long.MAX_VALUE);
        System.out.println("Valor mínimo de long: "+ Long.MIN_VALUE);

        var numeroVar = 128; // se cambia automático para valores entre byte, short e Int.
        System.out.println("numeroVar = " + numeroVar);

        var numerovar2 = 2147483648L; //también se agrega L, D o F cuando se rebasan los límites del Int
        System.out.println("numerovar2 = " + numerovar2);


    }
}
