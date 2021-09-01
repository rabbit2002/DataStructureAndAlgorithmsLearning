import java.util.Arrays;
import java.util.Scanner;

/**
 * description TODO
 *
 * @author RABBIT2002
 * @date 2021/2/28
 */
public class CF_1491A_KthLargestValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line1 = scanner.nextLine();
        int arrayLength = Integer.parseInt(line1.split(" ")[0]);
        int queriesLength = Integer.parseInt(line1.split(" ")[1]);

        String line2 = scanner.nextLine();
        int[] arrayOri = new int[arrayLength];
        for (int i = 0; i < arrayOri.length; i++) {
            arrayOri[i] = Integer.parseInt(line2.split(" ")[i]);
        }

        for (int i = 0; i < queriesLength; i++) {
            String lineQueries = scanner.nextLine();
            int types = Integer.parseInt(lineQueries.split(" ")[0]);
            int index = Integer.parseInt(lineQueries.split(" ")[1]);

            if (types == 2) {
                System.out.println(sorted(arrayOri)[index-1]);
            }
            if (types==1){
                arrayOri[index-1]-=1;
            }
        }
    }

    public static int[] sorted(int[] intOri) {
        int[] ints=Arrays.copyOf(intOri,intOri.length);
        for (int i = 0; i < ints.length; i++) {
            for (int j = i; j < ints.length; j++) {
                if (ints[i] < ints[j]) {
                    int temp = ints[i];
                    ints[i] = ints[j];
                    ints[j] = temp;
                }
            }
        }
        return ints;
    }
}
