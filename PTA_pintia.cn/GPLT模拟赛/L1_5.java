import java.util.Scanner;

public class L1_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = Integer.parseInt(input.next());
        int num2 = Integer.parseInt(input.next());
        int sum = num1 * num2;
        String sumStr = String.valueOf(sum);
        int sumLen = sumStr.length();
        String fin = "";
        for (int i = sumLen; i > 0; i--) {
            fin += String.valueOf(sumStr.charAt(i - 1));
        }
        System.out.println(Integer.parseInt(fin));
    }
}
