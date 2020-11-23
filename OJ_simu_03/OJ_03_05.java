import java.util.Scanner;

public class OJ_03_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] outputStr = {"ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu",};
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += (str.charAt(i) - 48);
        }
        String outputSum = String.valueOf(sum);
        for (int i = 0; i < outputSum.length(); i++) {
            System.out.print(outputStr[outputSum.charAt(i) - 48]);
            if (i < outputSum.length() - 1) {
                System.out.print(" ");
            }
        }
    }
}
