package Basics;

public class DataTypes {
    public static void main (String[] args){

        //Cadena de texto
        String myName = "Josue";

        //Enteros (se incluye long para numero largos)
        int myAge = 17;

        //Decimales (se incluye float, (menos preciso))
        double myHeight = 1.70;

        //Booleano
        boolean likeProgramming = true;

        //Constantes
        final String EMAIL = "jmolinaperez122@gmail.com";

        //Caracter
        char myInitial = 'J';

        String location = "Barranquilla";
        location = "Soledad";
        System.out.println("El tipo de dato es: " + location.getClass().getSimpleName()); //metodos para buscar el tipo de dato

    }
}
