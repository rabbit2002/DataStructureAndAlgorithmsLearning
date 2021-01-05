import java.util.Scanner;

public class L1_008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNum = scanner.nextInt();
        int endNum = scanner.nextInt();
        int nowNum = startNum;
        int sumNum = 0;
        for (int i = 0; i <= endNum - startNum; i++) {
            System.out.printf("%5d", nowNum);
            sumNum = sumNum + nowNum;
            nowNum++;
            if ((i + 1) % 5 == 0) {
                System.out.println();
            }
        }
        if ((endNum - startNum + 1) % 5 != 0) {
            System.out.println();
        }
        System.out.println("Sum = " + sumNum);
    }
}
