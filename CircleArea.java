import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        
        // Area of circle = π * r^2
        double area = Math.PI * radius * radius;
        
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
        System.out.printf("The area of the circle with radius %.2f is: %.2f\n", radius, area);
        
        scanner.close();
    }
}
