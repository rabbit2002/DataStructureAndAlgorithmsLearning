import java.util.Scanner;

public class CF_1447B_NumbersBox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[] arr = new int[n * m];
            int nagiviteTimes = 0;
            int minNum = Integer.MAX_VALUE;
            int sumNum = 0;
            for (int j = 0; j < arr.length; j++) {
                arr[j] = scanner.nextInt();
                if (arr[j] < 0) {
                    arr[j] = 0 - arr[j];
                    nagiviteTimes++;
                    sumNum += arr[j];
                    if (minNum > arr[j]) {
                        minNum = arr[j];
                    }
                } else {
                    sumNum += arr[j];
                    if (minNum > arr[j]) {
                        minNum = arr[j];
                    }
                }
            }
            if (nagiviteTimes % 2 == 0) {
                System.out.println(sumNum);
            } else {
                System.out.println(sumNum - minNum * 2);
            }
        }
    }
}
