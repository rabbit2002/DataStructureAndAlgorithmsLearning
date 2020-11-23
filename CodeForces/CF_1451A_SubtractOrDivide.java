import java.util.Scanner;

public class CF_1451A_SubtractOrDivide {
    public static void main(String[] args) {
        CF_1451A_SubtractOrDivide main = new CF_1451A_SubtractOrDivide();
        // System.out.println(main.judgePrime(6)[1]);
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int number = scanner.nextInt();
            int step = 0;
            while (number != 1) {
                int flag = main.judgePrime(number)[0];
                int temp = main.judgePrime(number)[1];
                if (flag == 1) {
                    number--;
                } else {
                    number = temp;
                }
                step++;
            }
            System.out.println(step);
        }
    }

    // int[] [0]=boolean isPrime 0=false 1=ture [1]=what is the max gcd
    // public boolean judgePrime(int integer) {
    public int[] judgePrime(int integer) {
        if (integer == 1) {
            // return false;
            return new int[]{0, -1};
        }
        for (int i = 2; i <= Math.sqrt(integer); i++) {
            if (integer % i == 0) {
                // return false;
                return new int[]{0, i};
            }
        }
        // return true;
        return new int[]{1, -1};
    }
}
