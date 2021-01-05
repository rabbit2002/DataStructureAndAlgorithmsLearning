package OJ_08;

import java.util.Scanner;

public class OJ_08_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int[] arr = new int[1001];
        for (int i = 0; i < count; i++) {
            int length = scanner.nextInt();
            for (int j = 0; j < length; j++) {
                int temp = scanner.nextInt();
                arr[temp]++;
            }
        }

        int max = 0;
        int maxPoint = 0;
        for (int i = 1; i <= 1000; i++) {
            if (arr[i] >= max) {
                max = arr[i];
                maxPoint = i;
            }
        }

        System.out.println(maxPoint + " " + max);
    }
}
