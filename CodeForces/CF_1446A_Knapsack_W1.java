import java.util.Scanner;

public class CF_1446A_Knapsack_W1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int items_n = scanner.nextInt();
            int maxCapacity_W = scanner.nextInt();
            // W/2<=C<=W
            int totalWeight_C = 0;
            int[] itemsWeight_wi = new int[items_n];
            int[] itemId = new int[items_n];
            for (int j = 0; j < items_n; j++) {
                itemsWeight_wi[j] = scanner.nextInt();
                itemId[j] = j;
            }
            for (int k = 0; k < itemsWeight_wi.length - 1; k++) {
                for (int j = 0; j < itemsWeight_wi.length - 1 - k; j++) {
                    if (itemsWeight_wi[j] > itemsWeight_wi[j + 1]) {
                        int tempNumber = itemsWeight_wi[j];
                        itemsWeight_wi[j] = itemsWeight_wi[j + 1];
                        itemsWeight_wi[j + 1] = tempNumber;
                        int tempId = itemId[j];
                        itemId[j] = itemId[j + 1];
                        itemId[j + 1] = tempId;
                    }
                }
            }
            // for (int j = 0; j < itemsWeight_wi.length; j++) {
            //     System.out.print(itemId[j]+":"+itemsWeight_wi[j] + " ");
            // }
            if (items_n == 1) {
                if (maxCapacity_W / 2 <= itemsWeight_wi[0] && itemsWeight_wi[0] <= maxCapacity_W) {
                    System.out.println(1);
                } else {
                    System.out.println(-1);
                }
                continue;
            } else {
                if (maxCapacity_W / 2 < itemsWeight_wi[0]) {
                    System.out.println(-1);
                    continue;
                }
            }
        }
    }
}
