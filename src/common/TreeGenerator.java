package common;


/**
 * Created by lyn on 18-4-23.
 */
public class TreeGenerator {
    public static TreeNode getDefaultRoot(){
        return transformArrayToTreeNode(Constants.INT_ARRAY);
    }
    public static TreeNode transformArrayToTreeNode(int[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        TreeNode[] nodes = new TreeNode[array.length];
        for (int i = 0; i < array.length; i++) {
            TreeNode node = new TreeNode(array[i]);
            nodes[i] = node;
        }
        for (int i = 0; i < array.length / 2; i++) {
            nodes[i].left = nodes[2 * i + 1];
            if (2 * i + 2 < array.length) {
                nodes[i].right = nodes[2 * i + 2];
            }
        }
        return nodes[0];
    }
}
