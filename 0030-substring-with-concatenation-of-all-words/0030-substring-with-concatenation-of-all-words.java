class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        // Ek empty list banayi jisme valid substrings ke starting indices save honge
        List<Integer> ans = new ArrayList<>();

        // Base case: Agar words array ya string 's' empty ho, toh direct empty list return kar do
        if (words.length == 0 || s.length() == 0) {
            return ans;
        }

        // Har word ki length nikali (saare words barabar length ke hain)
        int wordSize = words[0].length();
        // Array me total kitne words hain, woh count nikala
        int wordCount = words.length;
        // String 's' ki total length nikali
        int N = s.length();

        // Target HashMap banaya jo track karega ki konsa word kitni baar aana chahiye
        HashMap<String,Integer> originalCount = new HashMap<>();
        for(int i = 0; i < words.length; i++){
            // Har word ka frequency count originalCount map me store/update kar rahe hain
            originalCount.put(words[i], originalCount.getOrDefault(words[i],0) + 1);
        }

        // Har possible offset (0 se wordSize - 1 tak) ke liye loop chalaya
        // Yeh ensure karta hai ki koi bhi valid substring sequence miss na ho
        for(int offset = 0; offset < wordSize; offset++){
            // Current sliding window ke words ka count store karne ke liye map
            HashMap<String,Integer> currentCount = new HashMap<>();
            // Window ka starting pointer set kiya
            int start = offset;
            // Window me valid words ki ginti tracking variable
            int count = 0;

            // Window ko aage badhane ke liye 'end' pointer ka loop
            for(int end = offset; end + wordSize <= N; end += wordSize){
                // Current position se wordSize ki ek substring (word) nikali
                String currWord = s.substring(end, end + wordSize);

                // Check kiya ki kya yeh word hamare target array (words) me majood hai
                if(originalCount.containsKey(currWord)){
                    // Agar hai, toh current window ke map me iska count badha do
                    currentCount.put(currWord, currentCount.getOrDefault(currWord,0) + 1);
                    count++;

                    // Agar yeh word required count se zyada baar aa gaya, toh window ko left side se chhota karo
                    while(currentCount.get(currWord) > originalCount.get(currWord)){
                        // Window ke start se word nikala
                        String startWord = s.substring(start, start + wordSize);
                        // Is startWord ka count window map me kam kiya
                        currentCount.put(startWord, currentCount.get(startWord) - 1);
                        // Window ke start pointer ko aage badhaya
                        start += wordSize;
                        // Total valid words ka count kam kiya
                        count--;                        
                    }

                    // Agar window ke andar saare required words successfully match ho gaye
                    if(count == wordCount){
                        // Starting index ko answer list me add kar do
                        ans.add(start);
                    }
                }
                // Agar extracted word hamari dictionary me majood hi nahi hai
                else{
                    // Contiguous sequence toot gayi, toh count 0 kar do
                    count = 0;
                    // Start pointer ko invalid word ke aage shift kar do
                    start = end + wordSize;
                    // Current window ke saare frequency counts clear kar do
                    currentCount.clear();
                }
            }
        }

        // Sabhi valid indices wali list return kar do
        return ans;
    }
}