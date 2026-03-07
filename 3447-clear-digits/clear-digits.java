class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch: s.toCharArray()){
            if(Character.isDigit(ch)){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            } else {
                stack.push(ch);
            }
        }
        StringBuilder result = new StringBuilder();
        for(char c: stack){
            result.append(c);
        }
        return result.toString();
    }
}