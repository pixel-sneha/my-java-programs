class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i += 3) {
            if(i>21){
                break;
            }
            System.out.println(i);
        }
    }
}

//Write a program that gets integer input from the user, let's call it num, then it prints all the numbers from 1 to
// num (including) such that are not divisible by 3 or 7 with new line between.
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int i = 1;
        for(i=1;i<=num;i++){
            if(i%3 ==0 || i%7 ==0) continue;
            System.out.println(i);
        }
    }
}
