import java.util.Scanner;
public class Customer {

    private void login(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Username: ");
        String username = scan.nextLine();

        System.out.println("Password: ");
        String pass = scan.nextLine();

    }

    private void registerUser(){
        String username;
        String password;
        String phone;
        String email;
        String address;

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
