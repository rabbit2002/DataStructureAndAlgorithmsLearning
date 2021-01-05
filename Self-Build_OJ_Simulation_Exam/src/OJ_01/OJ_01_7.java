package OJ_01;

import java.util.Scanner;

public class OJ_01_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int num = scanner.nextInt();
            String numStr = String.valueOf(num);
            int numHow = Integer.parseInt(numStr.substring(0, 1));
            int sum = (numHow - 1) * 10 + (1 + numStr.length()) * numStr.length() / 2;
            System.out.println(sum);
        }
    }
}
