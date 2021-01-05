package OJ_03;

import java.util.Scanner;

public class OJ_03_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        int[] power = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
        char[] endChar = {'1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2'};
        boolean flag = true;
        for (int i = 0; i < count; i++) {
            String input = scanner.nextLine();
            char inputEndof = input.charAt(input.length() - 1);
            int sum = 0;
            for (int j = 0; j < 17; j++) {
                sum += (input.charAt(j) - 48) * power[j];
            }
            if (endChar[sum % 11] != inputEndof) {
                System.out.println(input);
                flag = false;
            }
        }
        if (flag) {
            System.out.println("All passed");
        }
    }
}
