class Solution {
    public String longestCommonPrefix(String[] strs) {


        // let us take prefix is = "flower"
        String prefix = strs[0]; // its saying loop shd start from the frst element strs[0]
        for(int i=1; i<strs.length; i++){
            while(strs[i].indexOf(prefix) != 0){                // this strs[i].indexOf(prefix) will help to compair the current index {ex :i =1} with the prefix which we assume 
                prefix = prefix.substring(0, prefix.length()-1); // this line will help to remove the letter which is not in the prefix
            }
        }
        return prefix;

        
    }
}