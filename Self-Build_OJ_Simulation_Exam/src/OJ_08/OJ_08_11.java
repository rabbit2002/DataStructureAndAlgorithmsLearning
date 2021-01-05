package OJ_08;

import java.util.Scanner;

public class OJ_08_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int max = 0;
        int sum = 0;
        for (int i = 0; i < count; i++) {
            if (sum < 0) {
                sum = 0;
            }
            if (sum > max) {
                max = sum;
            }
            sum += scanner.nextInt();
        }
        System.out.println(max);
    }
}
