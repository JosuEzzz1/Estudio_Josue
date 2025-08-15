import javax.swing.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int lenght = 0;
        lenght  = Integer.parseInt(JOptionPane.showInputDialog("How many numbers do you want to entry"));
        int[] numbers = new int[lenght];
        for(int i = 1; i <= numbers.length; i++){
            numbers[i-1] = Integer.parseInt(JOptionPane.showInputDialog("Enter the number " + i+":"));
        }
        JOptionPane.showMessageDialog(null, "The numbers are");
        for (int i = 0; i < lenght; i++) {
            JOptionPane.showMessageDialog(null, "[" + numbers[i] + "]");
        }
    }
}