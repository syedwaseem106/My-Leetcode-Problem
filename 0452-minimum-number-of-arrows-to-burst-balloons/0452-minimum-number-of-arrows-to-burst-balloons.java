class Solution {
    public int findMinArrowShots(int[][] points) {
        //sort the ballones by end of the end position of the arrow
        Arrays.sort(points, (a,b) -> Integer.compare(a[1], b[1]));
        
        int result = 1;//inteliszing the n0 of arrows needed is 1 

        // set the index of the prviously burst ballone to 0 
        int previous = 0;

        //iterating through all the ballone 
        for( int current =1; current < points.length; current ++){
            //            // If the start position of the current balloon is after the end position of the arrow that burst the previous balloon,
            //the new arroww is needed to busrst the carrent ballone 
            if(points[current][0] > points[previous][1]){
                result++;
                previous = current;

            }

        }
        return result ; 

    }
}