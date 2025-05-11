import java.util.Scanner;

public class MatrixSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declare a 2x2 matrix
        int[][] matrix = new int[2][2];
        
        // Input matrix elements
        System.out.println("Enter the elements of 2x2 matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        // Calculate sum
        int sum = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sum += matrix[i][j];
            }
        }
        
        // Display matrix
        System.out.println("\nMatrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        // Display sum
        System.out.println("Sum of all elements: " + sum);
        
        scanner.close();
    }
}
