import java.util.Scanner;

public class L1_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();
        if (day + 2 > 7) {
            System.out.println(day + 2 - 7);
        } else {
            System.out.println(day + 2);
        }
    }
}
