
class Solution {
    public boolean sol(TreeNode l,TreeNode r){
       if(l==null && r==null) return true;
       if(l==null || r==null) return false;
       if(l.val==r.val) return sol(l.left,r.right) && sol(l.right,r.left);
       return false;
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return sol(root.left,root.right);
    }
}