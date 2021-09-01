package The12thSimulationCompetition_Phase4;

import java.util.Scanner;

/**
 * 问题描述:
 * 小蓝在商店买文具。
 * 一支钢笔 x 元，小蓝买了 a 支。
 * 一个笔记本 y 元，小蓝买了 b 本。
 * 请问，小蓝一共需要支付多少钱？
 * <p>
 * 输入格式:
 * 输入四行。
 * 第一行包含一个整数 x。
 * 第二行包含一个整数 a。
 * 第三行包含一个整数 y。
 * 第四行包含一个整数 b。
 * <p>
 * 输出格式
 * 输出一个整数，表示答案。
 * <p>
 * 样例输入
 * 5
 * 2
 * 1
 * 6
 * <p>
 * 样例输出
 * 16
 * <p>
 * 样例输入
 * 2
 * 0
 * 2
 * 1
 * <p>
 * 样例输出
 * 2
 * <p>
 * 数据规模和约定
 * 对于所有评测用例，0 <= x, a, y, b <= 100。
 *
 * @author RABBIT2002
 * @date 2021/3/23
 */
public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int a = scanner.nextInt();
        int y = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(x * a + y * b);
    }
}
