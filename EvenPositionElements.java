import java.util.Scanner;

public class EvenPositionElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] array = new int[size];
        
        // Input array elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        
        // Print elements at even positions
        // Note: Even positions would be index 1, 3, 5, etc. (if position starts from 1)
        System.out.println("\nElements at even positions:");
        for (int i = 1; i < size; i += 2) {
            System.out.println("Element at position " + (i + 1) + ": " + array[i]);
        }
        
        scanner.close();
    }
}
