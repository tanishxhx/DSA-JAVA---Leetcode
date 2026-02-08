class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int total = 0;

        for(int i=0; i<n; i++){
            HashMap<Character, Integer> map = new HashMap<>();
            for(int j=i; j<n; j++){
               char c = s.charAt(j);
               map.put(c, map.getOrDefault(c, 0)+1);
            
            int maxFreq = 0;
            int minFreq = Integer.MAX_VALUE;
            for(int f: map.values()){
                maxFreq = Math.max(maxFreq, f);
                minFreq = Math.min(minFreq, f);
            }
            total += (maxFreq - minFreq);
        }
    }
    return total;
}
}