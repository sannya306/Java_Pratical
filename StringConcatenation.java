import java.util.Scanner;

public class StringConcatenation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input first string
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();
        
        // Input second string
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();
        
        // Concatenate strings using + operator
        String resultUsingOperator = firstString + secondString;
        
        // Concatenate strings using concat() method
        String resultUsingMethod = firstString.concat(secondString);
        
        // Display results
        System.out.println("\nConcatenation using + operator: " + resultUsingOperator);
        System.out.println("Concatenation using concat() method: " + resultUsingMethod);
        
        scanner.close();
    }
}
