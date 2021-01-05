package OJ_01;

import java.util.Scanner;

public class OJ_01_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        String[] inputStrArr = inputStr.split(" ");
        for (int i = inputStrArr.length - 1; i >= 0; i--) {
            System.out.print(inputStrArr[i]);
            if (i > 0) {
                System.out.print(" ");
            }
        }
    }
}
