package OJ_06;

import java.util.Scanner;

public class OJ_06_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        int x = 0;
        int y = 0;
        for (int i = 0; i < count; i++) {
            int[] numberArr = new int[4];

            for (int j = 0; j < 4; j++) {
                numberArr[j] = scanner.nextInt();
            }

            int sum = numberArr[0] + numberArr[2];
            if (sum == numberArr[1] && sum != numberArr[3]) {
                y++;
            }
            if (sum != numberArr[1] && sum == numberArr[3]) {
                x++;
            }

        }
        System.out.println(x + " " + y);

    }
}
