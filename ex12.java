/*Create a method named printPatterns that takes a square 2D array of integers (matrix) as input and prints the following patterns:

Main Diagonal: Print all elements where the row index equals the column index.
Anti-Diagonal: Print all elements where the sum of the row and column indices equals the size of the matrix minus 1.
Borders: Print the elements of the top, bottom, left, and right borders of the matrix.*/
class PrintPatterns {
    public static void printPatterns(int[][] matrix) {
        int size = matrix.length;

        System.out.print("Main Diagonal: ");
        for (int i = 0; i < size; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();

        System.out.print("Anti-Diagonal: ");
        for (int i = 0; i < size; i++) {
            System.out.print(matrix[i][size - 1 - i] + " ");
        }
        System.out.println();

        System.out.print("Top Border: ");
        for (int j = 0; j < size; j++) {
            System.out.print(matrix[0][j] + " ");
        }
        System.out.println();

        System.out.print("Bottom Border: ");
        for (int j = 0; j < size; j++) {
            System.out.print(matrix[size - 1][j] + " ");
        }
        System.out.println();

        System.out.print("Left Border: ");
        for (int i = 0; i < size; i++) {
            System.out.print(matrix[i][0] + " ");
        }
        System.out.println();

        System.out.print("Right Border: ");
        for (int i = 0; i < size; i++) {
            System.out.print(matrix[i][size - 1] + " ");
        }
        System.out.println();
    }
}

/*Create a method named arrayOperations that takes a 2D array of integers (matrix) as input and performs the following operations:

Calculate the sum of all elements in the matrix.
Find the maximum element in the matrix.
Create a new 1D array that contains the sums of each row in the matrix.*/
import java.util.Arrays;
class ArrayOperations {
    public static void arrayOperations(int[][] matrix) {
        int sum = 0, max = matrix[0][0];
        int calSum = 0;
        int rowSums[];
        rowSums = new int[matrix.length];
        for(int i=0;i< matrix.length;i++){
            for(int j=0; j<matrix[i].length;j++){
                sum += matrix[i][j];
                calSum += matrix[i][j];
                if(matrix[i][j]>=max){
                    max = matrix[i][j];
                }
            }
            rowSums[i] = calSum;
            calSum = 0;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Maximum: " + max);
        System.out.println("Row Sums: " + Arrays.toString(rowSums));

    }
}
