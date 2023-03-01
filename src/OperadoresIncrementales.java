public class OperadoresIncrementales {
    public static void main(String[] args) {
        // pre incremento
        int i = 1;
        System.out.println("inicial de i = " + i);
        int j = ++i; // i = i + 1;

        System.out.println(" preincremento de i = " + i);
        System.out.println("j = " + j);

        //post incremento
        i = 2;
        System.out.println("inicial de i = " + i);
        j = i++;
        System.out.println("j = " + j);
        System.out.println("post incremental de i = " + i);

        // pre decremento
        i = 3;
        System.out.println("inicial de i = " + i);
        j = --i;

        System.out.println("j = " + j);
        System.out.println("pre decremento de i = " + i);

        //post decremento
        i = 4;
        System.out.println("inicial de i = " + i);
        j = i--;

        System.out.println("j = " + j);
        System.out.println("pos decrtemento de i = " + i);

        System.out.println("++j = " + (++j));
        System.out.println("j++ = " + (j++));
        System.out.println("j = " + j);
    }
}
