package OJ_06;

import java.util.Scanner;

public class OJ_06_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.print("Celsius = " + (int)((number - 32) * 5 / 9.0));
    }
}
