public class EjemploStringInmutable {
    public static void main(String[] args) {
        String curso = "Programación Java"; // es un objeto String y lo asigna a la variable curso
        String profesor = "Enrique Rodríguez";

        String resultado = curso.concat(profesor);
        System.out.println("curso = " + curso);
        System.out.println("resultado = " + resultado);
        System.out.println(curso == resultado);

       String resultado2 = curso.transform(c ->{//funciones anónimas o expresiones lambda o función de flecha
            return c + " con " + profesor;
        });
        System.out.println("curso = " + curso);
        System.out.println("resultado2 = " + resultado2);

        String resultado3 = resultado.replace("a", "A");
        System.out.println("resultado = " + resultado);
        System.out.println("resultado3 = " + resultado3);
    }
}
