import java.util.Arrays;

public class LC1460_makeTwoArraysEqualByReversingSubArrays {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        return Arrays.compare(target, arr) == 0;
    }

    public static void main(String[] args) {
        System.out.println(
                new LC1460_makeTwoArraysEqualByReversingSubArrays().canBeEqual(
                        new int[] { 1, 2, 3, 4 },
                        new int[] { 2, 4, 1, 3 }));

        System.out.println(
                new LC1460_makeTwoArraysEqualByReversingSubArrays().canBeEqual(
                        new int[] { 3, 7, 9 },
                        new int[] { 3, 7, 11 }));
    }
}
