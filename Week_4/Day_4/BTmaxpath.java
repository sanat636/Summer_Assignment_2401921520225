
class Solution {
    int max;
    public int sol(TreeNode root){
        if(root==null) return 0;
        int left=sol(root.left);
        int right=sol(root.right);
        int ans=left+right+root.val;
        int ans1=Math.max(left,right)+root.val;
        int ans2=root.val;
        max=Math.max(max,Math.max(ans,Math.max(ans1,ans2)));
        return Math.max(ans1,ans2);
    }
    public int maxPathSum(TreeNode root) {
        max=Integer.MIN_VALUE;
        sol(root);
        return max;
    }
}