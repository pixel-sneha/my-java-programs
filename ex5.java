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
