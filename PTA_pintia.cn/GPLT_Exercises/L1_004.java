package GPLT_Exercises;

import java.util.Scanner;

public class L1_004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int F = scanner.nextInt();
        int C = 5 * (F - 32) / 9;
        System.out.println("Celsius = " + C);
    }
}
