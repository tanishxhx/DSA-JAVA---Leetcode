class Solution {
    private Boolean[][] memo;
    private int start = 0, maxLen = 1;
    public String longestPalindrome(String s) {
        int n = s.length();
        memo = new Boolean[n][n];
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if(isPalindrome(s, i, j)){
                    int len = j - i + 1;
                    if (len > maxLen) {
                        maxLen = len;
                        start = i;
                    }
                }
            }
        }
        return s.substring(start, start + maxLen);
    }
    private boolean isPalindrome(String s, int i, int j){
        if(i >= j){
            return true;
        }
        if (memo[i][j] != null) return memo[i][j];
        
        if(s.charAt(i) == s.charAt(j)){
            memo[i][j] = isPalindrome(s, i + 1, j - 1);
        } else {
            memo[i][j] = false;
        }
        return memo[i][j];
    }
}