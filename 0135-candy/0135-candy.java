class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length; // array ki lambayi nikal rahe hain
        int cnt =0; // candies ka size store karne ke liye veriable  
        int[] candies =  new int[n]; // har bache ko kithne candies mili o track ka rahe hain 
        for(int i =0; i< n; i++) candies[i] =1;  //surwath me bachon ko sab ko ek 1 hi candiesde rahe hain 
        // left se right thak traves kar rahe hain 
        for( int i=1; i< n; i++)
            if (ratings[i] > ratings[i-1])
                candies[i] = candies[i-1] + 1;// iska mathlab hai usko pichle wale ko 1ek zyada candies doo
            // right se left traves kar rahe hain uske sath total bi jod rahe hain 
        for (int i = n - 1; i > 0; i--) {
                //ager left wale bache ki ratig right wal se zyada hai.....
            if(ratings[i-1] > ratings[i])
                // dono condition statify hoo isliye max value nikal rahe hain 
                candies [i-1] = Math.max(candies[i] +1, candies [i-1]);
            cnt += candies[i-1];// har ekk bache ki candie ko add kar ke, count me add kar rahe hain 
        }
        return cnt + candies[ n-1 ];//sari candies ka sum niklal rahe hain last wale ka add kar ke return kardo
    }
}
    