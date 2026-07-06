class Solution {
    private void findCombination(int i , int [] a, int target, List<List<Integer>> ans, List<Integer> ds ){
        if(i ==a.length){
            if(target == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(a[i]<= target){
            ds.add(a[i]);
            findCombination(i, a, target- a[i],  ans, ds);
            ds.remove(ds.size() - 1);
        }
        findCombination(i+1,a,target,ans,ds);
    }
    public List<List<Integer>> combinationSum(int[] c, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombination(0, c, target, ans, new ArrayList<>());
        return ans;
    }
}