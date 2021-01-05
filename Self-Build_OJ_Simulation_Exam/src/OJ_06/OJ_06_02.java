package OJ_06;

import java.util.Scanner;

public class OJ_06_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(Integer.parseInt(number / 16 + "" + number % 16));
    }
}
