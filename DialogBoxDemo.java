import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DialogBoxDemo extends JFrame {
    
    public DialogBoxDemo() {
        super("Dialog Box Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Create panel with layout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        // Create buttons
        JButton messageButton = new JButton("Show Message Dialog");
        JButton confirmButton = new JButton("Show Confirm Dialog");
        JButton inputButton = new JButton("Show Input Dialog");
        JButton optionButton = new JButton("Show Option Dialog");
        JButton customButton = new JButton("Show Custom Dialog");
        
        // Add action listeners
        messageButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(
                    DialogBoxDemo.this,
                    "This is a simple message dialog",
                    "Message",
                    JOptionPane.INFORMATION_MESSAGE
                );
            }
        });
        
        confirmButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int result = JOptionPane.showConfirmDialog(
                    DialogBoxDemo.this,
                    "Do you want to continue?",
                    "Confirmation",
                    JOptionPane.YES_NO_CANCEL_OPTION
                );
                
                String message = "";
                switch (result) {
                    case JOptionPane.YES_OPTION:
                        message = "You clicked YES";
                        break;
                    case JOptionPane.NO_OPTION:
                        message = "You clicked NO";
                        break;
                    case JOptionPane.CANCEL_OPTION:
                        message = "You clicked CANCEL";
                        break;
                    case JOptionPane.CLOSED_OPTION:
                        message = "You closed the dialog";
                        break;
                }
                
                JOptionPane.showMessageDialog(
                    DialogBoxDemo.this,
                    message,
                    "Result",
                    JOptionPane.INFORMATION_MESSAGE
                );
            }
        });
        
        inputButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = JOptionPane.showInputDialog(
                    DialogBoxDemo.this,
                    "Please enter your name:",
                    "Input",
                    JOptionPane.QUESTION_MESSAGE
                );
                
                if (input != null && !input.isEmpty()) {
                    JOptionPane.showMessageDialog(
                        DialogBoxDemo.this,
                        "Hello, " + input + "!",
                        "Greeting",
                        JOptionPane.INFORMATION_MESSAGE
                    );
                }
            }
        });
        
        optionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String[] options = {"Option 1", "Option 2", "Option 3"};
                int result = JOptionPane.showOptionDialog(
                    DialogBoxDemo.this,
                    "Select an option:",
                    "Options",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[0]
                );
                
                if (result >= 0) {
                    JOptionPane.showMessageDialog(
                        DialogBoxDemo.this,
                        "You selected: " + options[result],
                        "Selection",
                        JOptionPane.INFORMATION_MESSAGE
                    );
                }
            }
        });
        
        customButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JPanel customPanel = new JPanel();
                customPanel.setLayout(new GridLayout(2, 2, 5, 5));
                
                customPanel.add(new JLabel("Username:"));
                JTextField username = new JTextField(10);
                customPanel.add(username);
                
                customPanel.add(new JLabel("Password:"));
                JPasswordField password = new JPasswordField(10);
                customPanel.add(password);
                
                int result = JOptionPane.showConfirmDialog(
                    DialogBoxDemo.this,
                    customPanel,
                    "Login",
                    JOptionPane.OK_CANCEL_OPTION,
                    JOptionPane.PLAIN_MESSAGE
                );
                
                if (result == JOptionPane.OK_OPTION) {
                    JOptionPane.showMessageDialog(
                        DialogBoxDemo.this,
                        "Username: " + username.getText() + "\nPassword: " + new String(password.getPassword()),
                        "Input Values",
                        JOptionPane.INFORMATION_MESSAGE
                    );
                }
            }
        });
        
        // Add buttons to panel
        panel.add(messageButton);
        panel.add(confirmButton);
        panel.add(inputButton);
        panel.add(optionButton);
        panel.add(customButton);
        
        // Add panel to frame
        add(panel);
        
        // Display frame
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new DialogBoxDemo();
    }
}
