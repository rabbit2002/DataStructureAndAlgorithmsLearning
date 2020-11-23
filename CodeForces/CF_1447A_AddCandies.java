import java.util.Scanner;

public class CF_1447A_AddCandies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int n = scanner.nextInt();
            System.out.println(n - 1);
            for (int j = 2; j <= n; j++) {
                System.out.print(j);
                if (j < n) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
