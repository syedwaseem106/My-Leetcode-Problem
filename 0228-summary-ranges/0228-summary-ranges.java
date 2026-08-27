class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        int len = nums.length;

        for( int i =0; i<len; i++){
            int start = nums[i];

            while(i+1 < len && nums[i+1] == nums[i] +1){
                i++;
            }
            if(start == nums[i]){
                list.add(String.valueOf(start));
            }else{
                list.add(start +"->" + nums[i]);
            }
        }
        return list;
        
    }
}