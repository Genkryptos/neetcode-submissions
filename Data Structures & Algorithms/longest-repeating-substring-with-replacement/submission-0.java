class Solution {
    public int characterReplacement(String s, int k) {
        int[] window = new int[26];
        int maxLen = 0,left = 0, maxFreq = 0;
        for(int i = 0;i<s.length();i++){
            int cur = s.charAt(i) - 'A';
            window[cur]++;
            maxFreq = Math.max(maxFreq, window[cur]);
            while((i - left + 1) - maxFreq > k){
                int leftChar = s.charAt(left) - 'A';
                window[leftChar]--;
                left++;
            }
            maxLen = Math.max(maxLen,i-left+1);
        }
        return maxLen;
    }
}
