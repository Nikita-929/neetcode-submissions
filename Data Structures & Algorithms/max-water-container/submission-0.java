class Solution {
    public int maxArea(int[] heights) {
        int max = Integer.MIN_VALUE;
        int l = 0;
        int r = heights.length-1;
        while(l<r){
            int currArea = (r-l)*Math.min(heights[l],heights[r]);
            max = Math.max(max,currArea);
            if(heights[l]>heights[r]){
                r--;
            }
            else{
                l++;
            }
           
        }
        return max;
    }
}
