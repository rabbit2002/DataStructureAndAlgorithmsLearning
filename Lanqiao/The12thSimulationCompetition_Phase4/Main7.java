package The12thSimulationCompetition_Phase4;

import java.util.Scanner;

/**
 * 问题描述:
 * 　　给定一个单词，请将这个单词的首字母大写，后面的所有字母小写。
 * <p>
 * 输入格式:
 * 　　输入一行包含一个字符串，表示给定的单词。
 * <p>
 * 输出格式:
 * 　　输出变换后的单词。
 * <p>
 * 样例输入
 * hello
 * <p>
 * 样例输出
 * Hello
 * <p>
 * 样例输入
 * WORLD
 * <p>
 * 样例输出
 * World
 * <p>
 * 样例输入
 * LanQiao
 * <p>
 * 样例输出
 * Lanqiao
 * <p>
 * 数据规模和约定
 * 对于所有评测用例，单词的长度不超过 100，单词中只包含大小写英文字母。
 *
 * @author RABBIT2002
 * @date 2021/3/23
 */
public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer stringBuffer =new StringBuffer(scanner.nextLine().toLowerCase());
        stringBuffer.setCharAt(0,(char)(stringBuffer.charAt(0)-32));
        System.out.println(stringBuffer);
    }
}
