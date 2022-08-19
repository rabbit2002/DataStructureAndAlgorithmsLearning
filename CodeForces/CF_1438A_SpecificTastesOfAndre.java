import java.util.Scanner;

public class CF_1438A_SpecificTastesOfAndre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int number = scanner.nextInt();
            int sumNeed = (int) Math.pow(2, number);
            int sum = 0;
            for (int j = 0; j < number; j++) {
                System.out.print(1);
                if (j != number - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
