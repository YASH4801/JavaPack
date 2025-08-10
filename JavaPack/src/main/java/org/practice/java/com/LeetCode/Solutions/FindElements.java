package org.practice.java.com.LeetCode.Solutions;


import java.util.HashSet;

public class FindElements {

    private TreeNode root;
    private HashSet<Integer> elements;

    public FindElements(TreeNode root) {
        this.root = root;
        elements = new HashSet<>();
        recoverTree(root, 0);
    }

    private void recoverTree(TreeNode root, int value) {
        root.val = value;
        elements.add(value);
        if (root.left != null) recoverTree(root.left, 2 * value + 1);
        if (root.right != null) recoverTree(root.right, 2 * value + 2);
    }

    public boolean find(int target) {
        return elements.contains(target);
    }
}

//class TreeNode {
//      int val;
//      TreeNode left;
//      TreeNode right;
//      TreeNode() {}
//      TreeNode(int val) { this.val = val; }
//      TreeNode(int val, TreeNode left, TreeNode right) {
//          this.val = val;
//          this.left = left;
//          this.right = right;
//      }
//}
