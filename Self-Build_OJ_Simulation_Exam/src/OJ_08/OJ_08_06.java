package OJ_08;

import java.util.Scanner;

public class OJ_08_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        String[][] arr = new String[count][3];
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = scanner.next();
                arr[i][2] = "0";
            }
        }

        for (int i = 0; i < count; i++) {
            if (arr[i][2].equals("1")) {
                continue;
            }
            for (int j = count - 1; j >= 0; j--) {
                if (arr[j][2].equals("1")) {
                    continue;
                }
                if (arr[i][0].equals("0") && arr[j][0].equals("1") || arr[i][0].equals("1") && arr[j][0].equals("0")) {
                    System.out.println(arr[i][1] + " " + arr[j][1]);
                    arr[i][2] = "1";
                    arr[j][2] = "1";
                    break;
                }
            }
        }

    }
}
