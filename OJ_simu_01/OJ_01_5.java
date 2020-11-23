import java.util.Scanner;

public class OJ_01_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oriNum = scanner.nextInt();
        int cutPoinr = scanner.nextInt();
        String oriNumStr = String.valueOf(oriNum);
        String cutNumStr = oriNumStr.substring(oriNumStr.length() - cutPoinr, oriNumStr.length());
        String newNumStr = cutNumStr + oriNumStr.substring(0, oriNumStr.length() - cutPoinr);
        double newNum = Integer.parseInt(newNumStr);
        double ans = Math.round(newNum * 100 / oriNum) / 100.0;
        String ansA = String.valueOf((int)ans);
        String ansB = String.valueOf(Math.round((ans - (int)ans) * 100));
        if (ansB.length() == 1) {
            ansB += "0";
        }
        System.out.println(ansA + "." + ansB);
    }
}
