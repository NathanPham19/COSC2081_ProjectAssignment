import java.util.Scanner;
public class Customer {
    String username;
    String password;
    String phone;
    String email;
    String address;
    //
    private void login(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Username: ");
        String username = scan.nextLine();

        System.out.println("Password: ");
        String pass = scan.nextLine();

    }

    public void registerUser(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Fill out info to register your account!");
        System.out.println("Username: ");
        String username = scan.nextLine();

        System.out.println("Password: ");
        String password = scan.nextLine();

        System.out.print("Email address: ");
        String email = scan.nextLine();

        System.out.print("Phone number: ");
        String phone = scan.nextLine();

        System.out.print("Home address: ");
        String address = scan.nextLine();

        if (username.isEmpty() || password.isEmpty() || phone.isEmpty()
            || email.isEmpty() || address.isEmpty())
            {
            System.out.println("One or more required information is missing. Please re-enter your info.")
            }

    }



    public static void main(String[] args) {
        System.out.println("Login or Register?");

    }
}
