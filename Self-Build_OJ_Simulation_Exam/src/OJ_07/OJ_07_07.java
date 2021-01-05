package OJ_07;

import java.util.Scanner;

public class OJ_07_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OJ_07_07 main = new OJ_07_07();

        String tempStr = scanner.nextLine();
        int length = Integer.parseInt(tempStr.split(" ")[0]);
        int needLength = Integer.parseInt(tempStr.split(" ")[1]);
        String number = scanner.nextLine();

        // System.out.println(number.substring(0,length));

        for (int i = 0; i <= length - needLength; i++) {
            if (main.judge(Integer.parseInt(number.substring(i, i + needLength)))) {
                System.out.println(number.substring(i, i + needLength));
                return;
            }
        }

        System.out.println(404);

        // System.out.println(number);
    }

    public boolean judge(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
