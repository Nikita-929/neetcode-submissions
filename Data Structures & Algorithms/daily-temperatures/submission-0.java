class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<int[]> st = new Stack<>();

        for(int i=0;i<temperatures.length;i++){
            while(!st.isEmpty() && temperatures[i] > st.peek()[1]){
                
                    res[st.peek()[0]]=i-st.peek()[0];
                    st.pop();
                
            }
            st.push(new int[]{i,temperatures[i]});
        }
        return res;
    }
}
