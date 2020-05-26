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
    int i=0;
    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder==null || preorder.length==0)
            return null;
        return bstFromPreOrderUtil(preorder,Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    private TreeNode bstFromPreOrderUtil(int []preorder,int min, int max){
        if(i>=preorder.length)
            return null;
        int k=preorder[i];
        TreeNode node=null;
        if(k>min && k<max){
            node=new TreeNode(preorder[i]);
            i++;
            node.left=bstFromPreOrderUtil(preorder,min,k);
            node.right=bstFromPreOrderUtil(preorder,k,max);
        }
        return node;
    }
}