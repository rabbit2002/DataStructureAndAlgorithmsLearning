package The12thSimulationCompetition_Phase4;

/**
 * 一个身份证号码有 18 位数字或字母组成。其中前17位必须是数字，最后一位可能是数字或字母X。
 * 身份证号码满足一定的校验规则。
 * 令身份证号从右到左依次标号为 1 到 18，其中标号为 i 的位的位权设置为 2^(i-1) mod 11 （2的i-1次方除以 11 的余数）。
 * 将每一位的数值乘以位权后相加，得到的结果除以 11 的余数应当为 1。其中最后一位（标号为1）中如果出现字母 X，看成数字 10。
 * 例如，如果一个人的身份证号为 34052419800101001X，则：
 * 标号为 1 的位，位权 1，数值 X，即 10，相乘得 10。
 * 标号为 2 的位，位权 2，数值 1，相乘得 10。
 * 标号为 3 的位，位权 4，数值 0，相乘得 0。
 * 标号为 4 的位，位权 8，数值 0，相乘得 0。
 * 标号为 5 的位，位权 5，数值 1，相乘得 5。
 * 标号为 6 的位，位权 10，数值 0，相乘得 0。
 * 标号为 7 的位，位权 9，数值 1，相乘得 9。
 * 标号为 8 的位，位权 7，数值 0，相乘得 0。
 * 标号为 9 的位，位权 3，数值 0，相乘得 0。
 * 标号为 10 的位，位权 6，数值 8，相乘得 48。
 * 标号为 11 的位，位权 1，数值 9，相乘得 9。
 * 标号为 12 的位，位权 2，数值 1，相乘得 2。
 * 标号为 13 的位，位权 4，数值 4，相乘得 16。
 * 标号为 14 的位，位权 8，数值 2，相乘得 16。
 * 标号为 15 的位，位权 5，数值 5，相乘得 25。
 * 标号为 16 的位，位权 10，数值 0，相乘得 0。
 * 标号为 17 的位，位权 9，数值 4，相乘得 36。
 * 标号为 18 的位，位权 7，数值 3，相乘得 21。
 * 将乘积相加，得 199，除以 11 的余数正好为 1。
 * 小明的身份证号前 17 位为 11010120210221999，请问小明身份证的最后一位是多少？
 *
 * @author RABBIT2002
 * @date 2021/3/23
 */
public class Main5 {
    public static void main(String[] args) {

        String str = "110101202102219990";
        String strReverse = new StringBuffer(str).reverse().toString();

        int sum = 0;
        for (int i = 0; i < 18; i++) {
            int power = (int) (Math.pow(2, i) % 11);
            int powerAns = power * (strReverse.charAt(i) - 48);
            sum += powerAns;
        }
        System.out.println((sum + 8) % 11);

        check();
    }

    private static void check() {
        String ans = "110101202102219998";
        String strAnsReverse = new StringBuffer(ans).reverse().toString();

        int ansSum = 0;
        for (int i = 0; i < 18; i++) {
            int power = (int) (Math.pow(2, i)) % 11;
            int powerAns = power * (strAnsReverse.charAt(i) - 48);
            ansSum += powerAns;
        }
        System.out.println(ansSum % 11);
    }
}
