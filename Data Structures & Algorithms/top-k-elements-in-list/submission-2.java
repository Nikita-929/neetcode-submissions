class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }

        List<int[]> ls = new ArrayList<>();
        
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            ls.add(new int[]{entry.getKey(),entry.getValue()});
        }
        ls.sort((a,b)->(b[1]-a[1]));
         int[] res = new int[k];
         for(int i=0;i<k;i++){
            res[i]= ls.get(i)[0];
         }
         return res;
    }
}
