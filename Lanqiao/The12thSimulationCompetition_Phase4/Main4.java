package The12thSimulationCompetition_Phase4;

/**
 * Fibonacci序列按照如下公式定义：
 * F[1] = 1
 * F[2] = 1
 * F[i] = F[i-1] + F[i-2] (i>2)
 * 前几个 Fibonacci 数为 1, 1, 2, 3, 5, 8, 13, 21。
 * 请问，前100个 Fibonacci 数中，有多少个数是 3 的倍数？
 *
 * @author RABBIT2002
 * @date 2021/3/23
 */
public class Main4 {

    static double[] longs = new double[100];

    public static void main(String[] args) {
        fibonacci2();

        int count = 0;
        for (int i = 0; i < longs.length; i++) {
            if (longs[i] % 3 == 0) {
                count++;
                System.out.println((i + 1) + ": " + longs[i]);
            }
        }
        System.out.println("final: " + count);
    }

    private static long fibonacci(int i) {
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 1;
        }
        return fibonacci(i - 1) + fibonacci(i - 2);
    }

    private static void fibonacci2() {
        longs[1 - 1] = 1;
        longs[2 - 1] = 1;
        for (int i = 3 - 1; i < 100; i++) {
            longs[i] = longs[i - 1] + longs[i - 2];
             // System.out.println(i+1 + ": " + longs[i]);
        }
    }
}
