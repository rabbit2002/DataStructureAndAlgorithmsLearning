package OJ_08;

import java.util.Scanner;

public class OJ_08_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        System.out.printf("%.6f", Math.abs(a + b));
    }
}
