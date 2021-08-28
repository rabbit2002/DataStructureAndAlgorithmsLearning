import java.util.Scanner;

public class CF_1447F1_FrequencyProblem_EasyVersion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] numberArr = new int[number];
        int maxFrequency = 0;
        int maxFrequencyPoint = 0;
        int secondFrequency = 0;
        int secondFrequencyPoint = 0;
        for (int i = 0; i < number; i++) {
            numberArr[i] = scanner.nextInt();
        }
        if (number == 1) {
            System.out.println(0);
            return;
        }
        // 7
        // 1 1 2 2 3 3 3
        for (int i = 0; i < number; i++) {
            // 首先和最大的比较 如果不是最大的数字 就和第二大的比较
            if (numberArr[i] == maxFrequencyPoint) {
                maxFrequency++;
            }
            if (numberArr[i] == secondFrequencyPoint && secondFrequencyPoint != 0) {
                secondFrequency++;
            }
            if (numberArr[i] != maxFrequencyPoint && secondFrequencyPoint == 0) {
                secondFrequencyPoint = numberArr[i];
                secondFrequency++;
            }
            // 第二大和最大判断 如果第二大大于第一 则交换
            if (secondFrequency > maxFrequency) {
                int tempPoint = secondFrequencyPoint;
                secondFrequencyPoint = maxFrequencyPoint;
                maxFrequencyPoint = tempPoint;
                int tempFrequency = secondFrequency;
                secondFrequency = maxFrequency;
                maxFrequency = tempFrequency;
            }
        }
        System.out.println(number - maxFrequency + secondFrequency);
    }
}
