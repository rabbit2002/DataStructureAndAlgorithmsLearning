import java.util.Scanner;

public class OJ_02_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1 / Math.pow(i, 2);
        }
        System.out.print("sum = ");
        System.out.printf("%.3f", sum);
    }
}
