import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you an admin? Y/N");
        String ans = scan.nextLine();

        // Engage Admin login if Y
        if (ans == "y" || ans == "Y"){
            System.out.println("Welcome Admin! Please enter your credentials!");
            System.out.println("Username: ");
            String user = scan.nextLine();
            String pass = scan.nextLine();

            Admin a1 = new Admin(user, pass);
        }

        else if (ans == "n" || ans == "N") {
            System.out.println("Welcome Customer! Do you want to create an account?");
            String ans1 = scan.nextLine();

        }
        // Engage Student Class if N

    }
}