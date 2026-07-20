class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]>result = new ArrayList<>();//Ek empty list banayi hai Isme final answer store hoga.

        //itert through all slots 
        for(int [] slot : intervals)//Har interval ko ek-ek karke dekhna.
        {
            if(newInterval [1] < slot[0]){
                // Agar new interval current slot se pehle finish ho raha hai,
                // to overlap possible nahi hai. tooo
                result.add(newInterval);// New interval ko result me add kar do.
                newInterval=slot;
                // Ab current slot ko newInterval maan lo
                // taaki baaki intervals ke saath compare kar sake.
            }
            else if(slot[1] < newInterval[0])
            // Agar current slot new interval se pehle khatam ho raha hai,
            // to ise direct result me add kar do.
            {
                result.add(slot);// Current slot ko direct answer me add kar do.
            }
            //Agar dono IF false ho gaye.
            else{
                newInterval[0] = Math.min(newInterval[0], slot[0]);// Dono me jo chhota start hai usko choose karo.
                newInterval[1] = Math.max(newInterval[1], slot[1]);// Dono me jo bada end hai usko choose karo.
            }
        }

        result.add(newInterval);// Lastest merged interval ko result me add karo.
        //Ye important hai.
        // Kyuki overlap hote waqt hum sirf
        // newInterval
        // ko update karte rahe.
        // Kabhi add nahi kiya.
        // Isliye end me add karna padta hai.//

        return result.toArray(new int[result.size()][]);// List ko int[][] array me convert karke return karo.
        //Kyuki function
        // List<int[]>
        // return nahi karta.
        // Wo
        // int[][]
        // return karta hai.
        
    }
}

