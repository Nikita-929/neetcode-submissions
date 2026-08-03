class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty()){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for(String s:strs){
            sb.append(s.length());
            sb.append('#');
            sb.append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        if(str.isEmpty()){
            return new ArrayList<>();
        }
        List<String> res = new ArrayList<>();
        int i = 0;
        while(i!= str.length()){
            char c = str.charAt(i);
            int j =i;
            StringBuilder size = new StringBuilder();
            while(str.charAt(j)!='#'){
                
                size.append(str.charAt(j));
                j++;
            }
            int n = Integer.parseInt(size.toString());
           res.add(str.substring(j+1,j+n+1));
           i=j+1+n;
        }
        return res;
    }
}
 