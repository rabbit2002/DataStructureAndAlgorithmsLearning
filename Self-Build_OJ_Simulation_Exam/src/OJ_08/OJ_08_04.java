package OJ_08;

import java.util.Scanner;

public class OJ_08_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        System.out.println(number / 16 * 10 + number % 16);
    }
}
