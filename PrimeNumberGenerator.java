import java.util.Scanner;

public class PrimeNumberGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the upper limit: ");
        int upperLimit = scanner.nextInt();
        
        System.out.println("Prime numbers between 1 and " + upperLimit + " are:");
        
        for (int i = 2; i <= upperLimit; i++) {
            boolean isPrime = true;
            
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        
        scanner.close();
    }
}
