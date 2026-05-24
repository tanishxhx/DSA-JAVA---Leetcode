class Solution {
    public String toGoatLatin(String sentence) {
        String[] words = sentence.split(" ");
        String vowels = "aeiouAEIOU";
        StringBuilder result = new StringBuilder();

        for(int i=0; i<words.length; i++){
            String word = words[i];
            if(vowels.indexOf(word.charAt(0)) != -1){
                word = word + "ma";
            } else {
                word = word.substring(1) + word.charAt(0) + "ma";
            }
            word += "a".repeat(i+1);
            if (i > 0) result.append(" ");
            result.append(word);
        }
        return result.toString();
    }
}