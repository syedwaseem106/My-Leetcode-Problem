class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet();   //adding Hashset for the strings
        for(int i=0; i<9; i++){                    // looping through rows
            for(int j=0; j<9; j++){                // looping through colums 
                char current_val = board[i][j];
                if(current_val != '.'){
                    if(!seen.add(current_val + "found in rows " + i) || !seen.add(current_val + "found in colum " + j) || !seen.add(current_val + "found in sub  Box " + i/3 +"-" + j/3))
                    return false ;
                    // seen.add(current_val + "found in rows " + i);// the result of it will say "found in rows" and the "row number of thtt"
                    // seen.add(current_val + "found in colum " + j);
                    // seen.add(current_val + "found in sub  Box " + i/3 +"-" + j/3); // jst to check the 3x3 grid to get the current subbox in that grid
                }
            }
        }
        return true;
        
    }
}