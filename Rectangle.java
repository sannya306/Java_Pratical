public class Rectangle {
    private double length;
    private double width;
    
    // Default constructor
    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }
    
    // Parameterized constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    // Getter for length
    public double getLength() {
        return length;
    }
    
    // Setter for length
    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            System.out.println("Length must be positive. Setting to default value 1.0");
            this.length = 1.0;
        }
    }
    
    // Getter for width
    public double getWidth() {
        return width;
    }
    
    // Setter for width
    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Width must be positive. Setting to default value 1.0");
            this.width = 1.0;
        }
    }
    
    // Method to calculate area
    public double calculateArea() {
        return length * width;
    }
    
    public static void main(String[] args) {
        // Create rectangle with default values
        Rectangle rect1 = new Rectangle();
        System.out.println("Rectangle 1:");
        System.out.println("Length: " + rect1.getLength());
        System.out.println("Width: " + rect1.getWidth());
        System.out.println("Area: " + rect1.calculateArea());
        
        System.out.println();
        
        // Create rectangle with custom values
        Rectangle rect2 = new Rectangle(5.0, 3.0);
        System.out.println("Rectangle 2:");
        System.out.println("Length: " + rect2.getLength());
        System.out.println("Width: " + rect2.getWidth());
        System.out.println("Area: " + rect2.calculateArea());
        
        System.out.println();
        
        // Change values using setters
        rect1.setLength(2.5);
        rect1.setWidth(4.0);
        System.out.println("Rectangle 1 (after modification):");
        System.out.println("Length: " + rect1.getLength());
        System.out.println("Width: " + rect1.getWidth());
        System.out.println("Area: " + rect1.calculateArea());
    }
}
