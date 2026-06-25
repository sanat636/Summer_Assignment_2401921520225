class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean lr=true;
        while(!q.isEmpty()){
          int n=q.size();
          LinkedList<Integer> lv=new LinkedList<>();
          for(int i=0;i<n;i++){
           TreeNode node=q.poll();
           if(lr) lv.addLast(node.val);
           else lv.addFirst(node.val);
           if(node.left!=null) q.offer(node.left);
           if(node.right!=null) q.offer(node.right);
          }
          res.add(lv);
         lr=!lr;
        }
        return res;
    }
}