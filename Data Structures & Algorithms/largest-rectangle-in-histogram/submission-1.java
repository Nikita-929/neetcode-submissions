class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int maxArea = 0;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<=n;i++){
            while(!st.isEmpty() &&(i==n || heights[i]<=heights[st.peek()])){
                int h = heights[st.pop()];
                int w = st.isEmpty()?i:i- st.peek()-1;
                maxArea=Math.max(maxArea,h*w);
                
            }
            st.push(i);
        }
        return maxArea;
    }
}
