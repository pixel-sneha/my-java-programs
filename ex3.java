//You are given a program that gets three inputs from the user, 
//op (char), n1 (int) and n2 (int).
//Your task is to add code which initialize new variable res (int)

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char op = scanner.next().charAt(0);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int res;
        if(op=='+'){
            res = n1+n2;
        }
        else if(op=='-'){
            res = n1 - n2;
        }
        else if(op=='*'){
            res = n1*n2;
        }
        else{
            res = 0;
        }
        System.out.println(res);
    }
}


//Write a program that gets two integers as input, and outputs the sum of the two numbers.
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int sum = n1+n2;
        System.out.println(sum);
    }
}
