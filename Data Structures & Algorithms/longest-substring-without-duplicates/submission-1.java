//substirng is contiguous   
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer>mp = new HashMap<>();
        int longest =0;
        int l =0;
        for(int r = 0;r<s.length();r++){
            if(mp.containsKey(s.charAt(r))){
                l = Math.max(mp.get(s.charAt(r))+1,l);
            }
            mp.put(s.charAt(r),r);
            longest = Math.max(longest, r-l+1);
        }
        return longest;
    }
}
