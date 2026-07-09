class Solution {
    public int firstMissingPositive(int[] nums) {
        int[] filteredNums = Arrays.stream(nums).filter(n -> n > 0).toArray();
        
        Arrays.sort(filteredNums);//Step 2: Sort the Remaining Positive Numbers

        
        int target = 1;//Step 3: Initialize the Target Variable
        for (int n : filteredNums) //Step 4: Iterate Through the Sorted List
        {
            if (n == target) {
                target++;
            } else if (n > target) {
                return target;//Step 5: Return the Target as the Missing Positive Integer

            }
        }
        
        return target;        
    }
}