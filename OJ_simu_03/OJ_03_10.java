import java.util.Scanner;

public class OJ_03_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] inputArr = new int[count + 1];
        inputArr[count] = 0;
        for (int i = 0; i < count; i++) {
            inputArr[i] = scanner.nextInt();
        }
        int point = 2;
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += point;
            if (inputArr[i] > inputArr[i + 1]) {
                point++;
            } else {
                point = 2;
            }
        }
        if (inputArr[inputArr.length - 2] > inputArr[inputArr.length - 3]) {
            sum++;
        }
        System.out.println(sum * 100);
    }
}
