import java.util.Scanner;

public class CF_1437A_MarketingScheme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            if (2 * l > r) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
