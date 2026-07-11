 //[2,3,1,1,4] greey approch teq 
        //greedy Criteria Choose the Farthest i Can go from my avalable option 
        // it mean i can only take the max jum as my index pointer

class Solution {
    public int jump(int[] nums) {
        int near = 0, far = 0, jumps = 0;//Initialization:

        while (far < nums.length - 1) {
            int farthest = 0;//farthest: This variable will store the farthest index we can reach from the current range of indices (near to far)
            for (int i = near; i <= far; i++)//This loop iterates through the current range of indices from "near" to "far"
            //For each index i, it calculates i + nums[i] which is the farthest index we can reach by jumping from index i
            {
                farthest = Math.max(farthest, i + nums[i]);//It updates farthest to be the maximum of its current value and i + nums[i]
            }
            near = far + 1;//near: Update the start of the next range to be one index after the current far.
            far = farthest;//far: Update the end of the next range to be farthest calculated in the for loop.
            jumps++;//jumps: Increment the number of jumps made by 1.
        }

        return jumps;//After exiting the while loop, the function returns the total number of jumps made to reach the last index  
    }
}