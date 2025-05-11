// Define an interface
interface Shape {
    // Abstract methods
    double calculateArea();
    double calculatePerimeter();
    void display();
}

// Circle class implementing the Shape interface
class Circle implements Shape {
    private double radius;
    
    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }
    
    // Implement interface methods
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
    
    @Override
    public void display() {
        System.out.println("Circle with radius: " + radius);
        System.out.printf("Area: %.2f\n", calculateArea());
        System.out.printf("Perimeter: %.2f\n", calculatePerimeter());
    }
}

// Rectangle class implementing the Shape interface
class Rectangle implements Shape {
    private double length;
    private double width;
    
    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    // Implement interface methods
    @Override
    public double calculateArea() {
        return length * width;
    }
    
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
    
    @Override
    public void display() {
        System.out.println("Rectangle with length: " + length + " and width: " + width);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}

// Main class
public class InterfaceDemo {
    public static void main(String[] args) {
        // Create a Circle object
        Shape circle = new Circle(5.0);
        
        // Create a Rectangle object
        Shape rectangle = new Rectangle(4.0, 6.0);
        
        // Display information
        System.out.println("=== Shape Information ===");
        System.out.println("\n1. Circle:");
        circle.display();
        
        System.out.println("\n2. Rectangle:");
        rectangle.display();
    }
}
