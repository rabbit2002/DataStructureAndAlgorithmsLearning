import java.util.Scanner;

/**
 * description TODO
 *
 * @author RABBIT2002
 * @date 2021/2/28
 */
public class CF_1491A_KthLargestValueB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // String line1 = scanner.nextLine();
        // int arrayLength = Integer.parseInt(line1.split(" ")[0]);
        // int queriesLength = Integer.parseInt(line1.split(" ")[1]);
        int arrayLength = scanner.nextInt();
        int queriesLength = scanner.nextInt();

        // String line2 = scanner.nextLine();
        int[] arrayOri = new int[arrayLength];
        int count = 0;
        for (int i = 0; i < arrayLength; i++) {
            // arrayOri[i] = Integer.parseInt(line2.split(" ")[i]);
            arrayOri[i] = scanner.nextInt();
            count += arrayOri[i];
        }

        for (int i = 0; i < queriesLength; i++) {
            // String lineQueries = scanner.nextLine();
            // int types = Integer.parseInt(lineQueries.split(" ")[0]);
            // int index = Integer.parseInt(lineQueries.split(" ")[1]);
            int types = scanner.nextInt();
            int index = scanner.nextInt();

            if (types == 1) {
                if (arrayOri[index - 1] == 0) {
                    count++;
                } else {
                    count--;
                }
                arrayOri[i] = 1 - arrayOri[i];
            }

            if (types == 2) {
                if (index <= count) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            }

        }
    }
}
