class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        //ager grid null hai ya starting cell hee obsticle hai to robort start hi nahi hooga
        if(obstacleGrid == null || obstacleGrid[0][0] == 1){
            return 0;
        }

        int rows = obstacleGrid.length;// yahan total row nikal rahe hain 
        int cols = obstacleGrid[0].length;// total cols nikal rahe hain

        // 1D Dp array  bana rahe hain 
        // dp[c] iska mathlab current row ke colum c thak jane ke total ways
        int[] dp = new int[cols];//Is Question Mein DP Kya Store Kar Raha Hai?

        dp[0]=1;// strating point pe pochnch ne ka yk hi way hai

        // har row ko vivit karo
        for(int r=0; r< rows; r++){
            // current row ke har column ko vist karo
            for(int c=0; c<cols; c++){
                // if current cell obsitical hai
                if(obstacleGrid[r][c] ==1){
                    //Agar obstacle mila is row per robot aa hi nahi saktha 
                    dp[c] = 0; //Kyun? is row per robot aa hi nahi saktha" To ways =0."
                }
                else{
                    // ager first colum nahi hai
                    if(c> 0){
                        //false ho gaya.Kuch nahi karenge.
                        //dp[c]--> upper se (top )se aane wale ways
                        //dp[c-1] --> left se annae wale ways

                        // find karo total ways kithne hain
                        dp[c] = dp[c]+ dp[c-1]; // formula hai total way = top + left
                    }
                }
            }
        }
        return dp[cols-1];// last me last cell ka answer return karo 
    }
}

// ///*DP = Dynamic Programming

// DP ka simple matlab hai:

// Jo answer pehle calculate kiya hai, usko yaad (store) rakhna taaki dobara calculate na karna pade./*



//Example:

// dp = [1,2,1]

// Matlab

// dp[0] = 1

// 👉 Column 0 tak pahunchne ka 1 way hai.

// dp[1] = 2

// 👉 Column 1 tak pahunchne ke 2 ways hain.

// dp[2] = 1

// 👉 Column 2 tak pahunchne ka 1 way hai.