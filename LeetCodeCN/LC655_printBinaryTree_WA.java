import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
// FIXME
class LC655_printBinaryTree_WA {
    int depthLayerCount = 0;
    int lineLength = 0;

    public List<List<String>> printTree(TreeNode root) {
        // cacu tree node depth
        dfsCacuDepth(root, 1);
        lineLength = 2 << depthLayerCount - 1;

        // build result
        List<List<String>> result = new ArrayList<>();
        for (int i = 0; i < depthLayerCount; i++) {
            List<String> tmp = new ArrayList<>();
            for (int j = 0; j < lineLength; j++) {
                tmp.add("");
            }
            result.add(tmp);
        }

        // full data to result list
        dfsFullData(root, result, depthLayerCount, lineLength / 2);

        return result;
    }

    public void dfsCacuDepth(TreeNode root, int count) {
        if (root == null) {
            return;
        }
        depthLayerCount = Math.max(depthLayerCount, ++count);
        dfsCacuDepth(root.left, count);
        dfsCacuDepth(root.right, count);
    }

    public void dfsFullData(TreeNode root, List<List<String>> list, int positionDepth, int positionLine) {
        if (root == null) {
            return;
        }
        list.get(positionDepth).set(positionLine, "" + root.val);
        dfsFullData(root.left, list, positionDepth++, positionLine - (1 << (depthLayerCount - positionDepth - 1)));
        dfsFullData(root.right, list, positionDepth++, positionLine + (1 << (depthLayerCount - positionDepth - 1)));
    }

    public static void main(String[] args) {
        TreeNode q2 = new TreeNode(1);
        q2.left = new TreeNode(2);
        q2.right = new TreeNode(3);
        q2.left.right = new TreeNode(4);

        List<List<String>> a2 = new LC655_printBinaryTree_WA().printTree(q2);

        for (int i = 0; i < a2.size(); i++) {
            for (int j = 0; j < a2.get(i).size(); j++) {
                System.out.print(a2.get(i).get(j) + ',');
            }
            System.out.println();
        }
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}