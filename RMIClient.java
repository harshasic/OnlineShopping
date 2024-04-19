import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.Naming;
import java.util.List;
import java.util.Scanner;

public class RMIClient {

    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.print("Welcome to Online Shopping\n");
            System.out.println("RMI Client Menu\n");
            System.out.println("1. Admin\n2. User\n3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            // System.out.println(choice);
            switch (choice) {
                case 1:
                    System.out.print("Admin Id: ");
                    String adminId = scanner.next();
                    System.out.print("Password: ");
                    String adminPasswd = scanner.next();
                    boolean isAdminId = adminId.equals("admin");
                    boolean isAdminPasswd = adminPasswd.equals("admin");
                    if (isAdminId && isAdminPasswd){
                        System.out.println("\n\n\nAdmin Login Successful ");
                        System.out.println("Admin View: \n");
                        int adminViewChoice;
                        do{
                            System.out.println("1. Browse Products\n2. Add Product\n3. Remove Product\n4. Exit");
                            System.out.print("Enter your choice: ");
                            adminViewChoice = scanner.nextInt();
                            // System.out.println(adminViewChoice);
                            switch (adminViewChoice){
                                case 1:
                                    System.out.println("You selected browse products option :)");
                                    // Implements browse products here
                                    break;
                                case 2: 
                                    System.out.println("You selected add products option :)");
                                    // Implements add product here
                                    break;
                                case 3:
                                    System.out.println("You selected remove products option :)");
                                    // Implement remove product here
                                    break;
                                default:
                                    break;
                            }
                        }while(adminViewChoice != 4);
                        
                    } else {
                        System.out.println("Invalid admin credentials\n");
                    }
                    break;
                    
                case 2:
                    int userViewChoice;
                    System.out.println("You are in 'User' view\n");
                    do{
                        System.out.println("1. Register\n2. Login\n3. Exit\n");
                        System.out.print("Enter your choice: ");
                        userViewChoice = scanner.nextInt();
                        // System.out.println(userViewChoice);
                        switch (userViewChoice){
                            case 1:
                                System.out.println("You selected user registration");
                                // Implement user registration here
                                break;
                            case 2:
                                System.out.println("You selected user login");
                                // Implement user registration here
                                break;
                            default:
                                break;
                        }
                    }while(userViewChoice != 3);
                    
                    
                    break;
                default:
                    break;
            }
        } while (choice !=3); 
    }
    
}
