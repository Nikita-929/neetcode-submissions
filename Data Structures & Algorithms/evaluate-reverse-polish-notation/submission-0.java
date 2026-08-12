class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(int i =0;i<tokens.length;i++){
            String s = tokens[i];
            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
                int b = st.peek();
                st.pop();
                int a = st.peek();
                st.pop();
                
                switch(s){
                    case "+": st.push(a+b);break;
                    case "-": st.push(a-b);break;
                    case "*": st.push(a*b);break;
                    case "/": st.push(a/b);break;
                }
                
            }else{
                st.push(Integer.parseInt(s));
            }
        }
        return st.peek();
    }
}
