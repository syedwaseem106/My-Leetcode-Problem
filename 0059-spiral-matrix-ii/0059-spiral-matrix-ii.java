class Solution {
    public int[][] generateMatrix(int n) {
        int x= 0, y=0 ;        // Current position se start karenge (top-left corner)
        // dx is the column movement 
        // dy is the row movement 
        int dx= 1, dy=0; // (1,0) means move RIGHT
        // n x n matrix create karo
        // by defaut sari value 0 hongi 
        int[][]res = new int[n][n];

        // 1 se n*n thak numbr fill karna hai
        for (int i =0; i<n*n; i++){
            // current position (y,x) kko value se fill karo 
            res[y][x] = i+1; // i start from 0 iss lye i+1 likha 


            // cheching if the next value is valid hai kya nai


            //ye condition caheck karna hai
            //1)next x matrix ke ander hona chahiye 
            //2) next y matrix ke ander hona chahiye 
            //3) nxt cell pehle se fill nai hona chahiye (value 0 hona chahiye)
            /*Sabse pehle maan lo:
            
            x = current column
            y = current row
            
            Aur
            
            dx = kis direction me column badhega
            dy = kis direction me row badhegi */

            /*Isliye ye poori condition sirf ek hi question pooch rahi hai:
            "Kya main next cell me safely ja sakta hoon?"*/

            //Matlab hum (0,0) pe khade hain aur RIGHT move kar rahe hain.
            if(!(0 <= x +dx &&// Left boundary cross nahi hui
                x + dx < n && // Right boundary ke andar hai
                0 <= y + dy &&  // Top boundary ke andar hai
                y + dy < n &&// Bottom boundary ke andar hai
                res[y+dy][x+dx] == 0 // Next cell empty hai
            )){
        // ager nxt movie possible nai hai to direction clockwise change kaor 
        //purana dx ko stor karlo
            int temp = dx ;

            dx = -dy; // new dx bange -dy

            dy = temp; // new dy bange purana dx
        /*
                    Direction rotation:

                    Right (1,0)
                        ↓
                    Down (0,1)
                        ↓
                    Left (-1,0)
                        ↓
                    Up (0,-1)
                        ↓
                    Right (1,0)
                */
            }
        //direction ke according next position pe move karo
            x += dx;
            y += dy;
        }
        return res;// spiral matrx return karo  


        
    }
}