class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase();
        paragraph = paragraph.replaceAll("[^a-z]", " ");

        String words[] = paragraph.split("\\s+");
        HashSet<String> set = new HashSet<>(Arrays.asList(banned));

        HashMap<String, Integer> map = new HashMap<>();
        for(String word: words){
            if(!set.contains(word)){
            map.put(word, map.getOrDefault(word, 0)+1);
        }
        }
        // Find the maximum frequency word
        String result = "";
        int maxCount = 0;
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            if(entry.getValue() > maxCount){
                result = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        return result;
    }
}