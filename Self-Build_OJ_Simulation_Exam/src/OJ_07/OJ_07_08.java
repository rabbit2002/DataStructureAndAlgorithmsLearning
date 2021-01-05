package OJ_07;

import java.util.Scanner;

public class OJ_07_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int p = scanner.nextInt();
        int[] arr = new int[n];
        int max = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] * p >= max) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
