import java.util.Scanner;

public class CF_1451A_SubtractOrDivide {
    public static void main(String[] args) {
        CF_1451A_SubtractOrDivide main = new CF_1451A_SubtractOrDivide();
        // System.out.println(main.judgePrime(6)[1]);
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int number = scanner.nextInt();
            if (number == 1) {
                System.out.println(0);
                continue;
            }
            if (number == 2) {
                System.out.println(1);
                continue;
            }
            if (number == 3) {
                System.out.println(2);
                continue;
            }
            if (number % 2 == 1) {
                System.out.println(3);
                continue;
            }
            if (number % 2 == 0) {
                System.out.println(2);
                continue;
            }
        }
    }
}
