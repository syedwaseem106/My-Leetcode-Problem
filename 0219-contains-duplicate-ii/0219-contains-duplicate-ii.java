class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();

        for(int i =0; i< nums.length; i++){
            //remove element that are outside of the windows
            if(i > k){
                set.remove(nums[i-k-1]);
            }

            //try to add current element if it fail then there is a duplicate exist 
            if(!set.add(nums[i])){
                return true ;
            }

        }
        return false;
        
    }
}