class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int num: nums){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }
        // Convert int[] → Integer[]
        Integer[] arr = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, (a, b) -> {
            if(freq.get(a).equals(freq.get(b))){
                return b-a;
            }
            return freq.get(a) - freq.get(b);
        });
        return Arrays.stream(arr).mapToInt(Integer::intValue).toArray();
    }
}