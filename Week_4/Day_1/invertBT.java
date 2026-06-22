
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return null;
        TreeNode td=root.left;
        root.left=root.right;
        root.right=td;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}