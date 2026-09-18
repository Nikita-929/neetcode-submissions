class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        ArrayList<double[]> pairs = new ArrayList<>();
    for(int i =0;i<position.length;i++){
        pairs.add(new double[]{position[i],(double)(target-position[i])/speed[i]});//pos,time
    }

    //sort by position
    pairs.sort((a,b)->Double.compare(a[0],b[0]));

    Stack<Double> st = new Stack<>();//time
    for(int i=pairs.size()-1;i>=0;i--){
        double currTime = pairs.get(i)[1];
        if(st.isEmpty()|| currTime > st.peek() ){
            st.push(currTime);
        }       
        
    }
    return st.size();
    }
    
}
