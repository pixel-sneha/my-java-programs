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

//Write a program that gets input from the user, an integer, let's call it num,
// the program prints the sum of all the numbers from 1 to num * 3.
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        int size = num*3;
        for(int i = 1;i<=size;i++){
            sum += i;
        }
        System.out.println(sum);
    }
}

//Write a program that gets two integers from the user - base and power (in this order),
// calculates the exponentiation and prints it.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int pow = sc.nextInt();
        int n = pow,i = 1,ans = 1;
        while(i<=n){
            ans *= base;
            i++;
        }
        System.out.println(ans);
    }
}
