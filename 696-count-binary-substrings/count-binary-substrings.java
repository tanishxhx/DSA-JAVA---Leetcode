class Solution {
    public int countBinarySubstrings(String s) {
        int prevRun = 0;
        int currentRun = 1;
        int ans = 0;

        for(int i=1; i<s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)){
                currentRun++;
            }
            else {
                ans += Math.min(prevRun, currentRun);
                prevRun = currentRun;
                currentRun = 1;
            }
        }
        return ans + Math.min(prevRun, currentRun);
    }
}