class Solution {
    public int minSwaps(String s) {
        int count0 = 0;
        int count1 = 0;
        int n = s.length();
        for (char c : s.toCharArray()) {
            if (c == '0') {
                count0++;
            } else if (c == '1') {
                count1++;
            }
        }
        if (Math.abs(count0 - count1) > 1) {
            return -1;
        }
        int misMatch0 = 0;
        int misMatch1 = 0;
        for (int i = 0; i < n; i++) {
            char expected0 = (i % 2 == 0) ? '0' : '1';
            char expected1 = (i % 2 == 0) ? '1' : '0';

            if (s.charAt(i) != expected0) {
                misMatch0++;
            }
            if (s.charAt(i) != expected1) {
                misMatch1++;
            }
        }
        if (n % 2 == 0) {
            return Math.min(misMatch0, misMatch1) / 2;
        } else {
            if (count0 > count1) {
                return misMatch0 / 2;
            } else {
                return misMatch1 / 2;
            }
        }
    }
}