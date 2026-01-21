/*Create a program that starts with an array of words, 
and prints a new array containing only the words longer than 5 characters*/

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] arr = text.split(",");
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > 5) {
                count++;
            }
        }

        String[] newArr = new String[count];

        int newArrIndex = 0;
        for (String word : arr) {
            if (word.length() > 5) {
                newArr[newArrIndex] = word;
                newArrIndex++;
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}

/*Initialize an array of strings named fruits with the values "apple", "banana", "orange", "grape", and "kiwi".
Uses an enhanced for loop to iterate over the fruits array.
In each iteration, prints the current fruit in uppercase using the toUpperCase() method: someString.toUpperCase()*/

public class Main {
    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "orange", "grape", "kiwi"};
        for(String someString : fruits){
            System.out.println(someString.toUpperCase());
        }
    }
}

/*Create a method named calculateStats that takes an array of integers as input and performs the following operations:

Calculates the sum of all elements in the array.
Calculates the average of the elements in the array.
Finds the maximum element in the array.
Finds the minimum element in the array.
The method should return an array of doubles containing the sum, average, maximum, and minimum, in that order.*/

import java.util.Scanner;

public class Main {
    public static double[] calculateStats(int[] arr) {
        int sum = 0, max = arr[0];
        int min = arr[0];
        double[] finalArr = new double[4];
        for (int i : arr) { //to find sum
        sum += i;
        }
        finalArr[0] = sum;

        double average = (double) sum / arr.length; //to find avg
        finalArr[1] = average;

        for(int i = 1; i < arr.length; i++){ 
            if(arr[i]>max){ //to find max
                max = arr[i];
            }
            if(arr[i]<min){ //to find min
                min = arr[i];
            }
        }
        finalArr[2] = max;
        finalArr[3] = min;
        return finalArr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] arrString = text.split(",");
        int[] numbers = new int[arrString.length];
        for (int i = 0; i < arrString.length; i++) {
           numbers[i] = Integer.parseInt(arrString[i]);
        }
        double[] stats = calculateStats(numbers);
        System.out.println("Sum: " + stats[0]);
        System.out.println("Average: " + stats[1]);
        System.out.println("Maximum: " + stats[2]);
        System.out.println("Minimum: " + stats[3]);
    }
}
