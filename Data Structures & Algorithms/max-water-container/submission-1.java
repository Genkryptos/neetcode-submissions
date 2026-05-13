class Solution {
    public int maxArea(int[] heights) {
        if(heights == null && heights.length < 2)
            return 0;
        int left = 1;
        int right = heights.length - 2;
        int leftMax = heights[0];
        int rightMax = heights[heights.length-1];
        int area = Math.min(leftMax,rightMax)*(heights.length-1);
        while(left<=right){
            if(leftMax > rightMax){
                if(rightMax < heights[right])
                    rightMax = heights[right];
                right--;  
            }else{
                if(leftMax < heights[left])
                    leftMax = heights[left];
                left++;  
            }
            int localArea = Math.min(leftMax,rightMax)*(right - left + 2);   
            area = Math.max(localArea,area);
        }
        return area;
    }
}
