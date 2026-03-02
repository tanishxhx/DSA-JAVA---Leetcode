class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int count = 0;

        for(int c=n-1; c >= 2; c--){
            int left = 0;
            int right = c-1;

            while(left < right){
                if(nums[left] + nums[right] > nums[c]){
                    count += (right - left);
                    right--;
                } else {
                    left++;
                }
            }
        }
        return count;        
    }
}


// The condition a + b > c is applied here if condition satisfies then increment the count. Otherwise left++;