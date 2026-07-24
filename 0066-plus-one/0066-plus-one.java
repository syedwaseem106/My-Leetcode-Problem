class Solution {
    public int[] plusOne(int[] digits) {
        //last indexx se suru karo
        for(int i = digits.length-1; i>=0;i--){

            //ager current digit me 1 add karne se 10 (das ) nahi bantha 
            if(digits[i] + 1 !=10){
                //Kya current digit 9 nahi hai?"
                //srf oo digit ko 1 increase kardo
                digits[i] +=1;
                //answer mil gaya
                return digits;
            }
            //ager digit 9 tha 
            // 9+1 =10
            // to current ddigit 0  ban jayega
            digits[i] =0;
        }

        //ager loop katam ho gaya
        // sare digit 9 the
        //example 999 --> 1000
        int[] newDigits = new int[digits.length +1];//Loop khatam.Ab kya kare?
        //1000 banana hai.Purana array me jagah hi nahi.Isliye
        // int[] newDigits = new int[digits.length +1]; Banega --> [0,0,0,0]


        //sabse pehle 1 rakddo 
 
        newDigits[0] =1;//Phir yahan Ban gaya [1,0,0,0]
        return newDigits;
    }
}

// Hum last digit se kyun start karte hain?
// School me bhi addition right se hoti hai.
// Example

//   123
// +   1
// -----
//  124