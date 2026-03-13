/*Create a method named validatePassword that takes one argument:

A String (password) to validate
The method should use guard clauses to validate the password and return a message string based on these rules:

If password is null: return "Password cannot be null"
If password is empty: return "Password cannot be empty"
If password length is less than 8: return "Password must be at least 8 characters"
If password contains spaces: return "Password cannot contain spaces"
If all checks pass: return "Valid password"*/
import java.util.Scanner;

public class Main {
    public static String validatePassword(String password) {
        if(password== null) return "Password cannot be null";
        if(password.length()==0) return "Password cannot be empty";
        if(password.length()<8) return "Password must be at least 8 characters";
        if(password.contains(" ")) return "Password cannot contain spaces";
        return "Valid password";
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        if (password.equals("null")) {
            password = null;
        }
        System.out.println(validatePassword(password));
    }
}
