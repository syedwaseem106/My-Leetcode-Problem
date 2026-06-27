class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int result = nums[0] + nums[1] + nums[nums.length-1];
        Arrays.sort(nums);// sorting 

        for(int i=0;  i<nums.length-2; i++){
            int a_pointer = i+1;            // 2 pointer approch pointer a
            int b_pointer = nums.length-1; // 2 pointer approch pointer b

            while(a_pointer < b_pointer){
                int current_sum = nums[i] + nums[a_pointer] + nums[b_pointer];//finding the current sum of all i value and 2 pointer value 
                if( current_sum > target ){
                    b_pointer -=1; // decriment the b_pointer to get the nearest sum element  beacuse b_pointer is the biggest elemeent
                }else{
                    a_pointer +=1;
                }

                if(Math.abs(current_sum - target) < Math.abs(result - target)){// jst cheacking it comes in between the target or comes near of the target or not
                result = current_sum; //
                }
            }
        } return result;
    }
}