import java.util.Scanner;

public class CF_71A_WayTooLongWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            String str = scanner.next();
            if (str.length() <= 10) {
                System.out.print(str);
            } else {
                System.out.print(str.charAt(0) + "" + (str.length() - 2) + "" + str.charAt(str.length() - 1));
            }
            System.out.println();
        }
    }
}
