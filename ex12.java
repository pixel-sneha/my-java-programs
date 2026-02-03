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
