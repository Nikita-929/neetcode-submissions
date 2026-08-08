class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int res =0;
        HashMap<Character,Integer> mp = new HashMap<>();
        int maxFreq = 0;
        for(int r=0;r<s.length();r++){
            mp.put(s.charAt(r),mp.getOrDefault(s.charAt(r),0)+1);
            maxFreq = Math.max(maxFreq,mp.get(s.charAt(r)));

            while((r-l+1)-maxFreq > k){
                
                mp.put(s.charAt(l),mp.get(s.charAt(l))-1);
                l++;
            }
            res = Math.max(res,r-l+1);
        }
        return res;
    }
}
