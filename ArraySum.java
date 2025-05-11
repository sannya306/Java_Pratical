import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declare an array of size 5
        int[] array = new int[5];
        
        // Input array elements
        System.out.println("Enter 5 integers for the array:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        
        // Calculate sum
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        
        // Display array elements
        System.out.println("\nArray elements:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        
        // Display sum
        System.out.println("\nSum of array elements: " + sum);
        
        scanner.close();
    }
}
