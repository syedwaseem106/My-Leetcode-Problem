class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0) return 0 ;// frst checking that its eqaul to 0 is yese retun 0

        int j=0; // front side of the array j= value size 
        for (int i=0; i< nums.length; i++){
            if(nums[i] != val)// checking if the number which we are aremoving is it the same 
            {
                nums[j]= nums[i];// store i value into j
                j++;


            }
        }
        return j;
        
    }
}