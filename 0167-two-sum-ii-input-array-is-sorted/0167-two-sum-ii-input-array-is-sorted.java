class Solution {
    public int[] twoSum(int[] nums, int target) {
        //using two poiter here 
        //let 
        int start =0; //pointer A
        int end = nums.length -1 ; // pointer B 

        // ager sstart chota huva end se tho usko  sum kardo
        while( start < end ){
            int sum = nums[start] + nums[end];


            //ager sum eqal hai target se tho jo sum tha uske +1 ke element ko return kardo 
            if(sum == target ){
                return new int[]{start +1, end +1};
            }// if else ager sum < target se to start ko increment kardo 
            // warna end ko Dicrement karddo
            else if( sum < target ){
                start ++;
            }
            else{
                end --;
            }
        }
        return new int []{-1,-1};// siak mathlab koi valid pair nahi mila jo target bana sake 
    }
}