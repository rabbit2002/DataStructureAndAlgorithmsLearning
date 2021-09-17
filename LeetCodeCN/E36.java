import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/valid-sudoku/
 * https://leetcode-cn.com/problems/valid-sudoku/solution/gong-shui-san-xie-yi-ti-san-jie-ha-xi-bi-ssxp/
 */

public class E36 {
    public static void main(String[] args) {
        char[][] q1 = new char[][]{
                new char[]{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                new char[]{'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                new char[]{'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                new char[]{'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                new char[]{'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                new char[]{'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                new char[]{'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                new char[]{'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                new char[]{'.', '.', '.', '.', '8', '.', '.', '7', '9'},

        };
        boolean a1 = new E36().isValidSudoku(q1);
        System.out.println(a1);
    }

    public boolean isValidSudoku(char[][] board) {
        Hashtable[] matrix = new Hashtable[27];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = new Hashtable<Character, Boolean>();
        }

        // 横着 0-8
        // 竖着 9-17
        // 格子 18-26
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                char item = board[i][j];
                if (item == '.') {
                    continue;
                }
                // 行
                Hashtable<Character, Boolean> roweHashtable = matrix[i];
                // 列
                Hashtable<Character, Boolean> columnHashtable = matrix[9 + j];
                // 格子
                Hashtable<Character, Boolean> pointHashtable = matrix[18 + (i / 3) * 3 + (j / 3)];

                if (roweHashtable.get(item) != null || columnHashtable.get(item) != null || pointHashtable.get(item) != null) {
                    return false;
                }
                roweHashtable.put(item, true);
                columnHashtable.put(item, true);
                pointHashtable.put(item, true);
            }
        }
        return true;
    }
}
