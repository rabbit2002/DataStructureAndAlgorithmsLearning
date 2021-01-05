import java.util.Scanner;

public class CF_1452B_ToyBlocks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        CF_1452B_ToyBlocks main = new CF_1452B_ToyBlocks();
        for (int i = 0; i < count; i++) {
            int n = scanner.nextInt();
            int sum = 0;
            int max = 0;
            int[] ai = new int[n];
            for (int j = 0; j < n; j++) {
                ai[j] = scanner.nextInt();
                sum += ai[j];
                if (ai[j] > max) {
                    max = ai[j];
                }
            }
            sum -= max;
            System.out.println(main.returnNumber(sum, max));
        }
    }

    public int returnNumber(int x, int y) {
        if (x == 0) {
            return y;
        } else if (y == 0) {
            return x;
        } else if (x > y) {
            return x % y;
        } else {
            return y % x;
        }
    }
}
