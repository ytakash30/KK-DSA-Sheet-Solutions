class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] count = new int[n];

        for (int i = 0; i < n; i++) {
            int currentCount = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] < nums[i]) {
                    currentCount++;
                }
            }
            count[i] = currentCount;
        }

        return count;
    }
}
