import java.util.HashMap;
import java.util.Scanner;

public class CF_1454C_SequenceTransformation_W1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testcaseNumber = scanner.nextInt();

        for (int i = 0; i < testcaseNumber; i++) {
            int number = scanner.nextInt();
            int[] arr = new int[number];
            HashMap<Integer, Integer> map = new HashMap();
            int maxFrequency = Integer.MIN_VALUE;
            int maxFrequencyPoint = -1;

            for (int j = 0; j < number; j++) {
                int tempNumber = scanner.nextInt();
                arr[j] = tempNumber;
                if (map.get(tempNumber) == null) {
                    map.put(tempNumber, 1);
                } else {
                    int tempFrequency = map.get(tempNumber);
                    map.remove(tempNumber);
                    map.put(tempNumber, tempFrequency + 1);
                    if (tempFrequency + 1 > maxFrequency) {
                        maxFrequencyPoint = tempNumber;
                    }
                }
            }

            boolean isMaxPoint = false;
            int sum = 0;
            for (int j = 0; j < number; j++) {
                if (arr[j] == maxFrequencyPoint) {
                    isMaxPoint = true;
                }
            }

        }

    }
}
