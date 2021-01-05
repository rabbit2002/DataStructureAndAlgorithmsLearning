package OJ_08;

import java.util.Scanner;

public class OJ_08_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        int length = Integer.parseInt(str1.split(" ")[0]);
        String fill = str1.split(" ")[1];
        String str = scanner.nextLine();
        int strLength = str.length();

        for (int i = 0; i < length - strLength; i = i + fill.length()) {
            System.out.print(fill);
        }

        if (length > strLength) {
            System.out.print(str);
        } else {
            System.out.print(str.substring(Math.abs(length - strLength), strLength));
        }

    }
}
