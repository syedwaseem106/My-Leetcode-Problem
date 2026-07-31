class Solution {
    public int hIndex(int[] citations) {
        int papers = citations.length;//Array me total papers kitne hain.
        int [] citationBuckets = new int [papers +1]; //Ek bucket array banate hain.
        //Agar papers = 5// to citationBuckets = new int[6]
        for(int citation: citations){
            //Array ke har citation ko check karo.
            citationBuckets[Math.min(citation, papers)]++;
        }
        int cumulativePapers = 0;//Ye count karega ki abhi tak kitne papers mile.
        // abb Hum maximum se check karenge.
        for( int hIndex = papers; hIndex >=0; hIndex--){
            cumulativePapers += citationBuckets[hIndex];//Current h se kitne papers hain unko add karo.
            if(cumulativePapers >=hIndex)//Check karo: Kya h papers available hain?Example:
            {
                return hIndex;
            }

        }
        return 0;
    }
}