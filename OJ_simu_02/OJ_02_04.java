import java.util.Scanner;

public class OJ_02_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strArr = str.split(" ");
        for (int i = strArr.length - 1; i >= 0; i--) {
            System.out.print(strArr[i]);
            if (i > 0) {
                System.out.print(" ");
            }
        }
    }
}
