import java.util.Scanner;

public class OJ_03_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int sum = x * y;
        String sumStr = String.valueOf(sum);
        for (int i = sumStr.length() - 1; i >= 0; i--) {
            System.out.print(sumStr.charAt(i));
        }
    }
}
