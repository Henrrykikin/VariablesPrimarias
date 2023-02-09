public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso = "Programación Java"; // es un objeto String y lo asigna a la variable curso
        String profesor = "Enrique Rodríguez";

        String detalle = curso + " con el instructor "+ profesor;
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 5;

        System.out.println(detalle + numeroA + numeroB); //Por precedencia de operadores lo considera una cadena, para realizar la suma en la concatenación, ingresar con paréntesis.
        System.out.println(detalle + (numeroA + numeroB));
        System.out.println(numeroA + numeroB + detalle); // Por precedencia de operadores, realiza primero la suma y después la concatenación
        
        // otro tipo de concatenación
        String detalle2 = curso.concat(" con ".concat(profesor));
        System.out.println("detalle2 = " + detalle2);

        String detalle3 = curso.concat(" con ".concat(profesor));
        System.out.println("detalle3 = " + detalle3);
        
        String detalle4 = curso.concat(" con ").concat(profesor);
        System.out.println("detalle4 = " + detalle4);
    }
}
