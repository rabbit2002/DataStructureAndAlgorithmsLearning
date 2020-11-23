import java.util.Scanner;

public class OJ_05_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int[][] matrix1 = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        x = scanner.nextInt();
        y = scanner.nextInt();
        int[][] matrix2 = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }
        if (matrix1[0].length != matrix2.length) {
            System.out.println("Error: " + matrix1[0].length + " != " + matrix2.length);
        } else {
            int[][] matrixFin = new int[matrix1.length][matrix2[0].length];
            for (int i = 0; i < matrixFin.length; i++) {
                for (int j = 0; j < matrixFin[0].length; j++) {
                    int sum = 0;
                    for (int k = 0; k < matrix1[0].length; k++) {
                        sum += matrix1[i][k] * matrix2[k][j];
                        System.out.println(sum);
                    }
                    matrixFin[i][j] = sum;
                }
            }
            System.out.println(matrixFin.length + " " + matrixFin[0].length);
            for (int i = 0; i < matrixFin.length; i++) {
                for (int j = 0; j < matrixFin[0].length; j++) {
                    System.out.print(matrixFin[i][j]);
                    if (j < matrixFin[0].length - 1) {
                        System.out.print(" ");
                    }
                }
                if (i < matrixFin.length - 1) {
                    System.out.println();
                }
            }
        }
    }
}
