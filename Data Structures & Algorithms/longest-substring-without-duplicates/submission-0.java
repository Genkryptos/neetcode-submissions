class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] window = new int[128];
        int maxLen = 0,left =0;
        for(int i = 0 ;i < s.length();i++){
            int cur = s.charAt(i);
            while(window[cur]>0){
                int leftChar = s.charAt(left);
                window[leftChar]--;
                left++;
            }
            window[cur]++;
            maxLen = Math.max(maxLen, i-left+1);
        }
        return maxLen;
    }
}
