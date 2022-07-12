package Task;

class Solution12 {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 1) {
            return nums[0] == target ? 0 : nums[0] > target ? 0 : 1;
        }
        int position = -1;
        int l = 0;
        int h = nums.length - 1;
        int m = -1;
        while (l <= h) {
            m = l + ((h-l)/2);
            int elem = nums[m];
            if (elem == target) {
                return m;
            }
            if (elem < target) {
                l = m + 1;
            } else {
                h = m - 1;
            }
        }
        return l;
    }
}
