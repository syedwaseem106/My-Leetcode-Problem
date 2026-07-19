class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length<=1){
            return intervals;
        }
        Arrays.sort(intervals,(arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));//its sort the input array from frst element 

        List<int[]> output_arr = new ArrayList();// ouput of our 2D array
        int [] current_interval = intervals[0]; // starting from 1st index
        output_arr.add(current_interval); // directly we will take the 1st Interval  add it to index to the output arry
        // we will thingk that our current interval is the first interval 

        for(int[] interval : intervals ){
            // let index begin from current begin
            int current_begin = current_interval[0];
            int current_end =  current_interval[1];    /// out_arr=[1,3] assume this is the O/P till this step 
            int next_begin = interval[0];
            int next_end = interval[1];

            if(current_end >= next_begin ){// if the current end o/p is greater then the next begin inetrval that means there is a "overlap "
                current_interval[1] = Math.max(current_end, next_end);// we are getting the max value for the Overlapping one so thiss line is writen "output[1,6]" 6 = max ones
            }else{
                current_interval = interval;//strore "current_interval" into "interval" 
                output_arr.add(current_interval);// return the output as the current interval
            }
        }
        return output_arr.toArray(new int[output_arr.size()][]);

    }
}