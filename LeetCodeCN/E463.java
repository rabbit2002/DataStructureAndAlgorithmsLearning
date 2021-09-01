/**
 * https://leetcode-cn.com/problems/island-perimeter/
 *
 * @author RABBIT2002
 * @date 2021/3/18
 */
public class E463 {

    public static void main(String[] args) {
        System.out.println(
                new E463().islandPerimeter(
                        new int[][]{{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}}));
    }

    /**
     * 检查每个格子是否是陆地
     * 如果是陆地检查周围4格是不是水
     * 如果是水则该格子邻接的边=水数量
     */
    public int islandPerimeter(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0) {
                    continue;
                }
                int temp = 0;

                if (i - 1 < 0 || grid[i - 1][j] == 0) {
                    temp++;
                }
                if (i + 1 >= grid.length || grid[i + 1][j] == 0) {
                    temp++;
                }
                if (j - 1 < 0 || grid[i][j - 1] == 0) {
                    temp++;
                }
                if (j + 1 >= grid[0].length || grid[i][j + 1] == 0) {
                    temp++;
                }
                System.out.println(i + "x" + j + "=" + temp);

                count += temp;
            }
        }

        return count;
    }

}
