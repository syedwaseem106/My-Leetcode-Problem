class Solution {
    TreeNode pre = null;
    int min = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        if(root == null) return 0;
        inOrder(root);
        return min;
    }

    private void inOrder(TreeNode root){
        if(root == null) return;

        //visit left subtree
        inOrder(root.left);

        //process current node
        if(pre != null){
            min = Math.min(min, Math.abs(pre.val - root.val));
        }
        pre = root;

        //visit right subtree
        inOrder(root.right);
    }
}