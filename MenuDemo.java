import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuDemo extends JFrame implements ActionListener {
    
    // Variables
    private JTextArea textArea;
    
    public MenuDemo() {
        super("Menu Demo");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Create menu bar
        JMenuBar menuBar = new JMenuBar();
        
        // Create File menu
        JMenu fileMenu = new JMenu("File");
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");
        
        // Add action listeners
        newItem.addActionListener(this);
        openItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);
        
        // Add items to File menu
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);
        
        // Create Edit menu
        JMenu editMenu = new JMenu("Edit");
        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem pasteItem = new JMenuItem("Paste");
        
        // Add action listeners
        cutItem.addActionListener(this);
        copyItem.addActionListener(this);
        pasteItem.addActionListener(this);
        
        // Add items to Edit menu
        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);
        
        // Create Help menu
        JMenu helpMenu = new JMenu("Help");
        JMenuItem aboutItem = new JMenuItem("About");
        aboutItem.addActionListener(this);
        helpMenu.add(aboutItem);
        
        // Add menus to menu bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);
        
        // Set menu bar to the frame
        setJMenuBar(menuBar);
        
        // Create text area for displaying actions
        textArea = new JTextArea();
        textArea.setEditable(false);
        
        // Add text area to frame
        add(new JScrollPane(textArea), BorderLayout.CENTER);
        
        // Set visibility
        setVisible(true);
    }
    
    // Handle menu item clicks
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        textArea.append("Selected menu item: " + command + "\n");
        
        if (command.equals("Exit")) {
            System.exit(0);
        }
    }
    
    public static void main(String[] args) {
        new MenuDemo();
    }
}
