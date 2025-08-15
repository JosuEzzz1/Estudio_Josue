import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        int lenght = 0;
        Scanner entry = new Scanner(System.in);
        System.out.println("How many numbers do you want to entry");
        lenght  = entry.nextInt();
        int[] numbers = new int[lenght];
        for(int i = 1; i <= numbers.length; i++){
            System.out.println("Enter the number " + i);
            numbers[i-1] = entry.nextInt();
        }
        System.out.println("The numbers are:");
        for (int i = 0; i < lenght; i++) {
            System.out.println("[" + numbers[i] + "]");
        }
    }
}
