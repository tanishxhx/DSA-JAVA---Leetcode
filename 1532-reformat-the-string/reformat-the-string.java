class Solution {
    public String reformat(String s) {
        List<Character> letters = new ArrayList<>();
        List<Character> digits = new ArrayList<>();

        for(char c: s.toCharArray()){
            if(Character.isDigit(c)){
                digits.add(c);
            } else {
                letters.add(c);
            }
        }
        if (Math.abs(letters.size() - digits.size()) > 1) return "";

        StringBuilder result = new StringBuilder();
        boolean letterFirst = letters.size() >= digits.size();

        int i=0;
        int j=0;
        while(i < letters.size() || j < digits.size()){
            if(letterFirst && i<letters.size()){
                result.append(letters.get(i++));
            }
            if(j < digits.size()){
                result.append(digits.get(j++));
            }
            if(!letterFirst && i<letters.size()){
                result.append(letters.get(i++));
            }
        }
        return result.toString();
    }
}