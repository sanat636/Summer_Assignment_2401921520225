
class Solution {
    public boolean ans(TreeNode root,TreeNode min,TreeNode max){
        if(root==null) return true;
        if(min!=null && root.val<=min.val) return false;
        if(max!=null && root.val>=max.val) return false;
        return ans(root.left,min,root) && ans(root.right,root,max);
    }
    public boolean isValidBST(TreeNode root) {
        return ans(root,null,null);
    }
}