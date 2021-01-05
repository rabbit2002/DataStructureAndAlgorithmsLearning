package OJ_03;

import java.util.Scanner;

public class OJ_03_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < count; i++) {
            String str = scanner.nextLine();
            int sum = (str.charAt(0) - 48 - 1) * 10 + (1 + str.length()) * str.length() / 2;
            System.out.println(sum);
        }
    }
}
