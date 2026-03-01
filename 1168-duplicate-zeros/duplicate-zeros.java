class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int count = 0;          // zero count
        for(int num: arr){
            if(num == 0){
                count++;
            }
        }
        int i=n-1;
        int j = n + count - 1;
        while(i < j){
            if(j < n){
                arr[j] = arr[i];
            }
            if(arr[i] == 0){
                j--;
                if(j < n){
                    arr[j] = 0;   // Duplicate zero if within bounds
                }
            }
            i--;
            j--;
        }
    }
}