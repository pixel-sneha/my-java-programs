import java.util.Scanner;

//GUESS THE NUMBER GAME
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randNum = scanner.nextInt();
        
        int guess = scanner.nextInt();
        if(guess>randNum){
            System.out.println("Too high");
        }
        if(guess<randNum){
            System.out.println("Too low");
        }
        if(guess == randNum){
            System.out.println("You are right!");
        }
    }
}

//Write a program that acts as a calculator 
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char operation = scanner.nextLine().charAt(0);
        float ans = 0;
        while(operation != 'e'){
            float num1 = scanner.nextFloat();
            float num2 = scanner.nextFloat();
            scanner.nextLine();
            if(operation=='+'){
                ans = num1+num2;
                System.out.println(ans);
            }
            else if(operation=='-'){
                ans = num1-num2;
                System.out.println(ans);
            }
            else if(operation=='*'){
                ans = num1*num2;
                System.out.println(ans);
            }
            else if(operation=='/'){
                ans = num1/num2;
                System.out.println(ans);
            }
            operation = scanner.nextLine().charAt(0);
        }
    }
}


//Write a program that gets one input, a number. The input number indicates how many times to execute the below method. 
//Also create a method that calculates the sum of all of the numbers between 1 and 1000 (including) and prints it

import java.util.Scanner;

public class Main {
    // Method declaration
    public static void sumNumbers() {
        // Complete Method
        int sum = 0;
        for(int i = 1;i<1001;i++){
            sum += i;
        }
        System.out.println(sum);
    }
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            // Calling method
            sumNumbers();
        }
        scanner.close();
    }
}
