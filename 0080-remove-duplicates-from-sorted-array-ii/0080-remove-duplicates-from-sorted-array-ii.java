class Solution {
    public int removeDuplicates(int[] nums) {
        int k =2; // 2 hi duplicates hone chahiye list me 
        // k batata hai ki next valid element kis index par store hoga.
        // Pehle 2 elements ko hum hamesha rakhte hain,
        for (int i =2; i< nums.length; i++){ 
            // Third element (index 2) se checking start karte hain.
            // Current element ko us element se compare karo
            // jo valid array me 2 positions pehle hai.
            //
            // Agar dono same hain:
            // Matlab current element third duplicate hai.
            // Example:
            // Valid array -> [1, 1]
            // Current -> 1
            // Third 1 allowed nahi hai, isliye skip.
             // Agar different hain:
            // To current element ko rakh sakte hain.
            if(nums[i] != nums[k-2]){
                // current valid element ko next available position me store karo
                nums[k] = nums[i];
                k++; // next valid element pe move karo 

            }
            // Agar condition false hui to kuch nahi karenge.
            // Matlab current element third duplicate tha,
            // isliye automatically skip ho jayega.
        }return k;   // k hi final valid elements ki count hai.
        
    }
}