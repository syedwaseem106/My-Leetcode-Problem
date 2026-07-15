class Solution {
    // just cheaking whether  the place were keepin the queen is safe or Not "true Or false "
    private boolean isSafePlace(int n , char[][] nQueens, int row, int col){
        //cheack whether is there is any queen in the same place 
        for(int i = 0; i<n; i++){
            if (nQueens[i][col] =='Q'){
                return false;
            }
        }


        //cheking the Upper left place now is it safe ? 
        for ( int i = row -1, j = col -1; i >= 0 && j >=0; i --, j-- ){
            if(nQueens[i][j] == 'Q'){
                return false;
            }
        }


        // NOw cheaking the Upper right Position Now ?
        for( int i = row - 1, j= col +1 ; i>= 0 && j < n; i --, j++){
            if( nQueens[i][j] == 'Q'){
                return false ;
            }
        }


        //if no Conclusion found the just return true 
        return true ;

    }

    // now the main prt recursive Function for The N- queen r Problem
    private void solveNQueen(int n, List<List<String>> output,char[][] nQueens, int row){
        //base case if we place all the queen inn the all rows , we will be having the valid solution
        if ( row == n){
            List< String> solution = new ArrayList<>();// adding the sol in the new arry list 
            for (char[] rowArray : nQueens) // rowArray : nQueens iska mathlab nQueens ki har row ko rowArray me lo.
            {
                solution.add(new String(rowArray));// add the solutiin in the string row array 
            }
            output.add(solution);
            return; 
        }

        // now placing the queen in each col of the current row 
        for(int col = 0; col< n ; col++){
            //cheekin wether if is current space is safe add it 
            if(isSafePlace( n , nQueens ,row , col )){
                // placing the Queen 
                nQueens [row][col] = 'Q';
                //recursivly solve for the next row 
                solveNQueen(n, output, nQueens , row + 1);
                nQueens[row][col] ='.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> output = new ArrayList<>();// store all valid solution in this arrayList
        char[][] nQueens = new char [n][n] ; // checking for empty board


        //filling the bord with the BOX 
        for (int i =0 ; i< n; i++){
            Arrays.fill(nQueens[i], '.');// ager  sahi hai to "i" ke jagha me "." replace kardo
        }

        solveNQueen(n, output,nQueens, 0);// start solviong from the row 0
        return output;
        
    }
}