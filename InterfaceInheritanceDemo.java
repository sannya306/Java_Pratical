// Base interface
interface Drawable {
    void draw();
}

// Extended interface inheriting from Drawable
interface Colorable extends Drawable {
    void fill();
    void setColor(String color);
}

// Class implementing the extended interface
class ColoredShape implements Colorable {
    private String shapeName;
    private String color;
    
    // Constructor
    public ColoredShape(String shapeName) {
        this.shapeName = shapeName;
        this.color = "No color";
    }
    
    // Implement draw() method from Drawable interface
    @Override
    public void draw() {
        System.out.println("Drawing a " + shapeName);
    }
    
    // Implement fill() method from Colorable interface
    @Override
    public void fill() {
        System.out.println("Filling the " + shapeName + " with " + color);
    }
    
    // Implement setColor() method from Colorable interface
    @Override
    public void setColor(String color) {
        this.color = color;
        System.out.println("Color set to " + color);
    }
    
    // Display information
    public void displayInfo() {
        System.out.println("Shape: " + shapeName);
        System.out.println("Color: " + color);
    }
}

// Main class
public class InterfaceInheritanceDemo {
    public static void main(String[] args) {
        // Create objects
        ColoredShape triangle = new ColoredShape("Triangle");
        ColoredShape hexagon = new ColoredShape("Hexagon");
        
        // Working with triangle
        System.out.println("=== Triangle ===");
        triangle.displayInfo();
        triangle.draw();
        triangle.setColor("Blue");
        triangle.fill();
        
        System.out.println();
        
        // Working with hexagon
        System.out.println("=== Hexagon ===");
        hexagon.displayInfo();
        hexagon.draw();
        hexagon.setColor("Red");
        hexagon.fill();
    }
}
