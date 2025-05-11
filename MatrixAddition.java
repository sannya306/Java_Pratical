import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declare matrices
        int[][] matrix1 = new int[2][2];
        int[][] matrix2 = new int[2][2];
        int[][] resultMatrix = new int[2][2];
        
        // Input first matrix elements
        System.out.println("Enter the elements of first 2x2 matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                matrix1[i][j] = scanner.nextInt();
            }
        }
        
        // Input second matrix elements
        System.out.println("\nEnter the elements of second 2x2 matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                matrix2[i][j] = scanner.nextInt();
            }
        }
        
        // Calculate sum of matrices
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        
        // Display first matrix
        System.out.println("\nFirst Matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
        
        // Display second matrix
        System.out.println("\nSecond Matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
        
        // Display result matrix
        System.out.println("\nSum of Matrices:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
