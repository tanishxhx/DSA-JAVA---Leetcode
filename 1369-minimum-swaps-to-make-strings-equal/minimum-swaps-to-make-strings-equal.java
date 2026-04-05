class Solution {
    public int minimumSwap(String s1, String s2) {
        int xyCount = 0;
        int yxCount = 0;
        
        //Count mismatches
        for(int i=0; i<s1.length(); i++){
            char a = s1.charAt(i);
            char b = s2.charAt(i);

            if(a == 'x' && b == 'y'){
                xyCount++;
            } else if(a == 'y' && b == 'x'){
                yxCount++;
            }
        }
        //Agar total mismatches odd hai toh impossible hai
        if((xyCount + yxCount) % 2 != 0){
            return -1;
        }
        return (xyCount/2) + (yxCount/2) + (xyCount % 2) * 2;
    }
}