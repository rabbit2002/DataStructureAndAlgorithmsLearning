package MetaCamp2021;

import java.util.Scanner;
import java.util.TreeMap;

/**
 * description TODO
 *
 * @author RABBIT2002
 * @date 2021/5/8
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input1 = null;
        String input2 = null;
        while (!"".equals(input1 = scanner.nextLine())) {
            input2 = scanner.nextLine();

            // 天数
            int n = Integer.parseInt(input1.split(" ")[0]);
            // 数量
            int x = Integer.parseInt(input1.split(" ")[1]);

            String[] pricesStr = input2.split(" ");
            int[] prices = new int[n];

            TreeMap<Integer, Integer> treeMap = new TreeMap<>();

            for (int i = 0; i < prices.length; i++) {
                prices[i] = Integer.parseInt(pricesStr[i]);
                treeMap.put(prices[i], i);
            }

            System.out.println(treeMap);
        }
    }
}
