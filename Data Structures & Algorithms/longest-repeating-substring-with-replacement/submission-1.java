class Solution {
    public int characterReplacement(String s, int k) {
        int[] window = new int[26];
        int left = 0;
        int maxLen = 0;
        int maxFreq = 0;
        for(int i = 0; i < s.length() ; i++){
            int curChar = s.charAt(i) - 'A';
            window[curChar]++;
            maxFreq = Math.max(maxFreq, window[curChar]);
            int windowLength = i - left + 1;
            while(windowLength-maxFreq>k){
                int remChar = s.charAt(left) - 'A'; 
                window[remChar]--;
                left++;
                windowLength = i - left + 1;
            }
            maxLen = Math.max(maxLen,i-left+1);
        }
        return maxLen; 
    }
}
