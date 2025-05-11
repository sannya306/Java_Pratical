import java.util.Scanner;

public class AscendingSort {
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
        
        // Display unsorted array
        System.out.println("\nArray before sorting:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        
        // Sort array in ascending order (Bubble Sort)
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        
        // Display sorted array
        System.out.println("\n\nArray after sorting in ascending order:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        
        scanner.close();
    }
}
