class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;

        int[] s1freq = new int[26];
        int[] s2freq = new int[26];

        for(int i=0;i<s1.length();i++){
            s1freq[s1.charAt(i)-'a'] +=1;
            s2freq[s2.charAt(i)-'a'] +=1;//s1 a=1,b=1,c=1;s2 b=3;
        }

        int matches =0;
        for(int i=0;i<26;i++){
            if(s1freq[i]==s2freq[i])
                matches +=1;
        } //23

        int l =0;
        for(int r = s1.length();r<s2.length();r++){ // r = 3 4 5
            if(matches==26) return true;

            int index = s2.charAt(r)-'a';//3 0
            s2freq[index]++;//1 1
            if(s1freq[index] == s2freq[index])
                matches++;//24 24
            else if(s1freq[index] +1 == s2freq[index])
                matches--;

            index = s2.charAt(l)-'a';//0 1
            s2freq[index]--;//0 1
            if(s1freq[index] == s2freq[index])
                matches++;//25
            else if(s1freq[index] -1 == s2freq[index])
                matches--;//23
            l++;//1 2
        }
        return matches==26;
    }
}
