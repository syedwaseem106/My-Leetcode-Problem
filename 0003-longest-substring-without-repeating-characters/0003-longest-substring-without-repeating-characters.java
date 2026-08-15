class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left =0; // left pointer 0 pe hai abb
        int maxLength =0;// sabse lambi valid substring ko store karne ke liye ye banay hai variable 
        HashSet<Character> charSet = new HashSet<>(); // ye line unique cahareterko track karne ka kaam karthi hai 

        for(int right =0; right< s.length(); right++){
            // chaeck karo ki current element set me ha kya ageer hai tho ....
            while(charSet.contains(s.charAt(right))){
                // left wale pointer ko set se nikal doo 
                charSet.remove(s.charAt(left));
                left ++;// left ko aage bada do (increment )
            }

            charSet.add(s.charAt(right));// current uniuqe cherecter ko set me add kardo 
            maxLength =Math.max(maxLength, right - left +1);// max length ko update karo yaaani current window size - purana size 
        }// For loop complete hone par right pointer string ke end tak pahunch jata hai
        
        return maxLength;
    }
}