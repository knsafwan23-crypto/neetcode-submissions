class Solution {
    public int maxArea(int[] heights) {
        int max=0;
        for (int i=0 ;i<heights.length; i++) {
            for (int j=i+1; j<heights.length; j++) {
                if(heights[i]>heights[j]) {
                if(((j-i)*(heights[j]))>max ) {
                    max=(j-i)*(heights[j]);
                }}
                else {
                    if(((j-i)*(heights[i]))>max ) {
                    max=(j-i)*(heights[i]); } }}}
        return max;
    }
}
