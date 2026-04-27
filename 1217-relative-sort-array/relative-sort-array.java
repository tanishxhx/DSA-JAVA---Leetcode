class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: arr1){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for(int num: arr2){
            int count = map.getOrDefault(num, 0);
            for(int i=0; i<count; i++){
                result.add(num);
            }
            map.remove(num);
        }
        ArrayList<Integer> left = new ArrayList<>(map.keySet());
        Collections.sort(left);
        for(int num: left){
            int count = map.get(num);
            for(int i=0; i<count; i++){
                result.add(num);
            }
        }
        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }
        return ans;
    }
}