public class LC883_projectionAreaOf3dShapes {
    public static void main(String[] args) {
        int a1 = new LC883_projectionAreaOf3dShapes()
                .projectionArea(new int[][] { new int[] { 1, 2 }, new int[] { 3, 4 } });
        System.out.println(a1);

        int a2 = new LC883_projectionAreaOf3dShapes()
                .projectionArea(new int[][] { new int[] { 1, 0 }, new int[] { 0, 2 } });
        System.out.println(a2);
    }

    public int projectionArea(int[][] grid) {
        int xyArea = 0;
        int xzArea = 0;
        int yzArea = 0;

        int xLength = grid.length;
        int yLength = grid[0].length;

        int[] xMax = new int[xLength];
        int[] yMax = new int[yLength];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] != 0) {
                    xyArea++;
                }
                xMax[i] = Math.max(xMax[i], grid[i][j]);
                yMax[j] = Math.max(yMax[j], grid[i][j]);
            }
        }

        for (int i = 0; i < xLength; i++) {
            xzArea += xMax[i];
        }
        for (int i = 0; i < yLength; i++) {
            yzArea += yMax[i];
        }

        return xyArea + xzArea + yzArea;
    }
}
