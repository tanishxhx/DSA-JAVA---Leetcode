class Solution {
    public int minOperations(String s) {
        int countA = 0;
        int countB = 0;
        for(int i=0; i<s.length(); i++){
            char expectedA = (i % 2 == 0) ? '0' : '1';
            char expectedB = (i % 2 == 0) ? '1' : '0';
            if(s.charAt(i) == expectedA){
                countA++;
            }
            if(s.charAt(i) == expectedB){
                countB++;
            }
        }
        return Math.min(countA, countB);
    }
}