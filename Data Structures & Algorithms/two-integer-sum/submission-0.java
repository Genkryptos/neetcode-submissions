class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0;i<nums.length;i++){
            int reqNum = target - nums[i];
            if(map.containsKey(reqNum))
                return new int[]{map.get(reqNum),i}; 
            map.put(nums[i],i);
        }

        return new int[]{-1,-1};
        
    }
}
