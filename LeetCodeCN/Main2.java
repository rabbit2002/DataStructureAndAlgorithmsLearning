/**
 * description TODO
 *
 * @author RABBIT2002
 * @date 2021/4/10
 */
public class Main2 {
    public static void main(String[] args) {
        System.out.println(new Main2().storeWater(new int[]{1, 3}, new int[]{6, 8}));
        System.out.println(new Main2().storeWater(new int[]{0, 1, 3}, new int[]{6, 10, 8}));
        System.out.println(new Main2().storeWater(new int[]{9, 0, 1}, new int[]{0, 2, 2}));
        System.out.println(new Main2().storeWater(new int[]{4, 1}, new int[]{10000, 100}));
        System.out.println(new Main2().storeWater(new int[]{0, 1, 2}, new int[]{100, 100, 100}));
    }

    public int storeWater(int[] bucket, int[] vat) {
        double maxTimes = -1;
        int maxVat = Integer.MIN_VALUE;
        for (int i = 0; i < vat.length; i++) {
            if (vat[i] > maxVat) {
                maxVat = vat[i];
            }
        }
        maxTimes = Math.ceil(Math.sqrt(maxVat));

        int count = 0;

        for (int i = 0; i < vat.length; i++) {
            if (vat[i] == 0) {
                continue;
            }
            int bucketNeed = (int) Math.ceil(vat[i] / maxTimes);
            int bucketTemp = bucketNeed - bucket[i];
            count += bucketTemp;
        }

        return count += maxTimes;
    }
}
