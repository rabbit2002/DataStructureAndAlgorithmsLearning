import java.util.HashMap;
import java.util.Scanner;

public class CF_1454B_UniqueBidAuction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int min = Integer.MAX_VALUE;
            int length = scanner.nextInt();
            int[] arr = new int[length];
            int point = -1;
            HashMap<Integer, Boolean> map = new HashMap();
            for (int j = 0; j < length; j++) {
                int number = scanner.nextInt();
                arr[j] = number;
                if (map.get(number) == null) {
                    map.put(number, true);
                } else {
                    map.remove(number);
                    map.put(number, false);
                }
            }
            for (HashMap.Entry<Integer, Boolean> entry : map.entrySet()) {
                if (entry.getValue() == false) {
                    continue;
                }
                if (entry.getKey() < min) {
                    min = entry.getKey();
                }
            }
            for (int j = 0; j < length; j++) {
                if (min == arr[j]) {
                    point = j + 1;
                }
            }
            if (min == Integer.MAX_VALUE) {
                System.out.println(-1);
            } else {
                System.out.println(point);
            }
        }
    }
}
