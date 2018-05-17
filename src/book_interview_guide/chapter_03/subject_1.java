package book_interview_guide.chapter_03;

import common.TreeGenerator;
import common.TreeNode;

import java.util.Stack;

/**
 * Created by lyn on 18-5-3.
 * 二叉树前序中续遍历，分别用递归和非递归实现
 */
public class subject_1 {
    public static TreeNode root = TreeGenerator.getDefaultRoot();

    //测试
    public static void main(String[] args) {
        inOrderUnRecur(root);
    }

    /**
     * 用递归方式进行前序遍历
     *
     * @param node root treeNode
     */
    public static void preOrderRecur(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.println(node.data);
        preOrderRecur(node.left);
        preOrderRecur(node.right);
    }

    /**
     * 用递归方式进行中序遍历
     *
     * @param node root treeNode
     */
    public static void inOrderRecur(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrderRecur(node.left);
        System.out.println(node.data);
        inOrderRecur(node.right);
    }

    /**
     * 用非递归方式进行后序遍历
     *
     * @param node root treeNode
     */
    public static void posOrderRecur(TreeNode node) {
        if (node == null) {
            return;
        }
        posOrderRecur(node.left);
        posOrderRecur(node.right);
        System.out.println(node.data);
    }

    /**
     * 用非递归方式进行前序遍历
     *
     * @param node root treeNode
     */
    public static void preOrderUnRecur(TreeNode node) {
        if (node == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(node);
        while (!stack.isEmpty()) {
            node = stack.pop();
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
            System.out.println(node.data);
        }
    }

    /**
     * 用非递归方式进行中序遍历
     *
     * @param node root treeNode
     */
    public static void inOrderUnRecur(TreeNode node) {
        if (node == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || node != null) {
            if (node != null) {
                stack.push(node);
                node = node.left;
            } else {
                node = stack.pop();
                System.out.println(node.data);
                node = node.right;
            }
        }

    }

    /**
     * 用非递归方式进行后序遍历
     *
     * @param node root treeNode
     */
    public static void posOrderUnRecur(TreeNode node) {
        if (node == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(node);
        TreeNode c = null;
        while (!stack.isEmpty()) {
            c = stack.peek();
            if (c.left != null && node != c.left && node != c.right) {
                stack.push(c.left);
            } else if (c.right != null && node != c.right) {
                stack.push(c.right);
            } else {
                System.out.println(stack.pop().data);
                node = c;
            }
        }
    }
}
