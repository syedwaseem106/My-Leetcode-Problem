class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList();// creating a list were we can store our Output 
        if(matrix.length==0) return res; // this mean is our length is 0 then we dint travese any thing this wt it says 

        int rowbegin = 0;// satrting pointer
        int rowend = matrix.length-1; // end pointer
        int columnbegin =0;// starting pointer for Column
        int columnend= matrix[0].length -1;//Ye matrix ke aakhri (last) column ki position nikalta hai

        while(rowbegin <= rowend && columnbegin <= columnend){
            //Current row ke pehle column se lekar last column tak ek-ek karke jao
            for( int i=columnbegin; i<=columnend; i++){
                res.add(matrix[rowbegin][i]);//Jo element milta hai, usko result list (res) mein add kar do. "matrix[rowbegin][i]"-->rowBegin → kaunsi row dekhni hai
//i → us row ka kaunsa column dekhna hai
                //Ek line mein yaad rakho:
                //while(...) → Jab tak matrix bachi hai, loop chalao.
                //for(...) → Current row ko left se right tak padho.
                //res.add(...) → Har element ko answer mein daal do.
            }
            rowbegin ++;
            //Yaani loop 0th row, 1st row, aur 2nd row par chalega.
            //rowBegin se rowEnd tak ek-ek row par jao.
            for(int i=rowbegin; i<=rowend; i++){
                res.add(matrix[i][columnend]);//Har row ka columnEnd wala element uthao aur result mein add karo.


                //Yaad rakhne ka trick:

                // matrix[rowBegin][i] → Ek row fix hai, columns badal rahe hain (Left → Right).
                // matrix[i][columnEnd] → Ek column fix hai, rows badal rahi hain (Top → Bottom).
            }
            columnend --;// Right column traverse ho gaya, ab usko hata do

            // // Agar abhi bhi bottom row bachi hai 
            if(rowbegin <= rowend){
                // Bottom row ko Right → Left traverse karo
                for(int i= columnend ; i>=columnbegin; i--){
                    res.add(matrix[rowend][i]); // Bottom row ke har element ko result mein add karo

                }
            }
            rowend--;// Bottom row traverse ho gayi, ab usko hata do

            // Agar abhi bhi left column bacha hai
            if(columnbegin <= columnend){
                 // Left column ko Bottom → Top traverse karo
                for(int i = rowend; i>=rowbegin; i--){
                    res.add(matrix[i][columnbegin]); // Left column ke har element ko result mein add karo

                }
            }
            columnbegin++;// Left column traverse ho gaya, ab usko hata do

        }
        return res;
    }
}
// Yaad rakhne ka Trick 🧠
    // matrix[row][column]
    // matrix[rowBegin][i]
// ✅ Row fix hai
// ✅ Column badal raha hai
    // ➜ Left → Right
    // matrix[i][columnEnd]
// ✅ Column fix hai
// ✅ Row badal rahi hai
    // ➜ Top → Bottom  
    // matrix[rowEnd][i]
// ✅ Row fix hai
// ✅ Column badal raha hai
    // ➜ Right → Left
    // matrix[i][columnBegin]
// ✅ Column fix hai
// ✅ Row badal rahi hai
    // ➜ Bottom → Top