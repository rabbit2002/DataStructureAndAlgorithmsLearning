package OJ_08;

import java.util.Scanner;

public class OJ_08_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        double sum = 0.0;
        for (int i = 1; i <= number; i++) {
            sum += 1.0 / Math.pow(i, 2);
        }

        System.out.printf("sum = %.3f", sum);
    }
}
