//package org.practice.java.com.LeetCode.Solutions;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class LC173DesignBSTIterator {
//
//}
//
//
//
//
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
//  }
//
//class BSTIterator {
//
//    private TreeNode root;
//    private TreeNode currentNode;
//
//
//    public BSTIterator(TreeNode root) {
//        this.root = root;
//        this.currentNode = root;
//    }
//
//    public int next() {
//        if (this.root.left == null) {
//            return root;
//        }
//    }
//
//    public boolean hasNext() {
//
//    }
//}
//
///**
// * Your BSTIterator object will be instantiated and called as such:
// * BSTIterator obj = new BSTIterator(root);
// * int param_1 = obj.next();
// * boolean param_2 = obj.hasNext();
// */
