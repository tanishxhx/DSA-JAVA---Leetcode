class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        HashMap<Character, Integer> firstIndex = new HashMap<>();
        int maxLen = -1;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(firstIndex.containsKey(c)){
                maxLen = Math.max(maxLen, i - firstIndex.get(c) - 1);
            } else {
                firstIndex.put(c, i);
            }
        }
        return maxLen;
    }
}