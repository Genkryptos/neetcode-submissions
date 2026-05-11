class Solution {
    public String anagrams(String s){
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String anagram = "";
        for(char c:chars){
            anagram += c; 
        }
        return anagram;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> mapAnagram = new HashMap<>();
        for(String s:strs){
        String ana =  anagrams(s);
            if(mapAnagram.containsKey(ana)){
                mapAnagram.get(ana).add(s);
            }else{
                mapAnagram.put(ana,new ArrayList<>(Arrays.asList(s)));
            }
        }
        List<List<String>> result = new ArrayList<>();
        for(String s: mapAnagram.keySet()){
            result.add(mapAnagram.get(s));
        }
        return result;
    }
}
