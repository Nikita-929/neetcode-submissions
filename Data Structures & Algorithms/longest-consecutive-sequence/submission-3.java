//hashset
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int longest=0;
        for(int n:set){
            if(!set.contains(n-1)){
                int curr = n;
                int length=1;
                while(set.contains(curr+length)){
                    length++;
                }
                longest = Math.max(longest,length);
            }
        }
        return longest;
    }
}
