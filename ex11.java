/*Create a method named subMatrices that takes two 2D arrays (matrices) as input and return their difference as a new 2D array.*/
class SubMatrices {
    public static int[][] subMatrices(int[][] matrix1, int[][] matrix2) {
        int sub[][];
        sub = new int [matrix1.length][matrix1[0].length];
        for(int i=0; i<matrix1.length;i++){
            for(int j=0; j<matrix1[0].length;j++){
                sub[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return sub;
    }
}

/*Create a method matrixOperation that takes: Two 3x3 matrices,A String operator ("add", “subtract”)
Returns: For "add": New matrix with sum of elements,
For "subtract": New matrix with difference of elements*/

class MatrixOperation {
    public static int[][] matrixOperation(int[][] matrix1, int[][] matrix2, String operator) {
        int result[][];
        result = new int[matrix1.length][matrix1[0].length];
        for(int i = 0; i<matrix1.length;i++){
            for(int j = 0; j<matrix1[0].length;j++){
                if(operator.equals("add")){
                    result[i][j] = matrix1[i][j] + matrix2[i][j];
                }
                else if(operator.equals("subtract")){
                    result[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }
        }
        return result;
    }
}

/*Create a method named createJaggedArray that takes an integer n as input returns a jagged array of integers. The jagged array should have the following structure:
The first row should have 1 element.
The second row should have 2 elements.
The third row should have 3 elements.
And so on, up to the n row, which should have n elements.
Initialize each element of the array with the product of its row and column indices (starting from 1). For example, the element at the second row and first column should have the value 2 * 1 = 2.*/

class CreateJaggedArray {
    public static int[][] createJaggedArray(int n) {
        int[][] jaggedArray = new int[n][];

        for (int i = 0; i < jaggedArray.length; i++) {
            jaggedArray[i] = new int[i + 1];
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = (i + 1) * (j + 1);
            }
        }

        return jaggedArray;
    }
}
