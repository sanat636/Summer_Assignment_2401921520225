class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
     if(root==null) return 0;
     int[] res={Integer.MIN_VALUE};
     dia(root,res);
     return res[0];
    }
    public int dia(TreeNode root,int[] res){
        if(root==null) return 0;
        int left=dia(root.left,res);
        int right=dia(root.right,res);
        res[0]=Math.max(res[0],left+right);
        return Math.max(left,right)+1;
    }
}