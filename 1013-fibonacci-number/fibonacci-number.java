class Solution {
    public int fib(int n) {
        // Using Dynamic Programing - memoization
        if(n <= 1){
            return n;
        }
        int arr[] = new int[n+1];
        Arrays.fill(arr, -1);
        return dp(n, arr);
    }
    public int dp(int n, int arr[]){
        if(n <= 1){
            return n;
        }
        if(arr[n] != -1){
            return arr[n];
        }
        return arr[n] = dp(n-1, arr) + dp(n-2, arr);
    }
}