import java.util.Scanner;

public class CF_1436A_Reorder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[] arr = new int[n];
            //arr an
            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }
            int anSum = 0;
            for (int j = 0; j < n; j++) {
                anSum += arr[j];
            }
            if (anSum == m) {
                System.out.printf("YES");
            } else {
                System.out.printf("NO");
            }
            System.out.println();
        }
    }
}
