class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        sol(res,root);
        return res;
    }
    void sol(List<Integer> res,TreeNode root){
        if(root==null) return;
        sol(res,root.left);
        res.add(root.val);
        sol(res,root.right);
    }
}