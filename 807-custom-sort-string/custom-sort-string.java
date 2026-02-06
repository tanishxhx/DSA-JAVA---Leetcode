class Solution {
    public String customSortString(String order, String s) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for(char c: s.toCharArray()){
            freqMap.put(c, freqMap.getOrDefault(c, 0)+1);
        }
        StringBuilder sb = new StringBuilder();

        for(char c: order.toCharArray()){
            if(freqMap.containsKey(c)){
                int count = freqMap.get(c);
                for(int i=0; i<count; i++){
                    sb.append(c);
                }
                freqMap.remove(c);
            }
        }
        for(Map.Entry<Character, Integer> entry: freqMap.entrySet()){
            char c = entry.getKey();
            int count = entry.getValue();
            for(int i=0; i<count; i++){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}


// 