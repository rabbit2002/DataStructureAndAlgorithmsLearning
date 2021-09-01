package The12thSimulationCompetition_Phase4;

/**
 * 请问在 1900 到 2020 中，有多少个质数
 *
 * @author RABBIT2002
 * @date 2021/3/23
 */
public class Main2 {
    public static void main(String[] args) {
        System.out.println(judge(2));

        int count = 0;
        for (int i = 1900; i <= 2020; i++) {
            if (judge(i)) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean judge(int i) {
        if (i == 1) {
            return false;
        }
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}
