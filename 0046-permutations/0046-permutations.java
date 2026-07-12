class Solution {
    public List<List<Integer>> permute(int[] nums) {
        //M1: Backtracking
        //with for loop only
        
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> temp = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        solve(nums, temp, set, ans, n);
        return ans;
    }

    static void solve(int[] nums, List<Integer> temp, HashSet<Integer> set, List<List<Integer>> ans, int n) {
        if (temp.size() == n) {
            ans.add(new ArrayList<>(temp)); // copy current permutation
            return;
        }

        for (int i = 0; i < n; i++) {
            if (set.contains(nums[i]))
                continue; // skip if already used

            // STEP 1: do something
            temp.add(nums[i]);
            set.add(nums[i]);

            // STEP 2: explore
            solve(nums, temp, set, ans, n);

            // STEP 3: remove 
            temp.remove(temp.size() - 1);
            set.remove(nums[i]);
        }
    }
}