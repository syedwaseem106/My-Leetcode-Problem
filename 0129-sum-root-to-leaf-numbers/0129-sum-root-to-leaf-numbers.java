class Solution {
    public int sumNumbers(TreeNode root) {
        return helper(root,  0);
    }

    int helper(TreeNode node, int current){
        if(node == null) return 0;

        current = current * 10 + node.val;

        if(node.left == null && node.right == null) return current;

        return helper(node.left, current) + helper(node.right, current);
    }
}