1st approach ->

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;

        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            for(int otherNum : nums) {
                if(num == otherNum) {
                    count++;
                }
            }
        }
        return count;
    }
}


2nd approach ->

class Solution {
        public int numIdenticalPairs(int[] nums) {
        int ans = 0;
        int[] cnt = new int[101];
        for (int a: nums) {
            ans += cnt[a]++;  //ans=ans+cnt[a];
        }
        return ans;
    }
}