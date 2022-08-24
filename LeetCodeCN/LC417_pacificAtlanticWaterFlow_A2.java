import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC417_pacificAtlanticWaterFlow_A2 {
    public static void main(String[] args) {
        List<List<Integer>> a1 = new LC417_pacificAtlanticWaterFlow_A2().pacificAtlantic(
                new int[][] {
                        new int[] { 1, 2, 2, 3, 5 },
                        new int[] { 3, 2, 3, 4, 4 },
                        new int[] { 2, 4, 5, 3, 1 },
                        new int[] { 6, 7, 1, 4, 5 },
                        new int[] { 5, 1, 1, 2, 4 },
                });

        System.out.println(Arrays.deepToString(a1.toArray()));
    }

    int m = 0;
    int n = 0;
    int[][] height = null;

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        m = heights.length;
        n = heights[0].length;
        height = heights;

        boolean[][] res1 = new boolean[m][n];
        boolean[][] res2 = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (i == 0 || j == 0) {
                    if (!res1[i][j]) {
                        dfs(i, j, res1);
                    }
                }
                if (i == m - 1 || j == n - 1) {
                    if (!res2[i][j]) {
                        dfs(i, j, res2);
                    }
                }

            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (res1[i][j] && res2[i][j]) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(i);
                    temp.add(j);
                    ans.add(temp);
                }
            }
        }

        return ans;
    }

    int[][] dirs = new int[][] { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

    void dfs(int x, int y, boolean[][] res) {
        res[x][y] = true;

        for (int[] step : dirs) {
            int toX = x + step[0];
            int toY = y + step[1];

            // 边界
            if (toX < 0 || toX >= m || toY < 0 || toY >= n) {
                continue;
            }

            if (res[toX][toY]) {
                continue;
            }

            if (height[x][y] > height[toX][toY]) {
                continue;
            }

            dfs(toX, toY, res);
        }
    }
}
