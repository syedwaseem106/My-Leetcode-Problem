class Solution {
    List<List<Integer>> res=new ArrayList<>();// Final answer store karega. Saari unique permutations yahan add hongi.

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);// Pehle array sort karte hain taaki duplicate numbers ek saath aa jaaye.
        // Isse duplicate permutations ko skip karna aasaan ho jata hai.
        List<Integer> list=new ArrayList<>();  // Ye current permutation bana raha hai.
        // Jaise [1], fir [1,2], fir [1,2,1]...
        boolean[] used=new boolean[nums.length];// Ye batata hai ki kaunsa element current permutation me already use ho chuka hai.
        // false = abhi use nahi hua
        // true = already use ho gaya
        permutations(nums,used,list);// Backtracking start karo.

        return res;// Saari permutations return karo.

    }
    public void permutations(int[] nums,boolean[] used,List<Integer>list){
        if(list.size()==nums.length){// Agar current permutation ki size array ke equal ho gayi,
            // matlab ek complete permutation ban gaya.
            res.add(new ArrayList<>(list));// Current permutation ki copy answer me store karo.
            return;// Ab wapas jao aur doosre possibilities explore karo.

        }
        for(int i=0;i<nums.length;i++){// Har position ke liye saare numbers try karo.
            if( (i>0 && nums[i]==nums[i-1]) && !used[i-1] || (used[i]) ) continue;/*
             used[i]
             --------
             Agar ye number pehle hi current permutation me use ho chuka hai,
             to dobara use nahi kar sakte.

             (i>0 && nums[i]==nums[i-1]) && !used[i-1]
             ------------------------------------------
             Agar current number previous number ke equal hai
             aur previous duplicate abhi use nahi hua,

             to current duplicate ko skip karo.

             Isse duplicate permutations nahi bante.

             Example:

             nums = [1,1,2]

             Agar pehla 1 skip karke doosra 1 uthaya,
             to wahi permutation dobara banega.

             Isliye continue.
            */
            list.add(nums[i]); // Current number permutation me daal do.
            
            used[i]=true;// Mark karo ki ye number ab use ho chuka hai.

            permutations(nums,used,list);// Ab next position ke liye recursion.

            list.remove(list.size()-1);  // Backtracking:
            // Last added number hata do.
            used[i]=false;// Is number ko fir se available bana do,
            // taaki doosri branch me use ho sake.
        }
    }
}
// }//Sabse important line (99% students yahin confuse hote hain)
// if((i > 0 && nums[i] == nums[i-1]) && !used[i-1] || used[i])
//     continue;
// Isko simple Hindi me samajh:
// Pehla part
// used[i]
// Matlab:
// "Kya ye element current permutation me pehle se use ho chuka hai?"
// Agar haan, to skip.
// Doosra part
// (i > 0 && nums[i] == nums[i-1]) && !used[i-1]
// Maan lo:
// nums = [1,1,2]
//          ↑ ↑
//         0 1
// Ab i = 1 pe ho.
// Ye doosra 1 hai.
// Question:
// "Kya pehla 1 current permutation me use hua?"
// Agar nahi (!used[i-1] == true),
// to doosra 1 bhi mat uthao.
// Kyun?
// Kyuki pehle 1 ko skip karke doosra 1 uthana same permutation banayega.
// Isliye:
// continue;