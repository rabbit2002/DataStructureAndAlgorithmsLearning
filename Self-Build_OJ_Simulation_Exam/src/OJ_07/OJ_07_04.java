package OJ_07;

import java.util.Scanner;

public class OJ_07_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int x = 0;
        int y = 0;
        for (int i = 0; i < count; i++) {
            int temp = scanner.nextInt();
            if (temp % 2 == 0) {
                x++;
            } else {
                y++;
            }
        }
        System.out.println(y + " " + x);
    }
}
