package org.practice.java.com.LeetCode.Solutions;

import static java.lang.Character.isDigit;

public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }

      public static void main(String[] args) {
          Solution2 solution = new Solution2();
          TreeNode root = solution.recoverFromPreorder("1-401--349---90--88");
          System.out.println(root);
      }

      @Override
      public String toString() {
          return STR."""
             root =\{val}\s
            \{val} left =\{left}||  right =\{right}""";
      }
}
class Solution2 {
    public TreeNode recoverFromPreorder(String traversal) {
        StringBuilder order = new StringBuilder(traversal);
        StringBuilder number = new StringBuilder();
        int i = 0;
        while (i < traversal.length() && isDigit(traversal.charAt(i))) {
            number.append(traversal.charAt(i));
            i++;
        }
        TreeNode root = new TreeNode(Integer.parseInt(number.toString()));
        System.out.println(root);
        return recoverFromPreorderHelper(root, order, i, traversal.length(),0);
    }

    private TreeNode recoverFromPreorderHelper(TreeNode root, StringBuilder path, Integer i, int n, int currentHeight) {
        if (i == n) return root;
        int heightCount = 0;
        while (i < n && path.charAt(i) == '-') {
            heightCount++;
            i++;
        }
        StringBuilder number = new StringBuilder();
        while (i < n && isDigit(path.charAt(i))) {
            number.append(path.charAt(i));
            i++;
        }
        int leftval = Integer.parseInt(String.valueOf(number));
        TreeNode newNode = new TreeNode(leftval);
        if(currentHeight + 1  == heightCount) {
            root.left = recoverFromPreorderHelper(newNode, path, i, n, heightCount);
            System.out.println(root.left);
        }
        else {
            i -= heightCount;
            return null;
        }
        heightCount = 0;
        while (i < n && path.charAt(i) == '-') {
            heightCount++;
            i++;
        }
        if (currentHeight + 1 == heightCount) {
            number = new StringBuilder();
            while (i < n && isDigit(path.charAt(i))) {
                number.append(path.charAt(i));
                i++;
            }
            int rightval = Integer.parseInt(String.valueOf(number));
            TreeNode newNode1 = new TreeNode(rightval);
            root.right = recoverFromPreorderHelper(newNode1, path, i, n, heightCount);
            System.out.println(root.right);
        } else {
            i -= heightCount;
            return null;
        }
        return root;
    }
}