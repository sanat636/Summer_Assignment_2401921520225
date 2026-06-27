class Solution {
    public boolean sol(TreeNode root,int sum,int c){
        if(root==null) return false;
        if(root.left==null && root.right==null) return (c+root.val)==sum;
        boolean left=sol(root.left,sum,c+root.val);
        boolean right=sol(root.right,sum,c+root.val);
        return left || right; 
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return sol(root,targetSum,0);
    }
}