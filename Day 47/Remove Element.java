class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums == null) {
            return 0;
        }
        int i = 0;
        for (int n : nums) {
            if (n != val) {
                nums[i] = n;
                i++;
            }
        }
        return i;
    }
}
