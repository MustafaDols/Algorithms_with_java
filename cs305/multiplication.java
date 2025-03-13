package cs305;

public class multiplication {
    public static void main(String[] args) {

        int[][] A = {
                {1, 2},
                {3, 4}
        };
        int[][] B = {
                {1, 0},
                {0, 1}
        };

        int[][] result = multiplyMatrices(A, B);
        printMatrix(result);
    }


    public static int[][] multiplyMatrices(int [][] A , int [][] B){
        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;
        int[][] C = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return C;



            }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}



