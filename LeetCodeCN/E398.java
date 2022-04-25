import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class E398 {
    public static void main(String[] args) {
        Solution solution = new Solution(new int[]{1, 2, 3, 3, 3});
        System.out.println(solution.pick(3)); // 随机返回索引 2, 3 或者 4 之一。每个索引的返回概率应该相等。
        System.out.println(solution.pick(1)); // 返回 0 。因为只有 nums[0] 等于 1 。
        System.out.println(solution.pick(3)); // 随机返回索引 2, 3 或者 4 之一。每个索引的返回概率应该相等。
    }

    static class Solution {
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();

        public Solution(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(nums[i])) {
                    ArrayList value = map.get(nums[i]);
                    value.add(i);
                } else {
                    ArrayList<Integer> tempArrayList = new ArrayList<>();
                    tempArrayList.add(i);
                    map.put(nums[i], tempArrayList);
                }
            }
        }

        public int pick(int target) {
            ArrayList<Integer> value = map.get(target);
            return value.get(new Random().nextInt(0, value.size()));
        }
    }
}