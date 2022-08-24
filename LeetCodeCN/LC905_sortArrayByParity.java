import java.util.Arrays;

public class LC905_sortArrayByParity {
    public static void main(String[] args) {
        int[] a1 = new LC905_sortArrayByParity().sortArrayByParity(new int[] { 0 });
        System.out.println(Arrays.toString(a1));
    }

    public int[] sortArrayByParity(int[] nums) {
        int begin = 0;
        int end = nums.length - 1;

        while (begin != end) {
            if (nums[begin] % 2 == 0) {
                begin++;
                continue;
            }
            if (nums[end] % 2 == 1) {
                end--;
                continue;
            }

            int temp = nums[begin];
            nums[begin] = nums[end];
            nums[end] = temp;
            continue;
        }
        return nums;
    }
}
