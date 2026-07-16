// Kadane's Algorithm
class Solution {
    public int maxSubArray(int[] nums) {
         // Bhai, yaha pe hum maximum answer store karenge.
        // nums[0] se isliye start kiya kyunki agar saare numbers negative hue
        // toh answer bhi negative hi hoga.
        // Agar yaha 0 lete toh [-2,-5,-1] ka answer galat aata.
        int res = nums[0]; 
        // Bhai, ye current subarray ka sum hai.
        int total = 0 ; // abhi tak jo number utaye hain uska total count hoothaa  hai yahan
        
        // bhi array ke number ko ek ek kar ke utane ke liye ye line lethe hain
        for( int n: nums){
            
            // ager current sum -ve hai ya nahi check karneke liye 
            if( total < 0){
                //-ve Number mila tho usko feek do 
                // -ve number ko carry karne ka koi faida nai 
                // naya subarray  nxt element se start karenge 
                total =0;// -ve number nahi dalinge islye "0"
            }
            // ab current number "n" ko running sum "total =0;" isme add karo
            total +=n;
            // compair karo ke current number bada hai kya picchle answer se 
            // jo bada hooga usko " res " me Store karna hai 
            res = Math.max(res, total);
        }
        //abb pura array travers (dekh) liya 
        // abb jo max hai usko return kardo
        return res;
    }
}