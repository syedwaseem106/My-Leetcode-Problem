class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); // build it function for Array
        List<List<Integer>> output_arr =  new LinkedList(); // declaring responce array and adding the responce in the new LinkdList();

        for(int i=0; i<nums.length -2 ; i++)// i<numms.length -2 , this is beacuse we r trying to stop the loop at the last 3rdd indexx "i=3" {ex:nums = [-1,0,1,2,-1,-4]}
        { 
            if( i==0 || (i>0 && nums[i] != nums[i-1])){//nums[i] != nums[i-1], this is for duplicates
                int low = i+1;             // 2 sum technique adding 2 pointer for 2 sum
                int high = nums.length-1;   // 2 sum technique 
                int sum  = 0-nums[i];      //we needd 0 we are looking for 3 number which addup to "0"


                while(low < high){
                    if(nums[low] + nums[high] == sum){ // ading the 2 numbers and compairing with the sum
                 
                        output_arr.add(Arrays.asList(nums[i], nums[low], nums[high]));// adding the output to "output_arr" 
                        while(low < high && nums[low]== nums[low+1])low++;//  for avoiding Duplicate 
                        while(low < high && nums[high]== nums[high-1])high--;//  for avoiding Duplicate
                        low++;
                        high--;
                    }else if(nums[low] + nums[high] > sum) {// if adding low and high value make the result greater then sum then decriment the high pointer "high--""
                        high --;
                    } else {// if adding low and high value make the result Lower then sum then Incriment the Low pointer "low++"
                        low++;
                    } 
                }
            }
        }
        return output_arr;
    }
}

    
