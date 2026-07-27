class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums); // sorting the nums
        int n = nums.length; // finding the length of the array 
        return nums[n/2];

        
    }
}