class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //if the both tree are null theen they are identical
        if( p == null  && q == null){
            return true;
        }

        //if only one tree is null or the va;ue are diffrent they are not identical
        if(p == null || q == null || p.val != q.val){
            return false;
        }

        //recursively check weather left and right subtreee are identical
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}