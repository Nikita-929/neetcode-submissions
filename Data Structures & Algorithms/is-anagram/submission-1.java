//using fixed length char arr
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] freq = new char[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a'] +=1;
            freq[t.charAt(i)-'a'] -=1;
        }
        for(int i=0;i<26;i++){
            if(freq[i]!=0) 
                return false;
        }
        return true;
    } 
}
