import java.util.Scanner;

/**
 * L1-3 奇偶分家
 * <p>
 * 给定 N 个正整数，请统计奇数和偶数各有多少个？
 * <p>
 * 输入格式：
 * 输入第一行给出一个正整 N （≤1000）；第2行给出 N 个非负整数，以空格分隔。
 * <p>
 * 输出格式：
 * 在一行中先后输出奇数的个数、偶数的个数。中间以1个空格分隔。
 * <p>
 * 输入样例：
 * 9
 * 88 74 101 26 15 0 34 22 77
 * <p>
 * 输出样例：
 * 3 6
 */
public class L1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();

        int x = 0;
        int y = 0;

        for (int i = 0; i < count; i++) {
            int number = scanner.nextInt();

            if (number % 2 == 0) {
                x++;
            } else {
                y++;
            }
        }

        System.out.println(y + " " + x);
    }
}
