package Basics;

public class Operators {
    public static void main(String[] args) {
        //Declaracion de Variables
        var a = 2;
        var b = 4;

        //Operadores
        System.out.println("OPERADORES ARITMETICOS");
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        System.out.println("OPERADORES DE ASIGNACION");
        a = b;
        System.out.println(b);
        a += 1;
        System.out.println(a);
        a *= 2;
        System.out.println(a);

        System.out.println("OPERADORES DE COMPARACION");
        System.out.println(a == b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a != b);

        System.out.println("OPERADORES LOGICOS");
        System.out.println(true && true);
        System.out.println(true || false);
        System.out.println(!true);

        System.out.println("OPERADORES UNARIOS");
        System.out.println(-b);
        System.out.println(++b);
        System.out.println(b++);
        System.out.println(b);
    }
}


