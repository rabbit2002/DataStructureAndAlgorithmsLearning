package OJ_07;

import java.util.Scanner;

public class OJ_07_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[] flag = new boolean[150];

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str = str1 + str2;

        for (int i = 0; i < str.length(); i++) {
            int temp = str.charAt(i);
            // System.out.println(temp);

            if (flag[temp] == false) {
                System.out.print(str.charAt(i));
                flag[temp] = true;
            }
        }

    }
}
