import javax.swing.*;

// Realizar un algoritmo que dado N valores, calcule la cantidad de números pares e impares.

public class ParImpar {
    public static void main(String[] args) {
        int cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros"));
        int pares = 0;
        int impares = 0;
        for (int i = 1; i <= cant; i++){
            int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero " + i));
            if (num % 2 == 0){
                pares++;
            }else{
                impares++;
            }
        }
        JOptionPane.showMessageDialog(null, "Hay: " + pares + " numeros pares");
        JOptionPane.showMessageDialog(null, "Hay: " + impares + " numeros impares");
    }
}

