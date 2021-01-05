import java.util.Scanner;

public class CF_1438B_ValeriiAgainstEveryone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int arrLength = scanner.nextInt();
            int[] arrOri = new int[arrLength];
            int[] arrAfter = new int[arrLength];
            int arrSum = 0;
            boolean flag = false;
            for (int j = 0; j < arrOri.length; j++) {
                arrOri[j] = scanner.nextInt();
                arrAfter[j] = (int)Math.pow(2, arrOri[j]);
                arrSum += arrAfter[j];
                System.out.println(arrAfter[j]);
            }
            arrSum /= 2;
            System.out.println(arrSum);
            for (int j = 0; j < arrOri.length; j++) {
                if (arrSum == arrAfter[j]) {
                    flag = true;
                    System.out.println("YES");
                }
            }
            if (!flag) {
                System.out.println("NO");
            }
        }
    }
}
