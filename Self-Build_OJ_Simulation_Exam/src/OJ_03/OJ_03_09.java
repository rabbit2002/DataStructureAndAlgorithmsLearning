package OJ_03;

import java.util.Scanner;

public class OJ_03_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        String[] name = new String[count];
        int[] price = new int[count];
        int[] times = new int[count];
        int maxTimes = 0;
        int maxTimesPoint = -1;
        int maxSumPrice = 0;
        int maxSumPricePoint = -1;
        for (int i = 0; i < count; i++) {
            name[i] = scanner.next();
            price[i] = scanner.nextInt();
            times[i] = scanner.nextInt();
            if (times[i] > maxTimes) {
                maxTimes = times[i];
                maxTimesPoint = i;
            }
            if (times[i] * price[i] > maxSumPrice) {
                maxSumPrice = times[i] * price[i];
                maxSumPricePoint = i;
            }
        }
        System.out.println(name[maxTimesPoint] + " " + times[maxTimesPoint]);
        System.out.println(name[maxSumPricePoint] + " " + price[maxSumPricePoint] * times[maxSumPricePoint]);
    }
}
