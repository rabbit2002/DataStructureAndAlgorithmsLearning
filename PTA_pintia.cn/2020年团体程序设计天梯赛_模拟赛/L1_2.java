import java.util.Scanner;

/**
 * L1-2 打折
 * <p>
 * 去商场淘打折商品时，计算打折以后的价钱是件颇费脑子的事情。
 * 例如原价 ￥988，标明打 7 折，则折扣价应该是 ￥988 x 70% = ￥691.60。
 * 本题就请你写个程序替客户计算折扣价。
 * <p>
 * 输入格式：
 * 输入在一行中给出商品的原价（不超过1万元的正整数）和折扣（为[1, 9]区间内的整数），其间以空格分隔。
 * <p>
 * 输出格式：
 * 在一行中输出商品的折扣价，保留小数点后 2 位。
 * <p>
 * 输入样例：
 * 988 7
 * <p>
 * 输出样例：
 * 691.60
 */
public class L1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int price = scanner.nextInt();
        int costOff = scanner.nextInt();

        double sum = price * costOff / 10.0;

        System.out.printf("%.2f", sum);
    }
}
