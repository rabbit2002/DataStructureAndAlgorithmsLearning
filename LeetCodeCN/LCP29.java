/**
 * https://leetcode-cn.com/contest/season/2021-spring/problems/SNJvJP/
 *
 * @author RABBIT2002
 * @date 2021/4/5
 */
public class LCP29 {
    public static void main(String[] args) {

    }

    public int orchestraLayout(int num, int xPos, int yPos) {
        int[][] matrix = new int[num][num];

        int x = 0;
        int y = 0;
        // 0 -> right; 1 -> down; 2 -> left; 3 -> up
        int direction = 0;
        for (int i = 0; i < num * num; i++) {
            if (direction == 0) {
                x = x;
                y++;
            }
            if (direction == 1) {
                x++;
                y = y;
            }
            if (direction == 2) {
                x = x;
                y--;
            }
            if (direction == 3) {
                x--;
                y = y;
            }
        }
        return -1;
    }
}
