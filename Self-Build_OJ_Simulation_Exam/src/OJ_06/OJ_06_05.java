package OJ_06;

import java.util.Scanner;

public class OJ_06_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int sum = (int)Math.round((end - start) / 100.0);
        // System.out.println(sum);

        int hour = sum / 3600;
        int min = (sum % 3600) / 60;
        int second = sum - hour * 3600 - min * 60;

        System.out.printf("%02.0f:%02.0f:%02.0f", (float)hour, (float)min, (float)second);

    }
}
