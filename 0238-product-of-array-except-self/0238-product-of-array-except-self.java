class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length; // array ka length nikal rahe hain
        int ans[] = new int [n]; // ans store karne ke liye naya array bana rahe hain

        // sab element ko 1 se intiallize kar rahe hain 
        // Kyuki multiplication me 1 identity hoti hai
        Arrays.fill(ans, 1);

        // left side se runnning product store karenge  
        int curr =1;

        for(int i=0; i<n; i++){
            ans[i] *=curr;// // Current index par left product store karo

            curr *= nums[i]; //Current element ko running product me include karo
        }
        curr =1 ;
        // Suffix (Right Product) calculate kar rahe hai
        for(int i = n-1; i >= 0 ; i--){
            ans[i] *=curr; //left product ko right wale ke sath multiply karo 
            curr *=nums[i];// Current element ko right running product me include karo

        }
        return ans;
    }
}