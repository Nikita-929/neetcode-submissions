//sorting
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        
        Arrays.sort(nums);
        int streak=1;
        int longest =1;
        for(int i=1;i<nums.length;i++){
            int curr = nums[i];
            
            if(curr==nums[i-1]){
               continue;
            }
            if(curr==nums[i-1]+1){
                streak++;
                
                
            }else{
                streak=1;
            }
            longest = Math.max(longest,streak);
        }
        return longest;
    }
}
