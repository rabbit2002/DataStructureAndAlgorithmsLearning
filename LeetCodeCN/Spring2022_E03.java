import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Spring2022_E03 {
    HashMap<Integer, Boolean> value = new HashMap<>();

    public static void main(String[] args) {
        TreeNode q11 = new TreeNode(1);
        q11.right = new TreeNode(2);
        q11.right.right = new TreeNode(3);
        q11.right.right.right = new TreeNode(4);
        q11.right.right.right.right = new TreeNode(5);
        int[][] q12 = new int[][]{new int[]{1, 2, 4}, new int[]{1, 1, 3}, new int[]{0, 3, 5}};
        int a1 = new Spring2022_E03().getNumber(q11, q12);
        System.out.println(a1);

        TreeNode q21 = new TreeNode(4);
        q21.left = new TreeNode(2);
        q21.right = new TreeNode(7);
        q21.left.left = new TreeNode(1);
        q21.right.left = new TreeNode(5);
        q21.right.left.right = new TreeNode(6);
        int[][] q22 = new int[][]{new int[]{0, 2, 2}, new int[]{1, 1, 5}, new int[]{0, 4, 5}, new int[]{1, 5, 7}};
        int a2 = new Spring2022_E03().getNumber(q21, q22);
        System.out.println(a2);
    }

    public int getNumber(TreeNode root, int[][] ops) {
        int sum = 0;
        print(root);

        for (int i = 0; i < ops.length; i++) {
            // type 0->to false 1->to true
            int type = ops[i][0];
            int from = ops[i][1];
            int to = ops[i][2];

            for (int j = from; j <= to; j++) {
                if (value.containsKey(j)) {
                    if (type == 0) {
                        value.put(j, false);
                    } else {
                        value.put(j, true);
                    }
                }
            }
        }

        for (int v : value.keySet()) {
            if (value.get(v)) {
                sum++;
            }
        }

        return sum;
    }

    void print(TreeNode node) {
        if (node == null) {
            return;
        } else {
            value.put(node.val, false);

            print(node.left);
            print(node.right);
        }
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
