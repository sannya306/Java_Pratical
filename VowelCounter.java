import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Convert to lowercase to handle both uppercase and lowercase vowels
        input = input.toLowerCase();
        
        // Count vowels
        int vowelCount = 0;
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        
        // Display result
        System.out.println("The string: \"" + input + "\"");
        System.out.println("Number of vowels: " + vowelCount);
        
        scanner.close();
    }
}
