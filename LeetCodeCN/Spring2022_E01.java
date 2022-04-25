public class Spring2022_E01 {
    public static void main(String[] args) {
        int[] q11 = new int[]{3, 1, 2};
        int[][] q12 = new int[][]{new int[]{0, 2}, new int[]{2, 1}, new int[]{2, 0}};
        int a1 = new Spring2022_E01().giveGem(q11, q12);
        System.out.println(a1);
    }

    public int giveGem(int[] gem, int[][] operations) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < operations.length; i++) {
            int opeValue = gem[operations[i][0]] / 2;
            // from
            gem[operations[i][0]] -= opeValue;
            // to
            gem[operations[i][1]] += opeValue;
        }

        for (int i = 0; i < gem.length; i++) {
            if (gem[i] > max) {
                max = gem[i];
            }
            if (gem[i] < min) {
                min = gem[i];
            }
        }
        return max - min;
    }
}
