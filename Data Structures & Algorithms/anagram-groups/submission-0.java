class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mp = new HashMap<>();
        List<List<String>> res = new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            char[] a = strs[i].toCharArray();
            Arrays.sort(a);
            String sortedStr = Arrays.toString(a);
            mp.putIfAbsent(sortedStr,new ArrayList<>());
            mp.get(sortedStr).add(strs[i]);
        }
        return new ArrayList<>(mp.values());
    }
}
