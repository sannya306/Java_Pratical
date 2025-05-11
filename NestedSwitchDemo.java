import java.util.Scanner;

public class NestedSwitchDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Select department:");
        System.out.println("1. IT");
        System.out.println("2. HR");
        System.out.print("Enter your choice (1 or 2): ");
        int department = scanner.nextInt();
        
        switch (department) {
            case 1:
                System.out.println("IT Department Selected");
                System.out.println("Select your role:");
                System.out.println("1. Developer");
                System.out.println("2. Tester");
                System.out.print("Enter your choice (1 or 2): ");
                int itRole = scanner.nextInt();
                
                switch (itRole) {
                    case 1:
                        System.out.println("You selected Developer role");
                        break;
                    case 2:
                        System.out.println("You selected Tester role");
                        break;
                    default:
                        System.out.println("Invalid role selection");
                }
                break;
                
            case 2:
                System.out.println("HR Department Selected");
                System.out.println("Select your role:");
                System.out.println("1. Recruiter");
                System.out.println("2. HR Manager");
                System.out.print("Enter your choice (1 or 2): ");
                int hrRole = scanner.nextInt();
                
                switch (hrRole) {
                    case 1:
                        System.out.println("You selected Recruiter role");
                        break;
                    case 2:
                        System.out.println("You selected HR Manager role");
                        break;
                    default:
                        System.out.println("Invalid role selection");
                }
                break;
                
            default:
                System.out.println("Invalid department selection");
        }
        
        scanner.close();
    }
}
