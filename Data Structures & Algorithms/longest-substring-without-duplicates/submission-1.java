class Solution {
    public int lengthOfLongestSubstring(String s) {
       int window[] = new int[128];
       int maxLen = 0;
       int left = 0;
       for(int i = 0 ; i < s.length() ; i++){
            int curChar = s.charAt(i);
            window[curChar]++;
            while(window[curChar]>1){
                  int remChar = s.charAt(left);  
                  window[remChar]--;
                  left++;  
            }
            maxLen = Math.max(maxLen,i-left+1);
       }
       return maxLen;

    }
}
