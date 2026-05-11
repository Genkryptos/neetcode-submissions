class Solution {
    public boolean isAnagram(String s, String t) {
            if(s.length()!= t.length())
                return false;
            int[] arr= new int[26];
            for(int i = 0 ; i<s.length() ; i++){
                int schar = s.charAt(i) - 'a';
                int tchar = t.charAt(i) - 'a';
                arr[schar]++;
                arr[tchar]--;
            }
            for(int num : arr){
                if(num != 0)
                    return false;
            }

            return true;
    }
}
