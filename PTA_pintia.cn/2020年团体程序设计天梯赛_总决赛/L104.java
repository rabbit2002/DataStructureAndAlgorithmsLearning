import java.util.Scanner;

/**
 * L1-4 调和平均
 * <p>
 * N 个正数的算数平均是这些数的和除以 N，它们的调和平均是它们倒数的算数平均的倒数。
 * 本题就请你计算给定的一系列正数的调和平均值。
 * <p>
 * 输入格式：
 * 每个输入包含 1 个测试用例。
 * 每个测试用例第 1 行给出正整数 N (≤1000)；第 2 行给出 N 个正数，都在区间 [0.1,100] 内。
 * <p>
 * 输出格式：
 * 在一行中输出给定数列的调和平均值，输出小数点后2位。
 * <p>
 * 输入样例：
 * 8
 * 10 15 12.7 0.3 4 13 1 15.6
 * <p>
 * 输出样例：
 * 1.61
 */
public class L104 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] arr = new int[count];

        double sum = 0.0;
        for (int i = 0; i < count; i++) {
            arr[i] = (int)(scanner.nextDouble() * 10);
            sum += 1.0 / arr[i];
        }

        System.out.printf("%.2f", count / (sum * 10));
    }
}

