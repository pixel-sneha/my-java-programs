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
