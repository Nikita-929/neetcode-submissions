//brute force 
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        int longest = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int curr = nums[i];
            int streak=0;
            while(set.contains(curr)){
                
                
                    streak++;
                    curr +=1;;
                
            }
            longest = Math.max(longest,streak);
        }
        return longest;
    }
}
