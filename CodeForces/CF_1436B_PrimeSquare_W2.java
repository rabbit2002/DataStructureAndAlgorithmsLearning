import java.util.Scanner;

public class CF_1436B_PrimeSquare_W2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int matrixLine = 0;
        int rowSumBeforeEnd = 0;
        int rowEnd = 0;
        int columnSumBeforeEnd = 0;
        int columnEnd = 0;
        int matrixEnd = 0;
        for (int x = 0; x < count; x++) {
            matrixLine = scanner.nextInt();
            CF_1436B_PrimeSquare_W2 cf_1436B_primeSquare = new CF_1436B_PrimeSquare_W2();
            // a matrix full 1 expect last row and column
            rowSumBeforeEnd = matrixLine - 1;
            rowEnd = cf_1436B_primeSquare.whatsToFill(rowSumBeforeEnd);
            columnSumBeforeEnd = matrixLine - 1;
            columnEnd = cf_1436B_primeSquare.whatsToFill(columnSumBeforeEnd);
            matrixEnd = cf_1436B_primeSquare.whatsToFill(rowEnd * (matrixLine - 1));
            // build
            int[][] matrix = new int[matrixLine][matrixLine];
            if (matrixLine == 2) {
                matrix = new int[][] { { 1, 1 }, { 1, 1 } };
            }
            if (matrixLine == 3) {
                matrix = new int[][] { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };
            }
            for (int i = 0; i < matrixLine; i++) {
                for (int j = 0; j < matrixLine; j++) {
                    matrix[i][j] = 1;
                    matrix[i][columnEnd - 1] = rowEnd;
                    matrix[rowEnd - 1][j] = columnEnd;
                    matrix[matrixLine - 1][matrixLine - 1] = matrixEnd;
                }
            }
            // print
            for (int i = 0; i < matrixLine; i++) {
                for (int j = 0; j < matrixLine; j++) {
                    System.out.printf(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public int whatsToFill(int sum) {
        if (judgePrime(sum + 1)) {
            return 1;
        }
        int returnNum = 4;
        while (true) {
            if (judgePrime(sum + returnNum)) {
                if (!judgePrime(returnNum)) {
                    return returnNum;
                } else {
                    returnNum++;
                }
            } else {
                returnNum++;
            }
        }
        // return是合数
        // sum+return=素数
    }

    public boolean judgePrime(int integer) {
        for (int i = 2; i <= Math.sqrt(integer); i++) {
            if (integer % i == 0) {
                return false;
            }
        }
        return true;
    }
}
