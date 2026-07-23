class Solution {
    public int minPathSum(int[][] grid) {
        int m= grid.length;//Matlab Rows kitni hain? m =3
        int n = grid[0].length;//Matlab cols kitni hain? n=3
        //Grid
        // 1 3 1
        // 1 5 1
        // 4 2 1
        // ==========================
        // STEP 1: Fill First Column
        // ==========================
        // First column me sirf upar se hi aa sakte hain,
        // isliye previous row ka sum add karte jao.
        for(int i=1; i<m ; i++){
            grid[i][0] += grid[i-1][0];
        }
            // ========================
        // STEP 2: Fill First Row
        // ========================
        // First row me sirf left se hi aa sakte hain,
        // isliye previous column ka sum add karte jao.
        for(int j=1; j<n; j++){
            grid[0][j] += grid[0][j-1];
                // ==========================================
        // STEP 3: Fill Remaining Cells (DP Logic)
        // ==========================================
        // Har cell tak pahunchne ke do hi raste hain:
        // 1. Upar se
        // 2. Left se
        // Dono me jo minimum cost hogi,
        // usme current cell ki value add kar denge.
        }
        for(int i=1; i<m; i++){
            for(int j =1; j<n; j++){
                 // Current cell value +
                // minimum(upper path, left path)
                grid[i][j] += Math.min(grid[i-1][j], grid[i][j-1]);
            }
        }
        // Last cell me minimum path sum store hoga
        return grid[m-1][n-1];
        
    }
}
// Easy Trick (Interviewer Style)
// Har cell sochta hai:
// "Mere paas upar wala aur left wala dost hai. Dono mujhe batate hain ki un tak pahunchne ka cost kitna laga. Main dono me se jo sasta hai usko choose karta hoon aur apni value usme add kar deta hoon."
// Isliye har cell me minimum path sum store hota chala jata hai.