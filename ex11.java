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
