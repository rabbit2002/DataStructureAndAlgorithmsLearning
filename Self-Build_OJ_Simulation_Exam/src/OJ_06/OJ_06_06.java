package OJ_06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OJ_06_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str = str1 + str2;

        List<Character> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            int temp = 0;
            boolean flag = true;

            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) == str.charAt(i)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                list.add(str.charAt(i));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
    }
}
