class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> mp = new HashMap<>();

         for(int i =0;i<strs.length;i++){
            char[] arr = strs[i].toCharArray();

           
            char[] freq = new char[26];
            for(int j=0;j<arr.length;j++){
                freq[arr[j]-'a']++;
            }
             String key = Arrays.toString(freq);
            mp.put(key,new ArrayList<>());
            
        }
        
        for(int i =0;i<strs.length;i++){
            char[] arr = strs[i].toCharArray();

           
            char[] freq = new char[26];
            for(int j=0;j<arr.length;j++){
                freq[arr[j]-'a']++;
            }
             String curr = Arrays.toString(freq);
            mp.get(curr).add(strs[i]);
        

        }
        return new ArrayList<>(mp.values());
    }
}
