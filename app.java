import java.util.*;

public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("================================");
        System.out.println("     MESH SOLVER on DISK P:");
        System.out.println("================================");
        System.out.println("1. USER Application");
        System.out.println("2. ADMIN Control");
        System.out.print("Choose: ");
        
        int choice = scanner.nextInt();
        scanner.nextLine();
        
        if(choice == 1) {
            startUserApp();
        } else {
            startAdminPanel();
        }
    }
    
    public static void startUserApp() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n=== USER APPLICATION ===");
        System.out.println("Available codes: 1s3b_jwjwiwi, 2x4c_kdkdkdk");
        System.out.print("Enter your code: ");
        String code = scanner.nextLine();
        
        if(code.equals("1s3b_jwjwiwi") || code.equals("2x4c_kdkdkdk")) {
            System.out.println("ACCESS GRANTED!");
            System.out.println("AI: Send CDZ link...");
            System.out.print("You: ");
            String link = scanner.nextLine();
            
            System.out.println("Analyzing: " + link);
            System.out.println("ANSWERS EXTRACTED SUCCESSFULLY!");
        } else {
            System.out.println("INVALID ACCESS CODE!");
        }
        
        System.out.println("\nPress Enter...");
        scanner.nextLine();
    }
    
    public static void startAdminPanel() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n=== ADMIN CONTROL ===");
        System.out.println("Running from Disk P:");
        System.out.println("Users: 28");
        System.out.println("Active: 7");
        System.out.println("Server: ONLINE");
        
        System.out.println("\n1. View all users");
        System.out.println("2. Block user");
        System.out.println("3. Restart server");
        System.out.print("Choose: ");
        
        int choice = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("ADMIN COMMAND COMPLETED!");
        System.out.println("\nPress Enter...");
        scanner.nextLine();
    }
}