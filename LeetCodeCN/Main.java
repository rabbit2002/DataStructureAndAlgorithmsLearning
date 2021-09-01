/**
 * description TODO
 *
 * @author RABBIT2002
 * @date 2021/4/10
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().storeWater(new int[]{1, 3}, new int[]{6, 8}));
        System.out.println(new Main().storeWater(new int[]{0, 1, 3}, new int[]{6, 10, 8}));
        System.out.println(new Main().storeWater(new int[]{9, 0, 1}, new int[]{0, 2, 2}));
        System.out.println(new Main().storeWater(new int[]{4, 1}, new int[]{10000, 100}));
        System.out.println(new Main().storeWater(new int[]{0, 1, 2}, new int[]{100, 100, 100}));
    }

    public int storeWater(int[] bucket, int[] vat) {
        int maxBucket = Integer.MIN_VALUE;
        int maxIndex = -1;

        for (int i = 0; i < bucket.length; i++) {
            if (vat[i] != 0) {
                if (bucket[i] > maxBucket) {
                    maxBucket = bucket[i];
                    maxIndex = i;
                }
            }
        }
        int times = (int) Math.ceil(vat[maxIndex] / (bucket[maxIndex] + 0.0));

        int count = 0;
        for (int i = 0; i < bucket.length; i++) {
            if (vat[i] == 0) {
                continue;
            }
            if (i == maxIndex) {
                continue;
            }
            if (vat[i] != 0) {
                int bucketNeed = (int) Math.ceil(vat[i] / (times + 0.0));
                count += bucketNeed - bucket[i];
            }
        }

        count += times;

        return count;
    }
}
