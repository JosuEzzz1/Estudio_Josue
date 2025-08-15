package Structures_Datas;

import java.util.*;

public class List {
    public static void main(String[] args) {

        //Declaracion y Creacion
        ArrayList<String> names = new ArrayList<>();
        var numbers = new ArrayList<Integer>();

        //Tamaño
        System.out.println(names.size());

        //Añadir elementos
        names.add("Josue");
        names.add("NatyHackk");
        names.add("Junior insano");
        System.out.println(names.size());

        //Obtener o imprimir elementos
        System.out.println(names.getFirst());
        System.out.println(names.get(1));
        System.out.println(names.getLast());

        //Modificar elementos
        names.set(0, "JosuDev");

        //Remover elementos
        names.remove(1);
        System.out.println(names.size());
        System.out.println(names.getLast());

        //Buscar elementos
        System.out.println(names.contains("Josue"));

        //Limpiar Arraylist
        names.clear();
    }
}
