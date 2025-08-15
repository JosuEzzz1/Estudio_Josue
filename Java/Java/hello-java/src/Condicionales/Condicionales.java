package Condicionales;

import javax.swing.JOptionPane;

public class Condicionales {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Bienvenido, aqui podras verificar que numero es mayor");
        int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));

        if (a > b){
            JOptionPane.showMessageDialog(null, a + " es mayor que " + b);
        }else {
            JOptionPane.showMessageDialog(null, b + " es mayor que " + a);
        }

        JOptionPane.showMessageDialog(null, "Aqui podras ver si el numero es positivo, negativo o 0");
        if (a > 0) {
            JOptionPane.showMessageDialog(null, a + " Es positivo");
        }else if(a == 0) {
            JOptionPane.showMessageDialog(null, a + " Es igual a 0");
        }else {
            JOptionPane.showMessageDialog(null, a + " Es negativo");
        }

        JOptionPane.showMessageDialog(null, "Verifica si el numero es par o impar");
        if (a % 2 == 0){
            JOptionPane.showMessageDialog(null, a + " es un numero par");
        }else{
            JOptionPane.showMessageDialog(null, a + " es un numero impar");
        }

        JOptionPane.showMessageDialog(null, "Verifica si el numero esta entre 1 y 100");
        if (a > 0 && a <101){
            JOptionPane.showMessageDialog(null, a + " está entre 1 y 100");
        }
        //Sobresaliente = >= 95, aprobado >= 60, suspenso < 60
        double nota = Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu nota"));
        if (nota >= 95){
            JOptionPane.showMessageDialog(null, "Felicitaciones, tu nota es sobresaliente");
        }else if (nota >= 60 && nota < 95){
            JOptionPane.showMessageDialog(null, "Felicidades, aprobaste");
        }else{
            JOptionPane.showMessageDialog(null, "Lo sentimos, esfuerzate mas a la proxima");
        }

        int day = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del dia 1 al 7"));
        switch (day){
            case 1:
                JOptionPane.showMessageDialog(null, "Hoy es lunes");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Hoy es Martes");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Hoy no es ni lunes ni martes");
        }
    } 
}
