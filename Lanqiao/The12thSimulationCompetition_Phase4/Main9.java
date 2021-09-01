package The12thSimulationCompetition_Phase4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * 问题描述:
 * 小Hi正在研究一种特殊的栈。这种栈的元素既可以从栈顶出栈，也可以从栈底出栈。(进栈还是只能从栈顶进栈)
 * 已知入栈的序列是1~N的一个排列，请你判断出栈序列能否是1, 2, 3, ... N?
 * <p>
 * 输入格式:
 * 输入包含多组数据。
 * 输入第一行包含一个整数T，代表测试数据的组数。
 * 以下每组数据占据2行。
 * 第一行包含一个整数N。
 * 第二行包含N个整数，整数中由空格隔开。表示入栈序列。
 * <p>
 * 输出格式
 * 对于每组数据输出YES或者NO，代表出栈序列能否是1, 2, 3, ... N。
 * <p>
 * 样例输入
 * 2
 * 5
 * 2 4 1 3 5
 * 5
 * 4 3 1 5 2
 * <p>
 * 样例输出
 * YES
 * NO
 * <p>
 * 数据规模和约定
 * 对于30%的评测用例，1 <= N <= 10
 * 对于80%的评测用例，1 <= N <= 10000
 * 对于所有评测用例，1 <= N <= 100000， 1 <= T <= 10。
 *
 * @author RABBIT2002
 * @date 2021/3/23
 */
public class Main9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();

        for (int i = 0; i < times; i++) {
            // 本组长度
            int length = scanner.nextInt();
            // 当前指针位置
            int count = 1;

            Deque<Integer> deque = new ArrayDeque(length);

            // 开始判断
            for (int j = 0; j < length; j++) {
                int inputNumber = scanner.nextInt();

                // 是当前数字 直接下一轮
                if (count == inputNumber) {
                    count++;
                } else {
                    // 不是当前数字 入栈
                    deque.push(inputNumber);
                }
                // 对栈内判断
                while (true) {
                    if (deque.size() != 0 && count == deque.getFirst()) {
                        count++;
                        deque.pollFirst();
                        continue;
                    } else if (deque.size() != 0 && count == deque.getLast()) {
                        count++;
                        deque.pollLast();
                        continue;
                    } else {
                        break;
                    }
                }
            }
            if (count - 1 == length) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
