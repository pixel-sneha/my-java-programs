/*Write a program that takes two inputs: a text string and a delimiter character. The program should replace all single spaces (" ")
 in the text with the specified delimiter and print the modified string.*/

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String delimiter = scanner.nextLine();
        String[] texts = text.split(" ");
        String newText = String.join(delimiter,texts);
        System.out.println(newText);
    }
}

/*Create a method named createFormattedString that takes the following arguments:
A string productName.
An integer quantity.
A double unitPrice.
The method should return a formatted string that combines these values*/

import java.util.Scanner;
public class Main {
    public static String createFormattedString(String productName, int quantity, double unitPrice) {
        double quantityAsDouble = quantity;
        String formatted = String.format("Product: %s, Quantity: %.1f, Unit Price: %.5f",productName,quantityAsDouble,unitPrice);
        return formatted;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int qty = scanner.nextInt();
        double price = scanner.nextDouble();
        String formattedString = createFormattedString(product, qty, price);
        System.out.println(formattedString);
    }
}

/*Create a method named compareStrings that takes two strings as input and performs the following comparisons:

Checks if the two strings are equal using equals and prints the result.
Checks if the two strings are equal (ignoring case) using equalsIgnoreCase and prints the result.
Compares the two strings using compareTo and prints the result.
Compares the two strings (ignoring case) using compareToIgnoreCase and prints the result.*/

import java.util.Scanner;

public class Main {
    public static void compareStrings(String str1, String str2) {
        boolean cond1 = str1.equals(str2);
        boolean cond2 = str1.equalsIgnoreCase(str2);
        int cond3 = str1.compareTo(str2);
        int cond4 = str1.compareToIgnoreCase(str2);
        System.out.println(str1 + " equals " + str2 + ": " + cond1);
        System.out.println(str1 + " equalsIgnoreCase " + str2 + ": " + cond2);
        System.out.println(str1 + " compareTo " + str2 + ": " + cond3);
        System.out.println(str1 + " compareToIgnoreCase " + str2 + ": " + cond4);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        compareStrings(str1, str2);
    }
}

/*Each test case has one input - an odd whole number.
Your task is to print n - pyramid using **/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int rows = (n / 2) + 1;
        for(int i=0;i<rows;++i){
            String str = new String(new char[2 * (i + 1) - 1]).replace("\0", "*");
            System.out.println(str);
        }
    }
}
