public class Calculator {
    public int calculateSum(int number1, int number2) {
        return number1 + number2;
    }
    
    public int calculateDifference(int number1, int number2) {
        return number1 - number2;
    }
    
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        int num1 = 25;
        int num2 = 10;
        
        // Calculate and display sum
        int sum = calc.calculateSum(num1, num2);
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
        
        // Calculate and display difference
        int difference = calc.calculateDifference(num1, num2);
        System.out.println("Difference between " + num1 + " and " + num2 + " is: " + difference);
    }
}
