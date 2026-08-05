class Solution {
    public int romanToInt(String s) {
        int res =0; // current result 0 hai 
        Map<Character, Integer> roman = new HashMap<>();//1. Map banana (Sabhi Roman letters ki value fix karna)
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
        //Matlab: Ek list jaisi banayi hai jisme computer ko pata hai ki kis Roman letter ka kya number value hota hai

        //Matlab: Yeh loop ek-ek karke Roman string ke letters ko check karta hai.
        for (int i=0; i < s.length() - 1 ; i++){
            if (roman.get(s.charAt(i)) < roman.get(s.charAt(i + 1))) {
                res -= roman.get(s.charAt(i));
                //Agar pehla letter chhota hai agle wale se (s.charAt(i) < s.charAt(i + 1)), toh total (res) me se uski value minus ho jayegi.
                //Agar chhota nahi hai, toh value plus (+) ho jayegi.
            } else{
                res += roman.get(s.charAt(i));
            }
        }

        return res + roman.get(s.charAt(s.length() - 1));
        //Matlab: Kyunki loop aakhri letter se ek pehle hi ruk jata hai, isliye aakhri (last) letter ki value ko final answer mein plus (+) karke return kar diya jata hai.
        
    }
}