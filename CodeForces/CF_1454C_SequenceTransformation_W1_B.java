import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CF_1454C_SequenceTransformation_W1_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testcaseNumber = scanner.nextInt();

        for (int i = 0; i < testcaseNumber; i++) {
            int number = scanner.nextInt();
            int[] arr = new int[number];
            Set<Integer> set = new HashSet<>();

            for (int j = 0; j < number; j++) {
                int tempNumber = scanner.nextInt();
                arr[j] = tempNumber;
                set.add(tempNumber);
            }

            int frequencyMin = Integer.MAX_VALUE;

            for (int n : set) {
                boolean flagBefore = false;
                boolean flag = false;
                int frequency = 0;
                for (int j = 0; j < number; j++) {
                    if (arr[j] == n) {
                        // flagBefore=!flag;
                        // flag=!flag;
                        if (flagBefore != !flag) {
                            frequency++;
                        }
                    } else {
                        flagBefore = !flag;
                        // flag=!flag;
                        // if (flagBefore!=flag){
                        frequency++;
                        // }
                    }
                }
                frequency = frequency / 2;
                if (frequency < frequencyMin) {
                    frequencyMin = frequency;
                }
            }
            System.out.println(frequencyMin);

        }

    }
}
