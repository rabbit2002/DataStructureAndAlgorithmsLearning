package OJ_07;

import java.util.Scanner;

public class OJ_07_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bcd = scanner.nextInt();
        System.out.println((bcd / 16) * 10 + bcd % 16);
    }
}
