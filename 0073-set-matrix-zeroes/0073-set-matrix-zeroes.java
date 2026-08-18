class Solution {
    public void setZeroes(int[][] matrix) {
        boolean zeroinFirstCol = false;// ye varible check karega ke kahi frst col me 0 th nahi

        // matrix ki har row ko check kar rahe hain
        for(int row = 0; row < matrix.length; row++){
            //ager current row kke frst col me 0 hai
            // to yaaad rakho ki frst column ko baadd me 0 karna hai
            if(matrix[row][0] ==0){
                zeroinFirstCol = true;
            }

            //col 1 se start kar rahe hai 0 ko baad me handle karenege 
            for(int col =1; col < matrix[0].length; col++){
                //ager kisi position pe  0 mila 
                if(matrix[row][col] == 0){
                    //current row ke frst element ko 0 bana ddo
                    matrix[row][0] = 0;/// iska mthlab iss puri row ko zero karna hai 
                    matrix[0][col] = 0;
                }
            }
        }
        //ab matrix ko bottom ki tarf traves karnge
        //reverse direction matter kartha hai
        //kykun ke 1st row me column marker store karrahe hain
        for( int row = matrix.length -1; row>=0; row--){

            //her row wko rgt se left traves karnege 
            //or current col ke 1st row me 0 hai to current cell ko 0 kar do 
            for(int col = matrix[0].length-1; col>=1; col--){
                if(matrix[row][0] == 0 || matrix[0][col] == 0){
                matrix[row][col] = 0;
                }
            }//ager starting me frst column me 0 mila tho 
            //current row ke  frtst colum bhi 0 kar ddo 
            if(zeroinFirstCol){
                matrix[row][0] = 0 ;
            }  
        }
    }
}