class Solution {
    public int trap(int[] height) {
        int left = 1;
        int right = height.length - 2;
        int leftMax = height[0];
        int rightMax = height[height.length - 1];
        int waterTrapped = 0;
        while(right>=left){
            if(leftMax>rightMax){
                if(rightMax>height[right]){
                    waterTrapped += rightMax - height[right];
                }
                else
                    rightMax = height[right];    
                right--;
            }else{
                if(leftMax>height[left]){
                    waterTrapped += leftMax - height[left];
                }
                else
                    leftMax = height[left];    
                left++;
            }
        }
        return waterTrapped;
    }
}
