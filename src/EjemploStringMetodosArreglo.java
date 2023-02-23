public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.length() = " + trabalenguas.length());
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray()); //Imprimeelidentificador solamente

        char[] arreglo = trabalenguas.toCharArray();      //[] arreglo
        int largo = arreglo.length;
        System.out.println("largo = " + largo);
        for(int i = 0; i < largo; i++){
            System.out.println("arreglo[i] = " + arreglo[i]); //print() imprime demanera horizontal
        }
        System.out.println();
        System.out.println("trabalenguas.split(\"a\") = " + trabalenguas.split("a"));// muestra una referencia

        String[] arreglo2 = trabalenguas.split("a");
        int l = arreglo2.length;
        for(int j = 0; j < l ; j++){
            System.out.println(arreglo2[j]);
        }

        String archivo = "alguna.imagen.pdf";
        String[] arreglo3 = archivo.split("\\."); // \\. o [.] indica que es el carácter "."
        int m = arreglo3.length;
        for(int k = 0; k < m; k++){
            System.out.println(arreglo3[k]);
        }
        System.out.println("extensión = " + arreglo3[m-1]);
    }
}
