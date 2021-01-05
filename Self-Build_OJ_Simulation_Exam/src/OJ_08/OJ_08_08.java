package OJ_08;

import java.util.Scanner;

public class OJ_08_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = scanner.nextInt();
        int end = scanner.nextInt();

        int pointI;
        boolean flag = false;

        for (int i = start; i <= end; i++) {

            int sum = (int)(Math.pow(i, 3) - Math.pow(i - 1, 3));
            double sqrt = Math.sqrt(sum);
            //System.out.println(sqrt);
            pointI = i;

            if (sqrt % 1 > 10E-6) {
                continue;
            }

            for (int j = (int)Math.sqrt(((int)sqrt) / 2) + 1; j >= 1; j--) {
                if ((int)sqrt == Math.pow(j, 2) + Math.pow(j - 1, 2)) {
                    System.out.println(i + " " + j);
                    flag = true;
                }
            }

        }

        if (!flag) {
            System.out.println("No Solution");
        }

    }
}
