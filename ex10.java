public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
            {5, 7, 10, 24, 41},
            {86, 13, 683, 64, 13},
            {42, 46, 791, 111, 9},
            {86, 88, 1845, 5, 15897},
            {9, 1, 5, 5, 6}
        };
            
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*Create a method named getElement that takes three arguments:
A 2D array of integers named matrix.
An integer rowIndex representing the row index.
An integer colIndex representing the column index.
The method should return the element at the specified row and 
column in the matrix. If the rowIndex or colIndex is out of bounds, the method should return -1. */

class GetElement {
    public static int getElement(int[][] matrix, int rowIndex, int colIndex) {
        if(rowIndex<0 || rowIndex>=matrix.length || colIndex<0 || colIndex>=matrix.length){
            return -1;
        }
        for(int i=0;i< matrix.length;i++){
            for(int j = 0;j<matrix.length;j++){
                if(matrix[i][j]==matrix[rowIndex][colIndex]){
                    return matrix[rowIndex][colIndex];
                }
            }
        }
        return matrix[rowIndex][colIndex];
    }
}

/*Create a method named printMatrix that takes a 2D array of integers as an 
argument and prints its elements in a matrix format. 
Use nested loops to iterate over the rows and columns of the array.*/

class PrintMatrix {
    public static void printMatrix(int[][] matrix) {
        int i,j;
        for(i=0;i<matrix.length;i++){
            for(j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
    }
}

/*Create a method named printSum that takes a 2D array of integers as an argument. 
The method should: Calculate and print the sum of each row,
Print the sums "Row X sum: Y" (where X is the row index and Y is the sum)*/

import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class Main {
    public static void printSum(int[][] array) {
        int sum = 0;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                sum += array[row][col];
                }
        System.out.print("Row " + row + " sum: " +sum);
        sum = 0;
        System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arrayString = scanner.nextLine();
        
        Type arrayType = new TypeToken<int[][]>(){}.getType();
        int[][] array = new Gson().fromJson(arrayString, arrayType);
        
        printSum(array);
    }
}
