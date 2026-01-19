/* Create a method named values that receives an array as an argument and prints all of the items in the array one after the other.
To iterate over an array use the .length field */

public class Main {
    public static void values(int[] arr) {
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        values(numbers);
    }
}

/* Create a method named changeElement that receives 3 arguments, it  will return a modified array by
changing the element in an index that is stored in the second argument with the value in the third argument. */
import java.util.Scanner;
public class Main {
    public static String[] changeElement(String[] arr, int index, String newElement) {
        for(int i=0;i<arr.length;i++){
            if(i==index){
                arr[i] = newElement;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String textArray = scanner.nextLine();
        int index = scanner.nextInt();
        scanner.nextLine();
        String newElement = scanner.nextLine();
        String[] arr = textArray.split(",");
        String[] modifiedArr = changeElement(arr, index, newElement);
        for (int i = 0; i < modifiedArr.length; i++) {
            System.out.print(modifiedArr[i] + " ");
        }
    }
}

/*Create a method named merge that receives two arrays as arguments.
The method merges the two arrays into one sorted array and returns it.*/

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static String[] merge(String[] arr1, String[] arr2) {
        Arrays.sort(arr1);
        int size1 = arr1.length;
        int size2 = arr2.length;
        int size = size1 + size2;
        String result[] = new String[size];
        System.arraycopy(arr1, 0, result, 0, size1);
        System.arraycopy(arr2, 0, result, size1, size2);
        Arrays.sort(result);
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String textArr1 = scanner.nextLine();
        String textArr2 = scanner.nextLine();
        String[] arr1 = textArr1.split(",");
        String[] arr2 = textArr2.split(",");

        String[] mergedArray = merge(arr1, arr2);
        System.out.println(Arrays.toString(mergedArray));
    }
}

/*Write a method named prod which gets an array of numbers 
as argument and returns the product of all the numbers in the list.*/
import java.util.Scanner;
public class Main {
    public static int prod(int[] arr) {
        int product = 1;
        for(int i = 0;i< arr.length;i++){
            product *= arr[i];
        }
        return product;
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] stringArr = text.split(",");
        int[] arr = new int[stringArr.length];
        for (int i = 0; i < stringArr.length; i++) {
            arr[i] = Integer.parseInt(stringArr[i]);
        }
        
        int result = prod(arr);
        System.out.println("Product of array elements: " + result);
    }
}
