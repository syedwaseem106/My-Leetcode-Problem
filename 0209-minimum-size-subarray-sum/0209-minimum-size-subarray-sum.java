class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left =0;// ye left pointer hai jo starting window ko track karega 
        int sum =0;// current window ka sum hai
        int ans = Integer.MAX_VALUE;// iska mathlab answer ko max value se start kar rahe hain

        //right pointer ko ek ek kar ke add karega 
        for(int right =0; right <nums.length; right++){
            sum += nums[right];// current right lement ko sum ke sath addd karo

            //jab thak window ka size current se bada hai to window ko chota karne ka try karo 
            while(sum >= target){
                
                //current window ki lenght ko calculate karo length = right -left +1 or uskao ans me store karo 
                ans = Math.min(ans, right - left + 1);
                //left most emelemnt ko sum se remove karo thaki window choti hoojaye 
                sum -=nums[left];
                left ++; // left ko inceremaent karo 
            }
        }

        // Agar ans abhi bhi Integer.MAX_VALUE hai,
        // iska matlab koi valid subarray nahi mila
        // isliye 0 return karo
        // Otherwise minimum length return karo
        return ans == Integer.MAX_VALUE ? 0:ans;
        
    }
}