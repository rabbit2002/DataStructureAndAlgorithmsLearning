import java.util.Scanner;

public class CF_1451B_NonSubstringSubsequence_W2 {
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
                temp = scanner.nextLine();
                tempArr = temp.split(" ");
                int start = Integer.parseInt(tempArr[0]);
                int end = Integer.parseInt(tempArr[1]);
                boolean flag = false;
                if (str.length() == (end - start + 1)) {
                    System.out.println("NO");
                    continue;
                }
                if (start == 1 && !flag) {
                    for (int k = end; k < strLength; k++) {
                        if (strArr[end - 1] == strArr[k]) {
                            flag = true;
                            break;
                        }
                    }
                } else if (end == strLength) {
                    for (int k = 0; k < start; k++) {
                        if (strArr[start] == strArr[k]) {
                            flag = true;
                            break;
                        }
                    }
                } else {
                    for (int k = 0; k < start; k++) {
                        if (strArr[start] == strArr[k]) {
                            flag = true;
                            break;
                        }
                    }
                    for (int k = end; k < strLength; k++) {
                        if (strArr[end - 1] == strArr[k]) {
                            flag = true;
                            break;
                        }
                    }
                }
                if (flag) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
