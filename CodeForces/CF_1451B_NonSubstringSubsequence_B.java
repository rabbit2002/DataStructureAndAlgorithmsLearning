import java.util.Scanner;

public class CF_1451B_NonSubstringSubsequence_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < count; i++) {
            String temp = scanner.nextLine();
            String[] tempArr = temp.split(" ");
            int strLength = Integer.parseInt(tempArr[0]);
            int queryNum = Integer.parseInt(tempArr[1]);
            String str = scanner.nextLine();
            char[] strArr = str.toCharArray();
            for (int j = 0; j < queryNum; j++) {
                int start = scanner.nextInt();
                int end = scanner.nextInt();
                System.out.println(start - 1);
                System.out.println(strArr[start - 1]);
                System.out.println(strArr[end - 1]);
            }
        }
    }
}
