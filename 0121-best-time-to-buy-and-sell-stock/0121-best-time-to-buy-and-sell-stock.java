class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0]; // pehle din ke price ko buying price maan lethe hain
        int profit= 0; // strating me profit 0 hi hai

        for(int i=0; i<prices.length; i++){
            // dusre din se leeke akhri din thak jaarahe hain
            if(prices[i] < buy){
                //ager aj ka price buy price se kum hai
                // buy = 7
                // Aaj ka price = 1
                // 1 < 7
                // Yes
                buy = prices[i]; // to naya sasta price ko buy bana do
                // ab buy =1  Kyuki obviously 7 me kharidne se accha 1 me kharidna hai
            }else if(prices[i] - buy > profit){
                    //// Warna check karo ki agar aaj bechne se profit zyada mil raha hai kya.a
                    // Example
                    // buy = 1
                    // Aaj price = 5
                    // Profit = 5 - 1 = 4
                    // Current profit = 0
                    // 4 > 0
                    // Yes
                profit = prices[i] - buy;// Naya maximum profit store kar lo.
                    // AB profit = 4
                    // Next
                    // Price = 6
                    // Profit = 6 - 1 = 5
                    // Current profit = 4
                    // 5 > 4
                    // Yes
                    // To profit = 5
            }
                // Loop khatam.

        }
        return profit ;// Maximum profit return kar do.

    }
}