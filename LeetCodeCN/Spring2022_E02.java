public class Spring2022_E02 {
    public static void main(String[] args) {
        int[] q11_materials = new int[]{3, 2, 4, 1, 2};
        int[][] q12_cookbooks = new int[][]{new int[]{1, 1, 0, 1, 2}, new int[]{2, 1, 4, 0, 0}, new int[]{3, 2, 4, 1, 0}};
        int[][] q13_attribute = new int[][]{new int[]{3, 2}, new int[]{2, 4}, new int[]{7, 6}};
        int q14_limit = 5;

        int a1 = new Spring2022_E02().perfectMenu(q11_materials, q12_cookbooks, q13_attribute, q14_limit);
        System.out.println(a1);
    }

    public int perfectMenu(int[] materials, int[][] cookbooks, int[][] attribute, int limit) {
        return 0;
    }
}
