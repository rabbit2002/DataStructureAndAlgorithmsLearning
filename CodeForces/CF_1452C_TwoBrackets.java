import java.util.Scanner;

public class CF_1452C_TwoBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < count; i++) {
            String str = scanner.nextLine();
            char[] strArr = str.toCharArray();
            int parentheses = 0;
            int brackets = 0;
            int sum = 0;
            // (-40 )-41 [-91 ]-93
            for (int j = 0; j < strArr.length; j++) {
                if (strArr[j] == 40) {
                    parentheses++;
                }
                if (strArr[j] == 41) {
                    parentheses--;
                    if (parentheses >= 0) {
                        sum++;
                    }
                    if (parentheses < 0) {
                        parentheses = 0;
                    }
                }
                if (strArr[j] == 91) {
                    brackets++;
                }
                if (strArr[j] == 93) {
                    brackets--;
                    if (brackets >= 0) {
                        sum++;
                    }
                    if (brackets < 0) {
                        brackets = 0;
                    }
                }
            }
            System.out.println(sum);
        }
    }
}
