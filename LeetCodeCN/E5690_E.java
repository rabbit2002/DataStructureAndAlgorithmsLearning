/**
 * description TODO
 *
 * @author RABBIT2002
 * @date 2021/2/28
 */
public class E5690_E {
    public static void main(String[] args) {
        System.out.println(new E5690_E().closestCost(new int[]{4}, new int[]{9}, 9));
    }

    public int closestCost(int[] baseCosts, int[] toppingCosts, int target) {
        int count = 0;

        int differ = Integer.MAX_VALUE;

        if (baseCosts.length == 1) {
            count = baseCosts[0];
            differ = target - count;
        }

        for (int i = baseCosts.length - 1; i >= 0; i--) {
            if (baseCosts[i] > target) {
                continue;
            }
            count = baseCosts[i];
            break;
        }

        // System.out.println(count);

        for (int i = toppingCosts.length - 1; i >= 0; i--) {
//            if (count + toppingCosts[i] < target) {
//                if (count + toppingCosts[i]*2 < target) {
//                    count=count + toppingCosts[i]*2;
//                }
//                count= count + toppingCosts[i];
//            }
            for (int j = 0; j < 2; j++) {
                if (count + toppingCosts[i] <= target) {
                    count = count + toppingCosts[i];
                    //System.out.println(count);
                }
            }
        }

        return count;
    }
}
