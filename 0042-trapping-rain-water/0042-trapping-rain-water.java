class Solution {
    public int trap(int[] height) {

        int n = height.length;
        int totalWater = 0;

        int leftMax = 0;
        int rightMax = 0;

        int start = 0;
        int end = n - 1;

        while (start < end) {

            leftMax = Math.max(leftMax, height[start]);//Step 1: Update maximum heights
            rightMax = Math.max(rightMax, height[end]);//Step 1: Update maximum heights


            if (leftMax < rightMax) //Step 2: Decide which side to process
            {

                totalWater += leftMax - height[start];//Water trapped at start
                start++;//Then move

            } else {

                totalWater += rightMax - height[end];// Otherwise Water trapped at end
                end--;//Then move:

            }
        }

        return totalWater;
    }
}