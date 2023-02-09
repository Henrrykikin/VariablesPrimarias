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
    }
}
