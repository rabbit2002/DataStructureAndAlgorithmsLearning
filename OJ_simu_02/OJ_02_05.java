import java.util.Scanner;

public class OJ_02_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        String numArr = String.valueOf(data);
        if (numArr.length() < 8) {
            for (int i = 0; i <= 8 - numArr.length() + 1; i++) {
                numArr = "0" + numArr;
            }
        }
        int count = numArr.length();
        boolean flag = true;
        for (int i = 0; i < count; i++) {
            int num = Integer.parseInt(numArr);
            if (judgePrime(num)) {
                System.out.println(numArr + " " + "Yes");
            } else {
                System.out.println(numArr + " " + "No");
                flag = false;
            }
            numArr = numArr.substring(1);
        }
        if (flag == true) {
            System.out.println("All Prime!");
        }
    }

    public static boolean judgePrime(int num) {
        if (num == 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
