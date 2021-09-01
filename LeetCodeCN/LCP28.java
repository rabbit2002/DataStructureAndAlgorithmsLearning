import java.util.Map;
import java.util.TreeMap;

/**
 * https://leetcode-cn.com/contest/season/2021-spring/problems/4xy4Wx/
 *
 * @author RABBIT2002
 * @date 2021/4/5
 */
public class LCP28 {
    public static void main(String[] args) {
        System.out.println(new LCP28().purchasePlans(new int[]{2, 5, 3, 5}, 6));
        // System.out.println(new Main().purchasePlans(new int[]{2, 2, 1, 9}, 10));
    }

    public int purchasePlans(int[] nums, int target) {
        int count = 0;
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < nums.length; i++) {
            // 2->0 5->1 3->2 5->3
            // 2->0 3->2 5->1 5->3
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            // 4 1 3 1
            int complement = target - nums[i];
//            if (map.containsKey(complement) && map.get(complement) != i) {
//
//            }
            for (int j = 1; j < complement; j++) {
                if (map.containsKey(j) && map.get(j) != i) {
                    count++;
                }
            }
        }

        return count;
    }
}
