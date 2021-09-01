package GPLT_Exercises;

import java.util.Scanner;

public class L1_007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        char inputChar[] = input.toCharArray();
        for (int i = 0; i < inputChar.length; i++) {
            switch (inputChar[i]) {
                case '-':
                    System.out.printf("fu");
                    break;
                case '1':
                    System.out.printf("yi");
                    break;
                case '2':
                    System.out.printf("er");
                    break;
                case '3':
                    System.out.printf("san");
                    break;
                case '4':
                    System.out.printf("si");
                    break;
                case '5':
                    System.out.printf("wu");
                    break;
                case '6':
                    System.out.printf("liu");
                    break;
                case '7':
                    System.out.printf("qi");
                    break;
                case '8':
                    System.out.printf("ba");
                    break;
                case '9':
                    System.out.printf("jiu");
                    break;
                case '0':
                    System.out.printf("ling");
                    break;
            }
            if (i < inputChar.length - 1) {
                System.out.printf(" ");
            }
        }
    }
}
