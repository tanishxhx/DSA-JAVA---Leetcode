class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;
        int sum = 0;

        map.put(0, -1);

        for(int i=0; i<nums.length; i++){
            sum += (nums[i] == 1? 1 : -1);

            if(map.containsKey(sum)){
                int prevIndex = map.get(sum);
                maxLen = Math.max(maxLen, i - prevIndex);
            } else {
                map.put(sum, i);
            }
        }
        return maxLen;
    }
}