import java.util.Scanner;

public class OJ_03_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int length = input.length();
        boolean flag = true;
        for (int i = 0; i < length; i++) {
            System.out.print(input + " ");
            if (judge(Integer.parseInt(input))) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
                flag = false;
            }
            input = input.substring(1);
        }
        if (flag) {
            System.out.println("All Prime!");
        }
    }

    public static boolean judge(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
