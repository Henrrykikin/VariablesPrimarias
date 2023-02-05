public class PrimitivosFloat {
    static float varFlotante; //se utiliza así para ejemplificar el valor de float en la línea 19 y se deja en static para que pueda ser utilizado por el método static del main
    public static void main(String[] args) {
        float realFloat = 2.12e3f; //al agregar 1.0 se tiene que colocar f,2.12e3f = 2120f,1.5e-3 = 0.0015f
        System.out.println("numeroFloat = " + realFloat);
        System.out.println("Tipo float corresponde en byte a: "+ Float.BYTES);
        System.out.println("Tipo float corresponde en bites a: "+ Float.SIZE);
        System.out.println("Valor máximo de float: "+ Float.MAX_VALUE);
        System.out.println("Valor mínimo de float: "+ Float.MIN_VALUE);

        double realDouble = 3.4028235E38;
        System.out.println("realDouble = " + realDouble);
        System.out.println("Tipo double corresponde en byte a: "+ Double.BYTES);
        System.out.println("Tipo double corresponde en bites a: "+ Double.SIZE);
        System.out.println("Valor máximo de double: "+ Double.MAX_VALUE);
        System.out.println("Valor mínimo de double: "+ Double.MIN_VALUE);

        //float varFlotante = 3.1416f; //los floats siempre deben estar inicializados salvo que sean variables globales y se declaren afuera del main
        System.out.println("varFlotante = " + varFlotante);

    }
}
