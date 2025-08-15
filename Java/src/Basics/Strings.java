package Basics;

public class Strings {
    public static void main(String[] args) {
        String name = "Josue";
        String lastName = "Molina";
        int age = 17;

        //Concatenation
        System.out.println(name.concat(" " + lastName));

        //Length method
        System.out.println(name.length());

        //Get Char
        System.out.println(name.charAt(0));

        //SubString
        System.out.println(name.substring(1, 4));

        //Upper Case
        System.out.println(name.toUpperCase());

        //Lower Case
        System.out.println(name.toLowerCase());

        //Contains
        System.out.println("Hola Mundo".contains("ola"));

        //Comparison
        System.out.println(name.equals("josue"));
        System.out.println(name.equalsIgnoreCase("josue"));

        //Trim
        System.out.println(" Hola me llamo Josue ".trim());

        //Replace
        System.out.println("Hola me llamo Josue".replace("Hola", "Adios,"));

        //Format concatenation
        System.out.println(String.format("Hola, me llamo %s, tengo %d años", name, age));
    }
}
