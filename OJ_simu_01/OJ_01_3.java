import java.util.Scanner;

public class OJ_01_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        int count = 0;
        while (inputNum != 1) {
            if (inputNum % 2 == 0) {
                inputNum = inputNum / 2;
            } else {
                inputNum = (3 * inputNum + 1) / 2;
            }
            count++;
        }
        System.out.println(count);
    }
}
