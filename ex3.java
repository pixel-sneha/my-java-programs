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

//Write a program that:
/*prints "Enter your age:" (with new line)
Gets input from the user, one integer (the user's age)
calculates the difference between the user's age and 120. For example: for age 32, 88 will be calculated.
prints the calculated number. */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        int diff = 120-age;
        System.out.println(diff);
    }
}

//Write a program that prints "hello" 10 times. Do it using a for loop. 
class Main {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            System.out.println("hello");
        }
    }
}

class Main {
    public static void main(String[] args) {
        int i = 1;
        while(i<=10){
            System.out.println("hello");
            i++;
        }
    }
}
