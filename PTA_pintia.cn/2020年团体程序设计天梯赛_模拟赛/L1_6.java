import java.util.Scanner;

/**
 * L1-6 检查密码
 * <p>
 * 本题要求你帮助某网站的用户注册模块写一个密码合法性检查的小功能。
 * 该网站要求用户设置的密码必须由不少于6个字符组成，并且只能有英文字母、数字和小数点 . ，还必须既有字母也有数字。
 * <p>
 * 输入格式：
 * 输入第一行给出一个正整数 N（≤ 100），随后 N 行，每行给出一个用户设置的密码，为不超过 80 个字符的非空字符串，以回车结束。
 * <p>
 * 输出格式：
 * 对每个用户的密码，在一行中输出系统反馈信息，分以下5种：
 * * 如果密码合法，输出 Your password is wan mei. ；
 * * 如果密码太短，不论合法与否，都输出 Your password is tai duan le. ；
 * * 如果密码长度合法，但存在不合法字符，则输出 Your password is tai luan le. ；
 * * 如果密码长度合法，但只有字母没有数字，则输出 Your password needs shu zi. ；
 * * 如果密码长度合法，但只有数字没有字母，则输出 Your password needs zi mu. 。
 * <p>
 * 输入样例：
 * 5
 * 123s
 * zheshi.wodepw
 * 1234.5678
 * WanMei23333
 * pass*word.6
 * <p>
 * 输出样例：
 * Your password is tai duan le.
 * Your password needs shu zi.
 * Your password needs zi mu.
 * Your password is wan mei.
 * Your password is tai luan le.
 */
public class L1_6 {
    public static void main(String[] args) {
        // 不少于6个字符组成，并且只能有英文字母、数字和小数点 .，还必须既有字母也有数字
        // .46 0-48 9-57 A65 Z90 a96 z122

        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < count; i++) {

            String str = scanner.nextLine();
            char[] strArr = str.toCharArray();

            if (str.length() <= 6) {
                System.out.println("Your password is tai duan le.");
                continue;
            }

            boolean flagABC = false;
            boolean flagNum = false;
            // boolean flagPoint = false;
            boolean flagError = false;

            for (int j = 0; j < strArr.length; j++) {
                // .46 0-48 9-57 A65 Z90 a96 z122
                if (strArr[j] == 46 || (strArr[j] >= 48 && strArr[j] <= 57) || (strArr[j] >= 65 && strArr[j] <= 90) || (strArr[j] >= 96 && strArr[j] <= 122)) {
                    if ((strArr[j] >= 65 && strArr[j] <= 90) || (strArr[j] >= 96 && strArr[j] <= 122)) {
                        flagABC = true;
                    }
                    if (strArr[j] >= 48 && strArr[j] <= 57) {
                        flagNum = true;
                    }
                    // if (strArr[j] == 46) {
                    //     flagPoint = true;
                    // }
                } else {
                    flagError = true;
                    break;
                }
            }

            if (flagError) {
                System.out.println("Your password is tai luan le.");
                continue;
            }
            if (flagABC && flagNum) {
                System.out.println("Your password is wan mei.");
                continue;
            }
            if (flagABC && !flagNum) {
                System.out.println("Your password needs shu zi.");
                continue;
            }
            if (!flagABC && flagNum) {
                System.out.println("Your password needs zi mu.");
                continue;
            }

        }
    }
}

