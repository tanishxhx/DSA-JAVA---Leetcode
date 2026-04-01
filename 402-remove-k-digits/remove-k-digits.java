class Solution {
    public String removeKdigits(String num, int k) {
        if(k == num.length()){
            return "0";
        }
        //using StringBuilder as a stack.
        StringBuilder stack = new StringBuilder();
        for(char digit: num.toCharArray()){
            while(k > 0 && stack.length() > 0 && stack.charAt(stack.length()-1) > digit){
                stack.deleteCharAt(stack.length()-1);
                k--;
            }
            stack.append(digit);
        }
        //If k > 0, remove from the end
        while(k > 0 && stack.length() > 0){
            stack.deleteCharAt(stack.length()-1);
            k--;
        }
        // skip leading zeroes
        int idx = 0;
        while (idx < stack.length() && stack.charAt(idx) == '0') {
            idx++;
        }
        String result = stack.substring(idx);
        return result.isEmpty()?"0" : result;
    }
}