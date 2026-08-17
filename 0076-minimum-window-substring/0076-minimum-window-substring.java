class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character , Integer> map=new HashMap<>();
        int m=t.length();
        int n=s.length();

        for(int i=0;i<m;i++){
            char ch=t.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

         int count=0;
         int left=0;
        

         int minlen=Integer.MAX_VALUE;
         int idx=-1;
      for(int right=0;right<=n-1;right++){
            char ch=s.charAt(right);
             if(count<m){
            if(map.containsKey(ch)){
               if(map.get(ch)>0){
                  map.put(ch,map.get(ch)-1);
                  count++;
                 
                }else if(map.get(ch)<=0){
                    map.put(ch,map.get(ch)-1);
                }
               
            }
            
            } 
            while(count==m && left<=right){
                 
                     int len=right-left+1;
                     if(len<minlen){
                        
                        minlen=len;

              System.out.println(minlen);
                        idx=left;
                        // System.out.println(idx);
                     }

                     if(map.containsKey(s.charAt(left))){
                        map.put(s.charAt(left),map.get(s.charAt(left))+1);
                        
                        if(map.get(s.charAt(left))>0)count--;
                     }

                      left++;
            }
            } 
        
            if(idx==-1)return "";
           return s.substring(idx,idx+minlen);
    }
}