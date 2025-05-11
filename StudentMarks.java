import java.util.Scanner;

class Student {
    private String name;
    private int[] marks;
    private int total;
    private double average;
    
    // Constructor
    public Student(String name, int mark1, int mark2, int mark3) {
        this.name = name;
        this.marks = new int[3];
        marks[0] = mark1;
        marks[1] = mark2;
        marks[2] = mark3;
        calculateResults();
    }
    
    // Method to calculate total and average
    private void calculateResults() {
        total = 0;
        for (int mark : marks) {
            total += mark;
        }
        average = (double) total / marks.length;
    }
    
    // Method to display results
    public void displayResults() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Marks: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
        System.out.println("Total Marks: " + total);
        System.out.printf("Average: %.2f\n", average);
    }
}

public class StudentMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter mark for subject 1: ");
        int mark1 = scanner.nextInt();
        
        System.out.print("Enter mark for subject 2: ");
        int mark2 = scanner.nextInt();
        
        System.out.print("Enter mark for subject 3: ");
        int mark3 = scanner.nextInt();
        
        // Create Student object
        Student student = new Student(name, mark1, mark2, mark3);
        
        // Display results
        student.displayResults();
        
        scanner.close();
    }
}
