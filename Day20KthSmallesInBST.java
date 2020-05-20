/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int count;
    int ele;
    public int kthSmallest(TreeNode root, int k) {
        count=0;
        ele=Integer.MAX_VALUE;
        inorder(root,k);
        return ele;
    }
    private void inorder(TreeNode root, int k) {
        if(root!=null && count<k)
        {
            inorder(root.left,k);
            if(count<k){
                ++count;
                 ele=root.val;
            }
           
            inorder(root.right,k);
        }
    }
    
}