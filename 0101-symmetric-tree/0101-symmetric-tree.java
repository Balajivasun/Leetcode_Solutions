/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return helper(root.left,root.right);
    }
    public boolean helper(TreeNode leftt, TreeNode rightt){
        if(leftt==null && rightt==null) return true;
        if(leftt==null || rightt==null ) return false;
        return leftt.val==rightt.val && helper(leftt.left,rightt.right) && helper(leftt.right,rightt.left);
    }
}