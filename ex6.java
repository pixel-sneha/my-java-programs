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

/* Create a method that receives two arguments and returns the bigger number of the two. if both are equal then return one of them.

Iterate iterations times and for each iteration do:

Call the method with num1, num2, and save the result in a variable.
Divide the bigger number of the two by 2, and then replace the original larger variable with the new result value.
print the new value.  
Continue doing it until the program iterated iterations times or one of the numbers is smaller than 2.
*/
import java.util.Scanner;

public class Main {
    
    public static double bigger(double arg1, double arg2) {
        return (arg1 >= arg2) ? arg1 : arg2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iterations = scanner.nextInt();
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        for (int i = 0; i < iterations; i++) {
            if(num1<2 || num2<2){
                break;
            }
            double result = bigger(num1,num2);
            if (result == num1){
                num1 /= 2;
                System.out.println(num1);
            }
            
            else if (result == num2){
            num2 /= 2;
            System.out.println(num2);
            }
        }
        
    }


/*Write a function named sigma with one argument that represents a number n.

The function will return the sum of all the numbers from 1 to n (including). */
import java.util.Scanner;

public class Main {
    public static int sigma(int n) {
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum += i;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = sigma(n);
        System.out.println(res);
    }
}
}

/*Write a method named is_valid that gets two strings arguments, username and password.
The method will return True if the username and password are valid in the system, otherwise False.
Our system contains only two valid usernames - "admin" and "user".
The valid password for username "user" is "qweasd".
For username "admin" any password is valid! */
/*Write a method named is_valid that gets two strings arguments, username and password.

The method will return True if the username and password are valid in the system, otherwise False.

Our system contains only two valid usernames - "admin" and "user".

The valid password for username "user" is "qweasd".

For username "admin" any password is valid! */
import java.util.Scanner;

public class Main {
    public static boolean is_valid(String username, String password) {
    switch (username) {
        case "admin":
            return true;
        case "user":
            return password.equals("qweasd");
        default:
            return false;
    }
}

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String user = scanner.nextLine();
        String pass = scanner.nextLine();
        boolean res = is_valid(user, pass);
        System.out.println(res);
    }
}
