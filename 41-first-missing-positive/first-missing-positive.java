class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int counter = 1;
        while (i < nums.length) {
            if (nums[i] <= 0) {
                i++;
                continue;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                i++;
                continue;
            }
            if (nums[i] == counter) {
                i++;
                counter++;
                continue;
            } else {
                return counter;
            }
        }
        return counter;
    }
}