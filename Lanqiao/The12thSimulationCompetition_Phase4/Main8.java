package The12thSimulationCompetition_Phase4;

import java.util.Scanner;

/**
 * 问题描述
 * 给定一个序列 S = (s[1], s[2], ..., s[n])，
 * 一个位置 p 上的变化度是指以这个位置为中心的相邻的 5 个元素的最大值与最小值的差，
 * 即 s[p-2], s[p-1], s[p], s[p+1], s[p+2] 中最大值与最小值的差。
 * 一个序列总共有 n-4 个变化度，位置 1, 2, n-1, n 没有变化度。
 * 例如，对于下面的序列 (1, 0, 4, 8, 5, 7, 6)，总共有 3, 4, 5 三个位置有变化度，分别为 8, 8, 4。
 * 给定一个序列，请求出这个序列的变化度。
 * <p>
 * 输入格式
 * 输入的第一行包含一个整数 n，表示给定的序列长度。
 * 第二行包含 n 个整数 s[1], s[2], ..., s[n]，表示给定的序列。
 * <p>
 * 输出格式
 * 输出一行，包含 n-4 个非负整数，分别表示每个位置的变化度。
 * <p>
 * 样例输入
 * 7
 * 1 0 4 8 5 7 6
 * <p>
 * 样例输出
 * 8 8 4
 * <p>
 * 数据规模和约定
 * 对于所有评测用例，5 <= n <= 1000，0 <= s[i] <= 1000000。
 *
 * @author RABBIT2002
 * @date 2021/3/23
 */
public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int[] arrays = new int[length];
        for (int i = 0; i < length; i++) {
            arrays[i] = scanner.nextInt();
        }

        for (int i = 2; i < length - 2; i++) {
            int max = Math.max(
                    arrays[i - 2],
                    Math.max(
                            arrays[i - 1],
                            Math.max(
                                    arrays[i],
                                    Math.max(
                                            arrays[i + 1],
                                            arrays[i + 2]
                                    ))));
            int min = Math.min(
                    arrays[i - 2],
                    Math.min(
                            arrays[i - 1],
                            Math.min(
                                    arrays[i],
                                    Math.min(
                                            arrays[i + 1],
                                            arrays[i + 2]
                                    ))));

            System.out.print(max - min);
            if (i < length - 2 - 1) {
                System.out.print(" ");
            }
        }
    }
}
