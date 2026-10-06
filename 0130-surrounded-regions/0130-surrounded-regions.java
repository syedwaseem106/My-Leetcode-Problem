class Solution {
    public void solve(char[][] board) {
        int m = board.length;// board ki total nikal rahe hain
        int n = board[0].length; // total coulmn nikal rahe hain

        // visited matrix iss me hum track karenghe ki konsa "0" boundrys ke connected me hai
        // false aya tho abbi visit nahi huva
        // true aya tho visit hoochuka

        boolean[][] vis = new boolean[m][n];

          // 1. FIRST AUR LAST COLUMN SE DFS START KARO
        
        for(int i =0; i<m; i++){
            // check karo ki colum ka frst eliment 0  hai kya nahi

            if(board[i][0] == 'O' && vis[i][0] == false){
                //frst column ke 0 se DFS start
                dfs(i, 0, board, vis);
            }

            // Ab last column check kar rahe hain
            // board[i][n-1] = current row ka last column\
            // ager last column mein '0' hai
            // or vo visisted nahi hai tho
            if(board[i][n-1] == 'O' && vis[i][n-1] == false){
                // last boundery ke 0 se DFS start 
                dfs(i, n-1, board, vis);
            }
        }
            
        // 2. FIRST AUR LAST ROW SE DFS START KARO
        // Har column ko check karenge
        for(int j=0;  j<m; j++){                //frst row ke current olumn check kar rahe hain
            //board[0][j] =  first row
            // ager yahan 0 hai or visited nahi hai 
            if(board[0][j] =='O' && vis[0][j] == false){
                //first row ke boundery 0 se DFS start
                dfs(0, j, board, vis);
            }
            // Last row ka current column check kar rahe hain
            // board[m-1][j] = last row
            //
            // Agar yahan O hai aur visited nahi hai
            if(board[m-1][j] == 'O' && vis[m-1][j] == false){

            // Last row ke boundary O se DFS start
            dfs(m-1, j, board, vis);
        }
    }
        // =====================================================
        // 3. AB BOARD KO SCAN KARO AUR SURROUNDED O KO X KARO
        // =====================================================

        // Har row ke liye loop
        for(int i = 0; i < m; i++){

            // Har column ke liye loop
            for(int j = 0; j < n; j++){

                // Agar current cell 'O' hai
                // aur visited nahi hua
                //
                // Matlab ye O boundary se connected nahi hai
                // Isliye ye surrounded O hai
                if(board[i][j] == 'O' && vis[i][j] == false){

                    // Surrounded O ko X bana do
                    board[i][j] = 'X';
                }
            }
        }
    }


    // =========================================================
    // DFS FUNCTION
    // =========================================================

    // Ye function connected O cells ko visit karega
    public void dfs(int i, int j, char[][] board, boolean[][] vis){

        // Total rows
        int m = board.length;

        // Total columns
        int n = board[0].length;


        // =====================================================
        // BASE CASE
        // =====================================================

        // Agar row boundary ke bahar chali gayi
        // OR
        // column boundary ke bahar chala gaya
        // OR
        // current cell already visited hai
        // OR
        // current cell X hai
        //
        // to DFS ko stop kar do
        if(i < 0 || 
           j < 0 || 
           i >= m || 
           j >= n || 
           vis[i][j] == true || 
           board[i][j] == 'X'){

            // Kuch nahi karna, function se bahar aa jao
            return;
        }


        // =====================================================
        // CURRENT O KO VISITED MARK KARO
        // =====================================================

        // Current O ko visited mark kar diya
        // Matlab ye O boundary se connected hai
        vis[i][j] = true;


        // =====================================================
        // 4 DIRECTIONS MEIN DFS
        // =====================================================

        // Neeche jao
        // row + 1, column same
        dfs(i + 1, j, board, vis);


        // Right jao
        // row same, column + 1
        dfs(i, j + 1, board, vis);


        // Upar jao
        // row - 1, column same
        dfs(i - 1, j, board, vis);


        // Left jao
        // row same, column - 1
        dfs(i, j - 1, board, vis);
    }
}