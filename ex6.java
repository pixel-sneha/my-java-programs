//Create a method that gets two arguments, calculates the product of them and prints it,
import java.util.Scanner;

public class Main {
    // Method declaration
    public static void productOfSum(int a, int b) {
        int product = a*b;
    System.out.println(product);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        // Call the method with a and b as arguments
        productOfSum(a,b);
        scanner.close();
    }
}
