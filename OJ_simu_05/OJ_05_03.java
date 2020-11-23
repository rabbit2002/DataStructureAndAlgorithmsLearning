import java.util.Scanner;

public class OJ_05_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int n = a + b + c;
        int m = 3 - n;
        if (m == 3) {
            System.out.println("The winner is a: " + x + " + " + m);
        } else if (n == 3) {
            System.out.println("The winner is b: " + y + " + " + n);
        }
        if (x > y && m > 0) {
            System.out.println("The winner is a: " + x + " + " + m);
        } else if (x < y && n > 0) {
            System.out.println("The winner is b: " + y + " + " + n);
        }
    }
}
