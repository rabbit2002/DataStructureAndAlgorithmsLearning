package OJ_06;

import java.util.Scanner;

public class OJ_06_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < count; i++) {
            String str = scanner.nextLine();
            //            System.out.println(str);
            //            System.out.print("AI: ");

            String[] strArr = str.split(" ");
            StringBuffer stringBuffer = new StringBuffer();
            for (int j = 0; j < strArr.length; j++) {
                if (j >= 1 && strArr[j - 1].equals("") && strArr[j].equals("")) {
                    continue;
                }
                System.out.println(strArr[j]);
            }

        }
    }
}
