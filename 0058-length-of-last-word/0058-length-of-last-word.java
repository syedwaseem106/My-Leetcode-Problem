class Solution {
    public int lengthOfLastWord(String s) {
        int count =0; // ye yk variable bana raha hun jahan last word ke leeter ko store karthe hain 
        for(int i=s.length()-1; i>=0; i--)
        // yahan ham peche se travers karrahe hain 
        {
            //check karo current char space value tho nahi hai
            if(s.charAt(i) != ' '){
                count ++;
            }else if(count >0)// yahan pooch rahe hain ke koi letter mila kya karke 
            {
                break;// loop ko wahi rook do
            }
        }return count;// final answer ko return kardo 
        
    }
}

// Simple Bhai Language Mein Samjho

// Hume last word ki length nikalni hai.

// Example 1
// Input:
// s = "Hello World"

// Output:
// 5

// Last word = "World"

// Length = 5