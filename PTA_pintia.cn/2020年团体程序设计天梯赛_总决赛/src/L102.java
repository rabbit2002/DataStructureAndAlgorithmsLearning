import java.util.Scanner;

/**
 * L1-2 猫是液体
 * <p>
 * 测量一个人的体积是很难的，但猫就不一样了。
 * 因为猫是液体，所以可以很容易地通过测量一个长方体容器的容积来得到容器里猫的体积。
 * 本题就请你完成这个计算。
 * <p>
 * 输入格式：
 * 输入在第一行中给出 3 个不超过 100 的正整数，分别对应容器的长、宽、高。
 * <p>
 * 输出格式：
 * 在一行中输出猫的体积。
 * <p>
 * 输入样例：
 * 23 15 20
 * <p>
 * 输出样例：
 * 6900
 */
public class L102 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        System.out.println(x * y * z);
    }
}
