class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

         if(n == 1){
            return nums[0];
        }
        int arr1[] = new int[n];
        Arrays.fill(arr1, -1);
        int caseA = solve(nums, 0, n - 1, arr1);

        int arr2[] = new int[n];
        Arrays.fill(arr2, -1);
        int caseB = solve(nums, 1, n, arr2);

        return Math.max(caseA, caseB);
    }
    public int solve(int[] nums, int i, int n, int arr[]){
        if(i >= n){
            return 0;
        }
        if(arr[i] != -1){
            return arr[i];
        }
        int steal = nums[i] + solve(nums, i+2, n, arr);
        int skip = solve(nums, i+1, n, arr);

        return arr[i] = Math.max(steal, skip);
    }
}