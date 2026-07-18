//"Hum last index ko goal maante hain. Phir right se left aate hain. Jo bhi index current goal tak pahunch sakta hai, usi ko naya goal bana dete hain. Agar aakhir me goal index 0 ban gaya, to answer true; warna false."

class Solution {
    public boolean canJump(int[] nums) {
        int goal = nums.length -1;//// Last index ko initial goal maan lo.

        //// Second last index se lekar first index tak traverse karo.
        for(int i= nums.length-2; i>=0; i--){
            // Agar current index se goal ya uske aage jump kar sakte hain.
            if(i + nums[i] >= goal)
            // "if i + nums[i] >= goal:" Check if the current index i plus the maximum jump length at that position (nums[i]) is greater than or equal to the goal. If it is, it means we can jump from index i to the goal or beyond.
            {
                goal = i;// To current index hi naya goal ban jayega.
            }
        }
        return goal == 0;// Agar goal 0 ban gaya to start se end tak pahunch sakte hain.

    }
}
// Goal = Last index.
// Peechhe se check karo ki kaun-kaun sa index goal tak pahunch sakta hai.
// Jo pahunch sakta hai, usko naya goal bana do.
// Agar aakhir me goal = 0 ho gaya, matlab first index se last index tak jaana possible hai, isliye true.
// Nahi to false.