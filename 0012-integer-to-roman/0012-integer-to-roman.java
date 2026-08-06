// Hum sabse badi value se start karte hain.
// Agar number us value se bada ya equal hai to us Roman symbol ko answer me add kar dete hain aur number se us value ko minus kar dete hain.
// Ye process tab tak repeat karte hain jab tak number 0 na ho jaye.

class Solution {
    public String intToRoman(int num) {
        // Integer values ko descending order me rakha hai
        final int[] values ={1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        // Har integer value ka corresponding Roman symbol
        final String[] symbols ={"M", "CM", "D",  "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder sb = new StringBuilder();// final roman value store karne ke liye 
        
        for(int i=0; i< values.length; i++){
            //ager value already 0 hai 
            // to aur kuch convert karne ki zarurath ni
            if(num ==0)
            break;

            //jab thak current value number se choti ya equal hai
            while(num>=values[i]){
                // roman symbol answer me addd karo 
                sb.append(symbols[i]);

                //numbers me se current value minus kardo abb
                num -= values[i];
            }
        }

        //final roman answer ko return kardo 
        return sb.toString(); 
    }
}