public class OperadoresLogicos {
    public static void main(String[] args) {
        int i = 3;
        byte j = 7;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean m = false;

        boolean b1 = i == j && k > l;
        System.out.println("b1 = i == j && k > l => " + b1);

        boolean b2 = i == j || k > l;
        System.out.println("b2 = i == j && k > l => " + b2);
    }
}
