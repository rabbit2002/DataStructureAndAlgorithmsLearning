import java.util.Scanner;

public class CF_1491B_MinimalCost_W2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCast = scanner.nextInt();

        int n = scanner.nextInt();
        int u = scanner.nextInt();
        int v = scanner.nextInt();

        for (int i = 0; i < testCast; i++) {
            int input = scanner.nextInt();
            int inputBefore = input;
            boolean wall = true;
            for (int j = 1; j < n; j++) {
                input = scanner.nextInt();
                if (input != inputBefore) {
                    wall = false;
                }
                if (Math.abs(input - inputBefore) > 1) {
                    System.out.println(0);
                    return;
                }
                input = inputBefore;
            }

            if (!wall) {
                System.out.println(Math.min(u, v));
            } else {
                System.out.println(Math.min(u + v, v * 2));
            }
        }

    }
}
