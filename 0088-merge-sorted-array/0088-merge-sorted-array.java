class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //Bhai yahan do pointers bana diye.
        //j → nums2 ko traverse karega.
        //i → nums1 mein kahaan se insert karna hai.
        for (int j = 0, i = m; j < n; j++) {
            //Matlab nums1 ka valid data yahan tak tha: 
            //[1,2,3,0,0,0]
        //           ^
            //       i
            nums1[i] = nums2[j];//Bhai, nums2 ka element uthao aur nums1 ke khaali part mein chipka do.
            i++;
        }
        Arrays.sort(nums1);//Ab bhai pura array sort kar de.
            //Pehle tha [1,2,3,2,5,6]
            //Sort ke baad [1,2,2,3,5,6]
    }
}
// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
//         for (int j = 0, i = m; j < n; j++) {
//             nums1[i] = nums2[j];
//             i++;
//         }
//         Arrays.sort(nums1);
//     }
// }