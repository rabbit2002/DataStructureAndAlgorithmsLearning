import java.util.Scanner;

public class CF_1452A_RobotProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        CF_1452A_RobotProgram main = new CF_1452A_RobotProgram();
        for (int i = 0; i < count; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if (x == y) {
                System.out.println(x * 2);
                continue;
            }
            int max = main.returnMax(x, y);
            System.out.println((max - 1) * 2 + 1);
        }
    }

    public int returnMax(int x, int y) {
        if (x >= y) {
            return x;
        } else {
            return y;
        }
    }
}
