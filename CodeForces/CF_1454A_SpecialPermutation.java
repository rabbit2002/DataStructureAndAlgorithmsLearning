import java.util.Scanner;

public class CF_1454A_SpecialPermutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int number = scanner.nextInt();
            for (int j = 2; j <= number; j++) {
                System.out.print(j + " ");
            }
            System.out.print(1);
            System.out.println();
        }
    }
}
