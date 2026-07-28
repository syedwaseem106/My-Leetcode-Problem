class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;// arrays ka size findd kar rahe hain
        k = k % n;// Agar k bada hai to usko chhota kar do
        Reverse(nums, 0, n - 1);// Step 1: Pure array ko reverse karo
        Reverse(nums, 0, k - 1);// Step 2: Pehle k elements ko reverse karo
        Reverse(nums, k, n - 1);  // Step 3: Bache hue elements ko reverse karo
    }
    //// Reverse Function
    void Reverse(int[] nums, int s, int e) {
        // Jab tak start aur end mil nahi jate
        while (e > s) {
             // Dono values ko swap karo
            int temp = nums[s];
            nums[s] = nums[e];//nums[s] ko nums[e] se
            nums[e] = temp;//nums[e] me  temp daldo;
              // Start aage badhao
            s++;
            // End piche lao
            e--;
        }
    }
}