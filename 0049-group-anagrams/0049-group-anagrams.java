class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List <String>> map = new HashMap<>();
        
        for (String word : strs){//trying to Sort the String 
            String sort = sortStr(word);// this line Help us to sort the Word string 
            map.putIfAbsent(sort, new ArrayList<>());// putting that in to new list
            //"new ArrayList<>()" we used this because there is no current Value available 
            map.get(sort).add(word);// taking the sortewd word and adding it to the hashmap
        }
        return convertToList(map);
    }
    private List<List<String>>convertToList(Map<String, List <String>>map){// */ converting map to the list ****
        List<List<String>> result = new ArrayList<>(); /// this is for Hold all grouping of "Anagrams" 
        for( List<String> anagrams: map.values()){// itirate "anagram " in to the maps
            result.add(anagrams);
        }

        return result ;

    }
    
    private String sortStr(String Word){//creating the method for sorting the string 
        char[] chars = Word.toCharArray();//* frts converting this the word in "char" array 
        Arrays.sort(chars);// sort the Char array 
        return new String(chars); //return the  Sorted  Array 
    }
}