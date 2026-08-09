class Solution {
    public String convert(String s, int numRows) {
        // Agar row sirf 1 hai ya phir row ki sankhya string ki length se zyada ya barabar hai, toh string ko waise ka waise hi return kar do kyunki koi zigzag pattern nahi banega.
        if(numRows ==1 || numRows>= s.length()){
            return s;
        }
        // 'idx' batata hai ki hum abhi kis row par hain, aur 'd' direction batata hai (neeche jaane ke liye +1 aur upar jaane ke liye -1).
        int idx = 0 , d =1;
        // Har row ke characters ko store karne ke liye ArrayLists ka ek array banaya.
        List<Character>[] rows = new ArrayList[numRows];
        //// Array ke har index par ek nayi ArrayList initialize kar rahe hain.
        for(int i=0; i<numRows; i++){
            rows[i] = new ArrayList<>();
        }
        //// String ke har ek character par loop chala rahe hain.
        for(char c : s.toCharArray()){
            rows[idx].add(c);// Current character ko uski respective row wali list mein daal rahe hain.
            // Agar hum sabse upar wali row (0) par hain, toh direction neeche (+1) kar do
            if(idx==0){
                d=1;
            }
            // Agar hum sabse neeche wali row (numRows - 1) par hain, toh direction upar (-1) kar do.
            else if (idx==numRows -1){
                d =-1;
            }
            // Next character ke liye row index ko direction ke hisab se update karo.idx= index
            idx += d;

        }
        StringBuilder result = new StringBuilder();// Saari rows ko milakar final string banane ke liye StringBuilder ka use kiya.
        // Har ek row ki list par iterate kar rahe hain.
        for(List<Character> row : rows){
            // Row ke har character ko result mein append kar rahe hain.
            for(char c : row){
                result.append(c);
            }
        }
        // Final converted zigzag string ko return kar rahe hain.
        return result.toString();
    }
}