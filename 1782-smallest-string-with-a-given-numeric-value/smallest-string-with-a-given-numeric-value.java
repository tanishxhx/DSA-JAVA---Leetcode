class Solution {
    public String getSmallestString(int n, int k) {
        char[] result = new char[n];
        Arrays.fill(result, 'a');

        int remains = k-n;
        int index = n-1;

        while(remains > 0){
            int add = Math.min(25, remains);
            result[index] = (char)('a' + add);
            remains -= add;
            index--;
        }
        return new String(result);
    }
}

// Create an array and fill it with the a character
// Calculate the remaining characters to fill and fill them from last for lexicograph
// Distribute remaining value till remain > 0
