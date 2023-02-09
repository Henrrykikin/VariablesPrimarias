public class ConversiónDeTipos {
    public static void main(String[] args) {
        String numeroStr = "50";

        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "98765.43e-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String logicoStr = "true"; //true, TRUE, false o FALSE. No aplica con 1 o 0
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        //con var aplica igual
        /*
        var numeroStr = "50";
        var numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        var realStr = "98765.43e-3";
        var realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        var logicoStr = "true"; //true, TRUE, false o FALSE. No aplica con 1 o 0
        var  logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);
        */

        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);

        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        otroNumeroStr = String.valueOf(otroNumeroInt+10);//sobrecarga de métodos
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        double otroRealDouble = 1.23456e2;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);
        
        otroRealStr = String.valueOf(1.23456e2f);
        System.out.println("otroRealStr = " + otroRealStr);
        
        //de primitivos a primitivos (solo del mismo tipo compatible, no de in a boolean o a char pues arroja información relacionada con el unicode)
        int i = 32768;
        short s = (short)i; //utilizando cast para forzar la conversión. Al rebasar un numero que exceda 32767 para el caso de los long, habrá pérdida de información.
        System.out.println("s = " + s);
        long l = i; // se puede sin perder información
        System.out.println("l = " + l);
        System.out.println(Short.MAX_VALUE);


    }
    
}
