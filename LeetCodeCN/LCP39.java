import java.util.HashMap;
import java.util.Map;

public class LCP39 {
    public static void main(String[] args) {
        int[][] q11 = new int[][]{new int[]{1, 2, 3}, new int[]{3, 4, 5}};
        int[][] q12 = new int[][]{new int[]{1, 3, 5}, new int[]{2, 3, 4}};

        int[][] q21 = new int[][]{new int[]{1, 3}, new int[]{5, 4}};
        int[][] q22 = new int[][]{new int[]{3, 1}, new int[]{6, 5}};

//        int a1 = new Test01().minimumSwitchingTimes(q11, q12);
//        System.out.println(a1);
        int a2 = new LCP39().minimumSwitchingTimes(q21, q22);
        System.out.println(a2);
    }

    public int minimumSwitchingTimes(int[][] source, int[][] target) {
        HashMap<Integer, Integer> list = new HashMap<>();

        for (int i = 0; i < source.length; i++) {
            for (int j = 0; j < source[0].length; j++) {
                list.put(source[i][j], list.get(source[i][j]) == null ? 1 : list.get(source[i][j]) + 1);
            }
        }

        for (int i = 0; i < target.length; i++) {
            for (int j = 0; j < target[0].length; j++) {
                list.put(target[i][j], list.get(target[i][j]) == null ? -1 : list.get(target[i][j]) + -1);
            }
        }

        int count = 0;
        for (Map.Entry<Integer, Integer> e : list.entrySet()) {
            count += Math.abs(e.getValue());
        }
//        System.out.println(list);

        return count / 2;
    }
}