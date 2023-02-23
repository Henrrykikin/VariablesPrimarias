public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Andrés";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Andrés\") = " + nombre.equals("Andrés"));
        System.out.println("nombre.equals(\"andrés\") = " + nombre.equals("andrés"));
        System.out.println("nombre.equalsIgnoreCase(\"andrés\") = " + nombre.equalsIgnoreCase("andrés"));
        System.out.println("nombre.compareTo(\"Andrés\") = " + nombre.compareTo("Andrés"));
        System.out.println("nombre.compareTo(\"Aaron\") = " + nombre.compareTo("Aaron"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(5) = " + nombre.charAt(5));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));
        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1) = " + nombre.substring(4));
        System.out.println("nombre.substring(1) = " + nombre.substring(1,4)); //No incluye el 4
        System.out.println("nombre.substring(1) = " + nombre.substring(nombre.length()-1));
        
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\",\".\") = " + trabalenguas.replace("a", "."));
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a')); //retorna la primera posición en la que se encuentra el valor buscado
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a')); // retorna la últimaposición en la que encuentre el valor buscado
        System.out.println("trabalenguas.indexOf('z') = " + trabalenguas.indexOf('z'));
        System.out.println("trabalenguas.indexOf('t') = " + trabalenguas.indexOf('t'));
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("t")); //Para indicar si el string contiene el caracter buscado
        System.out.println("trabalenguas.contains(\"z\") = " + trabalenguas.contains("z"));
        System.out.println("trabalenguas.contains(\"lenguas\") = " + trabalenguas.contains("lenguas")); //para indicar si el string contiene la cadena buscada
        System.out.println("trabalenguas.startsWith(\"lenguas\") = " + trabalenguas.startsWith("lenguas"));
        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("traba")); // Para indicar si el string iniciacon la cadena buscada
        System.out.println("trabalenguas.endsWith(\"traba\") = " + trabalenguas.endsWith("traba")); //Para indicar si el string termina con la cadena buscada
        System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("lenguas"));
        System.out.println("    trabalenguas");
        System.out.println("   trabajenguas ".trim()); //Quita espacios en blanco

    }
}
