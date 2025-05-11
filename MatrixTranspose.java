import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declare original and transpose matrices
        int[][] matrix = new int[2][2];
        int[][] transpose = new int[2][2];
        
        // Input matrix elements
        System.out.println("Enter the elements of 2x2 matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        // Calculate transpose
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        
        // Display original matrix
        System.out.println("\nOriginal Matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        // Display transpose matrix
        System.out.println("\nTranspose Matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
