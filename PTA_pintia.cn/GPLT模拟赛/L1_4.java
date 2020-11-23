import java.util.Scanner;

public class L1_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String nameList = "";
        for (int i = 0; i < num; i++) {
            String name = input.next();
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            if (num1 < 15 || num1 > 20 || num2 < 50 || num2 > 70) {
                //				nameList=nameList+name+"\n";
                System.out.println(name);
            }
        }
    }
}
