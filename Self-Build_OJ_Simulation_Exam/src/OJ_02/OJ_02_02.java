package OJ_02;

import java.util.Scanner;

public class OJ_02_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        boolean flag = true;
        for (int i = 0; i < count; i++) {
            String idNumStr = scanner.nextLine();
            char idNumEnd = idNumStr.charAt(idNumStr.length() - 1);
            int[] idNumArr = new int[idNumStr.length() - 1];
            int[] power = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
            char[] judge = {'1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2'};
            int sum = 0;
            int remainder = 0;
            for (int j = 0; j < idNumArr.length; j++) {
                idNumArr[j] = idNumStr.charAt(j) - 48;
                sum += power[j] * idNumArr[j];
            }
            remainder = sum % 11;
            if (idNumEnd != judge[remainder]) {
                System.out.println(idNumStr);
                flag = false;
            }
        }
        if (flag) {
            System.out.println("All passed");
        }
    }
}
