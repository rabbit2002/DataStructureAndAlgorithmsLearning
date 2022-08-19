public class E713 {
    public static void main(String[] args) {
        int a1 = new E713().numSubarrayProductLessThanK(new int[]{10, 5, 2, 6}, 100);
        System.out.println(a1);
    }

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;

        int leftP = 0;
        while (leftP < nums.length) {
            int rightP = leftP;
            while (cacuSum(nums, leftP, rightP) < k) {
                count++;
                rightP++;
                if (rightP == nums.length) {
                    break;
                }
            }

            leftP++;
        }
        return count;
    }

    int cacuSum(int[] nums, int left, int right) {
        int tmp = 1;
        for (int i = left; i <= right; i++) {
            tmp *= nums[i];
        }
        return tmp;
    }
}
