import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner t = new Scanner(System.in);
        String name;
        int age;
        char gender;

        /*
        Capture
        */
        System.out.println("Ingresa tu nombre");
        name = t.nextLine();
        System.out.println("Ingresa tu edad");
        age = t.nextInt();
        System.out.println("Ingresa tu genero");
        gender = t.next().charAt(0);

        System.out.println("Tus datos son");
        System.out.println("Nombre: " + name);
        System.out.println("Edad: "+ age);
        System.out.println("Genero: "+ gender);
        


    }
}