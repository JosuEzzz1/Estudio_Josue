package Structures_Datas;

import java.util.HashSet;

public class Set {
    public static void main(String[] args) {

        //Declaracion y creacion
        HashSet<String> names = new HashSet<>();

        //Añadir elementos
        names.add("Josue");
        names.add("NatyHackk");
        names.add("Junior insano");
        System.out.println(names.size());

        //Tamaño
        System.out.println(names.size());

        //Obtener o imprimir elementos
        System.out.println(names);

        //Buscar elementos
        System.out.println(names.contains("Josue"));

        //Conjuntos (Solo válido entre mismo tipos de datos)
        var countries = new HashSet<String>();
        countries.add("Colombia");
        countries.add("España");
        countries.add("USA");
        names.addAll(countries);
        System.out.println(names);
    }
}
