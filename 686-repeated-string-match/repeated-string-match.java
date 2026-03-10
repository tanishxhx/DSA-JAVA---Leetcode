class Solution {
    public int repeatedStringMatch(String a, String b) {
        int repeatCount = (int)Math.ceil((double)b.length() / a.length());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<repeatCount; i++){
            sb.append(a);
        }
        for(int extra=0; extra<=2; extra++){
            String str = sb.toString();
            if(str.contains(b)){
                return repeatCount + extra;
            }
            sb.append(a);
        }
        return -1;
    }
}