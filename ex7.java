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
