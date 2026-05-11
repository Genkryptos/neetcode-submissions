class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> arr = new HashSet<>();
        for(int num : nums){
            if(!arr.add(num))
                return true;
        }
        return false;
    }
}