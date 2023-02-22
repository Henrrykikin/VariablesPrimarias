public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programación Java"; // es un objeto String y lo asigna a la variable curso
        String curso2 = new String("Programación Java"); //Con constructor

        boolean esIgual = curso == curso2; //Compara la referencia
        System.out.println("curso == curso2 = " + esIgual);
        
        esIgual = curso.equals(curso2); // compara el contenido
        System.out.println("curso.equals(curso2) = " + esIgual);

        esIgual = curso.equalsIgnoreCase(curso2); //Ignorando mayúsculas y minúsculas
        System.out.println("curso.equalsIgnoreCase(curso2) = " + esIgual);

        String curso3 = "Programación Java";
        esIgual = curso == curso3;
        System.out.println("curso == curso3 = " + esIgual);


    }
}
