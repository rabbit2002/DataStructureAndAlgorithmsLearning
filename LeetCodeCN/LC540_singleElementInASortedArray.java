public class LC540_singleElementInASortedArray {
    public static void main(String[] args) {
        System.out.println(new LC540_singleElementInASortedArray().singleNonDuplicate(new int[] { 1, 1, 2, 3, 3 }));
    }

    public int singleNonDuplicate(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                result += nums[i];
            } else {
                result -= nums[i];
            }
        }
        return result;
    }
}
