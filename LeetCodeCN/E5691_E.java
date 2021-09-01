import java.util.Arrays;

/**
 * description TODO
 *
 * @author RABBIT2002
 * @date 2021/2/28
 */
public class E5691_E {

    public static void main(String[] args) {
        System.out.println(new E5691_E().minOperations(new int[]{1, 2, 3, 4, 5, 6}, new int[]{1, 1, 2, 2, 2, 2}));
        System.out.println(new E5691_E().minOperations(new int[]{6, 6}, new int[]{1}));
        System.out.println(new E5691_E().minOperations(new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{6}));
        System.out.println(new E5691_E().minOperations(new int[]{6, 6}, new int[]{1}));
        System.out.println(new E5691_E().minOperations(new int[]{5, 6, 4, 3, 1, 2}, new int[]{6, 3, 3, 1, 4, 5, 3, 4, 1, 3, 4}));

    }

    public int minOperations(int[] nums1, int[] nums2) {
        int times = 0;

        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < nums1.length; i++) {
            count1 += nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            count2 += nums2[i];
        }

        if (count1 == nums1.length) {
            if (count1 > count2) {
                return -1;
            }
        }
        if (count2 == nums2.length) {
            if (count2 > count1) {
                return -1;
            }
        }

        int differ = Math.abs(count1 - count2);

        int[] ints = new int[nums1.length + nums2.length];

        System.arraycopy(nums1, 0, ints, 0, nums1.length);
        System.arraycopy(nums2, 0, ints, nums1.length, nums2.length);

        Arrays.sort(ints);
        // System.out.println(Arrays.toString(ints));

        for (int i = 0; i < ints.length; i++) {
            if ((differ - (Math.abs(6 - ints[i]))) > 0) {
                differ = differ - (6 - ints[i]);
                times++;
            }
        }
        return times;
    }
}
