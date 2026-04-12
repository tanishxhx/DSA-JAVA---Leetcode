class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        while(columnNumber > 0){
            columnNumber--;          // adjust for 1-based indexing
            int remainder = columnNumber % 26;         // Identify current char
            char currentChar = (char)('A' + remainder); // converting number to character
            result.append(currentChar);                 // append in the result
            columnNumber /= 26;                         // for moving to next digit if present
        }
        return result.reverse().toString();
    }
}