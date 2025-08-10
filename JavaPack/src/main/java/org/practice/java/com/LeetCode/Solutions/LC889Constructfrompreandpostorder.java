package org.practice.java.com.LeetCode.Solutions;

public class LC889Constructfrompreandpostorder {
    private int pre = 0;
    private int post = 0;
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        TreeNode node = new TreeNode(preorder[pre]);
        pre++;

        if (node.val != postorder[post]) {
            node.left = constructFromPrePost(preorder, postorder);
        }
        if (node.val != postorder[post]) {
            node.right = constructFromPrePost(preorder, postorder);
        }
        post++;
        return node;
    }

}
