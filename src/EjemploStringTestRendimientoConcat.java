public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a); // para el tercer método

        long inicio = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++){
            c = c.concat(a).concat(b).concat("\n"); //Primer método, 500 => 3 ms, 1000 => 8ms, 10000 => 166ms, 100000 => 6716ms
            //c += a + b + "\n"; // c = c + a + b + "\n" //Segundo método, 500 => 21ms, 1000 => 23ms, 10000 => 89ms, 100000 => 2663ms
            //sb.append(a).append(b).append("\n"); //Tercer método, 500 => 0ms, 1000 => 1ms, 10000 => 3ms, 100000 => 16ms :. ES EL MÁS ADECUADO
                                                        /*
                                                        sb.append(a).append(b).append("\n"); equivale a:
                                                            sb.append(a);
                                                            append(b);
                                                            append("\n");
                                                        */
        };
        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
    }
}
