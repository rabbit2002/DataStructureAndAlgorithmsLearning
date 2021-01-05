package OJ_05;

import java.util.Scanner;

public class OJ_05_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int num = scanner.nextInt();
        String[] arr = new String[(int)Math.pow(26, count)];
        int pow = count;
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char)97 + "" + (char)97 + "" + (char)97;
        }
    }
}
