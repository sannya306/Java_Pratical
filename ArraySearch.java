import java.util.Scanner;

public class ArraySearch {
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
        
        // Input element to search
        System.out.print("Enter the element to search for: ");
        int searchElement = scanner.nextInt();
        
        // Search for the element
        int position = -1;
        for (int i = 0; i < size; i++) {
            if (array[i] == searchElement) {
                position = i;
                break;
            }
        }
        
        // Display result
        if (position != -1) {
            System.out.println("Element " + searchElement + " found at position " + position + " (index).");
        } else {
            System.out.println("Element " + searchElement + " not found in the array.");
        }
        
        scanner.close();
    }
}
