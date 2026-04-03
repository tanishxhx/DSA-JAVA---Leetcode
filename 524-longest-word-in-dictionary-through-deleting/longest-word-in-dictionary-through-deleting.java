class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        String longest = "";
        for(String word: dictionary){
            if(isSubsequence(s, word)){
                if(word.length() > longest.length() || (word.length() == longest.length() && word.compareTo(longest) < 0)){
                    longest = word;
                }
            }
        }
        return longest;
    }
    private boolean isSubsequence(String s, String word){
        int i=0;
        int j=0;
        while(i < s.length() && j < word.length()){
            if(s.charAt(i) == word.charAt(j)){
                j++;
            }
            i++;
        }
        return j == word.length();
    }
}