class Solution {
    public int removeDuplicates(int[] nums) {
        int j =0;

        for( int i =0; i< nums.length; i++){
            if (nums[j] != nums[i]){// condition for comparing 
                j++; // incrementing j befor palcing any value in j 
                nums[j] = nums[i]; // adding i value in j place
            }
        }
        return ++j;

    }
}