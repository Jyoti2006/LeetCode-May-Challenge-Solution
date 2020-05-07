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
    int p1,p2,l1,l2;
    public boolean isCousins(TreeNode root, int x, int y) {
        p1=p2=l1=l2=-1;
        if(root==null)
            return false;
        if(root.val==x || root.val==y)
            return false;
        dfs(root,x,1,0);
        dfs(root,y,2,0);
        if(p1!=p2 && l1==l2)
            return true;
        return false;
    }
    private void dfs(TreeNode root, int x, int num, int depth){
        if(root==null)
            return;
        if(root.left!=null){
            if(root.left.val==x){
                if(num==1){
                    p1=root.val;
                    l1=depth+1;
                }
                else{
                    p2=root.val;
                    l2=depth+1;
                }
                return;
            }
            else{
                dfs(root.left,x,num,depth+1);
            }
        }
            if(root.right!=null){
                if(root.right.val==x){
                    if(num==1){
                        p1=root.val;
                        l1=depth+1;
                    }
                    else{
                        p2=root.val;
                        l2=depth+1;
                    }
                    return;
                }
                else{
                    dfs(root.right,x,num,depth+1);
                }
            }
    }
}