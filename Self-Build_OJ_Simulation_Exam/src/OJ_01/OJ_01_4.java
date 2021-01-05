package OJ_01;

import java.util.Scanner;

public class OJ_01_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] output = new String[]{"ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu"};
        String inputStr = scanner.next();
        int sumNum = 0;
        for (int i = 0; i < inputStr.length(); i++) {
            sumNum += Integer.parseInt(String.valueOf(inputStr.charAt(i)));
        }
        String sumNumStr = String.valueOf(sumNum);
        char[] sumNumArr = sumNumStr.toCharArray();
        for (int i = 0; i < sumNumArr.length; i++) {
            System.out.printf(output[Integer.parseInt(String.valueOf(sumNumArr[i]))]);
            if (i < sumNumArr.length - 1) {
                System.out.printf(" ");
            }
        }
    }
}
