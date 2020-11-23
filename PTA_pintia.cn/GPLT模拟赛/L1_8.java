import java.util.Scanner;

public class L1_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String insertChar = input.next();
        //		System.out.println(num);
        //		System.out.println(insertChar);
        input.nextLine();
        String word = input.nextLine();
        int wordLen = word.length();
        //		System.out.println(word);
        if (wordLen >= num) {
            System.out.println(word.substring((wordLen - num), wordLen));
        } else {
            for (int i = 0; i < (num - wordLen); i++) {
                System.out.printf(insertChar);
            }
            System.out.println(word);
        }
    }
}
