class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty()){
            return "";
        }
        StringBuffer sb = new StringBuffer();
        for(String s: strs){
            sb.append(s.length());
            sb.append(",");

        }
        sb.append("#");
        for(String s: strs){
             sb.append(s);
        }
       
        return sb.toString();
    }

    public List<String> decode(String str) {
        if(str.isEmpty()){
            return new ArrayList<>();
        }
        List<String> res = new ArrayList<>();
        List<Integer> sizes = new ArrayList<>();
        // for(int i=0;i<str.length();i++){
        //     if(str.charAt(i)=='#'){
        //         break;
        //     }
        //     int size = Integer.parseInt(String.valueOf(str.charAt(i)));
        //     sizes.add(size);
        // }
        int i=0;
        
            while(str.charAt(i)!='#'){
                int j =i;
                while(str.charAt(j)!=','){
                    j++;
                }
                sizes.add(Integer.parseInt(str.substring(i,j)));
                i=j+1;
            }
            i++;
            for(int s:sizes){

                
                    res.add(str.substring(i,i+s));
                    i=i+s;
                
            }
        
        return res;
    }
}
