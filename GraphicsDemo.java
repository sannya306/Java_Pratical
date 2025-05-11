import java.awt.*;
import javax.swing.*;

public class GraphicsDemo extends JFrame {
    
    public GraphicsDemo() {
        super("Graphics Demo");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        
        // Set color for drawing
        g.setColor(Color.BLUE);
        
        // Draw lines
        g.drawLine(50, 50, 200, 50);
        g.drawString("Line", 100, 70);
        
        // Draw rectangle
        g.setColor(Color.RED);
        g.drawRect(50, 100, 150, 70);
        g.drawString("Rectangle", 90, 190);
        
        // Draw filled rectangle
        g.setColor(Color.GREEN);
        g.fillRect(250, 100, 150, 70);
        g.setColor(Color.BLACK);
        g.drawString("Filled Rectangle", 280, 190);
        
        // Draw oval
        g.setColor(Color.ORANGE);
        g.drawOval(50, 220, 150, 100);
        g.drawString("Oval", 100, 340);
        
        // Draw filled oval
        g.setColor(Color.MAGENTA);
        g.fillOval(250, 220, 150, 100);
        g.setColor(Color.BLACK);
        g.drawString("Filled Oval", 290, 340);
        
        // Draw text with different font
        g.setColor(Color.DARK_GRAY);
        g.setFont(new Font("TimesRoman", Font.BOLD, 20));
        g.drawString("Java Graphics Demo", 150, 380);
    }
    
    public static void main(String[] args) {
        GraphicsDemo demo = new GraphicsDemo();
        demo.setVisible(true);
    }
}
