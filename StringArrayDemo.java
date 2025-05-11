import java.util.Scanner;

public class StringArrayDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declare an array of 5 strings
        String[] stringArray = new String[5];
        
        // Input strings
        System.out.println("Enter 5 strings:");
        for (int i = 0; i < 5; i++) {
            System.out.print("String " + (i + 1) + ": ");
            stringArray[i] = scanner.nextLine();
        }
        
        // Print the strings
        System.out.println("\nThe strings in the array are:");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + ". " + stringArray[i]);
        }
        
        scanner.close();
    }
}
