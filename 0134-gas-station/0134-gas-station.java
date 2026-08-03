class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0, totalCost = 0;


        for( int i=0; i < gas.length; i++){
            totalGas += gas[i];// sari gas ko jood rahe hain    
            totalCost += cost[i]; // saari cost ko add kar rhe hain
        }
        
        // ager total gas kum hai tp sare round laga na mumkin nahi hain
        if(totalGas< totalCost){
            return -1; // isliye -1 retun kardo
        }

        int currentGas = 0 ; 
        int start = 0 ;

        // sahi startig point dondo 
        for(int i=0; i < gas.length; i++){
            // gas bhari or agle startion thak ki  cost minus ki 
            currentGas += gas[i] - cost[i]; 

            //ager gas khatam hoogayi (negitive hoo gaya )
            if( currentGas < 0){
                // ager isa huva tho
                currentGas =0; // gas ko phir se zero bana do 
                start = i+1; // or index i ko i+ 1 se start karo 
                // maan lo agla sattion staring point hai  
            }
        }
        return start;
    }
};
