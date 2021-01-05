package OJ_02;

import java.util.Scanner;

public class OJ_02_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int sum = x * y;
        char[] sumArr = String.valueOf(sum).toCharArray();
        for (int i = sumArr.length - 1; i >= 0; i--) {
            System.out.print(sumArr[i]);
        }
    }
}
