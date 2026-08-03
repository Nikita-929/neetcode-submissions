class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefix =1;
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i-1>=0){
                res[i]=prefix*nums[i-1];
                prefix *=nums[i-1];
            }else{
                res[i]=prefix;
            }
        }

        int postfix = 1;
        for(int j=nums.length-1;j>=0;j--){
            if(j==nums.length-1){
                res[j] *=postfix;
            }else{
                res[j] *= postfix*nums[j+1];
                postfix *= nums[j+1];
            }
        }
        return res;
    }
}  
