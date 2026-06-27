
class Solution {
    int idx=0;
    public TreeNode sol(int[] preorder,int[] inorder,int a,int b){
        if(a>b) return null;
        int rv=preorder[idx];
        int i=a;
        while(i<=b){
            if(inorder[i]==rv){
                break;
            }
            i++;
        }
        idx++;
        TreeNode root=new TreeNode(rv);
        root.left=sol(preorder,inorder,a,i-1);
        root.right=sol(preorder,inorder,i+1,b);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return sol(preorder,inorder,0,inorder.length-1);

    }
}