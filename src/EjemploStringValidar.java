public class EjemploStringValidar {
    public static void main(String[] args) {
        
        String curso = null;
        
        boolean esNulo = curso == null;

        System.out.println("esNulo = " + esNulo);

        if (esNulo) { // !nulo equivale a esNulo == false, esNulo equivale a esNulo == true
            curso = " ";//"Programación Java";
        }

        // para validar que el String tiene un tamaño
        boolean esVacio = curso.length() == 0;

        System.out.println("esVacio = " + esVacio);

        boolean esVacio2 = curso.isEmpty(); // ATAJO para verificar si está vacío
        System.out.println("esVacio2 = " + esVacio2);

        boolean esBlanco = curso.isBlank(); //Para verificar si tiene un espacio en blanco, solo existe desde la versión 11, no funciona en Java 8
        System.out.println("esBlanco = " + esBlanco);

        if(!esBlanco){
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso "+ curso);
        }
    }
}
