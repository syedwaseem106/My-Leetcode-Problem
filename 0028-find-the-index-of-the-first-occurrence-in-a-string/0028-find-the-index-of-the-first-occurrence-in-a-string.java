class Solution {
    public int strStr(String haystack, String needle) {
        // ye loop i ko 0 se needle ke length pe thak jataha hai 
        // loop thab thk chale ga jab thak haystack  ke length ke ander hai
        for(int i=0, j= needle.length(); j<=haystack.length(); i++, j++){
            // haystack ke ander i se leekar j tahk ke substring ko nikal kar check karthe hai ke needle ke baraber hai ki nahi 
            if(haystack.substring(i,j).equals(needle)){
                //ager match miljata hai to wahi index of(i) return kardo 
                return i;
            }
        
        }
        return-1;//ager loop katam hoogaya needle nahi mila tho -1 return kardo 
    }
}